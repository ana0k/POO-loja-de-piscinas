import java.util.Scanner;

public class Login extends Usuario {

    Scanner scan = new Scanner(System.in);
    
    void login (){
        System.out.println("usu�rio: ");
        String logusuario = scan.next();
         
        System.out.println("Senha: ");
        String logsenha = scan.next();
    
        if (logusuario.equals(usuario) && logsenha.equals(senha)){
                System.out.println("\n[login confirmado]\n");
                Menu menu = new Menu();
                menu.MenuCliente();
        }else{
            System.out.println("\n[login nao confirmado, fa�a seu cadastro antes de continuar!]\n\n");
        }
    Menu menu = new Menu();
    menu.printmenu();         
    }
}