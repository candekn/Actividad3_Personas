package ar.edu.unlam.pb2;

public class Persona {
	//Atributos
	private String nombre;
	private Integer edad;
	private String dni;
	private Character sexo;
	private Double peso;
	private Double altura;
	private static final Character SEXH='H';
	private static final Character SEXM='M';
	private static final Integer BAJO=-1;
	private static final Integer MEDIA=0;
	private static final Integer ALTO=1;
	//Metodos
	public Persona(String dni){
		this.nombre="";
		this.edad=0;
		this.dni=dni;
		this.sexo=SEXH;
		this.peso=0.0;
		this.altura=0.0;
	}
	public Persona(String nombre, Integer edad, Character sexo){
		this.nombre=nombre;
		this.edad=edad;
		this.sexo=sexo;
		this.peso=(Math.random()*299+1);
		this.altura=(Math.random()*3+1);
		this.dni=buscarLetra()+generaDNI();
	}
	public Persona(String nombre, Integer edad, String dni, Character sexo, Double peso, Double altura){
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
			return BAJO;
		}
		else{
			if(imc>=25){
				return ALTO;
				}
				else{
					return MEDIA;
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
		if((sexo.compareTo(SEXH)==0||(sexo.compareTo(SEXM))==0)){
			
		}
		else{
			this.sexo=SEXH;
		}
		
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", sexo=" + sexo + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}
	private Integer generaDNI(){
		Integer dni=(int)(Math.random()*99999999+1);
		return dni;
	}
	private String buscarLetra() {
		Integer resto=(Integer)(generaDNI()%23);
		switch(resto) {
		case 1: return "A";
				 
		case 2: return "B";
				 
		case 3: return "C";
				 
		case 4: return "D";
				 
		case 5: return "E";
				 
		case 6: return "F";
				 
		case 7: return "G";
				 
		case 8: return "H";
				 
		case 9: return "I";
				 
		case 10:return "J";
				 
		case 11: return "k";
				 
		case 12: return "L";
				 
		case 13: return "M";
				 
		case 14: return "N";
				 
		case 15: return "O";
				 
		case 16: return "P";
				 
		case 17: return "Q";
				 
		case 18: return "R";
				 
		case 19: return "S";
		 
		case 20: return "T";
		 
		case 21: return "U";
		 
		case 22: return "V";
		 
		case 23: return "W";
		 
		case 24: return "X";
		 
		default: return "Y";
		 
		}			
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
	public String getNombre() {
		return nombre;
	}
	public Integer getEdad() {
		return edad;
	}
	public Character getSexo() {
		return sexo;
	}
	public Double getPeso() {
		return peso;
	}
	public Double getAltura() {
		return altura;
	}
	
	public static Integer getBajo() {
		return BAJO;
	}
	public static Integer getMedia() {
		return MEDIA;
	}
	public static Integer getAlto() {
		return ALTO;
	}
	
	
}
