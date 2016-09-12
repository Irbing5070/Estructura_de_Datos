

public class Factoriales {
     static int factorial(int numero){ 
          if ( numero <= 1 ) { //condicional para evitar numeros menores a 1
              return 1;  //Si la condicional anterior es verdadera, se imprimira el valor 1
          } else {  //Sino se cumple la condicion se devuelve el numero por el factorial (el cual el valor se ingresa en el metodo main)
        	  // a su vez se le resta 1 al numero para ir haciendolo más pequeño
              return numero*factorial(numero-1);
          }
     }
     public static void main(String args[]){
         System.out.println(factorial(5));  //Se el factorial, del numero ingresado 
     }
 }

/*
 * Este programa es recursivo, ya que se mandan llamadas al propio método con valores de numero 
 * cada vez más pequeños para resolver el problema. 
 * Cada vez que se produce una nueva llamada al método, se crean de nuevo las variables en memoria
 * y comienza la ejecución del nuevo método.
 * Cada llamada supone hacerlo a un método diferente, que es copia del original, 
 * que se ejecuta y devuelve el resultado a quien lo llamó, es decir al mismo programa.
 * 
 */