# Sistema de Evaluación - Escuela de Conducción

## 1. Descripción del proyecto

Este proyecto consiste en un programa desarrollado en Java que simula el sistema de evaluación de una escuela de conducción.

El programa permite registrar varios aspirantes, consultar sus categorías de licencia y sus calificaciones. También verifica quiénes aprobaron y convierte las notas a una escala de 0 a 100.

El objetivo principal es aplicar conceptos de programación funcional mediante expresiones lambda e interfaces funcionales.

## 2. Datos utilizados

El programa trabaja con los siguientes datos:

- Nombre del aspirante.
- Categoría de licencia (A2, B1 y C1).
- Calificación del examen teórico.

Se utiliza una lista con cinco aspirantes de ejemplo.

## 3. Interfaces funcionales utilizadas

En el desarrollo del programa se utilizaron cuatro interfaces funcionales:

**Predicate<Aspirante>**

Se utiliza para verificar si el aspirante aprobó. La condición establecida es que su calificación sea igual o superior a 3.0.

**Function<Aspirante, Double>**

Se utiliza para transformar la calificación de una escala de 0 a 5 a una escala de 0 a 100, multiplicando la nota por 20.

**Consumer<Aspirante>**

Se utiliza para mostrar en pantalla el nombre, la categoría, la calificación y el resultado de cada aspirante.

**Supplier<String>**

Se utiliza para proporcionar el mensaje inicial del programa.

## 4. Expresiones lambda implementadas

Las expresiones lambda permiten representar comportamientos de una manera más sencilla.

Ejemplos utilizados:

- `aspirante -> aspirante.nota >= 3.0`: recibe un aspirante y verifica si su nota cumple la condición de aprobación.
- `aspirante -> aspirante.nota * 20`: recibe un aspirante y devuelve su calificación convertida a una escala de 100.
- `aspirante -> { ... }`: recibe un aspirante y muestra sus datos y resultados.
- `() -> "SISTEMA DE EVALUACION..."`: no recibe parámetros y devuelve un mensaje de texto.

## 5. Funcionamiento del programa

El programa realiza las siguientes operaciones:

1. Registra cinco aspirantes.
2. Muestra sus nombres y categorías.
3. Evalúa sus calificaciones.
4. Determina si aprobaron o no.
5. Convierte las calificaciones a una escala de 100.
6. Muestra los resultados en la terminal.

La nota mínima de aprobación utilizada en esta simulación es 3.0.

## 6. Tecnologías utilizadas

- Lenguaje de programación: Java.
- Entorno de desarrollo: Visual Studio Code.
- Control de versiones y repositorio: GitHub.
- Interfaces funcionales de Java.

## 7. Cómo ejecutar el programa

1. Tener instalado Java JDK.
2. Abrir la carpeta del proyecto en Visual Studio Code.
3. Abrir una terminal dentro de la carpeta.
4. Compilar el programa con el siguiente comando:

```bash
javac EscuelaConduccion.java
```

5. Ejecutar el programa:

```bash
java EscuelaConduccion
```

## 8. Resultados esperados

El programa muestra los resultados de cinco aspirantes:

| Aspirante | Categoría | Nota | Resultado |
|---|---|---:|---|
| Carlos | A2 | 4.5 | Aprobado |
| Laura | B1 | 3.8 | Aprobado |
| Andres | C1 | 2.5 | No aprobado |
| Daniela | B1 | 4.0 | Aprobado |
| Miguel | A2 | 2.8 | No aprobado |

## 9. Uso de herramientas de inteligencia artificial

Para el desarrollo de esta actividad se utilizó ChatGPT como herramienta de apoyo.

Se utilizó para comprender los conceptos de programación funcional, recibir orientación sobre la estructura del código y revisar el funcionamiento de las expresiones lambda y las interfaces funcionales.

El código fue ejecutado y comprobado en Visual Studio Code. Se verificó que los resultados obtenidos correspondieran a las operaciones implementadas.

## 10. Integrantes

- Integrante 1: anderson suaza
---

**Actividad Colaborativa #3 - Unidad 3**

**Tema:** Programación funcional aplicada en Java.