import java.util.Scanner;
public class FornecEnvio {
	Scanner scan= new Scanner(System.in);
	
	void enviofornec() {
		
		System.out.println("Estes s�o os tamanhos e valores dos produtos para envio:\n");
		System.out.println("[1]Piscina padr�o retangular grande [9,98 x 4,06 e 1,40 de profundidade] ");
		System.out.println("[2]Piscina padr�o retangular m�dia [6,97 x 3,42 e 1,40 de profundidade]");
		System.out.println("[3]Piscina padr�o retangular pequena [3,96 x 2,36 e 1,30 de profundidade]");
		
		System.out.println("Informe a op��o de piscina desejada: ");
		int opcao= scan.nextInt();
				System.out.println("Estes s�o os revestimentos disponiveis na loja:\n");
		System.out.println("[1]Azulejo para piscina");
		System.out.println("[2]Pastilha de vidro para piscina");
		System.out.println("[3]Revestimento em cer�mica para piscina");
		
		System.out.println("Informe a op��o de revestimento desejada:");
		int opcao2= scan.nextInt();
		
		
		System.out.println("\nA piscina escolhida para envio foi a "+opcao+" e o revestimento escolhido foi o "+opcao2+". Obrigado pela sua colabra��o!");
		
		}
	}
