organization := "com.oracle"

name := "location-ai"

version := "0.1"

autoScalaLibrary := false

crossPaths := false

EclipseKeys.projectFlavor := EclipseProjectFlavor.Java

//mainClass in (Compile, run) := Some( "somepackage.MainClassName")

libraryDependencies ++= Seq( 
    "junit" % "junit" % "4.10",
    "com.novocode" % "junit-interface" % "0.10-M1" % "test"
    )
