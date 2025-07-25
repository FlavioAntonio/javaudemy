package padroes.observer;

public class Namorada implements ObservadorChegadaAniversariante{

	@Override
	public void chegou(EventochegadaAniversariante evento) {
		System.out.println("Avisar os convidados...");
		System.out.println("Apar as luzes...");
		System.out.println("Esperar um pouco...");
		System.out.println("e... surpresa...");
		
	}

}
