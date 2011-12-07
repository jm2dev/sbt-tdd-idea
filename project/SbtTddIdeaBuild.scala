import sbt._
import Keys._
import BuildSettings._

object SbtTddIdeasBuild extends Build { 


  lazy val root = Project(id = "sbt-samples",
                        base = file("."),
                        settings = buildSettings)
}
