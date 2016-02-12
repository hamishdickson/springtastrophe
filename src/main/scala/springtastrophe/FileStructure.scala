package springtastrophe

import java.io.File

sealed trait FileStructure {
  /**
    * A recursive search over a directory and it's sub directories to find files
    *
    * rewrite this - I think you can do this with a fold - which is cool since you can paralise a monoid
    */
  def whatsInADir(f: File): List[File] = {
    val fs = f.listFiles.toList
    fs ++ fs.filter(_.isDirectory).flatMap(whatsInADir)
  }
}
case object Empty extends FileStructure
case class Directory(d: String) extends FileStructure {
  def contents: List[File] = whatsInADir(new File(d))

  def isEmpty: Boolean = whatsInADir(new File(d)).isEmpty
}

object FileStructure {
  def fileType(f: File): FilesICareAbout = {
    if (f.getName.endsWith(".java"))
      JavaFile(f)
    else
      OtherFile(f)
  }

  def isJavaFile(f: File): Boolean = fileType(f) match {
    case JavaFile(_) => true
    case _ => false
  }
}