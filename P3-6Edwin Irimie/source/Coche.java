import javax.swing.JOptionPane;

class Coche {
	
	private String matricula;
	private String marca;
	private String modelo;
	private String color;
	private String techo;
	private double km;
	private int npuertas;
	private int nplazas;
	
	
	void setMatricula(String matri){
		matricula = matri;
	}
	String getMatricula(){
		return matricula;
	}
	void setMarca(String marc){
		marca = marc;
	}
	String getMarca(){
		return marca;
	}
	void setModelo(String model){
		modelo = model;
	}
	String getModelo(){
		return modelo;
	}
	void setColor(String col){
		color = col;
	}
	String getColor(){
		return color;
	}
	void setTecho(String tech){
		techo = tech;
	}
	String getTecho(){
		return techo;
	}
	void setKm(double kim){
		if ( kim > 0) {	
			km = kim;
		}
		else{
			km = 0;
		}
	}
	double getKm(){
		return km;
	}
	void setNpuertas(int npuer){
		if ( npuer > 0 && npuer <= 5){
			npuertas = npuer;
		}
		else{
			npuer = 3;
		}
	}
	int getNpuertas(){
		return npuertas;
	}
	void setNplazas(int nplaz){
		if ( nplaz > 0 && nplaz <= 7){
			nplazas = nplaz;
		}
		else{
			nplaz = 5;
		}
	}
	int getNplazas(){
		return nplazas;
	}
	
	public Coche(){
		matricula = " ";
		marca = "Seat";
		modelo = "Altea";
		color = "blanco";
		techo = "No";
		km = 0;
		npuertas = 3;
		nplazas = 5;
	}
		
	public Coche(String cochematricula){
		matricula = cochematricula;
		marca = "Seat";
		modelo = "Altea";
		color = "blanco";
		techo = "No";
		km = 0;
		npuertas = 3;
		nplazas = 5;
	}
		
	public Coche(int numPuertas , int numPlazas){
		npuertas = numPuertas;
		nplazas = numPlazas;
		matricula = " ";
		marca = "Seat";
		modelo = "Altea";
		color = "blanco";
		techo = "No";
		km = 0;
	}
		
	public Coche(String marCoche , String moCoche , String coCoche){
		marca = marCoche;
		modelo = moCoche;
		color = coCoche;
		matricula = " ";
		techo = "No";
		km = 0;
		npuertas = 3;
		nplazas = 5;
	}
	
	void avanzar(double kilom){
		km = km + kilom;
		JOptionPane.showMessageDialog(null,"El coche ha avanzado " + kilom + "km y tiene " + km + " km ");
	}
	void tunear(){
		km = 0;
		techo = "Si";
		JOptionPane.showMessageDialog(null,"El coche dispone de techo solar: " + techo );
	}
	void tunear(String colo){
		color = colo;
		techo = "Si";
		JOptionPane.showMessageDialog(null,"El coche dispone de techo solar: " + techo + " y tiene color " + colo);
	}
	void matricular(String matricu){
		matricula = matricu;
	}
}
		
		