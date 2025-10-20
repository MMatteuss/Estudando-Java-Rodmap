import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        // Usando Input em Java
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o seu segundo Nome:");
        String segundoNome = scanner.nextLine();
        System.out.println("Seu segundo nome e: "+segundoNome);
        scanner.close();
        System.out.println("Saido do SCANNER");
        // ----------------------------
	}
}