
# 🕵️ ¿Cuándo se usa el depurador (debugger) en la industria?

Usar el **debugger** en la industria del desarrollo de software no solo es común, **es esencial**. A continuación se exponen situaciones **muy reales y frecuentes** donde el depurador es la mejor herramienta:

----

## 1. NullPointerException

Cuando una variable es `null` y se intenta acceder a ella o llamarle un método. El debugger permite:

- Ver en qué momento dejó de inicializarse.
- Detectar si fue mal pasada desde otro método.
- Identificar *dónde* en la pila ocurrió el problema.

---

## 2. Bucles infinitos o condiciones que no se cumplen

A veces el programa entra en un bucle infinito o una condición `if` nunca se activa. El debugger permite:

- Ir paso a paso (`step over`) viendo cómo cambian las variables.
- Revisar el estado de las condiciones.
- Ver si se entró o no en una rama condicional.

---

## 3. Errores de lógica (sin excepciones)

El programa “funciona” pero **el resultado no es el esperado**. Aquí el debugger es fundamental para:

- Revisar el valor de cada variable línea por línea.
- Detectar errores de cálculo.
- Ver si un método devuelve lo esperado.

---

## 4. Problemas de múltiples clases y objetos

Cuando hay interacción entre muchas clases (por ejemplo, modelos, servicios y controladores), el debugger ayuda a:

- Ver si los objetos están bien conectados.
- Observar cómo fluye la ejecución de una clase a otra.
- Confirmar si los datos se están pasando correctamente.

---

##  5. Código heredado o de otro desarrollador

Cuando se trabaja con código que no se escribió, o que se olvidó cómo funciona:

- El debugger permite explorarlo sin miedo.
- Se puede entender mejor qué hace cada línea.
- Ayuda a no romper cosas al modificar.

---

# Ejemplo práctico

## Objetivo del programa
Una aplicación sencilla que calcula el total a pagar en un restaurante sumando el valor de la cuenta más una propina del 10%.

---

## Estructura del proyecto

Tendremos **tres clases**:

1. `Cuenta`: representa la cuenta del restaurante.
2. `CalculadoraPropinas`: hace el cálculo de la propina.
3. `App`: clase principal que inicia el programa.

---

### `Cuenta.java`
```java
public class Cuenta {
    private double subtotal;

    public Cuenta(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getSubtotal() {
        return subtotal;
    }
}
```

---

### `CalculadoraPropinas.java`
```java
public class CalculadoraPropinas {
    public double calcularTotal(Cuenta cuenta) {
        double subtotal = cuenta.getSubtotal();
        double propina = calcularPropina(subtotal);
        return subtotal;
    }

    private double calcularPropina(double monto) {
        return monto * 0.10;
    }
}
```

---

### `App.java`
```java
public class App {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(200.0);
        CalculadoraPropinas calculadora = new CalculadoraPropinas();

        double total = calculadora.calcularTotal(cuenta);
        System.out.println("Total a pagar (con propina): " + total);
    }
}
```

---

## 🧭 Actividad

Usa el depurador y encuentra por qué el resultado no incluye la propina. **No hay errores de compilación ni excepciones**, pero el total está mal.

Analiza cada línea y busca **el error de lógica**.

---
