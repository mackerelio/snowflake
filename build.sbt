name := "snowflake-lib"

version := "1.1.0-SNAPSHOT"

scalaVersion := "2.13.18"

crossScalaVersions := List("2.13.18", "3.3.8")

libraryDependencies ++= Seq(
  "org.specs2" % "specs2-core_2.13" % "4.20.6" % Test,
  "junit" % "junit" % "4.13.2" % Test
)

scalacOptions ++= {
  scalaBinaryVersion.value match {
    case "2.13" =>
      Seq("-Xsource:3-cross")
    case _ =>
      Nil
  }
}
