package oo.composicao.copy;

public class Carro {
	Motor motor = new Motor();
	
	void acelerar() {
		motor.fatorInjeção += 0.4;
	}
	void freiar() {
		if(motor.fatorInjeção > 0.5) {
			motor.fatorInjeção -= 0.4;			
		}
	}
	
	void ligar() {
		motor.ligado = true;
	}
	void desligado() {
		motor.ligado = false;
	}
	boolean estatusMotor() {
		return motor.ligado;
	}
}
