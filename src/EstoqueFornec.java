import java.util.Scanner;

public class EstoqueFornec {
	Scanner scan= new Scanner(System.in);
	int qt6 = 780;
	int qt5= 800;
	int qt4 = 1000;
	int qt3 = 35;
	int qt2 = 30;
	int qt1 = 40;

		void estoquetotal(){
			System.out.println("Estes s�o os produtos disponiveis para visualiza��o do fornecedor no estoque da loja:\n");
			System.out.println("1)["+qt1+"]Piscinas padr�o retangular grande [9,98 x 4,06];");
			System.out.println("2)["+qt2+"]Piscinas padr�o retangular m�dia [6,97 x 3,42];");
			System.out.println("3)["+qt3+"]Piscinas padr�o retangular pequena [3,96 x 2,36];");
			
			System.out.println("\nEstes s�o os revestimentos disponiveis para visualiza��o do fornecedor no estoque loja:\n");
			System.out.println("4)["+qt4+"cx]Azulejos para piscina");
			System.out.println("5)["+qt5+"cx]Pastilhas de vidro para piscina");
			System.out.println("6)["+qt6+"cx]Revestimento em cer�mica para piscina");
			 
			
			System.out.println("\n\nDeseja alterar algum item do estoque? [1 = sim - 2 = nao]: ");
			int opcao = scan.nextInt();
			
			
			switch (opcao) {
			case 2: System.out.println("\n\nVoltar ao menu do Fornecedor? [1 = sim - 2 = nao]: ");
			
			int opcao2 = scan.nextInt();
			
			if(opcao2 == 1) {
				Menu menu= new Menu();
				menu.MenuForn();
			} else if (opcao2 == 2){
				System.out.println("----fim do programa----\n");
			}
			break;
			
			case 1: System.out.println("Informe o numero do item que deseja alterar sua quantidade no estoque: ");
			int numitem = scan.nextInt();
			
				switch (numitem) {
			case 6: System.out.println("Informe a nova quantidade de revestimentos em cer�mica: ");
			qt6 = scan.nextInt();
			break;
			case 5: System.out.println("Informe a nova quantidade de pastilhas de vidro: ");
			qt5 = scan.nextInt();
			break;
			case 4: System.out.println("Informe a nova quantidade de azulejos: ");
			qt4 = scan.nextInt();
			break;
			case 3: System.out.println("Informe a nova quantidade de piscinas padr�o retangular pequena: ");
			qt3 = scan.nextInt();
			break;
			case 2:System.out.println("Informe a nova quantidade de piscinas padr�o retangular m�dia: ");
			qt2 = scan.nextInt();
			break;
			case 1: System.out.println("Informe a nova quantidade de piscinas padr�o retangular grande: ");
			qt1 = scan.nextInt();
			break;
			}
			break;
			}
			estoquetotal();
			
			
			System.out.println("\n\nVoltar ao menu do Fornecedor? [1 = sim - 2 = nao]: ");
			
			int opcao2 = scan.nextInt();
			
			if(opcao2 == 1) {
				Menu menu= new Menu();
				menu.MenuForn();
			} else if (opcao2 == 2){
				System.out.println("----fim do programa----\n");
			}
		}
}
