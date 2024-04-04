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
```js 
console.log(esPalindromo("oso"))
```
### ¿Como funciono en java?

Al tener el mismo funcionamiento que el codigo JavaScript, se mantuvieron los errores que pudo contener en dicho lenguaje, se realizaron pruebas unitarias para poder ubicar esos errores y mejorar el metodo para aumentar la robustes a la hora de ingresa una cadena.

### ¿Que errores presento el codigo inicialmente?

Los errores que presento el codigo fueron generalmente en la logica del metodo, ya que al poner un palindromo con espacios en este caso "anita lava la tina" retorno (False) cuando no debio de ser asi, al igual que con una palabra con mayusculas al inicio, en este caso se utilizo la palabra "Oso".

### ¿Como se solucionaron estos errores ?

Se soluciono mejorando el metodo, a la hora de los espacios se utilizaron expresiones regulares para controlar los espacios y que cuando los encontrara los cambiara por strings vacias para no alterar el orden de la cadena, luego con el problema de las mayusculas se transformo toda la cadena en minuscula para evitar este error de logica.

### ¿Qué rol jugaron las pruebas en mejorar su código?

Me ayudo a encontrar el error que se estaba presentando en el codigo, que principalmente paso desapercibido que luego de un rato se pudo encontrar con el uso de la pruebas unitarias, que indico que las mayusculas y los espacios eran el problema. 
