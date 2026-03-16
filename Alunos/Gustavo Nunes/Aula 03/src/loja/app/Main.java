package loja.app;

import loja.model.Venda;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Venda> vendas = new ArrayList<>();

    public static void main(String[] args) {
        mostraMenu();
    }

    // mostra menu e direciona para opção escolhida
    private static void mostraMenu() {

         System.out.printf("\n\n[1] - Calcular Preço Total\n" +
                "[2] - Calcular Troco    \n" +
                "[3] - Sair \n" +
                "Entre com opção :");

        int op = scanner.nextInt();

        switch (op){

            case 1:
                calculaPreco();
                mostraMenu();
                break;

            case 2:
                calculaTroco();
                mostraMenu();
                break;

            case 3:
                System.out.println("\nENCERRANDO...");
                break;

            default:
                mostraMenu();
                break;

        }
    }

    // Calculo do Preço
    private static void calculaPreco() {

        System.out.println("\nQuntidade: ");
        int quant = scanner.nextInt();
        System.out.println("\nValor unitário: ");
        double valUni = scanner.nextDouble();

        double preco = quant * valUni;

        System.out.printf("\nPreço = R$%.2f",preco);

    }

}