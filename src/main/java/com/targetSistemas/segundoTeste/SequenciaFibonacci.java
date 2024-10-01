package com.targetSistemas.segundoTeste;
import java.util.Scanner;

public class SequenciaFibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int numero = scan.nextInt();

        if(isFibonacci(numero)) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        }else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }
    }

    private static boolean isFibonacci(int numero) {
        if(numero < 0){
            return false;
        }
        int primeiro = 0, segundo = 1, proximo = 0;

        while (proximo < numero){
            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
        }
        return proximo == numero;
    }
}
