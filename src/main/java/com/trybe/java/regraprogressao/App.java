package com.trybe.java.regraprogressao;

import java.util.Scanner;

/**
 * 'App' - Projeto - Regra de Progressão.
 */
public class App {

  /**
   * Metodo main.
   */
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite a quantidade de atividades para cadastrar: ");
    int qtdAtv = Integer.parseInt(scanner.nextLine());

    int[] pesos = new int[qtdAtv];

    for (int i = 0; i < qtdAtv; i++) {
      System.out.println("Digite o nome da atividade " + (i + 1) + ": ");
      String nomeAtv = scanner.nextLine();
      System.out.println("Digite o peso da atividade " + (i + 1) + ": ");
      int pesoAtv = Integer.parseInt(scanner.nextLine());
      pesos[i] = pesoAtv;
      System.out.println("Digite a nota obtida para " + nomeAtv + ": ");
      int notaAtv = Integer.parseInt(scanner.nextLine());
    }

    int soma = 0;
    for (int valor : pesos) {
      soma += valor;
    }

    if (soma != 100) {
      System.out.println("A soma dos pesos é diferente de 100!");
    }

    scanner.close();

  }
}