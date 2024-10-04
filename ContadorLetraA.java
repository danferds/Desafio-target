import java.util.Scanner;

public class ContadorLetraA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o nome do seu filme favorito: ");
        String inputString = scanner.nextLine();

        int contador = contarLetraA(inputString);

        System.out.println("A letra 'a' aparece " + contador + " vez(es) no nome do filme.");
    }

    private static int contarLetraA(String str) {
        int contador = 0;

        // Converter a string para minúsculas para facilitar a comparação
        String strMinuscula = str.toLowerCase();

        // Transfoema a string em uma array de char e verifica quantas vezes a letra 'a' aparece. 
        for (char c : strMinuscula.toCharArray()) { 
            if (c == 'a') {
                contador++;
            }
        }
        
        return contador;
    }
}