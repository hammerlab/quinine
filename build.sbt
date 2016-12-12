organization := "org.hammerlab.quinine"
name := "quinine-core"
version := "0.0.3-SNAPSHOT"
description := "Read and Variant QC Metrics"

addSparkDeps

sparkVersion := "1.6.1"
hadoopVersion := "2.6.2"
scalatestVersion := "2.2.5"
bdgUtilsVersion := "0.2.4"

val adamCore = "org.bdgenomics.adam" %% "adam-core" % "0.19.0"

libraryDependencies ++= Seq(
  adamCore,
  libraries.value('bdg_utils_misc),
  libraries.value('log4j),
  "org.bdgenomics.bdg-formats" % "bdg-formats" % "0.7.0"
)

testDeps := Seq(libraries.value('scalatest))

testJarTestDeps ++= Seq(
  adamCore,
  libraries.value('bdg_utils_misc)
)

enableScalariform
