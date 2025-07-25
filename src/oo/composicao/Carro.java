package oo.composicao;

public class Carro {
	Motor motor = new Motor();
	
	public void acelerar() {
		motor.fatorInjeção += 0.4;
	}
	public void freiar() {
		if(motor.fatorInjeção > 0.5) {
			motor.fatorInjeção -= 0.4;			
		}
	}
	
	public void ligar() {
		motor.ligado = true;
	}
	public void desligado() {
		motor.ligado = false;
	}
	public boolean estatusMotor() {
		return motor.ligado;
	}
}
