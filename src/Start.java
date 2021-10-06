
import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Data entry----------------------------------------------------------------
		Scanner scn = new Scanner(System.in);
		System.out.println();
		System.out.println("***********RETO 1************");
		System.out.println();
		
		String nombre, apellido, dni;
		float salario;
		int edad;
		
		nombre = ctrlName();
		apellido = ctrlLastN();
		dni = ctrlDni();
		salario = ctrlSalario();
		edad = ctrlEdad();
		
		//Definition & Instantiation
		Empleado emp1 = new Empleado();
	
		emp1.setNombre(nombre);
		emp1.setApellido(apellido);
		emp1.setDni(dni);
		emp1.setSalario(salario);
		emp1.setEdad(edad);
		
		System.out.println("Nombre: " + emp1.getNombre());
		System.out.println("Apellido: " + emp1.getApellido());
		System.out.println("DNI: " + emp1.getDni());
		System.out.println("Salario: " + emp1.getSalario());
		System.out.println("Edad: " + emp1.getEdad());
		
		
		System.out.println();
		emp1.print();
		
	}
	

	//---------------------------FUNCTIONS-------------------------------------
	//functions to control data entry errors
	
	public static String ctrlName(){
    	Scanner scnn = new Scanner(System.in);
    	String x;
    	System.out.println("Introduce tu nommbre: ");
    	//Loop until the user entry the right data
    	while(scnn.hasNextInt()== true || scnn.hasNextFloat()== true || scnn.hasNextDouble()== true){
    		System.out.println("Error, no has introducido tu nombre correctamente, vuelve a intentar");
    		scnn.next();//Reset   
    	}   
    	x = scnn.nextLine();//Save the right     
    	return x;	    
    }

		
	public static String ctrlLastN(){
    	Scanner scnn = new Scanner(System.in);
    	String x;
    	System.out.println("Introduce tu apellido: ");
    	//Loop until the user entry the right data
    	while(scnn.hasNextInt()== true || scnn.hasNextFloat()== true || scnn.hasNextDouble()== true){
    		System.out.println("Error, no has introducido tu apellido correctamente, vuelve a intentar");
    		scnn.next();//Reset   
    	}   
    	x = scnn.nextLine();//Save the right     
    	return x;	    
    }
	
	public static String ctrlDni(){
    	Scanner scnn = new Scanner(System.in);
    	String x;
    	System.out.println("Introduce tu DNI: ");
    	//Loop until the user entry the right data
    	while(scnn.hasNextInt()== true || scnn.hasNextFloat()== true || scnn.hasNextDouble()== true){
    		System.out.println("Error, no has introducido tu DNI correctamente, vuelve a intentar");
    		scnn.next();//Reset   
    	}   
    	x = scnn.nextLine();//Save the right     
    	return x;	    
    }
	
    
    public static int ctrlEdad(){
    	Scanner scnn = new Scanner(System.in);
    	int num;
    	System.out.println("Introduce tu edad: ");
    	//Loop until the user entry the right data
    	while(scnn.hasNextInt() == false){
    		System.out.println("Error, no has introducido un número, vuelve a intentar");
    		scnn.next();//Reset   
    	}   
    	num = scnn.nextInt();//Save the right     
    	return num;	    
    }
    
    
    public static float ctrlSalario(){
    	Scanner scnn = new Scanner(System.in);
    	float num;
    	System.out.println("Introduce tu salario: ");
    	//Loop until the user entry the right data
    	while(scnn.hasNextFloat() == false){
    		System.out.println("Error, no has introducido un número decimal, vuelve a intentar");
    		scnn.next();//Reset   
    	}   
    	num = scnn.nextFloat();//Save the right     
    	return num;    
    }
			
}


