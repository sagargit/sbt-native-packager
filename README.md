# sbt-native-packager-demo

This project uses sbt-native-packager to run inside the docker container.
To run this project inside docker:

$ sbt docker:publishLocal

$ docker run -d -p 8080:8080 sbt-native-packager-demo:1.0 // runs as a daemon
