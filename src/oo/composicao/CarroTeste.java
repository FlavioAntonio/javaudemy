package oo.composicao;

public class CarroTeste {

	public static void main(String[] args) {
		Carro c1 = new Carro();
		
		if(c1.estatusMotor() == false) {
			System.out.println("O motos está desligado");
		}else {
			System.out.println("O Motos está ligado");
		}
		
		c1.ligar();
		c1.acelerar();
		System.out.println(c1.motor.giros());
	}

}
