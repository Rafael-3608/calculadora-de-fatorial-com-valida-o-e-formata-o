import java.util.Scanner;

public class CalculadoraFatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um valor inteiro que não seja negativo: ");
        int numero = scanner.nextInt();
        
        while (numero <= 0) {
            System.out.println("O valor não pode ser negativo. Digite novamente: ");
            numero = scanner.nextInt();
            }

        long valorFatorial = 1;

        for (int i = numero; i >= 1; i--) {
            valorFatorial *= i;

            if (i > 1) {
                System.out.print(i + " x ");
            }else{
                System.out.print(i);
            }
        }
        System.out.println("");
        System.out.println("O resultado da multiplicação é: " + valorFatorial);

        scanner.close();
    }
}
