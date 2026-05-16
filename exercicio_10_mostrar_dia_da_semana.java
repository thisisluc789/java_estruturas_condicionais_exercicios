import java.util.Scanner;

public class exercicio_10_mostrar_dia_da_semana {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1 - Sunday");
        System.out.println("2 - Monday");
        System.out.println("3 - Tuesday");
        System.out.println("4 - Whenesday");
        System.out.println("5 - Thursday");
        System.out.println("6 - Friday");
        System.out.println("7 - Saturday");

        System.out.println("Digite um valor de 1 a 7: ");
        int op = sc.nextInt();
        
        switch (op) {
            case 1: System.out.println("Sunday!");
                break;
            case 2: System.out.println("Monday!");
                break;
            case 3: System.out.println("Tuesday!");
                break;
            case 4: System.out.println("Wednesday!");
                break;
            case 5: System.out.println("Thursday!");
                break;
            case 6: System.out.println("Friday!");
                break;
            case 7: System.out.println("Saturday!");
                break;
            default: System.out.println("Valor inválido!");
                break;
        }
    }
}
