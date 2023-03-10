import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        // Obtém o número informado pelo usuário
        Scanner input = new Scanner(System.in);
        System.out.print("Informe um número inteiro positivo: ");
        int num = input.nextInt();

        // Calcula a sequência de Fibonacci até o número informado
        int a = 0;
        int b = 1;
        int fib = 0;
        while (fib < num) {
            fib = a + b;
            a = b;
            b = fib;
        }

        // Verifica se o número informado pertence à sequência de Fibonacci
        if (fib == num) {
            System.out.println(num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(num + " não pertence à sequência de Fibonacci.");
        }
        input.close();
    }
}
