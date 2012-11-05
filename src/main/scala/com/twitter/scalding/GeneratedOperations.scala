// following were autogenerated by scripts/operations_generator.rb at Mon Nov 05 11:48:12 -0800 2012 do not edit
package com.twitter.scalding

import cascading.pipe.Pipe
import cascading.tuple.Fields
import com.twitter.algebird.{Monoid, Ring}
import com.twitter.scalding.Dsl.{fieldToFields, productToFields}

trait TypedFieldsRichPipeOperations extends RichPipe {

  def map[A,S](fs : (Field[A],Field[S]))(fn : (A) => S)
    (implicit conv : TupleConverter[A], setter : TupleSetter[S], inArity : Arity1, outArity : Arity1) : Pipe = {

      map(fieldToFields(fs._1) -> fieldToFields(fs._2))(fn)(conv, setter)

  }

  def map[A,S,T](fs : (Field[A],(Field[S],Field[T])))(fn : (A) => (S,T))
    (implicit conv : TupleConverter[A], setter : TupleSetter[(S,T)], inArity : Arity1, outArity : Arity2) : Pipe = {

      map(fieldToFields(fs._1) -> productToFields(fs._2))(fn)(conv, setter)

  }

  def map[A,S,T,U](fs : (Field[A],(Field[S],Field[T],Field[U])))(fn : (A) => (S,T,U))
    (implicit conv : TupleConverter[A], setter : TupleSetter[(S,T,U)], inArity : Arity1, outArity : Arity3) : Pipe = {

      map(fieldToFields(fs._1) -> productToFields(fs._2))(fn)(conv, setter)

  }

  def map[A,B,S](fs : ((Field[A],Field[B]),Field[S]))(fn : ((A,B)) => S)
    (implicit conv : TupleConverter[(A,B)], setter : TupleSetter[S], inArity : Arity2, outArity : Arity1) : Pipe = {

      map(productToFields(fs._1) -> fieldToFields(fs._2))(fn)(conv, setter)

  }

  def map[A,B,S,T](fs : ((Field[A],Field[B]),(Field[S],Field[T])))(fn : ((A,B)) => (S,T))
    (implicit conv : TupleConverter[(A,B)], setter : TupleSetter[(S,T)], inArity : Arity2, outArity : Arity2) : Pipe = {

      map(productToFields(fs._1) -> productToFields(fs._2))(fn)(conv, setter)

  }

  def map[A,B,S,T,U](fs : ((Field[A],Field[B]),(Field[S],Field[T],Field[U])))(fn : ((A,B)) => (S,T,U))
    (implicit conv : TupleConverter[(A,B)], setter : TupleSetter[(S,T,U)], inArity : Arity2, outArity : Arity3) : Pipe = {

      map(productToFields(fs._1) -> productToFields(fs._2))(fn)(conv, setter)

  }

  def map[A,B,C,S](fs : ((Field[A],Field[B],Field[C]),Field[S]))(fn : ((A,B,C)) => S)
    (implicit conv : TupleConverter[(A,B,C)], setter : TupleSetter[S], inArity : Arity3, outArity : Arity1) : Pipe = {

      map(productToFields(fs._1) -> fieldToFields(fs._2))(fn)(conv, setter)

  }

  def map[A,B,C,S,T](fs : ((Field[A],Field[B],Field[C]),(Field[S],Field[T])))(fn : ((A,B,C)) => (S,T))
    (implicit conv : TupleConverter[(A,B,C)], setter : TupleSetter[(S,T)], inArity : Arity3, outArity : Arity2) : Pipe = {

      map(productToFields(fs._1) -> productToFields(fs._2))(fn)(conv, setter)

  }

  def map[A,B,C,S,T,U](fs : ((Field[A],Field[B],Field[C]),(Field[S],Field[T],Field[U])))(fn : ((A,B,C)) => (S,T,U))
    (implicit conv : TupleConverter[(A,B,C)], setter : TupleSetter[(S,T,U)], inArity : Arity3, outArity : Arity3) : Pipe = {

      map(productToFields(fs._1) -> productToFields(fs._2))(fn)(conv, setter)

  }

  def mapTo[A,S](fs : (Field[A],Field[S]))(fn : (A) => S)
    (implicit conv : TupleConverter[A], setter : TupleSetter[S], inArity : Arity1, outArity : Arity1) : Pipe = {

      mapTo(fieldToFields(fs._1) -> fieldToFields(fs._2))(fn)(conv, setter)

  }

  def mapTo[A,S,T](fs : (Field[A],(Field[S],Field[T])))(fn : (A) => (S,T))
    (implicit conv : TupleConverter[A], setter : TupleSetter[(S,T)], inArity : Arity1, outArity : Arity2) : Pipe = {

      mapTo(fieldToFields(fs._1) -> productToFields(fs._2))(fn)(conv, setter)

  }

  def mapTo[A,S,T,U](fs : (Field[A],(Field[S],Field[T],Field[U])))(fn : (A) => (S,T,U))
    (implicit conv : TupleConverter[A], setter : TupleSetter[(S,T,U)], inArity : Arity1, outArity : Arity3) : Pipe = {

      mapTo(fieldToFields(fs._1) -> productToFields(fs._2))(fn)(conv, setter)

  }

  def mapTo[A,B,S](fs : ((Field[A],Field[B]),Field[S]))(fn : ((A,B)) => S)
    (implicit conv : TupleConverter[(A,B)], setter : TupleSetter[S], inArity : Arity2, outArity : Arity1) : Pipe = {

      mapTo(productToFields(fs._1) -> fieldToFields(fs._2))(fn)(conv, setter)

  }

  def mapTo[A,B,S,T](fs : ((Field[A],Field[B]),(Field[S],Field[T])))(fn : ((A,B)) => (S,T))
    (implicit conv : TupleConverter[(A,B)], setter : TupleSetter[(S,T)], inArity : Arity2, outArity : Arity2) : Pipe = {

      mapTo(productToFields(fs._1) -> productToFields(fs._2))(fn)(conv, setter)

  }

  def mapTo[A,B,S,T,U](fs : ((Field[A],Field[B]),(Field[S],Field[T],Field[U])))(fn : ((A,B)) => (S,T,U))
    (implicit conv : TupleConverter[(A,B)], setter : TupleSetter[(S,T,U)], inArity : Arity2, outArity : Arity3) : Pipe = {

      mapTo(productToFields(fs._1) -> productToFields(fs._2))(fn)(conv, setter)

  }

  def mapTo[A,B,C,S](fs : ((Field[A],Field[B],Field[C]),Field[S]))(fn : ((A,B,C)) => S)
    (implicit conv : TupleConverter[(A,B,C)], setter : TupleSetter[S], inArity : Arity3, outArity : Arity1) : Pipe = {

      mapTo(productToFields(fs._1) -> fieldToFields(fs._2))(fn)(conv, setter)

  }

  def mapTo[A,B,C,S,T](fs : ((Field[A],Field[B],Field[C]),(Field[S],Field[T])))(fn : ((A,B,C)) => (S,T))
    (implicit conv : TupleConverter[(A,B,C)], setter : TupleSetter[(S,T)], inArity : Arity3, outArity : Arity2) : Pipe = {

      mapTo(productToFields(fs._1) -> productToFields(fs._2))(fn)(conv, setter)

  }

  def mapTo[A,B,C,S,T,U](fs : ((Field[A],Field[B],Field[C]),(Field[S],Field[T],Field[U])))(fn : ((A,B,C)) => (S,T,U))
    (implicit conv : TupleConverter[(A,B,C)], setter : TupleSetter[(S,T,U)], inArity : Arity3, outArity : Arity3) : Pipe = {

      mapTo(productToFields(fs._1) -> productToFields(fs._2))(fn)(conv, setter)

  }

  def flatMap[A,S](fs : (Field[A],Field[S]))(fn : (A) => Iterable[S])
    (implicit conv : TupleConverter[A], setter : TupleSetter[S], inArity : Arity1, outArity : Arity1) : Pipe = {

      flatMap(fieldToFields(fs._1) -> fieldToFields(fs._2))(fn)(conv, setter)

  }

  def flatMap[A,S,T](fs : (Field[A],(Field[S],Field[T])))(fn : (A) => Iterable[(S,T)])
    (implicit conv : TupleConverter[A], setter : TupleSetter[(S,T)], inArity : Arity1, outArity : Arity2) : Pipe = {

      flatMap(fieldToFields(fs._1) -> productToFields(fs._2))(fn)(conv, setter)

  }

  def flatMap[A,S,T,U](fs : (Field[A],(Field[S],Field[T],Field[U])))(fn : (A) => Iterable[(S,T,U)])
    (implicit conv : TupleConverter[A], setter : TupleSetter[(S,T,U)], inArity : Arity1, outArity : Arity3) : Pipe = {

      flatMap(fieldToFields(fs._1) -> productToFields(fs._2))(fn)(conv, setter)

  }

  def flatMap[A,B,S](fs : ((Field[A],Field[B]),Field[S]))(fn : ((A,B)) => Iterable[S])
    (implicit conv : TupleConverter[(A,B)], setter : TupleSetter[S], inArity : Arity2, outArity : Arity1) : Pipe = {

      flatMap(productToFields(fs._1) -> fieldToFields(fs._2))(fn)(conv, setter)

  }

  def flatMap[A,B,S,T](fs : ((Field[A],Field[B]),(Field[S],Field[T])))(fn : ((A,B)) => Iterable[(S,T)])
    (implicit conv : TupleConverter[(A,B)], setter : TupleSetter[(S,T)], inArity : Arity2, outArity : Arity2) : Pipe = {

      flatMap(productToFields(fs._1) -> productToFields(fs._2))(fn)(conv, setter)

  }

  def flatMap[A,B,S,T,U](fs : ((Field[A],Field[B]),(Field[S],Field[T],Field[U])))(fn : ((A,B)) => Iterable[(S,T,U)])
    (implicit conv : TupleConverter[(A,B)], setter : TupleSetter[(S,T,U)], inArity : Arity2, outArity : Arity3) : Pipe = {

      flatMap(productToFields(fs._1) -> productToFields(fs._2))(fn)(conv, setter)

  }

  def flatMap[A,B,C,S](fs : ((Field[A],Field[B],Field[C]),Field[S]))(fn : ((A,B,C)) => Iterable[S])
    (implicit conv : TupleConverter[(A,B,C)], setter : TupleSetter[S], inArity : Arity3, outArity : Arity1) : Pipe = {

      flatMap(productToFields(fs._1) -> fieldToFields(fs._2))(fn)(conv, setter)

  }

  def flatMap[A,B,C,S,T](fs : ((Field[A],Field[B],Field[C]),(Field[S],Field[T])))(fn : ((A,B,C)) => Iterable[(S,T)])
    (implicit conv : TupleConverter[(A,B,C)], setter : TupleSetter[(S,T)], inArity : Arity3, outArity : Arity2) : Pipe = {

      flatMap(productToFields(fs._1) -> productToFields(fs._2))(fn)(conv, setter)

  }

  def flatMap[A,B,C,S,T,U](fs : ((Field[A],Field[B],Field[C]),(Field[S],Field[T],Field[U])))(fn : ((A,B,C)) => Iterable[(S,T,U)])
    (implicit conv : TupleConverter[(A,B,C)], setter : TupleSetter[(S,T,U)], inArity : Arity3, outArity : Arity3) : Pipe = {

      flatMap(productToFields(fs._1) -> productToFields(fs._2))(fn)(conv, setter)

  }

  def flatMapTo[A,S](fs : (Field[A],Field[S]))(fn : (A) => Iterable[S])
    (implicit conv : TupleConverter[A], setter : TupleSetter[S], inArity : Arity1, outArity : Arity1) : Pipe = {

      flatMapTo(fieldToFields(fs._1) -> fieldToFields(fs._2))(fn)(conv, setter)

  }

  def flatMapTo[A,S,T](fs : (Field[A],(Field[S],Field[T])))(fn : (A) => Iterable[(S,T)])
    (implicit conv : TupleConverter[A], setter : TupleSetter[(S,T)], inArity : Arity1, outArity : Arity2) : Pipe = {

      flatMapTo(fieldToFields(fs._1) -> productToFields(fs._2))(fn)(conv, setter)

  }

  def flatMapTo[A,S,T,U](fs : (Field[A],(Field[S],Field[T],Field[U])))(fn : (A) => Iterable[(S,T,U)])
    (implicit conv : TupleConverter[A], setter : TupleSetter[(S,T,U)], inArity : Arity1, outArity : Arity3) : Pipe = {

      flatMapTo(fieldToFields(fs._1) -> productToFields(fs._2))(fn)(conv, setter)

  }

  def flatMapTo[A,B,S](fs : ((Field[A],Field[B]),Field[S]))(fn : ((A,B)) => Iterable[S])
    (implicit conv : TupleConverter[(A,B)], setter : TupleSetter[S], inArity : Arity2, outArity : Arity1) : Pipe = {

      flatMapTo(productToFields(fs._1) -> fieldToFields(fs._2))(fn)(conv, setter)

  }

  def flatMapTo[A,B,S,T](fs : ((Field[A],Field[B]),(Field[S],Field[T])))(fn : ((A,B)) => Iterable[(S,T)])
    (implicit conv : TupleConverter[(A,B)], setter : TupleSetter[(S,T)], inArity : Arity2, outArity : Arity2) : Pipe = {

      flatMapTo(productToFields(fs._1) -> productToFields(fs._2))(fn)(conv, setter)

  }

  def flatMapTo[A,B,S,T,U](fs : ((Field[A],Field[B]),(Field[S],Field[T],Field[U])))(fn : ((A,B)) => Iterable[(S,T,U)])
    (implicit conv : TupleConverter[(A,B)], setter : TupleSetter[(S,T,U)], inArity : Arity2, outArity : Arity3) : Pipe = {

      flatMapTo(productToFields(fs._1) -> productToFields(fs._2))(fn)(conv, setter)

  }

  def flatMapTo[A,B,C,S](fs : ((Field[A],Field[B],Field[C]),Field[S]))(fn : ((A,B,C)) => Iterable[S])
    (implicit conv : TupleConverter[(A,B,C)], setter : TupleSetter[S], inArity : Arity3, outArity : Arity1) : Pipe = {

      flatMapTo(productToFields(fs._1) -> fieldToFields(fs._2))(fn)(conv, setter)

  }

  def flatMapTo[A,B,C,S,T](fs : ((Field[A],Field[B],Field[C]),(Field[S],Field[T])))(fn : ((A,B,C)) => Iterable[(S,T)])
    (implicit conv : TupleConverter[(A,B,C)], setter : TupleSetter[(S,T)], inArity : Arity3, outArity : Arity2) : Pipe = {

      flatMapTo(productToFields(fs._1) -> productToFields(fs._2))(fn)(conv, setter)

  }

  def flatMapTo[A,B,C,S,T,U](fs : ((Field[A],Field[B],Field[C]),(Field[S],Field[T],Field[U])))(fn : ((A,B,C)) => Iterable[(S,T,U)])
    (implicit conv : TupleConverter[(A,B,C)], setter : TupleSetter[(S,T,U)], inArity : Arity3, outArity : Arity3) : Pipe = {

      flatMapTo(productToFields(fs._1) -> productToFields(fs._2))(fn)(conv, setter)

  }

  def filter[A](f1 : Field[A])(fn : (A) => Boolean)
    (implicit conv : TupleConverter[A], arity : Arity1) : Pipe = {

      filter(fieldToFields(f1))(fn)(conv)

  }

  def filter[A,B](f1 : Field[A], f2 : Field[B])(fn : ((A,B)) => Boolean)
    (implicit conv : TupleConverter[(A,B)], arity : Arity2) : Pipe = {

      filter(productToFields((f1,f2)))(fn)(conv)

  }

  def filter[A,B,C](f1 : Field[A], f2 : Field[B], f3 : Field[C])(fn : ((A,B,C)) => Boolean)
    (implicit conv : TupleConverter[(A,B,C)], arity : Arity3) : Pipe = {

      filter(productToFields((f1,f2,f3)))(fn)(conv)

  }

  def flatten[A](fs : (Field[Iterable[A]],Field[A]))
    (implicit conv : TupleConverter[Iterable[A]], setter : TupleSetter[A], arity : Arity1) : Pipe = {

      flatten(fieldToFields(fs._1), fieldToFields(fs._2))(conv, setter)

  }

  def flatten[A,B](fs : (Field[Iterable[(A,B)]],(Field[A],Field[B])))
    (implicit conv : TupleConverter[Iterable[(A,B)]], setter : TupleSetter[(A,B)], arity : Arity2) : Pipe = {

      flatten(fieldToFields(fs._1), productToFields(fs._2))(conv, setter)

  }

  def flatten[A,B,C](fs : (Field[Iterable[(A,B,C)]],(Field[A],Field[B],Field[C])))
    (implicit conv : TupleConverter[Iterable[(A,B,C)]], setter : TupleSetter[(A,B,C)], arity : Arity3) : Pipe = {

      flatten(fieldToFields(fs._1), productToFields(fs._2))(conv, setter)

  }

}

trait TypedFieldsReduceOperations[+Self <: TypedFieldsReduceOperations[Self]] extends ReduceOperations[Self] {

  def mapReduceMap[A,R,S](fs : (Field[A],Field[S]))(mapfn : (A) => R)(redfn : (R,R) => R)(mapfn2 : R => S)
    (implicit startConv : TupleConverter[A], midSetter : TupleSetter[R], midConv : TupleConverter[R], endSetter : TupleSetter[S], inArity : Arity1, outArity : Arity1) : Self = {

      mapReduceMap(fieldToFields(fs._1) -> fieldToFields(fs._2))(mapfn)(redfn)(mapfn2)(startConv, midSetter, midConv, endSetter)

  }

  def mapReduceMap[A,R,S,T](fs : (Field[A],(Field[S],Field[T])))(mapfn : (A) => R)(redfn : (R,R) => R)(mapfn2 : R => (S,T))
    (implicit startConv : TupleConverter[A], midSetter : TupleSetter[R], midConv : TupleConverter[R], endSetter : TupleSetter[(S,T)], inArity : Arity1, outArity : Arity2) : Self = {

      mapReduceMap(fieldToFields(fs._1) -> productToFields(fs._2))(mapfn)(redfn)(mapfn2)(startConv, midSetter, midConv, endSetter)

  }

  def mapReduceMap[A,R,S,T,U](fs : (Field[A],(Field[S],Field[T],Field[U])))(mapfn : (A) => R)(redfn : (R,R) => R)(mapfn2 : R => (S,T,U))
    (implicit startConv : TupleConverter[A], midSetter : TupleSetter[R], midConv : TupleConverter[R], endSetter : TupleSetter[(S,T,U)], inArity : Arity1, outArity : Arity3) : Self = {

      mapReduceMap(fieldToFields(fs._1) -> productToFields(fs._2))(mapfn)(redfn)(mapfn2)(startConv, midSetter, midConv, endSetter)

  }

  def mapReduceMap[A,B,R,S](fs : ((Field[A],Field[B]),Field[S]))(mapfn : ((A,B)) => R)(redfn : (R,R) => R)(mapfn2 : R => S)
    (implicit startConv : TupleConverter[(A,B)], midSetter : TupleSetter[R], midConv : TupleConverter[R], endSetter : TupleSetter[S], inArity : Arity2, outArity : Arity1) : Self = {

      mapReduceMap(productToFields(fs._1) -> fieldToFields(fs._2))(mapfn)(redfn)(mapfn2)(startConv, midSetter, midConv, endSetter)

  }

  def mapReduceMap[A,B,R,S,T](fs : ((Field[A],Field[B]),(Field[S],Field[T])))(mapfn : ((A,B)) => R)(redfn : (R,R) => R)(mapfn2 : R => (S,T))
    (implicit startConv : TupleConverter[(A,B)], midSetter : TupleSetter[R], midConv : TupleConverter[R], endSetter : TupleSetter[(S,T)], inArity : Arity2, outArity : Arity2) : Self = {

      mapReduceMap(productToFields(fs._1) -> productToFields(fs._2))(mapfn)(redfn)(mapfn2)(startConv, midSetter, midConv, endSetter)

  }

  def mapReduceMap[A,B,R,S,T,U](fs : ((Field[A],Field[B]),(Field[S],Field[T],Field[U])))(mapfn : ((A,B)) => R)(redfn : (R,R) => R)(mapfn2 : R => (S,T,U))
    (implicit startConv : TupleConverter[(A,B)], midSetter : TupleSetter[R], midConv : TupleConverter[R], endSetter : TupleSetter[(S,T,U)], inArity : Arity2, outArity : Arity3) : Self = {

      mapReduceMap(productToFields(fs._1) -> productToFields(fs._2))(mapfn)(redfn)(mapfn2)(startConv, midSetter, midConv, endSetter)

  }

  def mapReduceMap[A,B,C,R,S](fs : ((Field[A],Field[B],Field[C]),Field[S]))(mapfn : ((A,B,C)) => R)(redfn : (R,R) => R)(mapfn2 : R => S)
    (implicit startConv : TupleConverter[(A,B,C)], midSetter : TupleSetter[R], midConv : TupleConverter[R], endSetter : TupleSetter[S], inArity : Arity3, outArity : Arity1) : Self = {

      mapReduceMap(productToFields(fs._1) -> fieldToFields(fs._2))(mapfn)(redfn)(mapfn2)(startConv, midSetter, midConv, endSetter)

  }

  def mapReduceMap[A,B,C,R,S,T](fs : ((Field[A],Field[B],Field[C]),(Field[S],Field[T])))(mapfn : ((A,B,C)) => R)(redfn : (R,R) => R)(mapfn2 : R => (S,T))
    (implicit startConv : TupleConverter[(A,B,C)], midSetter : TupleSetter[R], midConv : TupleConverter[R], endSetter : TupleSetter[(S,T)], inArity : Arity3, outArity : Arity2) : Self = {

      mapReduceMap(productToFields(fs._1) -> productToFields(fs._2))(mapfn)(redfn)(mapfn2)(startConv, midSetter, midConv, endSetter)

  }

  def mapReduceMap[A,B,C,R,S,T,U](fs : ((Field[A],Field[B],Field[C]),(Field[S],Field[T],Field[U])))(mapfn : ((A,B,C)) => R)(redfn : (R,R) => R)(mapfn2 : R => (S,T,U))
    (implicit startConv : TupleConverter[(A,B,C)], midSetter : TupleSetter[R], midConv : TupleConverter[R], endSetter : TupleSetter[(S,T,U)], inArity : Arity3, outArity : Arity3) : Self = {

      mapReduceMap(productToFields(fs._1) -> productToFields(fs._2))(mapfn)(redfn)(mapfn2)(startConv, midSetter, midConv, endSetter)

  }

  def mapPlusMap[A,R,S](fs : (Field[A],Field[S]))(mapfn : (A) => R)(mapfn2 : R => S)
    (implicit startConv : TupleConverter[A], midSetter : TupleSetter[R], midConv : TupleConverter[R], endSetter : TupleSetter[S], monR : Monoid[R], inArity : Arity1, outArity : Arity1) : Self = {

      mapPlusMap(fieldToFields(fs._1) -> fieldToFields(fs._2))(mapfn)(mapfn2)(startConv, midSetter, midConv, endSetter, monR)

  }

  def mapPlusMap[A,R,S,T](fs : (Field[A],(Field[S],Field[T])))(mapfn : (A) => R)(mapfn2 : R => (S,T))
    (implicit startConv : TupleConverter[A], midSetter : TupleSetter[R], midConv : TupleConverter[R], endSetter : TupleSetter[(S,T)], monR : Monoid[R], inArity : Arity1, outArity : Arity2) : Self = {

      mapPlusMap(fieldToFields(fs._1) -> productToFields(fs._2))(mapfn)(mapfn2)(startConv, midSetter, midConv, endSetter, monR)

  }

  def mapPlusMap[A,R,S,T,U](fs : (Field[A],(Field[S],Field[T],Field[U])))(mapfn : (A) => R)(mapfn2 : R => (S,T,U))
    (implicit startConv : TupleConverter[A], midSetter : TupleSetter[R], midConv : TupleConverter[R], endSetter : TupleSetter[(S,T,U)], monR : Monoid[R], inArity : Arity1, outArity : Arity3) : Self = {

      mapPlusMap(fieldToFields(fs._1) -> productToFields(fs._2))(mapfn)(mapfn2)(startConv, midSetter, midConv, endSetter, monR)

  }

  def mapPlusMap[A,B,R,S](fs : ((Field[A],Field[B]),Field[S]))(mapfn : ((A,B)) => R)(mapfn2 : R => S)
    (implicit startConv : TupleConverter[(A,B)], midSetter : TupleSetter[R], midConv : TupleConverter[R], endSetter : TupleSetter[S], monR : Monoid[R], inArity : Arity2, outArity : Arity1) : Self = {

      mapPlusMap(productToFields(fs._1) -> fieldToFields(fs._2))(mapfn)(mapfn2)(startConv, midSetter, midConv, endSetter, monR)

  }

  def mapPlusMap[A,B,R,S,T](fs : ((Field[A],Field[B]),(Field[S],Field[T])))(mapfn : ((A,B)) => R)(mapfn2 : R => (S,T))
    (implicit startConv : TupleConverter[(A,B)], midSetter : TupleSetter[R], midConv : TupleConverter[R], endSetter : TupleSetter[(S,T)], monR : Monoid[R], inArity : Arity2, outArity : Arity2) : Self = {

      mapPlusMap(productToFields(fs._1) -> productToFields(fs._2))(mapfn)(mapfn2)(startConv, midSetter, midConv, endSetter, monR)

  }

  def mapPlusMap[A,B,R,S,T,U](fs : ((Field[A],Field[B]),(Field[S],Field[T],Field[U])))(mapfn : ((A,B)) => R)(mapfn2 : R => (S,T,U))
    (implicit startConv : TupleConverter[(A,B)], midSetter : TupleSetter[R], midConv : TupleConverter[R], endSetter : TupleSetter[(S,T,U)], monR : Monoid[R], inArity : Arity2, outArity : Arity3) : Self = {

      mapPlusMap(productToFields(fs._1) -> productToFields(fs._2))(mapfn)(mapfn2)(startConv, midSetter, midConv, endSetter, monR)

  }

  def mapPlusMap[A,B,C,R,S](fs : ((Field[A],Field[B],Field[C]),Field[S]))(mapfn : ((A,B,C)) => R)(mapfn2 : R => S)
    (implicit startConv : TupleConverter[(A,B,C)], midSetter : TupleSetter[R], midConv : TupleConverter[R], endSetter : TupleSetter[S], monR : Monoid[R], inArity : Arity3, outArity : Arity1) : Self = {

      mapPlusMap(productToFields(fs._1) -> fieldToFields(fs._2))(mapfn)(mapfn2)(startConv, midSetter, midConv, endSetter, monR)

  }

  def mapPlusMap[A,B,C,R,S,T](fs : ((Field[A],Field[B],Field[C]),(Field[S],Field[T])))(mapfn : ((A,B,C)) => R)(mapfn2 : R => (S,T))
    (implicit startConv : TupleConverter[(A,B,C)], midSetter : TupleSetter[R], midConv : TupleConverter[R], endSetter : TupleSetter[(S,T)], monR : Monoid[R], inArity : Arity3, outArity : Arity2) : Self = {

      mapPlusMap(productToFields(fs._1) -> productToFields(fs._2))(mapfn)(mapfn2)(startConv, midSetter, midConv, endSetter, monR)

  }

  def mapPlusMap[A,B,C,R,S,T,U](fs : ((Field[A],Field[B],Field[C]),(Field[S],Field[T],Field[U])))(mapfn : ((A,B,C)) => R)(mapfn2 : R => (S,T,U))
    (implicit startConv : TupleConverter[(A,B,C)], midSetter : TupleSetter[R], midConv : TupleConverter[R], endSetter : TupleSetter[(S,T,U)], monR : Monoid[R], inArity : Arity3, outArity : Arity3) : Self = {

      mapPlusMap(productToFields(fs._1) -> productToFields(fs._2))(mapfn)(mapfn2)(startConv, midSetter, midConv, endSetter, monR)

  }

  def count[A](fs : (Field[A],Field[Long]))(fn : (A) => Boolean)
    (implicit conv : TupleConverter[A], arity : Arity1) : Self = {

      count(fieldToFields(fs._1) -> fieldToFields(fs._2))(fn)

  }

  def count[A,B](fs : ((Field[A],Field[B]),Field[Long]))(fn : ((A,B)) => Boolean)
    (implicit conv : TupleConverter[(A,B)], arity : Arity2) : Self = {

      count(productToFields(fs._1) -> fieldToFields(fs._2))(fn)

  }

  def count[A,B,C](fs : ((Field[A],Field[B],Field[C]),Field[Long]))(fn : ((A,B,C)) => Boolean)
    (implicit conv : TupleConverter[(A,B,C)], arity : Arity3) : Self = {

      count(productToFields(fs._1) -> fieldToFields(fs._2))(fn)

  }

  def forall[A](fs : (Field[A],Field[Boolean]))(fn : (A) => Boolean)
    (implicit conv : TupleConverter[A], arity : Arity1) : Self = {

      forall(fieldToFields(fs._1) -> fieldToFields(fs._2))(fn)

  }

  def forall[A,B](fs : ((Field[A],Field[B]),Field[Boolean]))(fn : ((A,B)) => Boolean)
    (implicit conv : TupleConverter[(A,B)], arity : Arity2) : Self = {

      forall(productToFields(fs._1) -> fieldToFields(fs._2))(fn)

  }

  def forall[A,B,C](fs : ((Field[A],Field[B],Field[C]),Field[Boolean]))(fn : ((A,B,C)) => Boolean)
    (implicit conv : TupleConverter[(A,B,C)], arity : Arity3) : Self = {

      forall(productToFields(fs._1) -> fieldToFields(fs._2))(fn)

  }

  def reduce[A](f1 : Field[A])(fn : (A,A) => A)
    (implicit setter : TupleSetter[A], conv : TupleConverter[A], arity : Arity1) : Self = {

      reduce(fieldToFields(f1) -> fieldToFields(f1))(fn)(setter, conv)

  }

  def reduce[A](fs : (Field[A],Field[A]))(fn : (A,A) => A)
    (implicit setter : TupleSetter[A], conv : TupleConverter[A], arity : Arity1) : Self = {

      reduce(fieldToFields(fs._1) -> fieldToFields(fs._2))(fn)(setter, conv)

  }

  def reduce[A,B](f1 : Field[A], f2 : Field[B])(fn : ((A,B),(A,B)) => (A,B))
    (implicit setter : TupleSetter[(A,B)], conv : TupleConverter[(A,B)], arity : Arity2) : Self = {

      reduce(productToFields((f1,f2)) -> productToFields((f1,f2)))(fn)(setter, conv)

  }

  def reduce[A,B](fs : ((Field[A],Field[B]),(Field[A],Field[B])))(fn : ((A,B),(A,B)) => (A,B))
    (implicit setter : TupleSetter[(A,B)], conv : TupleConverter[(A,B)], arity : Arity2) : Self = {

      reduce(productToFields(fs._1) -> productToFields(fs._2))(fn)(setter, conv)

  }

  def reduce[A,B,C](f1 : Field[A], f2 : Field[B], f3 : Field[C])(fn : ((A,B,C),(A,B,C)) => (A,B,C))
    (implicit setter : TupleSetter[(A,B,C)], conv : TupleConverter[(A,B,C)], arity : Arity3) : Self = {

      reduce(productToFields((f1,f2,f3)) -> productToFields((f1,f2,f3)))(fn)(setter, conv)

  }

  def reduce[A,B,C](fs : ((Field[A],Field[B],Field[C]),(Field[A],Field[B],Field[C])))(fn : ((A,B,C),(A,B,C)) => (A,B,C))
    (implicit setter : TupleSetter[(A,B,C)], conv : TupleConverter[(A,B,C)], arity : Arity3) : Self = {

      reduce(productToFields(fs._1) -> productToFields(fs._2))(fn)(setter, conv)

  }

  def plus[A](f1 : Field[A])
    (implicit monoid : Monoid[A], conv : TupleConverter[A], setter : TupleSetter[A], arity : Arity1) : Self = {

      plus(fieldToFields(f1) -> fieldToFields(f1))(monoid, conv, setter)

  }

  def plus[A](fs : (Field[A],Field[A]))
    (implicit monoid : Monoid[A], conv : TupleConverter[A], setter : TupleSetter[A], arity : Arity1) : Self = {

      plus(fieldToFields(fs._1) -> fieldToFields(fs._2))(monoid, conv, setter)

  }

  def plus[A,B](f1 : Field[A], f2 : Field[B])
    (implicit monoid : Monoid[(A,B)], conv : TupleConverter[(A,B)], setter : TupleSetter[(A,B)], arity : Arity2) : Self = {

      plus(productToFields((f1,f2)) -> productToFields((f1,f2)))(monoid, conv, setter)

  }

  def plus[A,B](fs : ((Field[A],Field[B]),(Field[A],Field[B])))
    (implicit monoid : Monoid[(A,B)], conv : TupleConverter[(A,B)], setter : TupleSetter[(A,B)], arity : Arity2) : Self = {

      plus(productToFields(fs._1) -> productToFields(fs._2))(monoid, conv, setter)

  }

  def plus[A,B,C](f1 : Field[A], f2 : Field[B], f3 : Field[C])
    (implicit monoid : Monoid[(A,B,C)], conv : TupleConverter[(A,B,C)], setter : TupleSetter[(A,B,C)], arity : Arity3) : Self = {

      plus(productToFields((f1,f2,f3)) -> productToFields((f1,f2,f3)))(monoid, conv, setter)

  }

  def plus[A,B,C](fs : ((Field[A],Field[B],Field[C]),(Field[A],Field[B],Field[C])))
    (implicit monoid : Monoid[(A,B,C)], conv : TupleConverter[(A,B,C)], setter : TupleSetter[(A,B,C)], arity : Arity3) : Self = {

      plus(productToFields(fs._1) -> productToFields(fs._2))(monoid, conv, setter)

  }

  def times[A](f1 : Field[A])
    (implicit ring : Ring[A], conv : TupleConverter[A], setter : TupleSetter[A], arity : Arity1) : Self = {

      times(fieldToFields(f1) -> fieldToFields(f1))(ring, conv, setter)

  }

  def times[A](fs : (Field[A],Field[A]))
    (implicit ring : Ring[A], conv : TupleConverter[A], setter : TupleSetter[A], arity : Arity1) : Self = {

      times(fieldToFields(fs._1) -> fieldToFields(fs._2))(ring, conv, setter)

  }

  def times[A,B](f1 : Field[A], f2 : Field[B])
    (implicit ring : Ring[(A,B)], conv : TupleConverter[(A,B)], setter : TupleSetter[(A,B)], arity : Arity2) : Self = {

      times(productToFields((f1,f2)) -> productToFields((f1,f2)))(ring, conv, setter)

  }

  def times[A,B](fs : ((Field[A],Field[B]),(Field[A],Field[B])))
    (implicit ring : Ring[(A,B)], conv : TupleConverter[(A,B)], setter : TupleSetter[(A,B)], arity : Arity2) : Self = {

      times(productToFields(fs._1) -> productToFields(fs._2))(ring, conv, setter)

  }

  def times[A,B,C](f1 : Field[A], f2 : Field[B], f3 : Field[C])
    (implicit ring : Ring[(A,B,C)], conv : TupleConverter[(A,B,C)], setter : TupleSetter[(A,B,C)], arity : Arity3) : Self = {

      times(productToFields((f1,f2,f3)) -> productToFields((f1,f2,f3)))(ring, conv, setter)

  }

  def times[A,B,C](fs : ((Field[A],Field[B],Field[C]),(Field[A],Field[B],Field[C])))
    (implicit ring : Ring[(A,B,C)], conv : TupleConverter[(A,B,C)], setter : TupleSetter[(A,B,C)], arity : Arity3) : Self = {

      times(productToFields(fs._1) -> productToFields(fs._2))(ring, conv, setter)

  }

  def toList[A](fs : (Field[A],Field[List[A]]))
    (implicit conv : TupleConverter[A], arity : Arity1) : Self = {

      toList(fieldToFields(fs._1) -> fieldToFields(fs._2))

  }

  def toList[A,B](fs : ((Field[A],Field[B]),Field[List[(A,B)]]))
    (implicit conv : TupleConverter[(A,B)], arity : Arity2) : Self = {

      toList(productToFields(fs._1) -> fieldToFields(fs._2))

  }

  def toList[A,B,C](fs : ((Field[A],Field[B],Field[C]),Field[List[(A,B,C)]]))
    (implicit conv : TupleConverter[(A,B,C)], arity : Arity3) : Self = {

      toList(productToFields(fs._1) -> fieldToFields(fs._2))

  }

  def sortWithTake[A](fs : (Field[A],Field[List[A]]), k : Int)(fn : (A,A) => Boolean)
    (implicit conv : TupleConverter[A], arity : Arity1) : Self = {

      sortWithTake(fieldToFields(fs._1) -> fieldToFields(fs._2), k)(fn)

  }

  def sortWithTake[A,B](fs : ((Field[A],Field[B]),Field[List[(A,B)]]), k : Int)(fn : ((A,B),(A,B)) => Boolean)
    (implicit conv : TupleConverter[(A,B)], arity : Arity2) : Self = {

      sortWithTake(productToFields(fs._1) -> fieldToFields(fs._2), k)(fn)

  }

  def sortWithTake[A,B,C](fs : ((Field[A],Field[B],Field[C]),Field[List[(A,B,C)]]), k : Int)(fn : ((A,B,C),(A,B,C)) => Boolean)
    (implicit conv : TupleConverter[(A,B,C)], arity : Arity3) : Self = {

      sortWithTake(productToFields(fs._1) -> fieldToFields(fs._2), k)(fn)

  }

}

trait TypedFieldsFoldOperations[+Self <: TypedFieldsFoldOperations[Self]] extends TypedFieldsReduceOperations[Self] with FoldOperations[Self] {

  def foldLeft[R,A](fs : (Field[A],Field[R]))(init : R)(fn : (R,A) => R)
    (implicit setter : TupleSetter[R], conv : TupleConverter[A], arity : Arity1) : Self = {

      foldLeft(fieldToFields(fs._1) -> fieldToFields(fs._2))(init)(fn)(setter, conv)

  }

  def foldLeft[R,A,B](fs : ((Field[A],Field[B]),Field[R]))(init : R)(fn : (R,(A,B)) => R)
    (implicit setter : TupleSetter[R], conv : TupleConverter[(A,B)], arity : Arity2) : Self = {

      foldLeft(productToFields(fs._1) -> fieldToFields(fs._2))(init)(fn)(setter, conv)

  }

  def foldLeft[R,A,B,C](fs : ((Field[A],Field[B],Field[C]),Field[R]))(init : R)(fn : (R,(A,B,C)) => R)
    (implicit setter : TupleSetter[R], conv : TupleConverter[(A,B,C)], arity : Arity3) : Self = {

      foldLeft(productToFields(fs._1) -> fieldToFields(fs._2))(init)(fn)(setter, conv)

  }

}

trait TypedFieldsStreamOperations[+Self <: TypedFieldsStreamOperations[Self]] extends StreamOperations[Self] {

  def dropWhile[A](f1 : Field[A])(fn : (A) => Boolean)
    (implicit conv : TupleConverter[A], arity : Arity1) : Self = {

      dropWhile(fieldToFields(f1))(fn)(conv)

  }

  def dropWhile[A,B](f1 : Field[A], f2 : Field[B])(fn : ((A,B)) => Boolean)
    (implicit conv : TupleConverter[(A,B)], arity : Arity2) : Self = {

      dropWhile(productToFields((f1,f2)))(fn)(conv)

  }

  def dropWhile[A,B,C](f1 : Field[A], f2 : Field[B], f3 : Field[C])(fn : ((A,B,C)) => Boolean)
    (implicit conv : TupleConverter[(A,B,C)], arity : Arity3) : Self = {

      dropWhile(productToFields((f1,f2,f3)))(fn)(conv)

  }

  def scanLeft[R,A](fs : (Field[A],Field[R]))(init : R)(fn : (R,A) => R)
    (implicit setter : TupleSetter[R], conv : TupleConverter[A], arity : Arity1) : Self = {

      scanLeft(fieldToFields(fs._1) -> fieldToFields(fs._2))(init)(fn)(setter, conv)

  }

  def scanLeft[R,A,B](fs : ((Field[A],Field[B]),Field[R]))(init : R)(fn : (R,(A,B)) => R)
    (implicit setter : TupleSetter[R], conv : TupleConverter[(A,B)], arity : Arity2) : Self = {

      scanLeft(productToFields(fs._1) -> fieldToFields(fs._2))(init)(fn)(setter, conv)

  }

  def scanLeft[R,A,B,C](fs : ((Field[A],Field[B],Field[C]),Field[R]))(init : R)(fn : (R,(A,B,C)) => R)
    (implicit setter : TupleSetter[R], conv : TupleConverter[(A,B,C)], arity : Arity3) : Self = {

      scanLeft(productToFields(fs._1) -> fieldToFields(fs._2))(init)(fn)(setter, conv)

  }

  def takeWhile[A](f1 : Field[A])(fn : (A) => Boolean)
    (implicit conv : TupleConverter[A], arity : Arity1) : Self = {

      takeWhile(fieldToFields(f1))(fn)(conv)

  }

  def takeWhile[A,B](f1 : Field[A], f2 : Field[B])(fn : ((A,B)) => Boolean)
    (implicit conv : TupleConverter[(A,B)], arity : Arity2) : Self = {

      takeWhile(productToFields((f1,f2)))(fn)(conv)

  }

  def takeWhile[A,B,C](f1 : Field[A], f2 : Field[B], f3 : Field[C])(fn : ((A,B,C)) => Boolean)
    (implicit conv : TupleConverter[(A,B,C)], arity : Arity3) : Self = {

      takeWhile(productToFields((f1,f2,f3)))(fn)(conv)

  }

}

sealed case class Arity private[scalding](arity: Int)
sealed class Arity1 private[scalding] extends Arity(1)
sealed class Arity2 private[scalding] extends Arity(2)
sealed class Arity3 private[scalding] extends Arity(3)

trait Arities {

  implicit val arity1 = new Arity1
  implicit val arity2 = new Arity2
  implicit val arity3 = new Arity3

}
// end of autogenerated
