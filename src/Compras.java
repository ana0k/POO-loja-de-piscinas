import java.util.Scanner;

public class Compras {
	Scanner scan= new Scanner(System.in);
	double valorP;
	double valorR;
	double valorfinal;
	void compras() {
		System.out.println("--COMPRAS--");
		System.out.println("Estes são os tamanhos e valores dos produtos disponiveis na loja:\n");
		System.out.println("[1]Piscina padrão retangular grande [9,98 x 4,06 e 1,40 de profundidade] por: R$20.000,00;");
		System.out.println("[2]Piscina padrão retangular média [6,97 x 3,42 e 1,40 de profundidade] por: R$15.000,00;");
		System.out.println("[3]Piscina padrão retangular pequena [3,96 x 2,36 e 1,30 de profundidade] por: R$13.000,00;");
		System.out.println("[4]Piscina personalizada [tamanho e profundidade escolhido pelo cliente] a partir de R$5.000,00;");
		
		System.out.println("Informe a opção de piscina desejada: ");
		int opcao= scan.nextInt();
		switch(opcao) {
		case 4: 
			System.out.println("Informe a largura desejada: ");
			double largura = scan.nextDouble();
			System.out.println("Informe o comprimento desejado: ");
			double comprimento = scan.nextDouble();
			System.out.println("Informe a profundidade desejada: ");
			double profundi = scan.nextDouble();
			valorP = 5000 + (1500*comprimento);
			break;
		case 3: valorP=13000;
		break;
		
		case 2: valorP = 15000;
		break;
		
		case 1: valorP = 20000;
		
		}
		System.out.println("Estes são os revestimentos disponiveis na loja:\n");
		System.out.println("[1]Azulejo para piscina por: R$100,00 ;");
		System.out.println("[2]Pastilha de vidro para piscina por: R$200,00 ;");
		System.out.println("[3]Revestimento em cerâmica para piscina por: R$300,00 ;");
		
		System.out.println("Informe a opção de revestimento desejada: ");
		int opcao2= scan.nextInt();
		
		switch (opcao2) {
		case 3: valorR= 300;
		break;
		
		case 2: valorR= 200;
		break;
		
		case 1: valorR = 100;
		break;
		}
		valorfinal= valorP + valorR;
		System.out.println("\nTOTAL: "+valorfinal);
		System.out.println("\nA piscina escolhida foi a "+opcao+" e o revestimento escolhido foi o "+opcao2);
	}
}
