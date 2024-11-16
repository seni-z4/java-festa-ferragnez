package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {

  // creare il main per seguire il codice
  public static void main(String[] args) throws Exception {

    // creare l'array con i nomi dei invitati
    String[] lista = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi",
        "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic" };

    // chedere al utente come si chiama
    Scanner input = new Scanner(System.in);

    System.out.println("inserirci il tuo nome: ");

    String nomeDelInvitato = input.nextLine();

    // verifica se il nome e presente nella lista

    // new for loop with a if condition==============>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

    boolean guard = true;

    for (int i = 0; i < lista.length; i++) {

      if (lista[i].equals(nomeDelInvitato)) {
        guard = true;
        break;
      } else {
        guard = false;
      }
    }

    if (guard == true) {
      System.out.println("sei stati invitato");
    } else {
      System.out.println("non sei stato invitato");
    }

    // for loop
    // ====================================================>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

    // for (int i = 0; i < lista.length; i++) {

    // boolean guard = true;
    // // System.out.println(lista[i]);
    // if (lista[i].equals(nomeDelInvitato)) {
    // System.out.println("sei stato invitato");
    // break;
    // } else {
    // System.out.println("non sei stato invitato, mi dispiace");
    // continue;
    // }
    // }

    // while loop
    // ====================================================>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

    // while (nomeDelInvitato.equals(lista)) {
    // System.out.println("sei stato invitato");
    // }
  }
}
