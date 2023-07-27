# Use oficial maven image with openjdk-8
FROM maven:3.6.3-openjdk-8 as build

# Copiar el directorio actual en /app
COPY . /app

# Set the working directory
WORKDIR /app

# Construir el proyecto usando maven
RUN mvn clean install

# Cambia a una imagen de Tomcat para desplegar el WAR
FROM tomcat:9.0-jdk8-openjdk

# Establecer la variable de entorno para cambiar el puerto de Tomcat a 10000
ENV CATALINA_OPTS="-Dcatalina.http.port=10000"

# Copia el war generado por maven a la imagen de docker
COPY --from=build /app/target/veterinaria-patitas-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/ROOT.war

# Puerto a exponer
EXPOSE 10000

# Comando para iniciar Tomcat
CMD ["catalina.sh", "run"]
