import java.util.Scanner;
public class Loja {
	Scanner scan = new Scanner(System.in);
	
	void sobre() {
		System.out.println("---Loja PisciAna---");
		System.out.println("Somos PisciAna uma empresa destinada a venda de piscinas e acessórios");
		System.out.println("Contatos: pisciana.faleconosco@gmailcom Telefone: 51 912345000");
		System.out.println("Criado por:  Ana Lidia Marques Barbo Turma: INF-3AM ");
		System.out.println("\n\nVoltar ao menu do cliente? [1 = sim - 2 = nao]: ");
		
		int opcao2 = scan.nextInt();
		
		if(opcao2 == 1) {
			Menu menu= new Menu();
			menu.MenuCliente();
		} else if (opcao2 == 2){
			System.out.println("----fim do programa----\n");
		}
	}
}
