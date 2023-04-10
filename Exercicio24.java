import java.util.Scanner;
public class Exercicio24 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("digite um numero:");
        if (ler.hasNextInt()){
        int numero = ler.nextInt();
        if (numero>0) {System.out.println("o numero é positivo.");
        }else if (numero < 0) {System.out.println("o numero é negativo.");
        }else {
        System.out.println("o numero é zero.");
        }}else{
            System.out.print("Letra detectada");
        }
    }

}
