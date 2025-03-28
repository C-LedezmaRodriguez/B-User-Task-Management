# Backend Project - Java

## Descripción

Este proyecto backend está desarrollado con **Java** y **Spring Boot** para gestionar usuarios y tareas. La API proporciona endpoints para realizar operaciones CRUD en usuarios y tareas. Los datos son almacenados en memoria, pero en un entorno de producción, se podría integrar con una base de datos como **MySQL**, **PostgreSQL**, **MongoDB**, etc.

### Tecnologías

- **Java 17**: Lenguaje de programación utilizado para el desarrollo del backend.
- **Spring Boot**: Framework para crear aplicaciones Java de forma rápida y eficiente.
- **Spring Web**: Para crear servicios RESTful y manejar solicitudes HTTP.
- **H2 Database** (si se utiliza): Base de datos en memoria para simular almacenamiento persistente de datos.
- **Maven**: Herramienta para la gestión de dependencias y construcción del proyecto.

### Requisitos Previos

Antes de ejecutar este proyecto, asegúrate de tener instalado lo siguiente:

- **Java 17** o superior.
- **Maven**: Para gestionar dependencias y construir el proyecto.

### Instalación

1. Clona este repositorio en tu máquina local:
    ```bash
    git clone <URL del repositorio>
    ```

2. Navega al directorio del backend:
    ```bash
    cd backend-java
    ```

3. Compila el proyecto e instala las dependencias:
    ```bash
    mvn clean install
    ```

4. Inicia la aplicación Spring Boot:
    ```bash
    mvn spring-boot:run
    ```

   Esto iniciará el servidor en `http://localhost:8080`.

### Estructura del Proyecto

- **src/main/java/com/ejemplo/backend/Controller/**: Controladores que manejan las solicitudes HTTP y llaman a los servicios.
- **src/main/java/com/ejemplo/backend/Service/**: Lógica de negocio para la gestión de usuarios y tareas.
- **src/main/java/com/ejemplo/backend/Model/**: Clases que representan los usuarios y las tareas.
- **src/main/resources/application.properties**: Configuración de la aplicación (puedes configurarlo para usar una base de datos si lo deseas).
- **src/main/resources/static/**: Archivos estáticos como imágenes o recursos.
