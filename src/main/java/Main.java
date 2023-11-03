import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        FileHandler fh = new FileHandler();
        fh.parseData();


        System.out.println("Tast 1 for sortering efter de forskeliige regioner");
        System.out.println("Tast 2 for sortereing efter de forskellige aldersgrupper");
        System.out.println("Tast 3 for at sortere efter region primært og aldersgruppe sekundært ");
        System.out.println("Tast 4 for at sortere efter aldersgruppe primært og region sekundært");

        Scanner sc = new Scanner(System.in);
        int brugerinterface = 0;
        brugerinterface = sc.nextInt();
        sc.nextLine();
        switch (brugerinterface) {

            case 1: {
               fh.compareToregion();
               fh.printCovidData();
                break;
            }
            case 2:{
              fh.compareToAge();
              fh.printCovidData();
                break;
            }
            case 3: {
                fh.compareForAlderRegion();
                fh.printCovidData();
            }
            case 4:{
                fh.compareForregionAlder();
                fh.printCovidData();
            }
        }

    }
    }

