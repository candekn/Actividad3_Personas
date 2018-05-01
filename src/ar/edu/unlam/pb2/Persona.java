package ar.edu.unlam.pb2;

public class Persona {
	//Atributos
	private String nombre;
	private Integer edad;
	private Integer dni;
	private Character sexo;
	private Double peso;
	private Double altura;
	public static final Character sexH='H';
	public static final Character sexM='M';
	public static final Integer bajo=-1;
	public static final Integer media=0;
	public static final Integer alto=1;
	//Metodos
	public Persona(Integer dni){
		this.nombre="";
		this.edad=0;
		this.dni=dni;
		this.sexo=sexH;
		this.peso=0.0;
		this.altura=0.0;
	}
	public Persona(String nombre, Integer edad, Character sexo){
		this.nombre=nombre;
		this.edad=edad;
		this.sexo=sexo;
		this.peso=(Math.random()*299+1);
		this.altura=(Math.random()*3+1);
		this.dni=generaDNI();
	}
	public Persona(String nombre, Integer edad, Integer dni, Character sexo, Double peso, Double altura){
		this.nombre=nombre;
		this.edad=edad;
		this.dni=dni;
		this.sexo=sexo;
		this.peso=peso;
		this.altura=altura;
	}
	public Integer calcularIMC(){
		Double imc=(peso)/(Math.pow(this.altura, 2));
		if (imc<20){
			return bajo;
		}
		else{
			if(imc>=25){
				return alto;
				}
				else{
					return media;
					}
			}
	}
	public boolean esMayorDeEdad(){
		if(this.edad>=18){
			return true;
		}
		else{
			return false;
		}
	}
	public void comprobarSexo(Character sexo){
		if((sexo.compareTo(sexH)==0||(sexo.compareTo(sexM))==0)){
			
		}
		else{
			this.sexo=sexH;
		}
		
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", sexo=" + sexo + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}
	public Integer generaDNI(){
		Integer dni=(int)(Math.random()*99999999+1);
		return dni;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public void setSexo(Character sexo) {
		this.sexo = sexo;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	public void setAltura(Double altura) {
		this.altura = altura;
	}
	
}
