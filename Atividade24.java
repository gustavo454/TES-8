import java.util.Scanner;
public class Atividade24 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a quantidade de vezes a repetir: ");
         int N = ler.nextInt();
        int i,numero;
        for (i=1;i<N+1;i++) {
            System.out.print("Informe um numero:");
            if (ler.hasNextInt()) {
                numero = ler.nextInt();
                if (numero > 0) {
                    System.out.println("o numero é positivo.");
                } else if (numero < 0) {
                    System.out.println("o numero é negativo.");
                } else {
                    System.out.println("o numero é zero.");
                }
            } else {
                System.out.println("Letra detectada");
            }
        }
    }

}

