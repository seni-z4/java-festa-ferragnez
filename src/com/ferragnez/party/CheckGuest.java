package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {

  // creare il main per seguire il codice
  public static void main(String[] args) throws Exception {

    // creare l'array con i nomi dei invitati
    String[] lista = { "Dua Lipa", "Paris Hilton", " Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi",
        " Bebe Vio", "Luis", "Pardis Zarei",
        "Martina Maccherone", "Rachel Zeilic" };

    // chedere al utente come si chiama
    Scanner input = new Scanner(System.in);

    System.out.println("inserirci il tuo nome: ");

    String nomeDelInvitato = input.nextLine();

  }
}
