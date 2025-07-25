package excecao;

import java.util.Scanner;

public class Finally {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		try {
			System.out.println("Digite um numero: ");
			System.out.println(7 / entrada.nextInt());
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Finalmente codigo fechado");
			entrada.close();
		}
		System.out.println("FIM! ");

	}

}
