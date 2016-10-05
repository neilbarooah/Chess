# chess

- Fonts:
  - need unicode characters for pieces
  - add unicode encoding to build
- useful things:
  - http://code.makery.ch/blog/javafx-dialogs-official/
- Project requires at least jdk-8u40
  - this is necessary for Alert class (dialog boxes)
  - update jdk: http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
  - proof: https://docs.oracle.com/javase/8/javafx/api/javafx/scene/control/Alert.html


### Compiling & Running
There are two ways to compile & run the code in this project.

1. `sbt compile` and `sbt run`
2.  Manually:
   1.  Create the folders "target/classes" with `mkdir -p target/classes` on Linux/Mac or `mkdir target\classes` on Windows.
   2.  `javac -encoding utf8 -d target/classes/ -cp src/main/java/ src/main/java/boardview/ChessFX.java` to compile
   3.  `java -cp target/classes boardview.ChessFX` to run
