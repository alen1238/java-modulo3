
# 🧪 Proyecto de Clase: Calculadora con Excepciones Personalizadas en Java

## Objetivo

Desarrollar una aplicación de consola en Java que simule el funcionamiento de una **calculadora avanzada**, incorporando manejo de excepciones personalizadas, operaciones aritméticas básicas y validación de entrada del usuario.

---

## Requisitos funcionales

La calculadora debe:

1. Permitir al usuario seleccionar entre las siguientes operaciones:
   - Suma
   - Resta
   - Multiplicación
   - División
   - Raíz cuadrada

2. Solicitar al usuario los valores numéricos necesarios para cada operación.

3. Manejar las siguientes excepciones:
   - **División por cero**: `ArithmeticException`
   - **División inválida** (cuando el divisor es mayor que el numerador): excepción personalizada `DivisionInvalidaException`
   - **Raíz cuadrada de un número negativo**: excepción personalizada `RaizNegativaException`
   - **Entrada inválida** (cuando el usuario ingresa letras u otro tipo de dato no numérico): `InputMismatchException`

> 💡 **Guía para calcular una raíz cuadrada en Java**:
> Para calcular la raíz cuadrada de un número, se puede usar el método `Math.sqrt(numero)`.
> ```java
> double resultado = Math.sqrt(numero);
> ```
> Si el valor de `numero` es negativo, la operación devolverá `NaN`, por lo que se debe validar previamente si el número es mayor o igual a cero antes de llamar al método.

4. Mostrar un menú interactivo hasta que el usuario decida salir del programa.

---

## Requisitos técnicos

- Lenguaje: Java
- IDE: Visual Studio Code
- Repositorio: GitHub
- Control de versiones: Git (utilizado desde el panel gráfico de **Source Control** de VS Code, no desde la terminal)
- Organización: trabajo colaborativo en equipo

---

## 👥 Organización del equipo

El equipo debe estar compuesto por **4 o 5 estudiantes**. La distribución de tareas sugerida es la siguiente:

| Rol                  | Responsabilidad principal |
|----------------------|---------------------------|
| Desarrollador 1      | Clase principal con menú interactivo (`main`) |
| Desarrollador 2      | Clase `Calculadora` con los métodos `sumar`, `restar`, `multiplicar` |
| Desarrollador 3      | Métodos `dividir`, `raizCuadrada`, manejo de excepciones |
| Desarrollador 4      | Clases de excepciones personalizadas (`DivisionInvalidaException`, `RaizNegativaException`, etc.) |
| Desarrollador 5 (opcional) | Validación de entrada del usuario y pruebas manuales |

---

## 📁 Estructura del proyecto sugerida

```
CalculadoraExcepciones/
│
├── src/
│   ├── Calculadora.java
│   ├── CalculadoraApp.java  ← contiene el método main
│   ├── DivisionInvalidaException.java
│   └── RaizNegativaException.java
│
└── README.md
```

---

## Instrucciones para crear el repositorio y trabajar en equipo

### 1. Creación del repositorio en GitHub

1. Un integrante del equipo debe crear un repositorio público en GitHub con el nombre `CalculadoraExcepciones`.
2. Al crearlo, incluir un archivo `README.md`.
3. Agregar a los demás integrantes como **colaboradores** (desde "Settings" → "Collaborators").

---

### 🖥 2. Clonación y configuración en VS Code (sin consola)

1. Cada integrante abre VS Code.
2. Desde la **barra lateral izquierda**, haz clic en el icono de **Source Control** (control de código fuente).
3. Haz clic en "Clone Repository".
4. Pega la URL del repositorio de GitHub.
5. Selecciona una carpeta en tu equipo donde se descargará el repositorio.
6. Cuando VS Code pregunte si deseas **abrir el repositorio clonado**, haz clic en "Open".

---

### 3. Flujo de trabajo con Source Control (sin usar consola)

Cada estudiante debe seguir este flujo:

1. Crea una **nueva rama** con tu nombre o tarea asignada (desde Source Control → "..." → `Create Branch`).
2. Trabaja en los archivos correspondientes a tu tarea.
3. Usa el botón **`+` para Stage changes**.
4. Escribe un mensaje descriptivo del commit (ej. `Agrega clase Calculadora`).
5. Haz clic en **`✓ Commit`**.
6. Luego haz clic en **`Sync Changes`** para subir los cambios a GitHub.

**Nota:** Para evitar conflictos, cada quien debe trabajar en su rama. Una vez terminado, pueden integrar sus cambios a la rama principal mediante Pull Requests desde GitHub.

---

## 📋 Entregables

- Repositorio en GitHub con:
  - Código fuente completo
  - README.md con descripción del proyecto y nombres de los integrantes
  - Uso correcto de excepciones
- Buen manejo de commits (descriptivos, ordenados)
- División clara de responsabilidades

---

## 📆 Resultados al finalizar la clase
    Entregar enlace del repositorio al docente
---

## 📘 Sugerencias

- Planeen antes de codificar.
- Eviten subir cambios directamente a `main`.
- Usen ramas y commits frecuentemente.
- Comuníquense constantemente y usen bien los mensajes de commit para rastrear cambios.

---

¡Mucho éxito!
