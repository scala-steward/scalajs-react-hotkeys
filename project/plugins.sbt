val scalaJSVersion =
  Option(System.getenv("SCALAJS_VERSION")).getOrElse("0.6.33")

addSbtPlugin("org.scala-js" % "sbt-scalajs" % scalaJSVersion)

addSbtPlugin("ch.epfl.scala" % "sbt-scalajs-bundler-sjs06" % "0.17.0")

addSbtPlugin("com.geirsson" % "sbt-ci-release" % "1.5.2")

addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.4.0")
