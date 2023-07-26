# Use oficial maven image with openjdk-8
FROM maven:3.6.3-openjdk-8

# Copiar el directorio actual en /app
COPY . /app

# Set the working directory
WORKDIR /app

# Construir el proyecto usando maven
RUN mvn clean install

# Cambia a una imagen de JRE para reducir el tamaño de la imagen final
FROM openjdk:8-jre-slim

# Copia el jar generado por maven a la imagen de docker
COPY --from=0 /app/target/veterinaria-patitas-0.0.1-SNAPSHOT.jar /veterinaria-patitas.jar

# Puerto a exponer
EXPOSE 8080

# Comando para ejecutar la aplicación
CMD ["java", "-jar", "/veterinaria-patitas.jar"]
