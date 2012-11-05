#!/usr/bin/env ruby

$n = 3

def make_map_ops(template)

  (1..$n).each { |in_arity|
    (1..$n).each { |out_arity|
      make_map_op(template, in_arity, out_arity)
    }
  }

end

def make_map_op(template, in_arity, out_arity)

  in_type_names = ('A'..'H').to_a[0...in_arity]
  out_type_names = ('S'..'Z').to_a[0...out_arity]
  in_type = type_of(in_type_names)
  out_type = type_of(out_type_names)
  in_converter = if in_arity == 1 then 'fieldToFields' else 'productToFields' end
  out_converter = if out_arity == 1 then 'fieldToFields' else 'productToFields' end

  puts template.
    gsub('#{in_type}', in_type).
    gsub('#{out_type}', out_type).
    gsub('#{in_type_names}', in_type_names.join(',')).
    gsub('#{out_type_names}', out_type_names.join(',')).
    gsub('#{in_arity}', "#{in_arity}").
    gsub('#{out_arity}', "#{out_arity}").
    gsub('#{in_converter}', in_converter).
    gsub('#{out_converter}', out_converter).
    gsub('#{in_fields}', fields_of(in_type_names)).
    gsub('#{out_fields}', fields_of(out_type_names))

end

def make_unary_ops(template)

  (1..$n).each { |arity|
    make_unary_op(template, arity)
  }

end

def make_unary_op(template, arity)

  type_names = ('A'..'H').to_a[0...arity]
  type = type_of(type_names)
  converter = if arity == 1 then 'fieldToFields' else 'productToFields' end
  multi_param_list = type_names.zip(Array(1..arity)).map { |t| "f#{t[1]} : Field[#{t[0]}]" }.join(', ')
  multi_arg_tuple = Array(1..arity).map { |k| "f#{k}" }.join(',')
  multi_arg_tuple = '(' + multi_arg_tuple + ')' if arity > 1

  puts template.
    gsub('#{type}', type).
    gsub('#{type_names}', type_names.join(',')).
    gsub('#{arity}', "#{arity}").
    gsub('#{converter}', converter).
    gsub('#{fields}', fields_of(type_names)).
    gsub('#{multi_param_list}', multi_param_list).
    gsub('#{multi_arg_tuple}', multi_arg_tuple)

end

def fields_of(type_names)

  fields = type_names.map { |type| "Field[" + type + "]" }.join(',')
  if type_names.size > 1 then "(" + fields + ")" else fields end

end

def type_of(type_names)

  type = type_names.join(',')
  type = "(" + type + ")" if type_names.size > 1
  type

end

puts "// following were autogenerated by #{__FILE__} at #{Time.now} do not edit"
puts %Q|package com.twitter.scalding

import cascading.pipe.Pipe
import cascading.tuple.Fields
import com.twitter.algebird.{Monoid, Ring}
import com.twitter.scalding.Dsl.{fieldToFields, productToFields}

trait TypedFieldsRichPipeOperations extends RichPipe \{
|

make_map_ops(%q|
  def map[#{in_type_names},#{out_type_names}](fs : (#{in_fields},#{out_fields}))(fn : (#{in_type}) => #{out_type})
    (implicit conv : TupleConverter[#{in_type}], setter : TupleSetter[#{out_type}], inArity : Arity#{in_arity}, outArity : Arity#{out_arity}) : Pipe = {

      map(#{in_converter}(fs._1) -> #{out_converter}(fs._2))(fn)(conv, setter)

  }
|)
make_map_ops(%q|
  def mapTo[#{in_type_names},#{out_type_names}](fs : (#{in_fields},#{out_fields}))(fn : (#{in_type}) => #{out_type})
    (implicit conv : TupleConverter[#{in_type}], setter : TupleSetter[#{out_type}], inArity : Arity#{in_arity}, outArity : Arity#{out_arity}) : Pipe = {

      mapTo(#{in_converter}(fs._1) -> #{out_converter}(fs._2))(fn)(conv, setter)

  }
|)
make_map_ops(%q|
  def flatMap[#{in_type_names},#{out_type_names}](fs : (#{in_fields},#{out_fields}))(fn : (#{in_type}) => Iterable[#{out_type}])
    (implicit conv : TupleConverter[#{in_type}], setter : TupleSetter[#{out_type}], inArity : Arity#{in_arity}, outArity : Arity#{out_arity}) : Pipe = {

      flatMap(#{in_converter}(fs._1) -> #{out_converter}(fs._2))(fn)(conv, setter)

  }
|)
make_map_ops(%q|
  def flatMapTo[#{in_type_names},#{out_type_names}](fs : (#{in_fields},#{out_fields}))(fn : (#{in_type}) => Iterable[#{out_type}])
    (implicit conv : TupleConverter[#{in_type}], setter : TupleSetter[#{out_type}], inArity : Arity#{in_arity}, outArity : Arity#{out_arity}) : Pipe = {

      flatMapTo(#{in_converter}(fs._1) -> #{out_converter}(fs._2))(fn)(conv, setter)

  }
|)
make_unary_ops(%q|
  def filter[#{type_names}](#{multi_param_list})(fn : (#{type}) => Boolean)
    (implicit conv : TupleConverter[#{type}], arity : Arity#{arity}) : Pipe = {

      filter(#{converter}(#{multi_arg_tuple}))(fn)(conv)

  }
|)
make_unary_ops(%q|
  def flatten[#{type_names}](fs : (Field[Iterable[#{type}]],#{fields}))
    (implicit conv : TupleConverter[Iterable[#{type}]], setter : TupleSetter[#{type}], arity : Arity#{arity}) : Pipe = {

      flatten(fieldToFields(fs._1), #{converter}(fs._2))(conv, setter)

  }
|)

puts %Q|
\}

trait TypedFieldsReduceOperations[+Self <: TypedFieldsReduceOperations[Self]] extends ReduceOperations[Self] \{
|

make_map_ops(%q|
  def mapReduceMap[#{in_type_names},R,#{out_type_names}](fs : (#{in_fields},#{out_fields}))(mapfn : (#{in_type}) => R)(redfn : (R,R) => R)(mapfn2 : R => #{out_type})
    (implicit startConv : TupleConverter[#{in_type}], midSetter : TupleSetter[R], midConv : TupleConverter[R], endSetter : TupleSetter[#{out_type}], inArity : Arity#{in_arity}, outArity : Arity#{out_arity}) : Self = {

      mapReduceMap(#{in_converter}(fs._1) -> #{out_converter}(fs._2))(mapfn)(redfn)(mapfn2)(startConv, midSetter, midConv, endSetter)

  }
|)
make_map_ops(%q|
  def mapPlusMap[#{in_type_names},R,#{out_type_names}](fs : (#{in_fields},#{out_fields}))(mapfn : (#{in_type}) => R)(mapfn2 : R => #{out_type})
    (implicit startConv : TupleConverter[#{in_type}], midSetter : TupleSetter[R], midConv : TupleConverter[R], endSetter : TupleSetter[#{out_type}], monR : Monoid[R], inArity : Arity#{in_arity}, outArity : Arity#{out_arity}) : Self = {

      mapPlusMap(#{in_converter}(fs._1) -> #{out_converter}(fs._2))(mapfn)(mapfn2)(startConv, midSetter, midConv, endSetter, monR)

  }
|)
# TODO: mapList
make_unary_ops(%q|
  def count[#{type_names}](fs : (#{fields},Field[Long]))(fn : (#{type}) => Boolean)
    (implicit conv : TupleConverter[#{type}], arity : Arity#{arity}) : Self = {

      count(#{converter}(fs._1) -> fieldToFields(fs._2))(fn)

  }
|)
make_unary_ops(%q|
  def forall[#{type_names}](fs : (#{fields},Field[Boolean]))(fn : (#{type}) => Boolean)
    (implicit conv : TupleConverter[#{type}], arity : Arity#{arity}) : Self = {

      forall(#{converter}(fs._1) -> fieldToFields(fs._2))(fn)

  }
|)
make_unary_ops(%q|
  def reduce[#{type_names}](#{multi_param_list})(fn : (#{type},#{type}) => #{type})
    (implicit setter : TupleSetter[#{type}], conv : TupleConverter[#{type}], arity : Arity#{arity}) : Self = {

      reduce(#{converter}(#{multi_arg_tuple}) -> #{converter}(#{multi_arg_tuple}))(fn)(setter, conv)

  }

  def reduce[#{type_names}](fs : (#{fields},#{fields}))(fn : (#{type},#{type}) => #{type})
    (implicit setter : TupleSetter[#{type}], conv : TupleConverter[#{type}], arity : Arity#{arity}) : Self = {

      reduce(#{converter}(fs._1) -> #{converter}(fs._2))(fn)(setter, conv)

  }
|)
make_unary_ops(%q|
  def plus[#{type_names}](#{multi_param_list})
    (implicit monoid : Monoid[#{type}], conv : TupleConverter[#{type}], setter : TupleSetter[#{type}], arity : Arity#{arity}) : Self = {

      plus(#{converter}(#{multi_arg_tuple}) -> #{converter}(#{multi_arg_tuple}))(monoid, conv, setter)

  }

  def plus[#{type_names}](fs : (#{fields},#{fields}))
    (implicit monoid : Monoid[#{type}], conv : TupleConverter[#{type}], setter : TupleSetter[#{type}], arity : Arity#{arity}) : Self = {

      plus(#{converter}(fs._1) -> #{converter}(fs._2))(monoid, conv, setter)

  }
|)
make_unary_ops(%q|
  def times[#{type_names}](#{multi_param_list})
    (implicit ring : Ring[#{type}], conv : TupleConverter[#{type}], setter : TupleSetter[#{type}], arity : Arity#{arity}) : Self = {

      times(#{converter}(#{multi_arg_tuple}) -> #{converter}(#{multi_arg_tuple}))(ring, conv, setter)

  }

  def times[#{type_names}](fs : (#{fields},#{fields}))
    (implicit ring : Ring[#{type}], conv : TupleConverter[#{type}], setter : TupleSetter[#{type}], arity : Arity#{arity}) : Self = {

      times(#{converter}(fs._1) -> #{converter}(fs._2))(ring, conv, setter)

  }
|)
make_unary_ops(%q|
  def toList[#{type_names}](fs : (#{fields},Field[List[#{type}]]))
    (implicit conv : TupleConverter[#{type}], arity : Arity#{arity}) : Self = {

      toList(#{converter}(fs._1) -> fieldToFields(fs._2))

  }
|)
# TODO: dot
make_unary_ops(%q|
  def sortWithTake[#{type_names}](fs : (#{fields},Field[List[#{type}]]), k : Int)(fn : (#{type},#{type}) => Boolean)
    (implicit conv : TupleConverter[#{type}], arity : Arity#{arity}) : Self = {

      sortWithTake(#{converter}(fs._1) -> fieldToFields(fs._2), k)(fn)

  }
|)
# sortedTake and sortedReverseTake don't need to be included since their type params are used only for tuple conversion

puts %Q|
\}

trait TypedFieldsFoldOperations[+Self <: TypedFieldsFoldOperations[Self]] extends TypedFieldsReduceOperations[Self] with FoldOperations[Self] \{
|

make_unary_ops(%q|
  def foldLeft[R,#{type_names}](fs : (#{fields},Field[R]))(init : R)(fn : (R,#{type}) => R)
    (implicit setter : TupleSetter[R], conv : TupleConverter[#{type}], arity : Arity#{arity}) : Self = {

      foldLeft(#{converter}(fs._1) -> fieldToFields(fs._2))(init)(fn)(setter, conv)

  }
|)

puts %Q|
\}

trait TypedFieldsStreamOperations[+Self <: TypedFieldsStreamOperations[Self]] extends StreamOperations[Self] \{
|

# TODO: mapStream
make_unary_ops(%q|
  def dropWhile[#{type_names}](#{multi_param_list})(fn : (#{type}) => Boolean)
    (implicit conv : TupleConverter[#{type}], arity : Arity#{arity}) : Self = {

      dropWhile(#{converter}(#{multi_arg_tuple}))(fn)(conv)

  }
|)
make_unary_ops(%q|
  def scanLeft[R,#{type_names}](fs : (#{fields},Field[R]))(init : R)(fn : (R,#{type}) => R)
    (implicit setter : TupleSetter[R], conv : TupleConverter[#{type}], arity : Arity#{arity}) : Self = {

      scanLeft(#{converter}(fs._1) -> fieldToFields(fs._2))(init)(fn)(setter, conv)

  }
|)
make_unary_ops(%q|
  def takeWhile[#{type_names}](#{multi_param_list})(fn : (#{type}) => Boolean)
    (implicit conv : TupleConverter[#{type}], arity : Arity#{arity}) : Self = {

      takeWhile(#{converter}(#{multi_arg_tuple}))(fn)(conv)

  }
|)

puts %Q|
\}

sealed case class Arity private[scalding](arity: Int)
|

(1..$n).each { |arity| puts "sealed class Arity#{arity} private[scalding] extends Arity(#{arity})" }

puts %Q|
trait Arities \{

|

(1..$n).each { |arity| puts "  implicit val arity#{arity} = new Arity#{arity}" }

puts %Q|
\}
|

puts "// end of autogenerated"
