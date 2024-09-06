import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        System.out.println("siemano!");

        int wylosowanaLiczba = (int) (Math.random()*100+1);
        //rzutowanie
        /*
        typy proste (pisane zawsze małą literą) przchowują tylko wartość
        logiczne boolean
        całkowite byte short int long
        rzeczywiste float double
        znakowy char

        typy złożone obiekty wlasnosci i metody
        String Integer Kosc
         */
        System.out.println(wylosowanaLiczba);


        //wczytywanie z klawy
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int wpisanaLiczba = klawiatura.nextInt();

        //instrukcja warunkowa
        if (wpisanaLiczba == wylosowanaLiczba){
            System.out.println("Zgadłeś!");
        }
        else{
            System.out.println("Sory, nie zgadłeś");
        }
        //określić jak duża różnica pomiędzy wpisaną i wylosowaną
        //wyrażenie warunkowe zwraca wartość
        int roznica = wpisanaLiczba > wylosowanaLiczba ? wpisanaLiczba - wylosowanaLiczba : wylosowanaLiczba - wpisanaLiczba;
        System.out.println("Pomyłka o "+roznica);
        System.out.println("Wylosowana liczba: "+wylosowanaLiczba);

        //dzielenie całkowite
        roznica = roznica/10;
        switch  (roznica){
            case 0:
                System.out.println("Bardzo blisko");
                break;
            case 1:
                System.out.println("Blisko");
                break;
            case 2:
                System.out.println("Dość blisko");
                break;
            default:
                System.out.println("Słabo");
                break;
        }
        //wyrażenie switch
        System.out.println(switch (roznica){
            case 0->"Bardzo dobrze";
            case 1->"Dobrze";
            case 2->"Dość dobrze";
            default -> "Słabo";
        });
        //zgadywanie 10 razy
        for (int i = 0; i < 10; i++) {
            System.out.println("Podaj liczbę");
            wpisanaLiczba = klawiatura.nextInt();
            if (wpisanaLiczba == wylosowanaLiczba){
                System.out.println("Wygrałeś nowego Iphone 16S+");
                break;
            }
        }
        //tak długo aż sie uda
        System.out.println("Podaj liczbę");
        wpisanaLiczba = klawiatura.nextInt();
        while (wpisanaLiczba != wylosowanaLiczba){
            if (wpisanaLiczba > wylosowanaLiczba) {
                System.out.println("wpisano za duzo");
            }
            else {
                System.out.println("wpisano za malo");
            }
            System.out.println("Podaj liczbe");
            wpisanaLiczba = klawiatura.nextInt();
        }
        do{
            System.out.println("Podaj liczbe");
            wpisanaLiczba = klawiatura.nextInt();
            if(wpisanaLiczba>wylosowanaLiczba){
                System.out.println("za duza");
            }
            else if(wpisanaLiczba<wylosowanaLiczba){
                System.out.println("za mala");
        }   }
        while (wpisanaLiczba != wylosowanaLiczba);
        System.out.println("wygrana");

        //pierwsze zadanie domowe zadanie8
        //wygeneruj haslo losowe. Długość hasła powinna wynosić 20 znaków, a ponadto powinno zawierać liczby, wielkie i małe litery oraz znaki specjalne.
        String haslo ="";
        String maleLitery = "qwertyuiopasdfghjklzxcvbnm";
        String duzeLitery = "QWERTYUIOPASDFGHJKLZXCVBNM";
        String znakiSpecjalne = "!@#$%^&*()_-+=<>?,./`~[{]}|";
        String cyfry = "1234567890";
        int losowa;
        for (int i = 0; i < 5; i++) {
            losowa = (int) (Math.random()*maleLitery.length());
            haslo = haslo + maleLitery.charAt(losowa);
            losowa = (int) (Math.random()*duzeLitery.length());
            haslo = haslo + duzeLitery.charAt(losowa);
            losowa = (int) (Math.random()*znakiSpecjalne.length());
            haslo = haslo + znakiSpecjalne.charAt(losowa);
            losowa = (int) (Math.random()*cyfry.length());
            haslo = haslo + cyfry.charAt(losowa);
        }
        System.out.println("Wygenerowane haslo: "+haslo);
   }
}