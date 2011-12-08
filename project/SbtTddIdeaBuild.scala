import sbt._
import Keys._
import BuildSettings._
import Dependencies._

object SbtTddIdeasBuild extends Build { 

  val commonDeps = Seq(scalatest)

  lazy val root = Project(id = "sbt-samples",
                        base = file("."),
                        settings = buildSettings ++ Seq (libraryDependencies ++= commonDeps))
}
