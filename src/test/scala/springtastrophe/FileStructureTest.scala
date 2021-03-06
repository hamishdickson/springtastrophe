package springtastrophe

import java.io.File

import org.scalatest.{Matchers, FlatSpec}

class FileStructureTest extends FlatSpec with Matchers {
  "A file reader"  should "find a file in a package containing a java ... erm file" in {
    val d = Directory("./src/test/java/nonEmptyPackage")

    d.isEmpty should be (false)
  }

  it should "be able to see all files in a directory" in {
    val d = Directory("./src/test/java/nonEmptyPackage")

    val f1 = new File("./src/test/java/nonEmptyPackage/NoAnnotationThere.java")
    val f2 = new File("./src/test/java/nonEmptyPackage/SomeAnnotationThere.java")
    val f3 = new File("./src/test/java/nonEmptyPackage/notARealFilejava.txt")

    d.contents should contain (f1)
    d.contents should contain (f2)
    d.contents should contain (f3)
  }

  it should "know what a java file is" in {
    val d = Directory("./src/test/java/justJavaFiles")

    d.contents.foldRight(true)((i,j) => FileStructure.isJavaFile(i) && j) should be (true)
  }

  it should "be able to scan folders and create a list of all java files" in {
    val d = Directory("./src/test/java/nonEmptyPackage")

    val f1 = new File("./src/test/java/nonEmptyPackage/NoAnnotationThere.java")
    val f2 = new File("./src/test/java/nonEmptyPackage/SomeAnnotationThere.java")

    val fs = d.javaFiles

    fs.size should be (2)

    fs should contain (f1)
    fs should contain (f2)
  }

  it should "be able to get the class files" in {
    (pending)
    val d = Directory("./src/test/java/nonEmptyPackage")
/*
    val cs = d.javaFileNames

    cs.size should be (2)*/
  }

  it should "be able to work out which files have annotations" in {
    (pending)
    /**
      * todo - I'm pretty sure I'm going to need a macro from this point onwards
      */
  }
}
