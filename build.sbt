name := "sbt-native-packager-demo"

version := "1.0"

scalaVersion := "2.11.7"

enablePlugins(JavaAppPackaging)

enablePlugins(DockerSpotifyClientPlugin)

resolvers += "spray repo" at "http://repo.spray.io"

libraryDependencies ++= Seq(
  "io.spray" % "spray-can_2.11" % "1.3.3",
  "io.spray" % "spray-routing_2.11" % "1.3.3",
  "com.typesafe.akka" % "akka-actor_2.11" % "2.3.9"
)

    