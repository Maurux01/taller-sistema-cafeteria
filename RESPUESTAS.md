# Respuestas escritas - Taller Sistema de Cafeteria

## Ejercicio 1 - Variables
Uso double para el precio porque tiene decimales (3.50). int solo guarda enteros. Si declaro int precio = 3.50 no compila; con cast (int) 3.50 se trunca a 3 y se pierden los centavos.

## Ejercicio 2 - Operadores
Use el operador relacional > en subtotal > 30000. Devuelve boolean. Descuento = 6375, total = 36125, aplica = true.

## Ejercicio 3 - switch
Prefiero switch cuando comparo una misma variable contra valores constantes (igualdades), queda mas legible. No conviene para rangos, condiciones combinadas (&&, ||) o tipos no compatibles (double, boolean).

## Ejercicio 4 - while
Si la condicion nunca se vuelve falsa hay bucle infinito. Lo prevengo modificando la variable dentro del ciclo (inventario -= 3) y usando un limite alcanzable (>= 10). Resultado: 14 pedidos, inventario final 8.

## Ejercicio 5 - do-while
Es mas apropiado porque el cuerpo debe ejecutarse al menos una vez: primero se pide el monto y luego se valida. while evalua primero la condicion; do-while ejecuta primero el cuerpo.

## Ejercicio 6 - for y arrays
Uso for porque ya conozco el numero de elementos (productos.length). Reune inicializacion, condicion e incremento en una linea, evitando olvidar el i++ y el bucle infinito. Resultado: suma 23000, promedio 4600.

## Ejercicio 7 - Debugging
3 errores: 2 de compilacion (int cantidadVendida = "5" y falta ;) y 1 logico (if con = en vez de ==). Los de compilacion los detecta javac antes de ejecutar; los logicos compilan pero dan resultado incorrecto y se detectan probando.

## Parte 2 - Sistema de cafeteria
Pedidos procesados: 6 de 6. Total recaudado: 43000. Pedido de mayor valor: #3 con 13500. Inventario final de Brownie: 9. Total en caja: 93000.