import java.util.Scanner;

public class Cadastro extends Usuario {
Scanner scan= new Scanner(System.in);

	void cadastro() {
		System.out.println("Cadastre-se:");
		System.out.println("-----------------------------");
		System.out.println("\nSeu usu�rio: ");
		usuario = scan.next();
		
		System.out.println("-----------------------------");
		
		System.out.println("Sua senha:");
		senha = scan.next();
		
		System.out.println("-----------------------------");
		System.out.println("insira novamente para confirmar: ");
		String senhaconf = scan.next();
		
		if (senhaconf.equals(senha)) {
			System.out.println("[Cadastro conclu�do com sucesso! Agora fa�a seu login para continuar!]");
		
		} else {
			System.out.println("Erro. As senhas devem ser compat�veis.");
		}
		Menu menu = new Menu();
		menu.printmenu();
	}
}