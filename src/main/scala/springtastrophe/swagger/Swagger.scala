package springtastrophe.swagger

import io.circe._, io.circe.generic.auto._, io.circe.parser._, io.circe.syntax._

sealed trait Swagger

final case class Body(swagger: String, info: Info, host: String, basePath: String, schemes: Option[List[String]], consumes: Option[List[String]], produces: Option[List[String]], paths: Option[Map[String, Path]], definitions: Option[Map[String, Definition]]) extends Swagger
final case class Info(version: String, title: String, description: String, termsOfService: String, contact: Option[Contact], licence: Option[Licence]) extends Swagger
final case class Contact(name: String, email: String, url: String) extends Swagger
final case class Licence(name: String, url: String) extends Swagger

// todo: Implement
final case class Path()
final case class Definition()

object Swagger {
  def toJsonString(s: Body): String = s.asJson.noSpaces.toString
}