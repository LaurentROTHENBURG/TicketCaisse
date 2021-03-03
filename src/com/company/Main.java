package com.company;

import java.util.FormattableFlags;
import java.util.Scanner;

public class Main {

    // write your code here
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Initialisation de la variable permettant de savoir si autres plats
        char reponse = 'O';

        //declare la variable total pour sommer les totaux de chacun des plats
        float total = 0;

        //declare la variable plat pour affichage dans le ticket
        String listePlat = "";

        // Début de la boucle tant que
        while (reponse == 'O') {

            // On affiche un message pour demander la saisie du plat
            System.out.println("Entrez le plat : ");

            // On récupère le plat de la console
            String plat = sc.nextLine();

            // On affiche un message pour demander la saisie de la description
            System.out.println("Entrez la description : ");

            // On récupère la description de la console
            String description = sc.nextLine();

            // On affiche un message pour demander la quantité
            System.out.println("Entrez la quantite : ");

            // On récupère la quantité de la console
            float quantite = sc.nextFloat();
            sc.nextLine();

            // On affiche un message pour demander le prix du plat
            System.out.println("Entrez la prix : ");

            // On récupère la quantité de la console
            float prix = sc.nextFloat();
            sc.nextLine();

            // on calcul le prix total pour les plats
            total = (quantite * prix) + total;

            // on stocke la liste des plats dans une variable
            listePlat = listePlat +"\n" + plat + " : " + (quantite * prix) +" "+ "Eur " + "(" + description + ")" ;


            //On demande si la personne veut saisir un autre plat
            System.out.println("Voulez-vous saisir autres plats ? (O/N)");

            //On récupère la réponse de l'utilisateur
            reponse = sc.nextLine().charAt(0);

            // on affiche  le sous toal et le prix total
            if (reponse == 'O')
            {System.out.println("******* Sous total de l'addition est = " + total);
            }
            else
                {
                    System.out.println( "+-----------------------------------------+---------------+" );
                    System.out.println( "| Plats                                   | Total         |" );
                    System.out.println( "+-----------------------------------------+---------------+" );
                    System.out.printf(  "%10s\n", listePlat);
                    System.out.printf(  "%50.2f\n", total);

                    //System.out.println("** Le montant total de l'addition est = " + total + "Eur" + " ***" + listePlat );
                    System.out.println( "+----------------------------------------------------------" );
                }


    }
}
}