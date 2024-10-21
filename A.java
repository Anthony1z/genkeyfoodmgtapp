# Use Amazon Corretto JDK 11 as the base image
FROM amazoncorretto:11

//Create a volume to store temporary files
VOLUME /tmp

//Set the working directory inside the container
WORKDIR /app

//Copy the JAR file from the local target directory to the /app directory inside the container
COPY target/foodmgt-0.0.1-SNAPSHOT.jar foodmgt.jar

//Expose the application port (Spring Boot typically uses 8080)
EXPOSE 8080

//Command to run the JAR file
ENTRYPOINT ["java", "-jar", "foodmgt.jar"]
