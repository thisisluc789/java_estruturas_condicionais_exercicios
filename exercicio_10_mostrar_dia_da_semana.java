import java.util.Scanner;

public class exercicio_10_mostrar_dia_da_semana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("0 - Sunday");
        System.out.println("1 - Monday");
        System.out.println("2 - Tuesday");
        System.out.println("3 - Whenesday");
        System.out.println("4 - Thursday");
        System.out.println("5 - Friday");
        System.out.println("6 - Saturday");
        System.out.println("Digite um valor de 0 a 6: ");
        int op = sc.nextInt();
        switch (op) {
            case 0: System.out.println("Sunday!");
                break;
            case 1: System.out.println("Monday!");
                break;
            case 2: System.out.println("Tuesday!");
                break;
            case 3: System.out.println("Thursday!");
                break;
            case 4: System.out.println("Whenesday!");
                break;
            case 5: System.out.println("Friday!");
                break;
            case 6: System.out.println("Saturday!");
                break;
            default: System.out.println("Valor inválido!");
                break;
        }
    }
}
