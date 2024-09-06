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
    }
}