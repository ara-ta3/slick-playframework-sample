import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "OrMapper"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    // Add your project dependencies here,
    jdbc,
    anorm,
    "mysql" % "mysql-connector-java" % "5.1.18",
    "com.typesafe" % "slick_2.10.0-RC5" % "0.11.2",
    "com.typesafe.play" %% "play-slick" % "0.3.2"
  )


  val main = play.Project(appName, appVersion, appDependencies).settings(
    // Add your own project settings here      
  )

}
