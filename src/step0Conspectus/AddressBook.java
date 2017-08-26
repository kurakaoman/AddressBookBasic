package step0Conspectus;

import java.util.InputMismatchException;
import java.util.Scanner;


/**
 * Created by Szpak on 25.08.2017.
 */
public class AddressBook {

    public AddressBook(){
    }

    public void run() {
        Scanner czytnik = new Scanner(System.in);
        ContactList contactList = new ContactList();

        System.out.println("Witajw multimedialnej książce adresowej Marcin Szpaka Addres book" +
        "wydaj dyspozyje:" +
        System.lineSeparator() + "1) wyświetl listę kontaktów" +
        System.lineSeparator() + "2) wyświetl kontakt" +
        System.lineSeparator() + "3) dodaj kontakt" +
        System.lineSeparator() + "4) usuń kontakt" +
        System.lineSeparator() + "5) edytuj kontakt");

        String scan = czytnik.nextLine();
        try {
            if(!scan.equals("1") && !scan.equals("2") && !scan.equals("3") && !scan.equals("4") && !scan.equals("5")) {
                System.out.println("nie prawidłowy numer akcji!" +
                System.lineSeparator() + "sprubój jeszcze raz");
            }
            if(scan.equals("1")){
                System.out.println("Tu masz zawołać metodę która wyświetli listę w odpowiedni sposób");
            }
            if(scan.equals("2")) {
                System.out.println("Tu masz zawołać metodę która wyświetli wybrany kontakt ");
            }
            if(scan.equals("3")) {
                System.out.println("Tu masz zawołać metodę która dopisze nowy kontakt do listy i wyświetli Urzytkownik XXX został dopisany do listy ");
            }
            if(scan.equals("4")) {
                System.out.println("Tu masz zawołać metodę która usunie wybrany kontakt z listy i wyświetli Urzytkownik XXX został Usunięty ");
            }
            if(scan.equals("5")) {
                System.out.println("Tu masz zawołać metodę która edytuje wybrany kontakt i wyświetli Urzytkownik XXX został zmodyfikowany ");
            }
        } catch(InputMismatchException ime) {
            System.out.println("Wprowadziłeś niepoprawną wartość. należy wprowadzić cyfrę od 1 do... odpowiadającą wybranej akcji" +
            System.lineSeparator() + "sprubój ponownie");
        }
    }
}
