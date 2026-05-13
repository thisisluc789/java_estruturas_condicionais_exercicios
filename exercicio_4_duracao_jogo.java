import java.util.Scanner;

public class exercicio_4_duracao_jogo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a hora de inicio do jogo (0-23): ");
        int horaInicio = sc.nextInt();
        System.out.println("Digite a hora de termino do jogo (0-23): ");
        int horaTermino = sc.nextInt();
        int duracao = 24;
        if (horaInicio > horaTermino) {
            duracao = (24 - horaInicio) + horaTermino;
        } 
        else {
            duracao = horaTermino - horaInicio;
        }
        
        System.out.println("O jogo durou " + duracao + " hora(s).");
    }
}
