name := "manaus-lib"

organization := "com.getjenny"

crossScalaVersions := Seq("2.12.10")

resolvers ++= Seq("Typesafe Repository" at "https://repo.typesafe.com/typesafe/releases/",
  Resolver.bintrayRepo("hseeberger", "maven"))

libraryDependencies ++= {
  val BreezeVersion     = "1.0"
  val ScalatestVersion  = "3.1.1"
  val ScoptVersion      = "3.7.0"
  val LogbackVersion	= "1.2.3"
  Seq(
    "org.scalatest" %% "scalatest" % ScalatestVersion % "test",
    "org.scalanlp" %% "breeze" % BreezeVersion,
    "org.scalanlp" %% "breeze-natives" % BreezeVersion,
    "org.apache.logging.log4j" % "log4j-api" % "2.9.1",
    "org.apache.logging.log4j" % "log4j-core" % "2.9.1",
    "ch.qos.logback"  %  "logback-classic" % LogbackVersion,
    "com.typesafe.scala-logging" %% "scala-logging" % "3.7.2",
    "com.github.scopt" %% "scopt" % ScoptVersion
  )
}

scalacOptions += "-deprecation"
scalacOptions += "-feature"

enablePlugins(GitBranchPrompt)
enablePlugins(GitVersioning)
enablePlugins(UniversalPlugin)

git.useGitDescribe := true

releaseCrossBuild := true

publishMavenStyle := true

publishArtifact in Test := false

pomIncludeRepository := { _ => false }

excludeFilter in unmanagedResources := HiddenFileFilter || "log*.xml"

homepage := Some(url("http://www.getjenny.com"))

scmInfo := Some(
  ScmInfo(
    url("https://github.com/GetJenny/manaus-lib"),
    "scm:git@github.com:GetJenny/manaus-lib.git"
  )
)

developers := List(
  Developer(
    id    = "angleto",
    name  = "Angelo Leto",
    email = "angelo@getjenny.com",
    url   = url("http://www.getjenny.com")
  )
)

licenses := Seq(("GPLv2", url("https://www.gnu.org/licenses/old-licenses/gpl-2.0.md")))

