name := "manaus-lib"

organization := "com.getjenny"

crossScalaVersions := Seq("2.12.6", "2.11.11")

resolvers ++= Seq("Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/",
  Resolver.bintrayRepo("hseeberger", "maven"))

libraryDependencies ++= {
  val BreezeVersion     = "0.13.2"
  Seq(
    "org.scalatest" %% "scalatest" % "3.0.1" % "test",
    "org.scalanlp" %% "breeze" % BreezeVersion,
    "org.scalanlp" %% "breeze-natives" % BreezeVersion,
    "org.apache.logging.log4j" % "log4j-api" % "2.9.1",
    "org.apache.logging.log4j" % "log4j-core" % "2.9.1",
    "ch.qos.logback"    %  "logback-classic" % "1.2.3",
    "com.typesafe.scala-logging" %% "scala-logging" % "3.7.2",
    "com.github.scopt" %% "scopt" % "3.7.0"
  )
}

scalacOptions += "-deprecation"
scalacOptions += "-feature"

enablePlugins(GitBranchPrompt)
enablePlugins(GitVersioning)
enablePlugins(UniversalPlugin)

git.useGitDescribe := true

publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases"  at nexus + "service/local/staging/deploy/maven2")
}

isSnapshot := true

releaseCrossBuild := true

publishMavenStyle := true

publishArtifact in Test := false

pomIncludeRepository := { _ => false }

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

releaseProcess := Seq[ReleaseStep](
		releaseStepCommand("sonatypeOpen \"com.getjenny\" \"manaus-lib\""),
		releaseStepCommand("publishSigned"),
		releaseStepCommand("sonatypeRelease")
)

licenses := Seq(("GPLv2", url("https://www.gnu.org/licenses/old-licenses/gpl-2.0.md")))

