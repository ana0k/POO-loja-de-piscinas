import java.util.Scanner;

public class Revestimentos {
	Scanner scan= new Scanner(System.in);

	void revest() {
		System.out.println("Estes são os revestimentos disponiveis na loja:\n");
		System.out.println("[1]Azulejo para piscina por: R$100,00 ;");
		System.out.println("[2]Pastilha de vidro para piscina por: R$200,00 ;");
		System.out.println("[3]Revestimento em cerâmica para piscina por: R$300,00 ;");
		
	
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
