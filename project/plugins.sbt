unmanagedSourceDirectories in Compile += baseDirectory.value.getParentFile / "src" / "main" / "scala"

addSbtPlugin("com.lightbend.sbt" % "sbt-aspectj" % "0.11.0")
addSbtPlugin("com.github.gseitz" % "sbt-release" % "1.0.7")
//addSbtPlugin("com.geirsson" % "sbt-scalafmt" % "1.1.0")
addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.9.0")
addSbtPlugin("pl.project13.scala" % "sbt-jmh" % "0.2.18")
addSbtPlugin("com.eed3si9n" % "sbt-doge" % "0.1.5")
