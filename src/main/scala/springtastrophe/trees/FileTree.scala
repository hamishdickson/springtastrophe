package springtastrophe.trees

/**
  * General ADT for a file type `A`
  */

sealed trait FileTree[+A]
case object EmptyDir extends FileTree[Nothing]
final case class FileA[A](f: A) extends FileTree[A]
final case class FileDirectory[A](d: List[A]) extends FileTree[A]