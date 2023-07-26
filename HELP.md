# Veterinario Patitas - Guía de ayuda

## Descripción

Este servicio gestiona información sobre los veterinarios, propietarios y citas.

## Prerequisitos

- Java 8
- Maven
- Docker (si quieres ejecutar la aplicación en un contenedor)

## Para construir la aplicación

1. Navega hasta el directorio del proyecto en tu terminal.
2. Ejecuta el siguiente comando: `mvn clean install`

Esto construirá el proyecto y creará un archivo JAR en el directorio `target`.

## Para ejecutar la aplicación

1. Navega hasta el directorio del proyecto en tu terminal.
2. Ejecuta el siguiente comando: `java -jar target/veterinaria-patitas-0.0.1-SNAPSHOT.jar`

## Rutas de la aplicación

- `localhost:8085/`: Muestra el menu principal

- `localhost:8085/veterinarios`: Muestra la lista de veterinarios.
- `localhost:8085/veterinarios/addVeterinario`: Permite añadir un nuevo veterinario.
- `localhost:8085/veterinarios/updateVeterinario/{id}`: Permite actualizar la información de un veterinario existente.
- `localhost:8085/veterinarios/deleteVeterinario/{id}`: Permite eliminar un veterinario.

Asegúrate de reemplazar `{id}` con el ID del veterinario que deseas actualizar o eliminar.

