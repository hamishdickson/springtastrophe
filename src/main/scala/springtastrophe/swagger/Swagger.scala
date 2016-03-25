package springtastrophe.swagger

sealed trait Swagger

final case class Body(swagger: String, info: Info, host: String, basePath: String, schemes: Option[List[String]], consumes: Option[List[String]], produces: Option[List[String]], paths: Option[Map[String, Path]], definitions: Option[Map[String, Definition]]) extends Swagger
final case class Info(version: String, title: String, description: String, termsOfService: String, contact: Option[Contact], licence: Option[Licence]) extends Swagger
final case class Contact(name: String, email: String, url: String) extends Swagger
final case class Licence(name: String, url: String) extends Swagger

// todo: Implement
final case class Path() extends Swagger
final case class Definition() extends Swagger
