organization := "com.kifi"

name := "juggle"

version := "1.0.0"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2-core" % "3.6" % "test",
  "com.typesafe.akka" %% "akka-actor" % "2.3.14"
)

resolvers ++= Seq(
  "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases",
  "Akka Snapshot Repository" at "http://repo.akka.io/snapshots/"
)

publishMavenStyle := true

publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases"  at nexus + "service/local/staging/deploy/maven2")
}

publishArtifact in Test := false

pomIncludeRepository := { _ => false }

pomExtra := (
  <url>https://github.com/kifi/juggle</url>
  <licenses>
    <license>
      <name>MIT</name>
      <url>http://opensource.org/licenses/MIT</url>
      <distribution>repo</distribution>
    </license>
  </licenses>
  <scm>
    <url>git@github.com:kifi/juggle.git</url>
    <connection>scm:git:git@github.com:kifi/juggle.git</connection>
  </scm>
  <developers>
    <developer>
      <id>leogrim</id>
      <name>Léo Grimaldi</name>
      <url>https://github.com/leogrim</url>
    </developer>
  </developers>)
