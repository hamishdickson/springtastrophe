package springtastrophe

import org.scalatest.{Matchers, FlatSpec}

class FileStructureTest extends FlatSpec with Matchers {
  "A file reader" should "not find anything if the dir has no java annotations" in {
    val d = Directory("./src/test/java/emptyPackage")

    d.isEmpty should be (true)
  }

  it should "find a class in a package containing a java file" in {
    val d = Directory("./src/test/java/nonEmptyPackage")

    d.isEmpty should be (false)
  }
}
