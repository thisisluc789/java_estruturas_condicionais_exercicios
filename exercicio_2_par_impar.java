import java.util.Scanner;

public class exercicio_2_par_impar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        int num = sc.nextInt();
        
        if (num % 2 == 0)
        {
            System.out.println("O numero eh par.");
        } 
        else
        {
            System.out.println("O numero eh impar.");
        }
    }
}
