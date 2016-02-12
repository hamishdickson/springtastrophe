package springtastrophe

import java.io.File

sealed trait FileStructure[+A]
case object Empty extends FileStructure[Nothing]
case class ActualFile[A](f: A) extends FileStructure[A]
case class Directory[A](d: String) extends FileStructure[A] {
  def isEmpty: Boolean = whatsInADir(new File(d)).isEmpty

  /**
    * A recursive search over a directory and it's sub directories to find files
    */
  def whatsInADir(f: File): List[File] = {
    val fs = f.listFiles.toList
    fs ++ fs.filter(_.isDirectory).flatMap(whatsInADir)
  }
}

object FileStructure {
}