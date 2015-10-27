import model.Cafe;
import model.CafeSoort;
import model.LijstBezochteCafes;

import java.util.Scanner;


/**
 * Dit was mijn static void main om mee te testen
 */


public class StartGUI {

    private long startTime,endTime, totalTime;
    private static LijstBezochteCafes lijstBezochteCafes;

    public static void main(String[] args) {

        new StartGUI();
    }

    public StartGUI(){
        setup();
    }

    private void setup(){

        startTime =System.nanoTime();
        Scanner input = new Scanner(System.in);
        String antw = "";
        int keuze = 0;
        lijstBezochteCafes = new LijstBezochteCafes();



        System.out.println("Wat wil je doen? \n1) Toevoegen Cafe\n2) Start bezoek cafe\n3) Statistieken");
        keuze = Integer.parseInt(input.nextLine());

        switch (keuze){
            case 1: ToevoegenCafes();
                break;

        }

        lijstBezochteCafes.getCafes();

        totalTime = System.nanoTime() - startTime;
        double seconds = (double)totalTime / 1000000000;
        System.out.println("De verstreken tijd is: " + totalTime);
    }



    private static void ToevoegenCafes(){
        Cafe cafe;
        String cafeNaam,cafeAdres;
        int keuzeCafeSoort;
        CafeSoort cafeSoort;
        Scanner in = new Scanner(System.in);
        String antw;

        System.out.println("Toevoegen Cafe's");
        do {
            System.out.println("Cafe naam: ");
            cafeNaam = in.nextLine();
            System.out.println("Adres: ");
            cafeAdres = in.nextLine();
            System.out.println("Soort Cafe:\n1)BruineKroeg\n2)StudentenClub\n3)Club");
            keuzeCafeSoort =Integer.parseInt(in.nextLine());

            //get cafe soort enum en dan deze in constructor mee plaaten

            cafe = new Cafe(cafeNaam,cafeAdres);
            lijstBezochteCafes.addCafe(cafe);

            System.out.println("Wilt u nog een cafe toevoegen? Ja - Nee" );
            antw = in.nextLine();
        }while (antw.toLowerCase().equals("ja"));





    }



}
