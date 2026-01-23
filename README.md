
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
    - Lenguaje: Kotlin (versión 1.9.x o compatible)[^4]
    - Entorno: IntelliJ IDEA Community Edition o similar, con soporte para proyectos Kotlin/JVM.[^4]
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

El código fuente de la práctica está en el repositorio de la tarea de GitHub Classroom, organizado en paquetes según el enunciado.[^1]

Algunos archivos principales (ejemplos, adapta los nombres reales):

- `src/main/kotlin/org/iesra/Main.kt` – Punto de entrada donde pruebo los ejercicios.
- `src/main/kotlin/org/iesra/Robot.kt` – Implementación de la clase `Robot` para el ejercicio de R2D2.
- `src/main/kotlin/org/iesra/Direcciones.kt` - Enum class con las cuatro posibles direcciones que puede tomar el robot.

### Ejemplos de Ejecución

- **Entrada 1:** Descripción de la entrada y valor de prueba.
- **Salida Esperada 1:** Explicación de la salida esperada y el resultado de la prueba.

### Resultados de Pruebas

[Aquí se detallará cómo se ha verificado la funcionalidad del código, incluyendo resultados de pruebas automatizadas o manuales, en caso de que las haya.]

## Documentación Adicional

- **Manual de Usuario:** [Enlace a la documentación del usuario, si existe]
- **Autorización de Permisos:** Verificar que el profesor tenga permisos de lectura en el repositorio para revisar el código.

## Conclusiones

[Resumen de las conclusiones alcanzadas al desarrollar la actividad, las lecciones aprendidas, y posibles mejoras que se puedan implementar en futuras entregas.]

## Referencias y Fuentes

[Aquí se listarán las fuentes consultadas para el desarrollo de la actividad, tales como documentación oficial, artículos, o cualquier recurso externo relevante.]

### Notas Adicionales:

1. **Nombres de Archivos y Repositorios:**
   - Asegúrate de que el nombre del archivo o repositorio siga la estructura definida: `XXX-idActividad-Iniciales`.
2. **Permisos:**
   - Verifica que el profesor tenga los permisos necesarios para acceder al repositorio o documento.
3. **Formato:**
   - Si se entrega en formato PDF o Google Docs, asegúrate de cumplir con el mínimo y máximo de folios establecidos.
4. **Compilación y Ejecución:**
   - Detalla claramente cómo compilar y ejecutar el código, incluyendo las instrucciones en el archivo `README.md`.
