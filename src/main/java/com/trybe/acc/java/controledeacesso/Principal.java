package com.trybe.acc.java.controledeacesso;

import java.util.ArrayList;
import java.util.Scanner;
import main.java.com.trybe.acc.java.controledeacesso.Relatorio;

public class Principal {

  /** Método principal. */
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    try {

      int opcao = 1;
      ArrayList<Short> lista = new ArrayList<Short>();

      while (opcao == 1) {

        System.out.println("\n");
        System.out.println("Entre com uma opção válida");
        System.out.println("1 - Acessar o estabelecimento");
        System.out.println("2 - Finalizar sistema e mostrar relatório \n");

        opcao = scan.nextInt();
        System.out.println("\n");

        if (opcao == 1) {
          System.out.println("Entre com a idade:");
          short idade = scan.nextShort();
          lista.add(idade);

          System.out.println("\n");

          if (idade < 18) {
            System.out.println("Pessoa cliente menor de idade, catraca liberada!");
          } else if (idade < 50) {
            System.out.println("Pessoa adulta, catraca liberada!");
          } else if (idade >= 50) {
            System.out.println("Pessoa adulta maior de 50, catraca liberada!");
          }
        } else if (opcao == 2) {
          scan.close();
          Relatorio relatorio = new Relatorio();
          relatorio.mostrarRelatorio(lista);
        } else if (opcao != 1 && opcao != 2) {
          System.out.println("Opção inválida!");
        }
      }

    } catch (Exception e) {
      System.out.println("\n");
      System.out.println("Erro: " + e.getMessage());
    }
  }
}
