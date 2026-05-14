import java.util.Scanner;

public class exercicio_3_reconhecer_multiplos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int num1 = sc.nextInt();

        System.out.println("Digite o segundo valor: ");
        int num2 = sc.nextInt();
        
        if (num1 % num2 == 0 || num2 % num1 == 0) {
            System.out.println("Sim, os numeros sao multiplos.");
        }
        else {
            System.out.println("Nao, os numeros nao sao multiplos.");
        }
        sc.close();
    }
}
