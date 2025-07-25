package excecao.personalizadoB;

@SuppressWarnings("serial")
public class StringVaziaExecption extends Exception{
	
	private String nomeDoAtributo;
	
	public StringVaziaExecption(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	public String getMessage() {
		return String.format("O atributo '%s' está vazia", nomeDoAtributo);
	}
	
}
