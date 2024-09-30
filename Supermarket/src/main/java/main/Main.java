package main;

import implementation.Supermarket;
import implementation.SupermarketArray;

import java.util.Scanner;

public class Main {

    private static int TAMANHO = 3;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Supermarket supermarket = new SupermarketArray(TAMANHO);

        int opcao;

        do {
            System.out.println("\nLista de Compras");
            System.out.println("1 - Inserir");
            System.out.println("2 - Listar");
            System.out.println("3 - Remover");
            System.out.println("4 - Sair");
            System.out.println("Escolha uma opcao: ");
            opcao = scanner.nextInt(); // armazena um numero inteiro

            switch (opcao) {
                case 1:
                    System.out.println("Digite o item a ser inserido: ");
                    String item = scanner.next(); // armazena somente palavras simples
                    supermarket.adicionar(item);
                    break;
                case 2:
                    supermarket.imprimir();
                    break;
                case 3:
                    System.out.println("Digite a posicao do item a ser removido: ");
                    int indice = scanner.nextInt(); // armazena um número inteiro
                    supermarket.deletar(indice);
                    break;
                case 4:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opcao invalida. Por favor, escolha novamente.");
            }
        } while (opcao != 4);

        scanner.close(); // fecha o scanner de numeros
    }
}
