package oo.composicao;

public class Motor {
	double fatorInjeção = 1;
	boolean ligado = false;
	
	int giros() {
		if(!ligado) {
			return 0;
		}else {
			return (int) (fatorInjeção * 3000);			
		}
	}
}
