package oo.heranca.desafio;

public class CarroTeste {

	public static void main(String[] args) {
		Civic c1 = new Civic(1.0, "Amarelo");
		
		System.out.println(c1.getCor());
		System.out.println(c1.getMotor());
		c1.acelerar();
		System.out.println(c1.getVelocidade());
		c1.freiar();
		System.out.println(c1.getVelocidade());

	}

}
