[SBT scala example]: https://github.com/harrah/xsbt/wiki/Full-Configuration-Example
[MVN repository]: http://mvnrepository.com
[LICENSE]: https://github.com/harrah/xsbt/blob/0.11/LICENSE

# Basic SBT project with TDD dependencies and idea plugin

# Introduction

Clone this repository to have a basic SBT project using TDD.

I followed [SBT scala example].

I recommend [MVN repository] as a valuable resource for finding dependencies.

# Usage

Start sbt

  $ sbt
  > test
  > run-main com.jm2dev.App

The project I'm currently involved in use intellij idea

  $ sbt
  > gen-idea no-sbt-classifiers

but a terminal and a plain text editor are the only tools a programmer need.

# License

See xsbt [LICENSE].
