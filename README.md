# Práctica Programada 1 - Inverso de un Número

**Nombre:** Sebastián Vargas  
**Carné:** FH20008393

## Recursos usados
- [Java Documentation](https://docs.oracle.com/en/java/)
- ChatGPT (https://chat.openai.com)
- StackOverflow

## Prompts de IA
- Pregunta a ChatGPT sobre cómo invertir un número recursivamente usando cociente y residuo.

## Preguntas
**1. ¿Es posible implementar una solución iterativa?**  
Sí, usando un bucle while que tome cada dígito y construya el número invertido.

**2. ¿Hay otra manera recursiva de generar el mismo resultado?**  
Sí, se podría crear un método recursivo que convierta el número a string y use concatenación de caracteres al revés.

**3. Relación con conversión de bases numéricas**  
El uso de cociente y residuo para invertir un número es similar al proceso de convertir un número de base 10 a otra base, donde se obtiene el residuo como dígito de la nueva base y se repite con el cociente.


Práctica PP2 - Revert

Nombre: Sebastián Vargas  
Carné: FH20008393

Descripción
Programa en Java que utiliza la estructura de datos *Stack* para invertir el contenido de un archivo de texto (`input.txt`) y generar un archivo de salida (`output.txt`) con el texto invertido.


Entorno de desarrollo
IDE: Visual Studio Code  
Versión Java: Java SE 21 (OpenJDK 21)  



Preguntas

1. ¿Existe otra forma de invertir el contenido sin usar una pila?
Podriamos leer el archivo completo en una cadena (string) o un arreglo de caracteres y recorrerlos en sentido inverso para el archivo de salida.

2. ¿En qué ejemplo de la vida real se refleja el uso de una pila?
Creo que se puede ejemplificar bastante bien con una pila de platos, el que se coloca arriba de primero es el primero que se retira.

