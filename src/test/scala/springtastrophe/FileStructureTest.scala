package springtastrophe

import org.scalatest.{Matchers, FlatSpec}

class FileStructureTest extends FlatSpec with Matchers {
  "A file reader"  should "find a file in a package containing a java ... erm file" in {
    val d = Directory("./src/test/java/nonEmptyPackage")

    d.isEmpty should be (false)
  }

  ignore should "know it's a java file" in {
    val d = Directory("./src/test/java/nonEmptyPackage")

    val ls = List("./src/test/java/nonEmptyPackage/NoAnnotationThere.java", "./src/test/java/nonEmptyPackage/SomeAnnotationThere.java")

    d.contents should be (ls)
  }
}
