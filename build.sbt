name := "hello-mainargs-scala"

version := "0.1"

libraryDependencies ++= Seq(
  "com.lihaoyi" %% "mainargs" % "0.7.8",
  "org.scalatest"  %% "scalatest"  % "3.2.20"  % Test
)

enablePlugins(JavaAppPackaging)
