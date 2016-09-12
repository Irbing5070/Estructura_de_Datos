
class Torres {
	private static int movimientos = 0;

	public static int mover(int n, char a, char b, char c) {
		if (n > 0) {
			mover(n - 1, a, c, b);
			System.out.println("mover disco " + a + " a " + c);
			movimientos++;
			mover(n - 1, b, a, c);
		}
		return movimientos;
	}
	
	
	 
	    public static void main(String[]args)
	    {
	     java.util.Scanner leer = new java.util.Scanner(System.in);
	     int movimientos;
	     System.out.println("Numero de discos: ");
	     int n=leer.nextInt();
	     movimientos = Torres.mover(n, 'A', 'B', 'C');
	     System.out.println("\nMovimientos efectuados: "+movimientos);
	    }  
} 

/*
 * 
 * Este programa se detecta facilmente que esta en forma recursiva, que tiene varias llamadas recursivas para el numero de discos, 
 * ya que dependiendo la cantidad de discos en numero de llamadas al método aumenta, es decir que si tenemos 3 discos este numero de llamadas seran 7, 
 * y si son 4 serian 35 que son el numero de movientos que se realizarían para resolver las torres de hanoi. 
 * 
 */
