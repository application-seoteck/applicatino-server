FROM amazoncorretto:17
WORKDIR /app
COPY build/libs/application-server-0.0.1-SNAPSHOT.jar /app/app.jar
ENTRYPOINT ["java","-jar","/app/app.jar"]
