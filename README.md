# 📝 Diario Digital

Aplicación de consola desarrollada en **Java** que permite gestionar un diario personal utilizando archivos de texto para almacenar la información de forma persistente.

Cada entrada se guarda automáticamente con la fecha y hora en la que fue creada, permitiendo posteriormente consultar el contenido completo o realizar búsquedas dentro del diario.

---

## 🚀 Funcionalidades

- ➕ Añadir nuevas entradas al diario.
- 📅 Guardar automáticamente la fecha y hora de cada entrada.
- 📖 Leer todas las entradas almacenadas.
- 🔍 Buscar palabras o frases dentro del diario.
- 💾 Persistencia de datos mediante archivos de texto.
- ⚠️ Gestión básica de errores relacionados con el archivo.

---

## 🛠️ Tecnologías utilizadas

- Java
- Programación Orientada a Objetos (POO)
- Manejo de ficheros
- Entrada y salida por consola
- Scanner
- FileReader
- BufferedReader
- FileWriter
- BufferedWriter
- PrintWriter
- LocalDateTime
- DateTimeFormatter

---

## 📂 Estructura del proyecto

```text
DiarioDigital/
└── DiarioDigital_alumnos/
    ├── src/
    │   └── DiarioDigital.java
    ├── diario.txt
    └── DiarioDigital.iml
```

---

## ⚙️ Funcionamiento

Al iniciar la aplicación se muestra un menú interactivo:

```text
=== Mi Diario Digital ===

1. Añadir nueva entrada
2. Leer todo el diario
3. Buscar palabra en el diario
4. Salir
```

### ➕ Añadir nueva entrada

Permite escribir una nueva anotación que se guardará automáticamente en el archivo del diario junto con la fecha y hora actuales.

**Ejemplo:**

```text
[2025-09-29 20:48]
Hoy he comenzado mi proyecto de Diario Digital.
```

---

### 📖 Leer todo el diario

Muestra por pantalla todas las entradas almacenadas hasta el momento.

---

### 🔍 Buscar palabra en el diario

Permite localizar rápidamente palabras o frases dentro de las entradas guardadas.

**Ejemplo:**

```text
Introduce la palabra a buscar: proyecto
```

Resultado:

```text
[2025-09-29 20:48]
Hoy he comenzado mi proyecto de Diario Digital.
```

---

### 🚪 Salir

Finaliza la ejecución del programa.

---

## ▶️ Cómo ejecutar el proyecto

### 1. Clonar el repositorio

```bash
git clone https://github.com/ManuelTagua/DiarioDigital.git
```

### 2. Acceder a la carpeta del proyecto

```bash
cd DiarioDigital/DiarioDigital_alumnos/src
```

### 3. Compilar el código

```bash
javac DiarioDigital.java
```

### 4. Ejecutar la aplicación

```bash
java DiarioDigital
```

---

## 💾 Almacenamiento de datos

Las entradas se almacenan en el archivo:

```text
diario.txt
```

Este archivo se actualiza automáticamente cada vez que se añade una nueva entrada.

---

## 🎯 Objetivos de aprendizaje

Este proyecto fue desarrollado con el objetivo de practicar:

- Manejo de archivos en Java.
- Lectura y escritura de datos persistentes.
- Uso de flujos de entrada y salida.
- Manipulación de fechas y horas.
- Interacción con el usuario mediante consola.
- Organización básica de aplicaciones Java.

---

## 👨‍💻 Autor

**Manuel Tagua**
