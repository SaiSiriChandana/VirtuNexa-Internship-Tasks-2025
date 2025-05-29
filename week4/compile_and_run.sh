
#!/bin/bash
mkdir -p build
javac -d build -cp ".:sqlite-jdbc-3.36.0.3.jar" src/**/*.java
java -cp "build:sqlite-jdbc-3.36.0.3.jar" Main
