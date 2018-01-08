import javax.swing.JOptionPane;

public class Fabrica{
	

	public static void main(String[] args){
		
		String coche = "Este programa esta desarrollado por Edwin Irimie";
		JOptionPane.showMessageDialog(null,coche);
		
		Coche [] cars = new Coche[4];
		
		Coche car1 = new Coche();
		Coche car2 = new Coche("5678-AG");
		Coche car3 = new Coche(5 , 5);
		Coche car4 = new Coche("VW" , "Caddy" , "blanco");
		
		car1.matricular("1234-DF");
		car1.setModelo("Toledo");
		car1.setColor("azul");
		car1.avanzar(200);
		
		car2.setMarca("Fiat");
		car2.setModelo("Uno");
		car2.tunear("rojo");
		car2.avanzar(300);
		car2.setNplazas(2);
		
		car3.matricular("9012-HH");
		car3.setMarca("BMW");
		car3.setModelo("850");
		car3.setColor("gris");
		car3.avanzar(400);
		car3.setNpuertas(5);
		
		car4.matricular("3456-XS");
		car4.tunear();
		car4.avanzar(500);
		car4.setNpuertas(5);
		car4.setNplazas(7);
		
		cars[0] = car1;
		cars[1] = car2;
		cars[2] = car3;
		cars[3] = car4;
		
		for ( int i = 0; i < cars.length; i++){
			caracteristicas(cars[i]);
		}
		
	}	
	static void caracteristicas(Coche c){	
			
		JOptionPane.showMessageDialog(null,"La matricula es " + c.getMatricula() + "\n la marca del coche es " + c.getMarca() + "\n el modelo es " + c.getModelo() + "\n el color es " + c.getColor() + "\n techo solar " + c.getTecho() + "\n tiene " + c.getKm() + " km " + "\n numero de puertas " + c.getNpuertas() + "\n numero de plazas " + c.getNplazas());	
		
	}
}