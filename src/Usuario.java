
import java.util.Scanner;

public class Usuario {
	Scanner scan = new Scanner (System.in);
	protected static String usuario;
	protected static String senha;
	
	public void alterarUsuario(){
        System.out.println("Por favor, informe o novo nome de usuário:");
        usuario = (scan.nextLine());
         
        System.out.println("Nome de usu�rio alterado com sucesso! Fa�a login novamente para continuar!");
        Menu menu = new Menu();
        menu.printmenu();
        System.out.println();

	}
        
    

    public void alterarSenha(){
        System.out.println("Por favor, informe a sua senha atual:");
        String senhaconf = scan.next();
        
        if (senhaconf.equals(senha)) {
            System.out.println("Por favor, informe a sua nova senha:");
            senha = (scan.next());
            System.out.println();
            System.out.println("Senha alterada com sucesso! Fa�a login novamente para continuar:");
            Menu menu = new Menu();
            menu.printmenu();
            System.out.println();
        }else{
            System.out.println("Senha incorreta!");
            System.out.println();
        }
    }
	
	
	
}


