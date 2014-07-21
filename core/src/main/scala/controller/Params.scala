package io.prediction.controller

trait Params extends Serializable {}

// Concrete helper classes
case class EmptyParams() extends Params {
  override
  def toString(): String = "Empty"
}
