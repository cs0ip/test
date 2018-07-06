scalaVersion    := "2.12.6"

organization    := "cs0ip"
name            := "test"
version         := "0.0.1"

libraryDependencies ++= {
  import Dependency._

  val compile = List(
    catsCore,
    catsFree,
    alleyCatsCore,
    catsEffect,
    circeCore
  )

  val test = List(scalaTest)

  compile ++ test.map(_ % Test)
}

resolvers ++= Seq(
  Resolver.typesafeIvyRepo("releases"),
  Resolver.sonatypeRepo("releases")
)

scalacOptions ++= List(
  "-deprecation",
  "-feature",
  "-Xfatal-warnings",
  //"-Xlint",
  "-Ypartial-unification"
)

addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.1" cross CrossVersion.full)
