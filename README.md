Caso Palíndromos - Pruebas Unitarias
====================================
Se necesita saber si el input entregado a un método es o no un palíndromo, se ha entregado un ejemplo del codigo en javascript, por lo que el presente proyecto se implementara en codigo java.

### ¿Que hace el metodo?

En el codigo presentado en JavaScript la funcion toma una cadena y devuelve el valor booleano si la cadena es un palindromo o no

### ¿Como lo hace?

- La funcion "split" divide la cadena en un array de caracter individual.
- La funcion "reverse" invierte el array.
- La funcion "join" mete los elementos del array en la cadena que se encuentra vacia.
- Luego se compara la cadena normal con la cadena invertida, devolviendo el valor de True si son iguales y en caso contrario devolviendo False.

### ¿Como lo uso?

Para que se pueda ocupar la funcion habria que realizar una impresion en pantalla de la funcion con una cadena dentro. Por Ejemplo:  
console.log(esPalindromo("oso")); 


