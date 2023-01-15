addSbtPlugin("org.jetbrains" % "sbt-ide-settings" % "1.1.0")
// Linter
addSbtPlugin("org.wartremover" % "sbt-wartremover" % "3.0.9")
addSbtPlugin("org.scalameta"   % "sbt-scalafmt"    % "2.5.0")
// Publish helper
addSbtPlugin("com.dwijnand" % "sbt-dynver" % "4.1.1")
// Site generator
addSbtPlugin("com.typesafe.sbt" % "sbt-site" % "1.4.1")
// Publish pages
addSbtPlugin("io.kevinlee" % "sbt-github-pages" % "0.12.0")
// Coverage
addSbtPlugin("org.scoverage" % "sbt-scoverage" % "2.0.0")
// Sonatype upload
addSbtPlugin("com.github.sbt" % "sbt-ci-release"       % "1.5.11")
addSbtPlugin("org.xerial.sbt" % "sbt-sonatype"         % "3.9.15")
addSbtPlugin("io.shiftleft"   % "sbt-ci-release-early" % "2.0.37") //for auto-tagging
