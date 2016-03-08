package springtastrophe.trees

case class JavaClass[A](c: A) {
  val annotationValues: List[String] = ???

  val methods: List[JavaMethod] = ???
}

case class JavaMethod[A, M](m: M) {
  val annotationValuesOnMethod: String = ???

  val annotationValuesOnParameters: List[String] = ???
}
