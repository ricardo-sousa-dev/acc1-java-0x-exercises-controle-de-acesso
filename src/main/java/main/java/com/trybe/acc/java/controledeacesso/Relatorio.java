package main.java.com.trybe.acc.java.controledeacesso;

import java.math.BigDecimal;
import java.math.RoundingMode;
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
      } else if (lista.get(i) >= 50) {
        adultosMaiores++;
      }
    }

    // float menoresFloat = (menores * 100 / lista.size());
    // float adultosFloat = (adultos * 100 / lista.size());
    // float adultosMaioresFloat = (adultosMaiores * 100 / lista.size());

    BigDecimal menoresFloat =
        new BigDecimal((menores * 100) / lista.size()).setScale(2, RoundingMode.HALF_UP);
    BigDecimal adultosFloat =
        new BigDecimal((adultos * 100) / lista.size()).setScale(2, RoundingMode.HALF_UP);
    BigDecimal adultosMaioresFloat =
        new BigDecimal((adultosMaiores * 100) / lista.size()).setScale(2, RoundingMode.HALF_UP);

    System.out.println("\n");

    System.out.println("----- Quantidade -----");
    System.out.println("Menores: " + menores);
    System.out.println("Adultos: " + adultos);
    System.out.println("Adultos maiores: " + adultosMaiores);

    System.out.println("----- Percentual -----");
    System.out.println("Menores: " + menoresFloat + " %");
    System.out.println("Adultos: " + adultosFloat + " %");
    System.out.println("Adultos maiores: " + adultosMaioresFloat + " %");

    System.out.println("\nTOTAL: " + lista.size());
  }
}
