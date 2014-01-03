package models

import play.api.db.slick.Config.driver.simple._

case class User(
    id: Option[Int],
    name: String
    )

object Users extends Table[User]("Users") {
      def id = column[Int]("id", O.PrimaryKey)
      def name = column[String]("name")
      def * = id.? ~ name <> (User.apply _, User.unapply _)


      def findAll(filter: String = "%") = {
          for {
              u <- Users
              if (u.name like ("%" + filter))
          } yield u
      }
/*
      def createSample():Unit = {
        this.insert(1, "hogehoge","hogehoge@example.com")
        this.insert(50, "fugafuga","fugafuga@example.com")
        this.insert(101, "piyopiyo","piyopiyo@example.com")
      }

      def findSample():Unit = {
        Query(this) foreach { case (id:Int, name, email) =>
            println(id + " : " + name + " → "+ email)
        }
      }
*/
}
