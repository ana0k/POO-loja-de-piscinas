import java.util.Scanner;

public class LogFornecedor {
	Scanner scan = new Scanner(System.in);

	void LoginFornecedor() {
		System.out.println("--Entrar como fornecedor--\n");
		
		System.out.println("Seu Usuário: ");
		String fornec= scan.next();
		
		System.out.println("Sua Senha: ");
		int senhafornec= scan.nextInt();
		
		if(fornec.equals ("fornecedor") && senhafornec==12345) {
			System.out.println("[Fornecedor Logado!]");
			Menu menu=new Menu();
			menu.MenuForn();
		}else {
			
			System.out.println("[Erro. Login incompativel como fornecedor]");
			Menu menu= new Menu();
			menu.printmenu();
		}
		
	}
}
