import java.util.Scanner;

public class Tamanhos_Valores {
	Scanner scan= new Scanner(System.in);

	void TamanhoseVal () {
		System.out.println("Estes são os tamanhos e valores dos produtos disponiveis na loja:\n");
		System.out.println("[1]Piscina padrão retangular grande [9,98 x 4,06 e 1,40 de profundidade] por: R$20.000,00;");
		System.out.println("[2]Piscina padrão retangular média [6,97 x 3,42 e 1,40 de profundidade] por: R$15.000,00;");
		System.out.println("[3]Piscina padrão retangular pequena [3,96 x 2,36 e 1,30 de profundidade] por: R$13.000,00;");
		System.out.println("[4]Piscina personalizada [tamanho e profundidade escolhido pelo cliente] a partir de R$5.000,00;");
	
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
