# Conversor de Moneda

Un proyecto en Java que permite convertir entre diferentes monedas utilizando una API de tasas de cambio en tiempo real. Este conversor emplea tecnologías modernas como `HttpClient` y la biblioteca `Gson` para manejar las solicitudes y respuestas JSON, asegurando precisión y facilidad de uso.

---

## **Características**

- Conversión en tiempo real entre:
    - Dólar y Peso Argentino.
    - Dólar y Real Brasileño.
    - Dólar y Peso Colombiano.
    - Y viceversa.
- Solicitudes HTTP a la API mediante `HttpClient` y `HttpRequest`.
- Manejo de respuestas JSON con la biblioteca `Gson`.
- Diseño modular con clases organizadas en paquetes.
- Interfaz de usuario basada en consola, intuitiva y fácil de usar.

---

## **Requisitos**

1. **Java Development Kit (JDK)**: Versión 17 o superior.
2. **Dependencias:**
    - [Gson](https://github.com/google/gson): Biblioteca para manejar datos JSON.

   Puedes incluirla usando **Maven** o descargando el JAR manualmente.

---

## **Estructura del Proyecto**

```plaintext
src/
├── com/
│   ├── monedaconverter/
│   │   ├── service/
│   │   │   ├── Convert.java
│   │   │   ├── Service.java
│   │   ├── Principal.java
