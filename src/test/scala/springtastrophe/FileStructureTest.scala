package springtastrophe

import java.io.File

import org.scalatest.{Matchers, FlatSpec}

class FileStructureTest extends FlatSpec with Matchers {
  "A file reader"  should "find a file in a package containing a java ... erm file" in {
    val d = Directory("./src/test/java/nonEmptyPackage")

    d.isEmpty should be (false)
  }

  it should "know it's a java file" in {
    val d = Directory("./src/test/java/nonEmptyPackage")

    val f1 = new File("./src/test/java/nonEmptyPackage/NoAnnotationThere.java")
    val f2 = new File("./src/test/java/nonEmptyPackage/SomeAnnotationThere.java")

    val ls = List(f1, f2)

    d.contents should be (ls)

    ls.foldRight(true)((i,j) => FileStructure.isJavaFile(i) && j) should be (true)
  }
}
