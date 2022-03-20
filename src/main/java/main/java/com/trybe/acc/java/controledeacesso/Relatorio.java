package main.java.com.trybe.acc.java.controledeacesso;

import java.util.ArrayList;

public class Relatorio {
  /** Método inicial. */
  public void mostrarRelatorio(ArrayList<Short> lista) {
    int menores = 0;
    int adultos = 0;
    int adultosMaiores = 0;

    for (int i = 0; i < lista.size(); i++) {
      if (lista.get(i) < 18) {
        menores++;
      } else if (lista.get(i) < 50) {
        adultos++;
      } else {
        adultosMaiores++;
      }
    }

    double menoresDouble;
    double adultosDouble;
    double adultosMaioresDouble;

    if (menores > 0) {
      menoresDouble = (menores * 100.0 / lista.size());
    } else {
      menoresDouble = 0;
    }

    if (adultos > 0) {
      adultosDouble = (adultos * 100.0 / lista.size());
    } else {
      adultosDouble = 0;
    }

    if (adultosMaiores > 0) {
      adultosMaioresDouble = (adultosMaiores * 100.0 / lista.size());
    } else {
      adultosMaioresDouble = 0;
    }

    System.out.println("\n");

    System.out.println("----- Quantidade -----");
    System.out.println("Menores: " + menores);
    System.out.println("Adultos: " + adultos);
    System.out.println("Adultos maiores: " + adultosMaiores);
    // https://www.baeldung.com/java-printstream-printf
    System.out.println("----- Percentual -----");
    System.out.printf("Menores: %.2f %n", menoresDouble, "%");
    System.out.printf("Adultos: %.2f %n", adultosDouble, "%");
    System.out.printf("Adultos maiores: %.2f %n", adultosMaioresDouble, "%");

    System.out.printf("\nTOTAL: " + lista.size());
  }
}
