import javax.swing.JOptionPane;

public class Fabrica{
	
	/*
	 *@param cars que es una array
	 *@param num que se inizializa a 0
	 *@param matric que hace referencia a la nueva matricula que se le introducira
	 *@param coch hace referencia a la matricula guardada despues de pasarla a int
	 */
	

	public static void main(String[] args){
		
		String coche = "Este programa esta desarrollado por Edwin Irimie";	
		
		Coche [] cars = new Coche[Coche.MAX_COCHES];
		
		int num = 0;
		String matric;
		int coch;
		
		
		do{
			try{
				
				num = Integer.parseInt(JOptionPane.showInputDialog(null, "Fabrica de Coches de Edwin. Selecciona una de las siguientes opciones: \n" 
				+ "1.Fabricar coche(conociendo matricula) \n" + "2.Fabricar coche(a partir del numero de puertas y el numero de plazas) \n" + 
				"3.Fabricar coche(a partir de la marca, el modelo y el color) \n" + "4.Fabricar coche(sin datos) \n" + "5.Tunear coche(pintandolo solo) \n" + 
				"6.Tunear coche(sin pintarlo) \n" + "7.Avanzar kilometros \n" + "8.Mostrar caracteristicas de un coche \n" + "9.Salir del programa \n"));
				switch (num) {
					case 0: 
						JOptionPane.showMessageDialog(null,"La opcion introducida no se encuentra");
					break;
					case 1: 
						if(Coche.numcoche != 5){
							String matricula = JOptionPane.showInputDialog(null,"Inserte una matricula: ");
							cars[Coche.numcoche] = new Coche(matricula);
							caracteristicas(cars[Coche.numcoche -1]);
							
						}
						else{
							JOptionPane.showMessageDialog(null,"No puede crear mas de 5 coches");
						}
					break;
					case 2:
						if(Coche.numcoche != 5){
							String puertas = JOptionPane.showInputDialog(null,"Inserte numero de puertas: ");
							String plazas = JOptionPane.showInputDialog(null,"Inserte numero de plazas: ");
							int puer = Integer.parseInt(puertas);
							int plaz = Integer.parseInt(plazas);
							cars[Coche.numcoche] = new Coche(puer , plaz);
							matAleatorio(cars[Coche.numcoche -1]);
							caracteristicas(cars[Coche.numcoche -1]);
							
						}
						else{
							JOptionPane.showMessageDialog(null,"No puede crear mas de 5 coches");
						}
					break;
					case 3:
						if(Coche.numcoche != 5){
							String marca = JOptionPane.showInputDialog(null,"Inserte marca: ");
							String modelo = JOptionPane.showInputDialog(null,"Inserte modelo: ");
							String color = JOptionPane.showInputDialog(null,"Inserte color: ");
							cars[Coche.numcoche] = new Coche(marca , modelo , color);
							matAleatorio(cars[Coche.numcoche -1]);
							caracteristicas(cars[Coche.numcoche -1]);
						}
						else{
							JOptionPane.showMessageDialog(null,"No puede crear mas de 5 coches");
						}	
					break;
					case 4:
						if(Coche.numcoche != 5){
							cars[Coche.numcoche] = new Coche();
							matAleatorio(cars[Coche.numcoche -1]);
							caracteristicas(cars[Coche.numcoche -1]);
						}
						else{
							JOptionPane.showMessageDialog(null,"No puede crear mas de 5 coches");
						}		
					break;
					case 5:
							
							matric = JOptionPane.showInputDialog(null,"Inserte la matricula ");
							coch = buscaCoche(matric, cars);
							
							if(coch != -1){
								String color = JOptionPane.showInputDialog(null,"Inserte el color:");
								cars[coch].tunear(color);
								caracteristicas(cars[coch]);
							}
							else{
								JOptionPane.showMessageDialog(null,"No hay ningun coche con esa matricula");
							}				
					break;
					case 6:
						
							matric = JOptionPane.showInputDialog(null,"Inserte la matricula ");
							coch = buscaCoche(matric, cars);
							
							if(coch != -1){
							
								cars[Coche.numcoche -1].tunear();
								caracteristicas(cars[coch]);
							}
							else{
								JOptionPane.showMessageDialog(null,"No hay ningun coche con esa matricula");
							}	
							
					break;
					case 7:
							
							matric = JOptionPane.showInputDialog(null,"Inserte la matricula ");
							coch = buscaCoche(matric, cars);
							
							if(coch != -1){
							
								String km = JOptionPane.showInputDialog(null,"Inserte km: ");
								double x = Double.parseDouble(km);
								cars[coch].avanzar(x);
								JOptionPane.showMessageDialog(null,"El coche cuya matricula es: " + matric + " ha avanzado " + x + "km y tiene " + x + " km ");
								caracteristicas(cars[coch]);
							}
							else{
								JOptionPane.showMessageDialog(null,"No hay ningun coche con esa matricula");
							}	
							
					break;
					case 8:
						
							matric = JOptionPane.showInputDialog(null,"Inserte la matricula ");
							coch = buscaCoche(matric, cars);
							
							if(coch != -1){
							
								caracteristicas(cars[coch]);
							}
							else{
								JOptionPane.showMessageDialog(null,"No hay ningun coche con esa matricula");
							}	
							
					break;
					case 9:	
						JOptionPane.showMessageDialog(null,"Gracias por utilizar este programa");
					break;
					default: 
						JOptionPane.showMessageDialog(null,"La opcion introducida no es correcta");
					break;
				}
			}
			catch(Exception e){
				JOptionPane.showMessageDialog(null,"La opcion introducida no es correcta");
			}
		}while(num != 9);
	}
	
	/* 
	 *dentro del metodo main se realiza un do while para que vaya repitiendo siempre que la opcion no sea 9
	 *dentro del do while se hace un try catch para comprobar que la opcion sea numerica 
	 *y por ultimo dentro del try se realiza el switch con las opciones
	 */
	 
	public static void caracteristicas(Coche c){	
	
		
		JOptionPane.showMessageDialog(null,"El coche tiene las siguientes caracteristicas : " + "\n Matricula =  " + c.getMatricula() + "\n Marca =  " + c.getMarca() + "\n Modelo =  " + c.getModelo() + "\n Color = " + c.getColor() + "\n Techo solar =  " + c.getTecho() + "\n Kilometros =  " + c.getKm() + " km " + "\n Numero de puertas =  " + c.getNpuertas() + "\n Numero de plazas = " + c.getNplazas());	
		JOptionPane.showMessageDialog(null,"Numero de coches creados: " + c.numcoche);
	}
	
	/*
	 *mostraralas caracteristicas de cada coche
	 *@param c que es de tipo Coche
	 */
	 

	public static void matAleatorio(Coche co){
		String mate = Integer.toString((int) (Math.random() * 100000));
		co.setMatricula(mate);
		
	}
	
	/*
	 *genera una matricula aleatoria
	 *@param co que es de tipo Coche
	 */
	 
	public static int buscaCoche( String buscmatricula, Coche[] cars){
		
		int x = -1;
		for (int i = 0; i < Coche.numcoche; i++){
			
			String matri = cars[i].getMatricula();
			if(matri.equals(buscmatricula)){
				x = i;
				return x;
			}
		}
		return x;
	}
	
	/*
	 *buscara si la matricula introducida existe si es el caso la devuelve
	 *@return x devuelve el valor de la matricula
	 *@param buscmatricula guada la matricula
	 *@param cars es la array y proporciona la posicion de dicha matriculaç
	 */
	
}