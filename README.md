
# Práctica 4.4: Programación orientada a objetos III

# Título de la Actividad

## Identificación de la Actividad

- **Módulo:** PROG
- **Unidad de Trabajo:** U4 - Programación orientada a objetos III
- **Fecha de Creación:** 22/01/2026
- **Fecha de Entrega:** 25/01/2026
- **Alumno:**
    - **Nombre y Apellidos:** Irene Foncubierta Lobatón
    - **Correo electrónico:** ifonlob1108@g.educaand.es
    - **Iniciales:** IFL


## Descripción de la Actividad

En esta práctica trabajo la parte III de POO en Kotlin, continuando con lo visto en la unidad 4.
El objetivo de esta práctica es seguir modelando problemas con clases, objetos y métodos, utilizando también `enum class` y mejorando la organización del código respecto a prácticas anteriores.

En este caso me he centrado en crear varias clases que representen elementos del problema (como el robot R2D2 y  y en que el comportamiento quede encapsulado dentro de las propias clases, dejando el `main` solo como punto de entrada para probarlos.

1. **Requisitos previos:**
    - Lenguaje: Kotlin (versión 1.9.x o compatible)
    - Entorno: IntelliJ IDEA Community Edition o similar, con soporte para proyectos Kotlin/JVM.[
2. **Pasos para compilar el código:**

Si se usa IntelliJ:

```bash
# La compilación la gestiona el propio IDE al ejecutar el proyecto
```

Si se usa Gradle desde terminal:

```bash
./gradlew build
```

3. **Pasos para ejecutar la aplicación:**

Desde IntelliJ:

```bash
# Ejecutar el archivo con función main (por ejemplo, Main.kt) usando el botón Run
```

Desde terminal con Gradle:

```bash
./gradlew run
```

4. **Ejecución de pruebas (si se incluyen):**

```bash
./gradlew test
```


## Desarrollo de la Actividad

### Descripción del Desarrollo

Para esta práctica he seguido la estructura de la unidad U4, separando la lógica en clases y evitando tener código suelto en el `main`.
En este ejercicio, he definido una clase `Robot` con propiedades para el nombre, la posición y la dirección, además de métodos para moverlo y consultar su estado.

He utilizado `enum class` para representar las direcciones del robot y he creado métodos específicos para cambiar la dirección de forma cíclica, lo que hace el código más legible y más fácil de mantener, es decir, escalable a largo plazo.
En cada ejercicio he intentado que las clases estén bien encapsuladas, de forma que el `main` se limite a crear objetos, llamar a sus métodos y mostrar la información por consola.

### Código Fuente

El código fuente de la práctica está en el repositorio de la tarea de GitHub Classroom, organizado en paquetes según el enunciado.

Algunos archivos principales (ejemplos, adapta los nombres reales):

- `src/main/kotlin/org/iesra/Main.kt` – Punto de entrada donde pruebo los ejercicios.
- `src/main/kotlin/org/iesra/Robot.kt` – Implementación de la clase `Robot` para el ejercicio de R2D2.
- `src/main/kotlin/org/iesra/Direcciones.kt` - Enum class con las cuatro posibles direcciones que puede tomar el robot.

### Ejemplos de Ejecución

A modo de ejemplo, en el ejercicio del robot R2D2:

- **Entrada:**
    - Conjunto de movimientos definidos como un array de arrays de enteros, donde cada subarray representa una secuencia de pasos a seguir por robot.
- **Salida esperada:**
    - Después de cada movimiento, el programa muestra por consola la posición final y la dirección actual del robot con un mensaje del estilo:
`R2D2 está en (x, y) Direccion` siguiendo el formato indicado en el enunciado.


### Resultados de Pruebas

Las pruebas las he realizado de forma manual ejecutando el programa varias veces y cambiando los datos de entrada (sobre todo en arrays de movimientos y casos límite, como listas vacías o valores negativos).
Asimismo, también he verificado que los métodos de las clases se comportan como se espera en el enunciado y que la salida por consola es coherente respecto a los casos probados.

## Conclusiones

Con esta práctica he seguido afianzando la programación orientada a objetos en Kotlin, especialmente el uso de clases, métodos y enumeraciones.
De la misma forma, me ha ayudado a pensar más en términos de objetos y responsabilidades, intentando que cada clase y método tenga un objetivo claro y que el código sea más fácil de entender y reutilizar.

También he visto la importancia de probar distintos casos de entrada para asegurarme de que las clases responden bien ante valores que no son los “típicos”, como arrays vacíos o movimientos negativos.
