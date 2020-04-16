resolvers += Classpaths.typesafeReleases

addSbtPlugin("com.typesafe.sbt" %% "sbt-native-packager" % "1.4.1")

addSbtPlugin("com.typesafe.sbt" %% "sbt-multi-jvm" % "0.4.0")

addSbtPlugin("com.typesafe.sbt" %% "sbt-git" % "1.0.0")

addSbtPlugin("com.orrsella" %% "sbt-sublime" % "1.1.2")

addSbtPlugin("org.scoverage" %% "sbt-scoverage" % "1.6.1")

addSbtPlugin("com.jsuereth" %% "sbt-pgp" % "2.0.0")

addSbtPlugin("com.geirsson" % "sbt-ci-release" % "1.5.2")

addSbtPlugin("org.xerial.sbt" %% "sbt-sonatype" % "3.9.2")

addSbtPlugin("com.github.gseitz" % "sbt-release" % "1.0.8")
