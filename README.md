# CRUD Application with Java Spring Boot

![Java](https://img.shields.io/badge/java-%3E%3D8-blue)
![Spring Boot](https://img.shields.io/badge/spring%20boot-%3E%3D2.5-green)
![PostgreSQL](https://img.shields.io/badge/postgresql-%3E%3D15.3-ff69b4)
![IntelliJ IDEA](https://img.shields.io/badge/intellij%20idea-%3E%3D2023.1.3-orange)
![Postman](https://img.shields.io/badge/postman-visualize%20API-green)

> Este proyecto es una aplicación CRUD desarrollada en Java utilizando el framework Spring Boot. Proporciona una API
> para gestionar recursos en una base de datos PostgreSQL.

## Requisitos previos

- JDK 8 o superior instalado
- PostgreSQL 15.3-2 instalado y configurado
- pgAdmin para visualizar y administrar la base de datos
- IntelliJ IDEA Community Edition 2023.1.3 o una versión posterior instalada
- Postman para probar y visualizar la API

## Instalación

1. Clona este repositorio en tu máquina local utilizando el siguiente comando:

git clone git@github.com:Chrs-creyk/Java-Spring_Boot-CRUD_Application.git

2. Importa el proyecto en IntelliJ IDEA:
    - Abre IntelliJ IDEA.
    - Selecciona "Open" y elige el directorio donde clonaste el repositorio.
    - Selecciona "Import project from external model" y elige "Maven".
    - Sigue las instrucciones para importar el proyecto.

3. Configura la base de datos PostgreSQL:
    - Crea una nueva base de datos en PostgreSQL.
    - Actualiza la configuración de la base de datos en el archivo `application.properties`.

4. Ejecuta la aplicación:
    - Ejecuta la clase principal `Application.java` para iniciar el servidor de Spring Boot.

## Uso

La API permite las siguientes operaciones:

### Registrar un nuevo producto

- Método: `POST`
- URL: `http://localhost:8080/api/v1/products`
- Descripción: Registra un nuevo producto en la base de datos.
- Cuerpo de la solicitud (JSON):
  ```json
  {
    "name": "Nombre del producto",
    "description": "Descripción del producto",
    "price": 99.99
  }

{
Respuesta exitosa (código 200):
"message": "Producto registrado exitosamente",
"productId": 1
}

### Actualizar un producto

- Método: `PUT`
- URL: `http://localhost:8080/api/v1/products`
- Descripción: Actualiza un producto existente en la base de datos. Si el producto ya existe por su nombre, se realiza
  una actualización en lugar de una inserción. Si el producto no existe, se devuelve un mensaje de conflicto. En ambos
  casos, se devuelve una respuesta con el producto actualizado o el mensaje de conflicto.
- Cuerpo de la solicitud (JSON):
  ```json
  {
    "id": 1,
    "name": "Nuevo nombre",
    "description": "Nueva descripción",
    "price": 129.99
  }

### Eliminar un producto

- Método: DELETE
- URL: http://localhost:8080/api/v1/products/{productId}
- Descripción: Elimina un producto por su ID.
- Respuesta aceptada (código 202).
- Respuesta de conflicto al no encontrar ID (Codigo 409).

```json
    {
    "message": "Producto eliminado exitosamente",
    "productId": 1
    }
```
```json
    {
      "error": true,
      "message": "No existe un producto con ese ID"
    }
 ```
### Obtener todos los productos

- Método: `GET`
- URL: `http://localhost:8080/api/v1/products`
- Descripción: Obtiene una lista de todos los productos en la base de datos.

### Obtener un producto por ID

- Método: `GET`
- URL: `http://localhost:8080/api/v1/products/{id}`
- Descripción: Obtiene un producto específico por su ID.

__________________________________________________________
*Asegúrate de ajustar la URL (`http://localhost:8080`) a la dirección y el puerto en el que se está ejecutando tu
servidor de Spring Boot. Los datos proporcionados en los ejemplos de respuesta son solo ilustrativos y deben ajustarse a
los datos reales almacenados en la base de datos.*

## Contribuciones

Las contribuciones son bienvenidas. Si encuentras un error o tienes alguna mejora, por favor abre un "Issue" o envía una
solicitud de pull.

## Contacto

- Nombre: Cristhian A. Jurado
- Email: crisdeves117@gmail.com
- LinkedIn: [Fullstack Developer Cristhian Jurado](https://www.linkedin.com/in/fullstack-developer-cristhian-jurado/)
