package loops;

import java.util.Scanner;

public class Ex4_ParEImpar {

/*
Faça um programa que peça N números inteiros, calcule e mostre
a quantidade de números pares e a quantidade de números impares.
 */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantidadeNumeros;
        int numero;
        int quantidadePares = 0, quantidadeImpares = 0;


        System.out.println("Quantidade de números: ");
        quantidadeNumeros = scan.nextInt();

        int count = 0;
        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) quantidadePares++;
            else quantidadeImpares++;

            count++;

        } while (count < quantidadeNumeros);

        System.out.println("A quantidade de números Pares é " + quantidadePares);
        System.out.println("A quantidade de números Ímpares é " + quantidadeImpares);
    }
}
