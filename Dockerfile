FROM sopheap/car_check:1.0.1
WORKDIR /usr/src
ADD ./ .
RUN  mvn clean package
ENTRYPOINT ["java", "-jar", "note/target/kh-note-1.0-SNAPSHOT.jar"]

FROM openjdk:17.0.2-jdk
WORKDIR /usr/src/app
COPY --from=0 /usr/src/note/target/kh-note-1.0-SNAPSHOT.jar kh-note-1.0-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "kh-note-1.0-SNAPSHOT.jar"]
