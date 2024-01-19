package com.trybe.java.regraprogressao;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

/**
 * 'App' - Projeto - Regra de Progressão.
 */
public class App {

  /**
   * Metodo main.
   */
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite a quantidade de atividades para cadastrar: ");
    int qtdAtv = Integer.parseInt(scanner.nextLine());

    double[] pesos = new double[qtdAtv];
    double[] pesosNotas = new double[qtdAtv];

    for (int i = 0; i < qtdAtv; i++) {
      System.out.println("Digite o nome da atividade " + (i + 1) + ": ");
      String nomeAtv = scanner.nextLine();
      System.out.println("Digite o peso da atividade " + (i + 1) + ": ");
      double pesoAtv = Double.parseDouble(scanner.nextLine());
      pesos[i] = pesoAtv;
      System.out.println("Digite a nota obtida para " + nomeAtv + ": ");
      double notaAtv = Double.parseDouble(scanner.nextLine());
      // notas[i] = notaAtv;
      pesosNotas[i] = pesoAtv * notaAtv;
    }

    double somaPesos = Arrays.stream(pesos).sum();
    double somaPonderada = Arrays.stream(pesosNotas).sum();
    double notaFinal = somaPonderada / somaPesos;
    if (somaPesos != 100.0) {
      System.out.println("A soma dos pesos é diferente de 100!");
    } else {
      if (notaFinal >= 85.0) {
        System.out.println("Parabéns! Você alcançou %.1f".formatted(notaFinal)
            + "%! E temos o prazer de informar que você obteve aprovação!");
      } else {
        System.out.printf("Lamentamos informar que, com base na sua "
            + "pontuação alcançada neste período, %.1f%%"
            + ", você não atingiu a pontuação mínima necessária para sua aprovação.", notaFinal);
      }
    }
    scanner.close();
  }
}