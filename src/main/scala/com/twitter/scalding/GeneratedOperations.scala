// following were autogenerated by scripts/operations_generator.rb at Thu Oct 25 13:57:41 -0700 2012 do not edit
package com.twitter.scalding

import cascading.pipe.Pipe
import cascading.tuple.Fields

trait GeneratedRichPipeOperations extends FieldConversions {

  def map[A,T](fs : (Fields,Fields))(fn : A => T)
    (implicit conv : TupleConverter[A], setter : TupleSetter[T]) : Pipe

  def map[A,S](fs : (Field[A],Field[S]))(fn : (A) => S)
    (implicit conv : TupleConverter[A], setter : TupleSetter[S], inArity : Arity1, outArity : Arity1): Pipe = {

      map(fieldToFields(fs._1) -> fieldToFields(fs._2))(fn)(conv, setter)

  }

  def map[A,S,T](fs : (Field[A],(Field[S],Field[T])))(fn : (A) => (S,T))
    (implicit conv : TupleConverter[A], setter : TupleSetter[(S,T)], inArity : Arity1, outArity : Arity2): Pipe = {

      map(fieldToFields(fs._1) -> productToFields(fs._2))(fn)(conv, setter)

  }

  def map[A,S,T,U](fs : (Field[A],(Field[S],Field[T],Field[U])))(fn : (A) => (S,T,U))
    (implicit conv : TupleConverter[A], setter : TupleSetter[(S,T,U)], inArity : Arity1, outArity : Arity3): Pipe = {

      map(fieldToFields(fs._1) -> productToFields(fs._2))(fn)(conv, setter)

  }

  def map[A,B,S](fs : ((Field[A],Field[B]),Field[S]))(fn : ((A,B)) => S)
    (implicit conv : TupleConverter[(A,B)], setter : TupleSetter[S], inArity : Arity2, outArity : Arity1): Pipe = {

      map(productToFields(fs._1) -> fieldToFields(fs._2))(fn)(conv, setter)

  }

  def map[A,B,S,T](fs : ((Field[A],Field[B]),(Field[S],Field[T])))(fn : ((A,B)) => (S,T))
    (implicit conv : TupleConverter[(A,B)], setter : TupleSetter[(S,T)], inArity : Arity2, outArity : Arity2): Pipe = {

      map(productToFields(fs._1) -> productToFields(fs._2))(fn)(conv, setter)

  }

  def map[A,B,S,T,U](fs : ((Field[A],Field[B]),(Field[S],Field[T],Field[U])))(fn : ((A,B)) => (S,T,U))
    (implicit conv : TupleConverter[(A,B)], setter : TupleSetter[(S,T,U)], inArity : Arity2, outArity : Arity3): Pipe = {

      map(productToFields(fs._1) -> productToFields(fs._2))(fn)(conv, setter)

  }

  def map[A,B,C,S](fs : ((Field[A],Field[B],Field[C]),Field[S]))(fn : ((A,B,C)) => S)
    (implicit conv : TupleConverter[(A,B,C)], setter : TupleSetter[S], inArity : Arity3, outArity : Arity1): Pipe = {

      map(productToFields(fs._1) -> fieldToFields(fs._2))(fn)(conv, setter)

  }

  def map[A,B,C,S,T](fs : ((Field[A],Field[B],Field[C]),(Field[S],Field[T])))(fn : ((A,B,C)) => (S,T))
    (implicit conv : TupleConverter[(A,B,C)], setter : TupleSetter[(S,T)], inArity : Arity3, outArity : Arity2): Pipe = {

      map(productToFields(fs._1) -> productToFields(fs._2))(fn)(conv, setter)

  }

  def map[A,B,C,S,T,U](fs : ((Field[A],Field[B],Field[C]),(Field[S],Field[T],Field[U])))(fn : ((A,B,C)) => (S,T,U))
    (implicit conv : TupleConverter[(A,B,C)], setter : TupleSetter[(S,T,U)], inArity : Arity3, outArity : Arity3): Pipe = {

      map(productToFields(fs._1) -> productToFields(fs._2))(fn)(conv, setter)

  }

  def mapTo[A,T](fs : (Fields,Fields))(fn : A => T)
    (implicit conv : TupleConverter[A], setter : TupleSetter[T]) : Pipe

  def mapTo[A,S](fs : (Field[A],Field[S]))(fn : (A) => S)
    (implicit conv : TupleConverter[A], setter : TupleSetter[S], inArity : Arity1, outArity : Arity1): Pipe = {

      mapTo(fieldToFields(fs._1) -> fieldToFields(fs._2))(fn)(conv, setter)

  }

  def mapTo[A,S,T](fs : (Field[A],(Field[S],Field[T])))(fn : (A) => (S,T))
    (implicit conv : TupleConverter[A], setter : TupleSetter[(S,T)], inArity : Arity1, outArity : Arity2): Pipe = {

      mapTo(fieldToFields(fs._1) -> productToFields(fs._2))(fn)(conv, setter)

  }

  def mapTo[A,S,T,U](fs : (Field[A],(Field[S],Field[T],Field[U])))(fn : (A) => (S,T,U))
    (implicit conv : TupleConverter[A], setter : TupleSetter[(S,T,U)], inArity : Arity1, outArity : Arity3): Pipe = {

      mapTo(fieldToFields(fs._1) -> productToFields(fs._2))(fn)(conv, setter)

  }

  def mapTo[A,B,S](fs : ((Field[A],Field[B]),Field[S]))(fn : ((A,B)) => S)
    (implicit conv : TupleConverter[(A,B)], setter : TupleSetter[S], inArity : Arity2, outArity : Arity1): Pipe = {

      mapTo(productToFields(fs._1) -> fieldToFields(fs._2))(fn)(conv, setter)

  }

  def mapTo[A,B,S,T](fs : ((Field[A],Field[B]),(Field[S],Field[T])))(fn : ((A,B)) => (S,T))
    (implicit conv : TupleConverter[(A,B)], setter : TupleSetter[(S,T)], inArity : Arity2, outArity : Arity2): Pipe = {

      mapTo(productToFields(fs._1) -> productToFields(fs._2))(fn)(conv, setter)

  }

  def mapTo[A,B,S,T,U](fs : ((Field[A],Field[B]),(Field[S],Field[T],Field[U])))(fn : ((A,B)) => (S,T,U))
    (implicit conv : TupleConverter[(A,B)], setter : TupleSetter[(S,T,U)], inArity : Arity2, outArity : Arity3): Pipe = {

      mapTo(productToFields(fs._1) -> productToFields(fs._2))(fn)(conv, setter)

  }

  def mapTo[A,B,C,S](fs : ((Field[A],Field[B],Field[C]),Field[S]))(fn : ((A,B,C)) => S)
    (implicit conv : TupleConverter[(A,B,C)], setter : TupleSetter[S], inArity : Arity3, outArity : Arity1): Pipe = {

      mapTo(productToFields(fs._1) -> fieldToFields(fs._2))(fn)(conv, setter)

  }

  def mapTo[A,B,C,S,T](fs : ((Field[A],Field[B],Field[C]),(Field[S],Field[T])))(fn : ((A,B,C)) => (S,T))
    (implicit conv : TupleConverter[(A,B,C)], setter : TupleSetter[(S,T)], inArity : Arity3, outArity : Arity2): Pipe = {

      mapTo(productToFields(fs._1) -> productToFields(fs._2))(fn)(conv, setter)

  }

  def mapTo[A,B,C,S,T,U](fs : ((Field[A],Field[B],Field[C]),(Field[S],Field[T],Field[U])))(fn : ((A,B,C)) => (S,T,U))
    (implicit conv : TupleConverter[(A,B,C)], setter : TupleSetter[(S,T,U)], inArity : Arity3, outArity : Arity3): Pipe = {

      mapTo(productToFields(fs._1) -> productToFields(fs._2))(fn)(conv, setter)

  }

  def flatMap[A,T](fs : (Fields,Fields))(fn : A => Iterable[T])
    (implicit conv : TupleConverter[A], setter : TupleSetter[T]) : Pipe

  def flatMap[A,S](fs : (Field[A],Field[S]))(fn : (A) => Iterable[S])
    (implicit conv : TupleConverter[A], setter : TupleSetter[S], inArity : Arity1, outArity : Arity1): Pipe = {

      flatMap(fieldToFields(fs._1) -> fieldToFields(fs._2))(fn)(conv, setter)

  }

  def flatMap[A,S,T](fs : (Field[A],(Field[S],Field[T])))(fn : (A) => Iterable[(S,T)])
    (implicit conv : TupleConverter[A], setter : TupleSetter[(S,T)], inArity : Arity1, outArity : Arity2): Pipe = {

      flatMap(fieldToFields(fs._1) -> productToFields(fs._2))(fn)(conv, setter)

  }

  def flatMap[A,S,T,U](fs : (Field[A],(Field[S],Field[T],Field[U])))(fn : (A) => Iterable[(S,T,U)])
    (implicit conv : TupleConverter[A], setter : TupleSetter[(S,T,U)], inArity : Arity1, outArity : Arity3): Pipe = {

      flatMap(fieldToFields(fs._1) -> productToFields(fs._2))(fn)(conv, setter)

  }

  def flatMap[A,B,S](fs : ((Field[A],Field[B]),Field[S]))(fn : ((A,B)) => Iterable[S])
    (implicit conv : TupleConverter[(A,B)], setter : TupleSetter[S], inArity : Arity2, outArity : Arity1): Pipe = {

      flatMap(productToFields(fs._1) -> fieldToFields(fs._2))(fn)(conv, setter)

  }

  def flatMap[A,B,S,T](fs : ((Field[A],Field[B]),(Field[S],Field[T])))(fn : ((A,B)) => Iterable[(S,T)])
    (implicit conv : TupleConverter[(A,B)], setter : TupleSetter[(S,T)], inArity : Arity2, outArity : Arity2): Pipe = {

      flatMap(productToFields(fs._1) -> productToFields(fs._2))(fn)(conv, setter)

  }

  def flatMap[A,B,S,T,U](fs : ((Field[A],Field[B]),(Field[S],Field[T],Field[U])))(fn : ((A,B)) => Iterable[(S,T,U)])
    (implicit conv : TupleConverter[(A,B)], setter : TupleSetter[(S,T,U)], inArity : Arity2, outArity : Arity3): Pipe = {

      flatMap(productToFields(fs._1) -> productToFields(fs._2))(fn)(conv, setter)

  }

  def flatMap[A,B,C,S](fs : ((Field[A],Field[B],Field[C]),Field[S]))(fn : ((A,B,C)) => Iterable[S])
    (implicit conv : TupleConverter[(A,B,C)], setter : TupleSetter[S], inArity : Arity3, outArity : Arity1): Pipe = {

      flatMap(productToFields(fs._1) -> fieldToFields(fs._2))(fn)(conv, setter)

  }

  def flatMap[A,B,C,S,T](fs : ((Field[A],Field[B],Field[C]),(Field[S],Field[T])))(fn : ((A,B,C)) => Iterable[(S,T)])
    (implicit conv : TupleConverter[(A,B,C)], setter : TupleSetter[(S,T)], inArity : Arity3, outArity : Arity2): Pipe = {

      flatMap(productToFields(fs._1) -> productToFields(fs._2))(fn)(conv, setter)

  }

  def flatMap[A,B,C,S,T,U](fs : ((Field[A],Field[B],Field[C]),(Field[S],Field[T],Field[U])))(fn : ((A,B,C)) => Iterable[(S,T,U)])
    (implicit conv : TupleConverter[(A,B,C)], setter : TupleSetter[(S,T,U)], inArity : Arity3, outArity : Arity3): Pipe = {

      flatMap(productToFields(fs._1) -> productToFields(fs._2))(fn)(conv, setter)

  }

  def flatMapTo[A,T](fs : (Fields,Fields))(fn : A => Iterable[T])
    (implicit conv : TupleConverter[A], setter : TupleSetter[T]) : Pipe

  def flatMapTo[A,S](fs : (Field[A],Field[S]))(fn : (A) => Iterable[S])
    (implicit conv : TupleConverter[A], setter : TupleSetter[S], inArity : Arity1, outArity : Arity1): Pipe = {

      flatMapTo(fieldToFields(fs._1) -> fieldToFields(fs._2))(fn)(conv, setter)

  }

  def flatMapTo[A,S,T](fs : (Field[A],(Field[S],Field[T])))(fn : (A) => Iterable[(S,T)])
    (implicit conv : TupleConverter[A], setter : TupleSetter[(S,T)], inArity : Arity1, outArity : Arity2): Pipe = {

      flatMapTo(fieldToFields(fs._1) -> productToFields(fs._2))(fn)(conv, setter)

  }

  def flatMapTo[A,S,T,U](fs : (Field[A],(Field[S],Field[T],Field[U])))(fn : (A) => Iterable[(S,T,U)])
    (implicit conv : TupleConverter[A], setter : TupleSetter[(S,T,U)], inArity : Arity1, outArity : Arity3): Pipe = {

      flatMapTo(fieldToFields(fs._1) -> productToFields(fs._2))(fn)(conv, setter)

  }

  def flatMapTo[A,B,S](fs : ((Field[A],Field[B]),Field[S]))(fn : ((A,B)) => Iterable[S])
    (implicit conv : TupleConverter[(A,B)], setter : TupleSetter[S], inArity : Arity2, outArity : Arity1): Pipe = {

      flatMapTo(productToFields(fs._1) -> fieldToFields(fs._2))(fn)(conv, setter)

  }

  def flatMapTo[A,B,S,T](fs : ((Field[A],Field[B]),(Field[S],Field[T])))(fn : ((A,B)) => Iterable[(S,T)])
    (implicit conv : TupleConverter[(A,B)], setter : TupleSetter[(S,T)], inArity : Arity2, outArity : Arity2): Pipe = {

      flatMapTo(productToFields(fs._1) -> productToFields(fs._2))(fn)(conv, setter)

  }

  def flatMapTo[A,B,S,T,U](fs : ((Field[A],Field[B]),(Field[S],Field[T],Field[U])))(fn : ((A,B)) => Iterable[(S,T,U)])
    (implicit conv : TupleConverter[(A,B)], setter : TupleSetter[(S,T,U)], inArity : Arity2, outArity : Arity3): Pipe = {

      flatMapTo(productToFields(fs._1) -> productToFields(fs._2))(fn)(conv, setter)

  }

  def flatMapTo[A,B,C,S](fs : ((Field[A],Field[B],Field[C]),Field[S]))(fn : ((A,B,C)) => Iterable[S])
    (implicit conv : TupleConverter[(A,B,C)], setter : TupleSetter[S], inArity : Arity3, outArity : Arity1): Pipe = {

      flatMapTo(productToFields(fs._1) -> fieldToFields(fs._2))(fn)(conv, setter)

  }

  def flatMapTo[A,B,C,S,T](fs : ((Field[A],Field[B],Field[C]),(Field[S],Field[T])))(fn : ((A,B,C)) => Iterable[(S,T)])
    (implicit conv : TupleConverter[(A,B,C)], setter : TupleSetter[(S,T)], inArity : Arity3, outArity : Arity2): Pipe = {

      flatMapTo(productToFields(fs._1) -> productToFields(fs._2))(fn)(conv, setter)

  }

  def flatMapTo[A,B,C,S,T,U](fs : ((Field[A],Field[B],Field[C]),(Field[S],Field[T],Field[U])))(fn : ((A,B,C)) => Iterable[(S,T,U)])
    (implicit conv : TupleConverter[(A,B,C)], setter : TupleSetter[(S,T,U)], inArity : Arity3, outArity : Arity3): Pipe = {

      flatMapTo(productToFields(fs._1) -> productToFields(fs._2))(fn)(conv, setter)

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