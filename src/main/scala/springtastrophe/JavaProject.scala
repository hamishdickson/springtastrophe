package springtastrophe

/**
  * ADT for a java project's file structure
  *
  * implementation idea .... a fold.... can be a monoid ... can paralise...
  */

sealed trait JavaProject
case object DontCare extends JavaProject
case class Dir(ls: List[JavaProject]) extends JavaProject
case class JavaFile(code: String) extends JavaProject
