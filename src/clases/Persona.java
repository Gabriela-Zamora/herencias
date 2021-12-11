package clases;

import javax.swing.JOptionPane;

public class Persona {
	
	private String numeroDeDNI;
	private String nombre;
	private String apellido;
	private String fechaDeNcimiento;
	private String direccion;
	private String ciudadDeProcedencia;
	
	public void imprimirDatosPersona(String datos) {
		datos+="Nombre: "+nombre+"\n";
		datos+="Apellido: "+apellido+"\n";
		datos+="Fecha de Nacimiento: "+fechaDeNcimiento+"\n";
		datos+="Direccion: "+ciudadDeProcedencia+"\n";
		datos+="Ciudad de Procedencia: "+ciudadDeProcedencia+"\n";
		
		System.out.println(datos);
	}

	public void registrarDatos() {
		numeroDeDNI=JOptionPane.showInputDialog("Ingrese el numero del documento");
		nombre=JOptionPane.showInputDialog("Ingrese el nombre");
		apellido=JOptionPane.showInputDialog("Ingrese el apellido");
		fechaDeNcimiento=JOptionPane.showInputDialog("Ingrese fecha nacimiento (dd/mm/aaaa)");
		direccion=JOptionPane.showInputDialog("Ingrese la direccion");
		ciudadDeProcedencia=JOptionPane.showInputDialog("Ingrese la ciudad de procedencia");
	}
	
	public String getNumeroDeDNI() {
		return numeroDeDNI;
	}

	public void setNumeroDeDNI(String numeroDeDNI) {
		this.numeroDeDNI = numeroDeDNI;
	}

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

	public String getFechaDeNcimiento() {
		return fechaDeNcimiento;
	}

	public void setFechaDeNcimiento(String fechaDeNcimiento) {
		this.fechaDeNcimiento = fechaDeNcimiento;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCiudadDeProcedencia() {
		return ciudadDeProcedencia;
	}

	public void setCiudadDeProcedencia(String ciudadDeProcedencia) {
		this.ciudadDeProcedencia = ciudadDeProcedencia;
	}

}
