//Definicion de la Clase Animal
public class Animal{

//Atributos
private String nombre;
private int edad;

//Metodos
public void nace(){
	System.out.println("Hola he nacido. ");
}

public String getNombre(){
	return nombre;
}

public int getEdad(){
	return edad;
}

public void setNombre(String nombre){
	this.nombre=nombre;
}

public void setEdad(int edad){
	this.edad=edad;
}



}
