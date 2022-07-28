package br.com.dio.calculadora;

import java.util.Scanner;
import java.util.function.UnaryOperator;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*int a, b;
        System.out.println("Digite o primeiro valor: ");
        a = scan.nextInt();
        System.out.println("Digite o segundo valor: ");
        b = scan.nextInt();
        int somar = somar(a, b);
        int subtrair = subtrair(a, b);
        int multiplicar = multiplicar(a, b);
        int dividir = dividir(a, b);

        System.out.println("Somar: " + somar);
        System.out.println("Subtrair: " + subtrair);
        System.out.println("Multiplicar: " + multiplicar);
        System.out.println("Dividir: " + dividir);*/

        int valor = 20;
        UnaryOperator<Integer> retornaDobro = n -> (n * 2);
        Integer dobro = retornaDobro.apply(valor);
        System.out.printf("O dobro de %d é exatamente %d\n", valor, dobro);


        UnaryOperator<String> retornaUppercase = s -> s.toUpperCase();
        System.out.println("Digite um nome: ");
        String nome;
        nome = scan.nextLine();
        String nomeUpperCase = retornaUppercase.apply(nome);
        System.out.println("Nome digitado: " + nomeUpperCase);

    }

    public static int somar(int a, int b){
        return a + b;
    }

    public static int subtrair(int a, int b){
        return a - b;
    }

    public static int multiplicar(int a, int b){
        return a * b;
    }

    public static int dividir(int a, int b){
        return a / b;
    }

}
