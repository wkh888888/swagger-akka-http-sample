name := "swagger-akka-http-sample"

scalaVersion := "2.12.6"

resolvers += Resolver.sonatypeRepo("releases")
resolvers += Resolver.sonatypeRepo("snapshots")

val akkaVersion = "2.5.13"
val akkaHttpVersion = "10.1.1"

libraryDependencies ++= Seq(
  "io.swagger" % "swagger-jaxrs" % "1.5.20",
  "com.github.swagger-akka-http" %% "swagger-akka-http" % "0.14.1-SNAPSHOT",
  "com.typesafe.akka" %% "akka-http" % akkaHttpVersion,
  "com.typesafe.akka" %% "akka-http-spray-json" % akkaHttpVersion,
  "com.typesafe.akka" %% "akka-actor" % akkaVersion,
  "com.typesafe.akka" %% "akka-stream" % akkaVersion,
  "com.typesafe.akka" %% "akka-slf4j" % akkaVersion,
  "ch.megard" %% "akka-http-cors" % "0.3.0",
  "javax.xml.bind" % "jaxb-api" % "2.3.0", //https://github.com/swagger-akka-http/swagger-akka-http/issues/62
  "org.slf4j" % "slf4j-simple" % "1.7.25"
)
