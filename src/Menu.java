import java.util.Scanner;

	
	public class Menu {
		Scanner scan = new Scanner(System.in);
		Login log = new Login();
		Cadastro cad = new Cadastro();
		LogAdm adm = new LogAdm();
		LogFornecedor forn = new LogFornecedor();
		Produtos prod = new Produtos();
		Tamanhos_Valores Tam_Val= new Tamanhos_Valores();
		Revestimentos Revestimentos = new Revestimentos();
		Loja sobrenos = new Loja();
		Compras compras = new Compras();
		Estoque estoque = new Estoque();
		EstoqueFornec estoqueforn = new EstoqueFornec();
		Porcentagem porcent = new Porcentagem();
		FornecEnvio envio = new FornecEnvio();
		Usuario editarUsu = new Usuario();
		
		void printmenu(){										//primeiro menu
			System.out.println("----------MENU----------");
			System.out.println("[1] Login");
			System.out.println("[2] Cadastre-se");
			System.out.println("[3] Entrar como administrador");
			System.out.println("[4] Entrar como fornecedor");
			System.out.println("[5] Sair");
			System.out.print("-Digite a opção desejada: ");
			int opcao = scan.nextInt();
			
			switch(opcao) {
			case 5: System.out.println("----fim do programa----");
			break;
			
			case 4: forn.LoginFornecedor();
			break;
			
			case 3: adm.admlog();
			break;
			
			case 2: cad.cadastro(); 
			break;
			
			case 1: log.login();
			break;
			}
			
		
			
		}
		
		void MenuCliente(){		//inicial do cliente/usuario/ menu do cliente
			System.out.println("---MENU---");
			System.out.println("[1]Visualizar produtos");
			System.out.println("[2]Tamanhos e valores");
			System.out.println("[3]Revestimentos");
			System.out.println("[4]Ir as compras");
			System.out.println("[5]Sobre Nós");
			System.out.println("[6]Encerrar programa");
			System.out.println("[7]Voltar ao Menu inicial");
			System.out.println("[8]Alterar usuario");
			System.out.println("[9]Alterar senha");
			
			System.out.println("-Digite a opção desejada: ");
			int opcao= scan.nextInt();
			switch (opcao) {
			case 9: editarUsu.alterarSenha();
				break;
			case 8: editarUsu.alterarUsuario();
			break;
			case 7: Menu menu= new Menu();
					menu.printmenu();
			break;
			
			case 6: System.out.println("----fim do programa----");
			break;
			
			case 5: sobrenos.sobre();
			break;
			
			case 4: compras.compras();
			break;
			
			case 3: Revestimentos.revest();
			break;
			
			case 2:Tam_Val.TamanhoseVal();
			break;
			
			case 1: prod.listaprodutos();
			break;
			}
			System.out.println("\n\nVoltar ao menu inicial? [1 = sim - 2 = nao]: ");
			
			int opcao2 = scan.nextInt();
			
			if(opcao2 == 1) {
				Menu menu= new Menu();
				menu.printmenu();
			} else if (opcao2 == 2){
				System.out.println("----fim do programa----\n");
			}
		}
		
		void MenuAdm() {		//menu do administrador
			System.out.println("[1]Visualizar usuários cadastrados");
			System.out.println("[2]Estoque");
			System.out.println("[3]Alterar Estoque");
			System.out.println("[4]Ver porcentagem que receberá em determinada venda");
			System.out.println("[5]Sair");
			System.out.println("[6]Voltar ao Menu inicial");
			System.out.println("Digite a opção desejada: ");
			int opcao=scan.nextInt();
			
			switch (opcao){
			case 6: Menu menu= new Menu();
					menu.printmenu();
			break;
				
			case 5: System.out.println("----fim do programa----");
			break;
			
			case 4: porcent.porcentvenda();
			break;
			
			case 3: estoque.estoquetotal();
			break;
			
			case 2:estoque.estoquetotal();
			break;
				
			case 1:System.out.println("Veja os usuários cadastrados até agora!");
			break;
			}
			System.out.println("\n\nVoltar ao menu do Adm? [1 = sim - 2 = nao]: ");
			
			int opcao2 = scan.nextInt();
			
			if(opcao2 == 1) {
				Menu menu= new Menu();
				menu.MenuAdm();
			} else if (opcao2 == 2){
				System.out.println("----fim do programa----\n");
			}
		}
		
		void MenuForn() {		//menu do fornecedor
			System.out.println("[1]Visualizar produtos em estoque");
			System.out.println("[2]Alterar estoque");
			System.out.println("[3]Enviar Produtos");
			
			System.out.println("[4]Fretes");
			System.out.println("[5]Sair");
			System.out.println("[6]Voltar ao Menu inicial");
			System.out.println("Digite a opção desejada: ");
			int opcao=scan.nextInt();
			switch (opcao) {
			case 6: Menu menu= new Menu();
			menu.printmenu();
			break;
			
			case 5: System.out.println("----fim do programa----");
				break;
				
			case 4:System.out.println("Veja aqui os valores de frete para cada região do país:");
			System.out.println("Norte: R$2500,00");
			System.out.println("Nordeste: R$2500,00");
			System.out.println("Centro-Oeste: R$1500,00");
			System.out.println("Sudeste: R$1500");
			System.out.println("Sul: R$1000,00");
			
				break;
			
				
			case 3:envio.enviofornec();
				break;
				
			case 2:estoqueforn.estoquetotal();
				break;
				
			case 1:estoqueforn.estoquetotal();
				break;
			}
			System.out.println("\n\nVoltar ao menu do fornecedor? [1 = sim - 2 = nao]: ");
			
			int opcao2 = scan.nextInt();
			
			if(opcao2 == 1) {
				Menu menu= new Menu();
				menu.MenuForn();
			} else if (opcao2 == 2){
				System.out.println("----fim do programa----\n");
			}
		}
		
}
