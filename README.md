# Taller: Sistema de Cafetería

Proyecto del taller **TIFC2DEV-JAVA** (Generation Colombia, 2026).  
Implementa los ejercicios de la Parte 1 (variables, operadores, `switch`, `while`, `do-while`, `for` y arrays) y el sistema de turno de la Parte 2 (procesamiento de pedidos, descuentos, inventario y reporte de cierre).

## Requisitos

- **Java JDK 8+** (recomendado JDK 17 o superior)
- **Git** (opcional, para clonar el repositorio)

Verifica tu instalación:

```bash
java -version
javac -version
```

## Estructura del proyecto

```
.
├── Ejercicio1Variables.java      # Variables y tipos de dato
├── Ejercicio2Operadores.java     # Operadores y descuento
├── Ejercicio3Switch.java         # switch por categoría
├── Ejercicio4While.java          # while con inventario
├── Ejercicio5DoWhile.java        # do-while de apertura de caja
├── Ejercicio6ForArrays.java      # for y arrays (menú y promedio)
├── CajaRegistradora.java         # Ejercicio 7 - debugging
├── SistemaCafeteria.java         # Parte 2 - sistema de turno
├── RESPUESTAS.md                 # Respuestas escritas del taller
└── README.md
```

## Cómo compilar

Desde la raíz del proyecto:

```bash
javac *.java
```

Esto genera los archivos `.class` (ignorados por `.gitignore`).

## Cómo ejecutar

Ejecutar un ejercicio individual:

```bash
java Ejercicio1Variables
java Ejercicio2Operadores
java Ejercicio3Switch
java Ejercicio4While
java Ejercicio5DoWhile
java Ejercicio6ForArrays
java CajaRegistradora
```

Ejecutar el sistema completo (Parte 2):

```bash
java SistemaCafeteria
```

## Descripción de la Parte 2

`SistemaCafeteria` simula un turno completo de la cafetería:

1. **Apertura de caja** con `do-while` (monto mayor a 0, fuerza un intento inválido primero).
2. **Procesamiento de 6 pedidos** con `for`: nombre, cantidad, categoría (vía `switch`) y subtotal.
3. **Descuento del 10%** cuando el subtotal supera `$12.000`.
4. **Validación de inventario** de Brownie (10 unidades): si no hay suficiente, se marca como agotado y no se cobra.
5. **Reporte de cierre**: pedidos procesados, total recaudado, pedido de mayor valor, inventario final de Brownie y total en caja.

## Respuestas escritas

Las respuestas a las preguntas del taller se encuentran en [`RESPUESTAS.md`](./RESPUESTAS.md).

## Autor

Mauro Infante
