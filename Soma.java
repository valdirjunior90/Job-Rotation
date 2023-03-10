public class Soma {
    public static void main(String[] args) {
        int indice = 13;
        int soma = 0;
        int k = 0;

        while (k <= indice) {
            soma = soma + k;
            k = k + 1;
        }

        System.out.println(soma);
    }
}