import java.util.HashSet;
import java.util.Random;

public class VerificadorFibonacci {
    public static void main(String[] args) {
        // Gerar um número aleatório entre 0 e 100
        Random random = new Random();
        int numeroAleatorio = random.nextInt(101);
        System.out.println("Número gerado: " + numeroAleatorio);

        // Calcular a sequência de Fibonacci até o número gerado
        HashSet<Integer> conjuntoFibonacci = new HashSet<>();
        calcularFibonacci(numeroAleatorio, conjuntoFibonacci);

        if (conjuntoFibonacci.contains(numeroAleatorio)) {
            System.out.println(numeroAleatorio + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numeroAleatorio + " não pertence à sequência de Fibonacci.");
        }
    }

    private static void calcularFibonacci(int numeroMaximo, HashSet<Integer> conjuntoFibonacci) {
        int a = 0, b = 1;

        while (a <= numeroMaximo) {
            conjuntoFibonacci.add(a);
            int proximo = a + b;
            a = b;
            b = proximo;
        }
    }
}
