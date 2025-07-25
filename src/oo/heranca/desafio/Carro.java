package oo.heranca.desafio;

public class Carro {
	private double velocidade;
	private double motor;
	private String cor;
	
	protected Carro(double motor, String cor){
		this.velocidade = 1;
		this.motor = motor;
		this.cor = cor;
	}
	
	public double getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	public double getMotor() {
		return motor;
	}
	public void setMotor(double motor) {
		this.motor = motor;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public double acelerar() {
		
		if(velocidade <=180) {
			velocidade =+ 5;
		}
		
		return velocidade;	
	}
	 public double freiar() {
		if(velocidade >=1) {
			velocidade -= 5;
		}
		return velocidade;
	}
	
}
