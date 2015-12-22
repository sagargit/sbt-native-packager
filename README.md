# sbt-native-packager-demo

This project uses sbt-native-packager to run inside the docker container.
To run this project inside docker:

$ sbt docker:publishLocal

$ docker images // shows the all images

$ docker run -d -p 8080:8080 sbt-native-packager-demo:1.0 // runs as a daemon and creates a container, maps container port to localhost:8080

$ docker ps -a // shows all the containers

$ docker stop container_name // stops the container

$ docker start container_name //
