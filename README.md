# kh-note

Building garage application to record car fixing record.

# build and package
mvn clean package
#start sever, need to run
1. docker compose up
2. nohup java -Duser.timezone=Asia/PhnomPenh -jar kh-note-1.0-SNAPSHOT.jar

#stop server
pkill -f 'java.*kh-note-1.0-SNAPSHOT.jar'

#Swagger
http://localhost:8080/swagger-ui/index.html