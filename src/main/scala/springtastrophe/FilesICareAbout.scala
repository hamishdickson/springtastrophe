package springtastrophe

import java.io.File

sealed trait FilesICareAbout
case class JavaFile(f: File) extends FilesICareAbout
case class OtherFile(f: File) extends FilesICareAbout