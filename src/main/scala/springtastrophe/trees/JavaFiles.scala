package springtastrophe.trees

import java.lang.annotation.Annotation

case class JavaClass[A](c: Class[A]) {
  val annotations: List[String] = {
    val as: List[Annotation] = c.getAnnotations.toList

    as map { case _ => "AARGH" }
  }

  //val methods: List[JavaMethod] = ???
}

case class JavaMethod[A, M](m: M) {
  val annotationValuesOnMethod: String = ???

  val annotationValuesOnParameters: List[String] = ???
}