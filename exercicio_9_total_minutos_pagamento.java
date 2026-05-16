import java.util.Locale;
import java.util.Scanner;

public class exercicio_9_total_minutos_pagamento {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os minutos consumidos: ");
        int minutos = sc.nextInt();

        double conta = 50.00;

        if(minutos > 100){
            conta = conta + (minutos - 100) * 2.00;
        }

        System.out.printf("Valor da conta = R$ %.2f%n", conta);

        sc.close();
    }
}
