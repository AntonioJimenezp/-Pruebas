//Importa el paquete con la clase Scanner
import java.util.*;

//Definicion de clase
public class TestAnimal{
	
	//Metodo principal
	public static void main(String[] args){
		
		//Declaracion del objeto animal
		Animal animal1 = new Animal();
		
		//Declaracion del objeto teclado
		Scanner teclado = new Scanner(System.in);
		
		//Pedimos el nombre del animal y su edad
		System.out.println("Mi nombre es: ");
		animal1.setNombre(teclado.nextLine());
		System.out.println("Edad del animal en meses: ");
		animal1.setEdad(teclado.nextInt());
		
		animal1.nace();
		System.out.println("Mi nombre es: " + animal1.getNombre() + " y mi edad es: " + animal1.getEdad() + " meses");
	}
	
}
