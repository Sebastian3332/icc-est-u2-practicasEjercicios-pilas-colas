# Práctica 3 Estructuras Lineales
## Nombre del estudiante

Sebastian Andres Arenillas Ponce

## Descripción general

Este proyecto implementa tres ejercicios utilizando estructuras lineales en Java. Se emplean pilas para validar signos y ordenar elementos además de colas para verificar palíndromos.

## Ejercicio 01 Validación de Signos

Se utiliza una pila para almacenar símbolos de apertura. Cada símbolo de cierre debe coincidir con el último símbolo abierto. Si existe una inconsistencia la cadena es inválida.

Código
public boolean isValid(String s)
## Ejercicio 02 Ordenar Stack

Se utiliza una pila auxiliar para ordenar los elementos sin emplear arreglos ni listas. El menor elemento queda en el tope de la pila.

Código
public void sortStack(Stack<Integer> stack)
## Ejercicio 03 Palíndromo usando Colas

Se utilizan colas para almacenar los caracteres de una palabra y compararlos con otra cola que contiene los caracteres en orden inverso.

Código
public boolean isPalindrome(String text)
Salida de consola
Ejercicio 01: Validación de Signos
Cadena: {[()]} | Resultado: true
Cadena: {[(])} | Resultado: false

## Ejercicio 02: Ordenar Stack
Stack original: [2 4 1 5]
Stack ordenado: [5 4 2 1]
Tope esperado: 1

## Ejercicio 03: Palíndromo usando Colas
ana   | Resultado: true
radar | Resultado: true
java  | Resultado: false
URL Release 2.0.2

Pegar aquí la URL del Release generado en GitHub.

Cómo ejecutar
Clonar el repositorio.
Abrir el proyecto en el IDE.
Ejecutar App.java.
Verificar la salida por consola.

## Conclusiones

Conclusión 1: Las pilas permiten resolver problemas donde el último elemento ingresado debe ser el primero en salir.

Conclusión 2: Las colas facilitan el procesamiento ordenado de datos siguiendo la política FIFO.

Conclusión 3: Las estructuras lineales ayudan a desarrollar soluciones eficientes y organizadas para problemas lógicos.