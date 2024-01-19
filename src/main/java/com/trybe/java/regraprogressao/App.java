package com.trybe.java.regraprogressao;

import java.text.DecimalFormat;
import java.util.Arrays;
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
    int[] pesosNotas = new int[qtdAtv];

    for (int i = 0; i < qtdAtv; i++) {
      System.out.println("Digite o nome da atividade " + (i + 1) + ": ");
      String nomeAtv = scanner.nextLine();
      System.out.println("Digite o peso da atividade " + (i + 1) + ": ");
      int pesoAtv = Integer.parseInt(scanner.nextLine());
      pesos[i] = pesoAtv;
      System.out.println("Digite a nota obtida para " + nomeAtv + ": ");
      int notaAtv = Integer.parseInt(scanner.nextLine());
      pesosNotas[i] = pesoAtv * notaAtv;
    }

    double soma = Arrays.stream(pesos).sum();
    int somaNotas = Arrays.stream(pesosNotas).sum();
    double notaFinal = somaNotas / soma;
    DecimalFormat decimalFormat = new DecimalFormat("#.0#");
    if (soma != 100.0) {
      System.out.println("A soma dos pesos é diferente de 100!");
    } else {
      if (notaFinal >= 85) {
        System.out.println("Parabéns! Você alcançou " +
            decimalFormat.format(notaFinal) + "%! E temos o prazer de informar que você obteve aprovação!");
      } else {
        System.out.println("Lamentamos informar que, com base na sua pontuação alcançada neste período, " +
            decimalFormat.format(notaFinal) + "%, você não atingiu a pontuação mínima necessária para sua aprovação.");
      }
    }
    scanner.close();
  }
}