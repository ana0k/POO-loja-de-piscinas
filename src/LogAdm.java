

import java.util.Scanner;


public class LogAdm {
	Scanner scan= new Scanner(System.in);
	
	
	void admlog() {
		System.out.println("--Fazer login como Administrador--");
		System.out.println("Seu usuário: ");
		String adm= scan.next();
	
		System.out.println("Sua senha: ");
		int senhadm= scan.nextInt();
		
		if(adm.equals ("administrador") && senhadm == 1234) {
			System.out.println("--Administrador logado!--");
		Menu menu=new Menu();
		menu.MenuAdm();
		}else {
			
			System.out.println("--Login incompativel como administrador--");
			Menu menu= new Menu();
			menu.printmenu();
		}
	}
}
