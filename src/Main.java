import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scannerinput = new Scanner(System.in);
        System.out.println("______CALCULADORA__IMC______");

        System.out.println("Para começarmos, digite seu peso! : ");
        Double peso = scannerinput.nextDouble();

        System.out.println("Agora digite a sua altura! : ");
        Double altura = scannerinput.nextDouble();

        double imc = Imc.calcular(peso, altura);
        System.out.printf("Seu imc é : %.1f", imc + " ");

        String classificacao = ResultComparator.comparator(imc);
        System.out.println(classificacao);

    }
}