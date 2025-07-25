package excecao;

public class ChecaVsNaoChecada {
	public static void main(String[] args) {
		
		try {
			geraErro1();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
		geraErro2();
		
		System.out.println("FIM : ");
	}
	static void geraErro1() {
		throw new RuntimeException("Ocorreu um erro bem legal #01!");
	}
	static void geraErro2(){
		
		try {
			throw  new Exception("Ocorreu um erro bem legal #02!");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Que legal");
		}
	}
}
