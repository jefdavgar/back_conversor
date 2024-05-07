# Conversor de Monedas

Este proyecto de Java implementa un conversor de monedas que utiliza programación orientada a objetos para organizar el código y se conecta a una API para obtener las tasas de cambio actualizadas.

## Descripción

El conversor de monedas consta de tres clases:

1. **Principal.java**: Esta es la clase principal que llama a la API y gestiona la interacción con el usuario.
2. **ConexionAPI.java**: Esta clase se encarga de conectar con la API y obtener los datos necesarios para realizar las conversiones.
3. **Modelo.java**: Aquí se definen las estructuras de datos y métodos necesarios para manejar la información recibida de la API.

## Funcionamiento

El programa utiliza la biblioteca GSON para transformar los documentos JSON recibidos de la API en objetos Java, lo que facilita la manipulación de los datos. Se realizaron pruebas de conexión utilizando Postman con el token de acceso proporcionado por la API para asegurar su correcto funcionamiento.

Para ejecutar el programa, simplemente inicia la clase `Principal.java`. Se abrirá una interfaz de entrada donde podrás ingresar la solicitud de conversión. Una vez procesada la solicitud, se mostrará la respuesta en la consola.

## Dependencias

El proyecto hace uso de la siguiente dependencia:

- **GSON**: Se utiliza para convertir documentos JSON en clases Java y viceversa.

```xml
<dependency>
    <groupId>com.google.code.gson</groupId>
    <artifactId>gson</artifactId>
    <version>2.8.8</version>
</dependency>
```

## Ejecución

1. Clona este repositorio en tu máquina local.
2. Abre el proyecto en tu entorno de desarrollo Java preferido.
3. Asegúrate de tener configuradas las dependencias, incluyendo GSON.
4. Ejecuta la clase `Principal.java`.
5. Sigue las instrucciones en la interfaz de entrada para realizar las conversiones de moneda.
