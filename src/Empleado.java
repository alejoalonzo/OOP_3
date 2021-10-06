
public class Empleado {
	
	//Attributes
	protected String nombre;
	protected String apellido;
	protected String dni;
	protected float salario;
	protected int edad;
	
	//Builders
	public Empleado() {
		this.nombre = "";
		this.apellido = "";
		this.dni = "";
		this.salario = 0.0f;
		this.edad = 0;
	}
	//Builder overload
	public Empleado(String name, String LastN, String id, float Sa, int age) {
		this.nombre = "";
		this.apellido = "";
		this.dni = "";
		this.salario = 0.0f;
		this.edad = 0;
	}
	
	
	//Getters & Setters-------------------------------------------------
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	//Own method-------------------------------------------------------------------------------------------------------------
	public void print () {
		System.out.println(this.nombre + " - " + this.apellido + " - " + this.dni + " - " + this.salario +  " - " + this.edad);
	}
	
	
}
