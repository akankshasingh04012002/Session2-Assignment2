ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

lazy val root = (project in file("."))
  .settings(
    name := "Session2-Assignment2"
  )
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.15" % "test"