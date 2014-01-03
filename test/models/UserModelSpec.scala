package test.models

import org.specs2.mutable._

import play.api.test._
import play.api.test.Helpers._

import models.Users

class UserModelSpec extends Specification {

  "UserModel" should {
    "Ormapper" in {
        "or" must have size(2)
    }
  }
}
