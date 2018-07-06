import sbt._

object Dependency {

  object Version {
    val akka = "2.5.12"
    val akkaHttp = "10.1.1"
    val cats = "1.1.0"
    val circe = "0.9.3"
    val doobie = "0.5.3"
    val macwire = "2.3.1"
    val enumeratum = "1.5.13"
  }

  val akka = "com.typesafe.akka" %% "akka-actor" % Version.akka
  val akkaTestkit = "com.typesafe.akka" %% "akka-testkit" % Version.akka

  val akkaStream = "com.typesafe.akka" %% "akka-stream" % Version.akka
  val akkaStreamTestkit = "com.typesafe.akka" %% "akka-stream-testkit" % Version.akka

  val akkaHttp = "com.typesafe.akka" %% "akka-http" % Version.akkaHttp
  val akkaHttpTestkit = "com.typesafe.akka" %% "akka-http-testkit" % Version.akkaHttp

  val akkaHttpCirce = "de.heikoseeberger" %% "akka-http-circe" % "1.20.1"
  val akkaHttpCors = "ch.megard" %% "akka-http-cors" % "0.3.0"

  val akkaHttpSwagger = "com.github.swagger-akka-http" %% "swagger-akka-http" % "0.14.1"

  val swakka =  "net.jtownson" %% "swakka" % "0.51"

  val scalaTest = "org.scalatest" %% "scalatest" % "3.0.5"

  val catsCore = "org.typelevel" %% "cats-core" % Version.cats
  val catsFree = "org.typelevel" %% "cats-free" % Version.cats
  val alleyCatsCore = "org.typelevel" %% "alleycats-core" % Version.cats

  val catsEffect = "org.typelevel" %% "cats-effect" % "1.0.0-RC"

  val circeCore = "io.circe" %% "circe-core" % Version.circe
  val circeGeneric = "io.circe" %% "circe-generic" % Version.circe
  val circeGenericExtras = "io.circe" %% "circe-generic-extras" % Version.circe
  val circeParser = "io.circe" %% "circe-parser" % Version.circe
  val circeShapes = "io.circe" %% "circe-shapes" % Version.circe
  val circeJava8 = "io.circe" %% "circe-java8" % Version.circe

  val doobieCore = "org.tpolecat" %% "doobie-core" % Version.doobie
  val doobiePostgres = "org.tpolecat" %% "doobie-postgres" % Version.doobie
  val doobieHikari = "org.tpolecat" %% "doobie-hikari" % Version.doobie
  val doobieScalatest = "org.tpolecat" %% "doobie-scalatest" % Version.doobie

  val logback = "ch.qos.logback" % "logback-classic" % "1.2.3"

  val scalaLogging = "com.typesafe.scala-logging" %% "scala-logging" % "3.9.0"

  val apacheCommonCodecs = "commons-codec" % "commons-codec" % "1.11"

  val scalaConductrBundleLib = "com.typesafe.conductr" %% "scala-conductr-bundle-lib" % "1.9.0"

  val macwireMacros = "com.softwaremill.macwire" %% "macros" % Version.macwire
  val macwireUtil = "com.softwaremill.macwire" %% "util" % Version.macwire
  val macwireProxy = "com.softwaremill.macwire" %% "proxy" % Version.macwire

  val pureConfig = "com.github.pureconfig" %% "pureconfig" % "0.9.1"

  val fastParse = "com.lihaoyi" %% "fastparse" % "1.0.0"

  val enumeratum = "com.beachape" %% "enumeratum" % Version.enumeratum
  val enumeratumCirce = "com.beachape" %% "enumeratum-circe" % Version.enumeratum
}
