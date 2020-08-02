name := "swagger-akka-http-sample"

scalaVersion := "2.13.3"

val akkaVersion = "2.6.8"
val akkaHttpVersion = "10.1.12"
val jacksonVersion = "2.11.2"

libraryDependencies ++= Seq(
  "io.swagger" % "swagger-jaxrs" % "1.6.2",
  "com.github.swagger-akka-http" %% "swagger-akka-http" % "1.1.2",
  "com.typesafe.akka" %% "akka-http" % akkaHttpVersion,
  "com.typesafe.akka" %% "akka-http-spray-json" % akkaHttpVersion,
  "com.typesafe.akka" %% "akka-actor" % akkaVersion,
  "com.typesafe.akka" %% "akka-stream" % akkaVersion,
  "com.typesafe.akka" %% "akka-slf4j" % akkaVersion,
  "com.fasterxml.jackson.module" %% "jackson-module-scala" % jacksonVersion,
  "ch.megard" %% "akka-http-cors" % "0.4.3",
  "pl.iterators" %% "kebs-spray-json" % "1.7.1",
  "javax.xml.bind" % "jaxb-api" % "2.3.0", //https://github.com/swagger-akka-http/swagger-akka-http/issues/62
  "org.slf4j" % "slf4j-simple" % "1.7.30"
)
