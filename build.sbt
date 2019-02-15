name := "untitled"

version := "0.1"

scalaVersion := "2.12.8"


lazy val root = (project in file(".")).enablePlugins(PlayScala)

resolvers += "HMRC Releases" at "https://dl.bintray.com/hmrc/releases"

libraryDependencies += guice
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % "test"
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "3.1.2" % "test"