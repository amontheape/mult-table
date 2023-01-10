import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um numero para obter sua tabela de multiplicacao: ");
        int number = sc.nextInt();

        System.out.println("Tabela de multiplicacao de " + number);
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + number * i);
        }
    }
}
