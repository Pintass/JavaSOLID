package client;

import pattern.patternDecorateur.Foils;
import pattern.patternDecorateur.Velo;
import pattern.patternStrategie.Alizes;
import pattern.voilier.Monocoque;
import pattern.voilier.Multicoque;
import pattern.patternStrategie.Orthodromie;
import pattern.voilier.Voilier;

public class ClientVoiliers {
    public static void main(String[] args) {
        Voilier mono = new Monocoque("Mono71", new Orthodromie());
        Multicoque multi77 = new Multicoque("Multi77", new Orthodromie());

        Monocoque mono78 = new Monocoque("Mono78", new Alizes());
        Multicoque multi9 = new Multicoque("Multi9", new Alizes());

        System.out.println("Mono");
        mono.appliquerSuivreRoute();
        System.out.println("multi77");
        multi77.appliquerSuivreRoute();
        System.out.println("multi9");
        multi9.appliquerSuivreRoute();
        System.out.println("mono78");
        mono78.appliquerSuivreRoute();

        System.out.println("Changement de stratégie pour multi77");
        multi77.setSuivreRoute(new Alizes());

        System.out.println("Mono");
        mono.appliquerSuivreRoute();
        System.out.println("multi77");
        multi77.appliquerSuivreRoute();
        System.out.println("multi9");
        multi9.appliquerSuivreRoute();
        System.out.println("mono78");
        mono78.appliquerSuivreRoute();

        System.out.println("tests d'armements");

        mono = new Foils(mono);
        mono = new Velo(mono);
        mono = new Foils(mono);
        System.out.println(mono.toString());
        mono.appliquerSuivreRoute();


    }
}
