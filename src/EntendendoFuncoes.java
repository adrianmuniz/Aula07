import java.util.Scanner;

public class EntendendoFuncoes {
	// funcao sem argumentos e sem return
	public static void saudacao() {
		System.out.println("Bem vindo ao programa");
	}
	//funcao sem argumentos e sem return
	public static void saudar(String nome) {
		System.out.println("Bem vindo ao programa, " + nome);
	}
	
	//funcao com argumentos e com return
	public static String nomeCompleto(String nome, String sobrenome) {
		String nomeSobrenome;
		nomeSobrenome = nome + " " + sobrenome;
		return nomeSobrenome;
	}
	
	public static void main(String[] args) {
		
		//System.out.println("Bem vindo ao Programa!");
		Scanner leitor = new Scanner (System.in);
		String nome[] = {"z�", "Joao", "Leia"};
		saudacao();
		
		//System.out.println("Digite o seu nome");
		//nome = leitor.next(
		for (int i=0; i<nome.length; i++) {
			saudar(nome[i]);
		}
		
		System.out.println(nomeCompleto("Andr�", "David"));
		saudar(nomeCompleto("Barack", "Obama"));
	}

	
}
