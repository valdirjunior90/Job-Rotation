import java.util.Scanner;

public class InverteString {
    public static void main(String[] args) {

        // Lê uma string do usuário
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String str = scanner.nextLine();
        
        // Converte a string para um array de caracteres
        char[] caracteres = str.toCharArray();
        
        // Inverte os caracteres do array
        for (int i = 0; i < caracteres.length / 2; i++) {
            char temp = caracteres[i];
            caracteres[i] = caracteres[caracteres.length - i - 1];
            caracteres[caracteres.length - i - 1] = temp;
        }
        
        // Cria uma nova string com os caracteres invertidos
        String strInvertida = new String(caracteres);
        
        // Imprime a string invertida
        System.out.println("A string invertida é: " + strInvertida);
        scanner.close();
    }
}
