import javax.swing.JOptionPane;

/**
 * Una clase para representar los coches con sus caracteristicas y metodos ademas de constructores.
 * @version, 28/01/18
 * @author Edwin Orlando Irimie
 */

public class Coche {
	
	private String matricula;
	private String marca;
	private String modelo;
	private String color;
	private String techo;
	private double km;
	private int npuertas;
	private int nplazas;
	public static int numcoche;
	static final int MAX_COCHES = 5;
	
	/** 
     * Crea un coche a partir de las siguientes variable
     * @param matricula que se utiliza para guardar la matricula 
     * @param marca que da valor a la marca del nuevo coche 
     * @param color que guarda un color que le asignaremos 
     * @param modelo guradara el modelo del coche 
     * @param  techo es una variable que devolvera un si o no segun si tiene o no techo
     * @param  km variable de tipo int que guardara el numero de kilometros
     * @param  npuertas variable de tipo int que guardara el numero de puertas
     * @param  nplazas variable de tipo int que guardara el numero de plazas
     * @param  de tipo int y estatico que realiza la funcion de contador
     * @param  de tipo int se utiliza para que el programa no sobrepase los 5 coches
     */
	
	void setMatricula(String matri){
		matricula = matri;
	}
	String getMatricula(){
		return matricula;
	}
	
	/**
	 *en el metodo setMatricula le pasamos por parametro la variable matri
	 *igualamos esa variable a la de matricula
	 *en el metodo getMatricula
	 *@return matricula
	 */
	 
	void setMarca(String marc){
		marca = marc;
	}
	String getMarca(){
		return marca;
	}
	
	/**
	 *en el metodo setMarca le pasamos por parametro la variable marc
	 *igualamos esa variable a la de marca
	 *@return marca
	 */
	 
	void setModelo(String model){
		modelo = model;
	}
	String getModelo(){
		return modelo;
	}
	
	/**
	 *en el metodo setModelo le pasamos por parametro la variable model
	 *igualamos esa variable a la de modelo
	 *@return modelo
	 */
	 
	void setColor(String col){
		color = col;
	}
	String getColor(){
		return color;
	}
	
	/**
	 *en el metodo setColor le pasamos por parametro la variable col
	 *igualamos esa variable a la de color
	 *@return color
	 */
	 
	void setTecho(String tech){
		techo = tech;
	}
	String getTecho(){
		return techo;
	}
	
	/**
	 *en el metodo setTecho le pasamos por parametro la variable tch
	 *igualamos esa variable a la de techo
	 *@return techo
	 */
	 
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
	
	/**
	 *se le pasa por parametro kim y mediante la condicion del if se determina
	 *si el coche tiene mas de 0 se igual kim con km y si no los km valen 0
	 *@return km
	 */
	 
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
	
	/**
	 *se le pasa por parametro npuer y mediante la condicion del if se determina
	 *si el coche tiene 5 o menos puertas
	 *@return npuertas
	 */
	 
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
	
	/**
	 *se le pasa por parametro nplaz y mediante la condicion del if se determina
	 *si el coche tiene 7 o mas plazas

	 */
	 
	
	public Coche(){
		matricula = " ";
		marca = "Seat";
		modelo = "Altea";
		color = "Blanco";
		techo = "No";
		km = 0;
		npuertas = 3;
		nplazas = 5;
		numcoche++;
	}
	
	/*
	 *constructor Coche sin parametros
	 *@param matricula = le asignamos una matricula
	 *@param marca = le asignamos una marca
	 *@param modelo = le asignamos un modelo
	 *@param color = le asignamos un color
	 *@param techo = le asignamos si tiene techo o no
	 *@param km = le asignamos unos kilometros
	 *@param npuertas = asignamos un numero de puertas
	 *@param nplazas = asignamos un numero de plazas 
	 *@param numcoche el contador se incrementa
	 */
		
	public Coche(String cochematricula){
		matricula = cochematricula;
		marca = "Seat";
		modelo = "Altea";
		color = "Blanco";
		techo = "No";
		km = 0;
		npuertas = 3;
		nplazas = 5;
		numcoche++;
	}
	
	/*
	 *constructor Coche con un parametro
	 *@param cochematricula = le asignamos una matricula
	 *@param marca = le asignamos el valor por defecto
	 *@param modelo = le asignamos el valor por defecto
	 *@param color = le asignamos el valor por defecto
	 *@param techo = le asignamos el valor por defecto
	 *@param km = le asignamos el valor por defecto
	 *@param npuertas = le asignamos el valor por defecto
	 *@param nplazas = le asignamos el valor por defecto
	 *@param numcoche el contador se incrementa
	 */
		
	public Coche(int numPuertas , int numPlazas){
		npuertas = numPuertas;
		nplazas = numPlazas;
		matricula = " ";
		marca = "Seat";
		modelo = "Altea";
		color = "Blanco";
		techo = "No";
		km = 0;
		numcoche++;
	}
	
	/*
	 *constructor Coche con dos parametros
	 *@param matricula = le asignamos el valor por defecto
	 *@param marca = le asignamos el valor por defecto
	 *@param modelo = le asignamos el valor por defecto
	 *@param color = le asignamos el valor por defecto
	 *@param techo = le asignamos el valor por defecto
	 *@param km = le asignamos el valor por defecto
	 *@param numPuertas = asignamos un numero de puertas 
	 *@param numPlazas = asignamos un numero de plazas 
	 *@param numcoche el contador se incrementa
	 */
		
	public Coche(String marCoche , String moCoche , String coCoche){
		marca = marCoche;
		modelo = moCoche;
		color = coCoche;
		matricula = " ";
		techo = "No";
		km = 0;
		npuertas = 3;
		nplazas = 5;
		numcoche++;
	}
	
	/*
	 *constructor Coche con tres parametros
	 *@param marCoche se le asigna una matricula diferente a la prederteminada
	 *@param moCoche se le asigna un modelo diferente a la prederteminada
	 *@param coCoche se le asigna un color diferente a la prederteminada
	 *@param techo = le asignamos el valor por defecto
	 *@param km = le asignamos el valor por defecto
	 *@param npuertas = le asignamos el valor por defecto
	 *@param nplazas = le asignamos el valor por defecto
	 *@param numcoche el contador se incrementa
	 */
	
	void avanzar(double kilom){
		km = km + kilom;
		
	}
	
	/* mediante el metodo avanzar calculamos los kilometros que se suman a los que ya tenia
	 *@param kilom hace referencia a los kilometros resltantes
	*/
	
	void tunear(){
		km = 0;
		if (techo.equals("No")){
			techo = "Si";
		}
		else{
			techo = "No";
		} 
	}
	
	/* 
	 *comprobamos si ya tiene techo y si es asi lo cambia a que no y viceversa
	 *ademas cambia los kilometros a 0
	 */
	 
	void tunear(String colo){
		color = colo;
		
	}
	
	/*
	 *@param colo 
	 *le asignamos el color
	 */
	 
	 
	void matricular(String matricu){
		matricula = matricu;
	}
	
	/*
	 *@param matricu 
	 *le asignamos la matricula
	 */
}
		
		