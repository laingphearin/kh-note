# kh-note

Building note application by simulating evernote

#build jar
mvn clean package -DskipTests 

#run jar with nohup command for ubuntu
nohup java -Duser.timezone=Asia/PhnomPenh -jar kh-note-1.0-SNAPSHOT.jar
