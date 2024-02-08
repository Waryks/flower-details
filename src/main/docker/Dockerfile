FROM openjdk:21
WORKDIR /opt
ENV PORT 8082
EXPOSE 8082
COPY flower-details/target/flower-details-1.0.0-SNAPSHOT.jar /app.jar
ENTRYPOINT ["java","-jar","/opt/app.jar"]