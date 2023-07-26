# Use an official Maven runtime parent image
FROM maven:3.6.3-openjdk-8-slim AS build

# Set the working directory in the image
WORKDIR /usr/src/app

# Copy the POM file
COPY ./pom.xml ./

# Download all required dependencies into one layer
RUN mvn dependency:go-offline -B

# Copy other source code files
COPY ./src ./src

# Build a JAR file
RUN mvn clean install

# Start with a base image containing Java runtime
FROM openjdk:8-jdk-alpine

# Add a volume pointing to /tmp
VOLUME /tmp

# Make port 8085 available to the world outside this container
EXPOSE 8080

# The application's JAR file
ARG JAR_FILE=/usr/src/app/target/*.jar

# Copy the application's JAR to the container
COPY --from=build ${JAR_FILE} app.jar

# Run the JAR file
ENTRYPOINT ["java", "-Dfile.encoding=windows-1252","-jar","/app.jar"]
