package springtastrophe.swagger

import org.scalatest.{FlatSpec, Matchers}


import io.circe._, io.circe.generic.auto._, io.circe.parser._, io.circe.syntax._

class SwaggerTest extends FlatSpec with Matchers {
  "A Swagger definition" should "match something something something" in {
    val out: String = """{"swagger":"2.0","info":{"version":"1.0.0","title":"Swagger Petstore","description":"A sample API that uses a petstore as an example to demonstrate features in the swagger-2.0 specification","termsOfService":"http://swagger.io/terms/","contact":null,"licence":null},"host":"petstore.swagger.io","basePath":"/api","schemes":null,"consumes":null,"produces":null,"paths":null,"definitions":null}"""

    val info: Info = Info("1.0.0", "Swagger Petstore", "A sample API that uses a petstore as an example to demonstrate features in the swagger-2.0 specification", "http://swagger.io/terms/", None, None)
    val b: Body = Body("2.0", info, "petstore.swagger.io", "/api", None, None, None, None, None)

    b.asJson.noSpaces should be (out)
  }
}
