package springtastrophe

/**
  * ADT for a java project's file structure
  */

trait JavaProject
case object DontCare extends JavaProject
case class Dir(ls: List[JavaProject]) extends JavaProject
case class JavaFile(code: String) extends JavaProject

object JavaProject {

}