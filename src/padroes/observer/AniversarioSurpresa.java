package padroes.observer;

public class AniversarioSurpresa {
	public static void main(String[] args) {
		Namorada nomorada = new Namorada();
		Porteiro porteiro = new Porteiro();
		porteiro.registrarObservador(nomorada);
		porteiro.monitorar();
	}
}
