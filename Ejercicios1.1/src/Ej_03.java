public class Ej_03 {
	static int mcd(int m, int n) { //Se inicializan las variables del metodo 
		if (n <= m && m % n == 0) //Se aplica una condición en donde se realizan 
			//comparaciones para evitar numeros iguales o menores de 0
			return n; //En caso verdadero devuelve el valor n
		else if (m < n) //Si no se cumple la condicion anterior, el metodo entra en esta 
			return mcd(n, m); //Si se cumple esta segunda condicion, se devuelven los valores ingresados
		else
			return mcd(n, m % n); //Si no se cumple la condicion anterior, el el metodo realiza una operacion aritmetica para obtener el MCD
	}

	public static void main(String[] args) {
		System.out.println(mcd(124,6)); //En los parametros de entrada se ingresan algunos datos, para probar el mcd, a su vez aqui se 
		//imprime el valor del mcd llamando al metodo llamado "mcd"
	}
}

//Este programa esta en forma recursiva, ya que se manda llamar al metodo en otro metodo, en este caso es el metodo main
//A su vez en el método main, se ingresan los valores que tomara el método para realizar la operación