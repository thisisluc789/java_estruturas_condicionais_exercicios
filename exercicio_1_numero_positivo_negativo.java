import java.util.Scanner;

public class exercicio_1_numero_positivo_negativo 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        double num = sc.nextDouble();
        if (num==0)
        {
            System.out.println("O número é zero.");
        } 
        else if(num > 0)
        {
            System.out.println("O número é positivo.");
        } 
        else if(num < 0)
        {
            System.out.println("O número é negativo.");
        } 
        sc.close();
    }
}