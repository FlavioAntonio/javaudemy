package excecao.personalizadoB;

@SuppressWarnings("serial")
public class NumeroForaIntervaloExecption extends RuntimeException{
	
	private String nomeDoAtributo;
	
	public NumeroForaIntervaloExecption(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	public String getMessage() {
		return String.format("O atributo '%s' está fora do Intervalo", nomeDoAtributo);
	}
	
}
