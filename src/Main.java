import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("informe quantos carros são:");
        int carros = sc.nextInt();


        double soma = 0;


        if (carros <= 0) {
            System.out.println("Insira um número maior que zero");
        } else {
            for (int i = 1; i <= carros; i++) {
                System.out.println("Digite a avaliação do " + i + " carro");
                double nota = sc.nextDouble();
                if (nota >=11) {
                    System.out.println("Insira um número valido");
                }
                soma += nota;
            }
            double media = soma / carros;
            System.out.println("A média dos números é: " +media);
            if (media >= 6) {
                System.out.println("Carros são bons");
            } else {
                    System.out.println("Carros são ruins");

            }
        }
    }
}