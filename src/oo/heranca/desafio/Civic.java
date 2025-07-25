package oo.heranca.desafio;

public class Civic extends Carro{

	Civic(double motor, String cor) {
		super(motor, cor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public
	double acelerar() {
		if(this.getVelocidade() <= 315) {
			this.setVelocidade(getVelocidade() + 10);			
		}
		return getVelocidade();
	}

	@Override
	public
	double freiar() {
		if(this.getVelocidade() <= 1) {
			this.setVelocidade(getVelocidade() - 10);		
		}
		return 0;
	}
	
	
}
