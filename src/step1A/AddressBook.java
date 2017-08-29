package step1A;

import step1A.ContactList;

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

        start(czytnik,contactList);
    }
    public void start(Scanner czytnik, ContactList contactList){
        System.out.println("Witaj w multimedialnej książce adresowej Marcina Szpaka Addres book" +
        "wydaj dyspozyje:" +
        System.lineSeparator() + "1) wyświetl listę kontaktów" +
        System.lineSeparator() + "2) wyświetl kontakt" +
        System.lineSeparator() + "3) dodaj kontakt" +
        System.lineSeparator() + "4) usuń kontakt" +
        System.lineSeparator() + "5) edytuj kontakt" +
        System.lineSeparator() + "6) Wyjdź");


        String scan = czytnik.nextLine();
        try {
            if(!scan.equals("1") && !scan.equals("2") && !scan.equals("3") && !scan.equals("4") && !scan.equals("5") && !scan.equals("6")) {
                System.out.println("nie prawidłowy numer akcji!" +
                System.lineSeparator() + "sprubój jeszcze raz");
                start(czytnik,contactList);
            }
            if(scan.equals("1")){
                contactList.showContactList();
                start(czytnik,contactList);
            }
            if(scan.equals("2")) {
                System.out.println("Podaj pozycję którą według listy zajmuje żądany przez Ciebie kontakt:" + System.lineSeparator());
                Integer poz = czytnik.nextInt();
                String buffor = czytnik.nextLine();
                System.out.println("Podaj Imię kontaktu:" + System.lineSeparator());
                String name = czytnik.nextLine();
                System.out.println("Podaj Nazwisko kontaktu:" + System.lineSeparator());
                String surname = czytnik.nextLine();
                contactList.showContact(poz, name, surname);
                start(czytnik,contactList);

                //System.out.println("Tu masz zawołać metodę która wyświetli wybrany kontakt ");
            }
            if(scan.equals("3")) {
                System.out.println("Podaj Imię kontaktu:" + System.lineSeparator());
                String name = czytnik.nextLine();
                System.out.println("Podaj Nazwisko kontaktu:" + System.lineSeparator());
                String surname = czytnik.nextLine();
                System.out.println("Podaj kraj w którym mieszka:" + System.lineSeparator());
                String country = czytnik.nextLine();
                System.out.println("Podaj kod pocztowy:" + System.lineSeparator());
                String postalCode = czytnik.nextLine();
                System.out.println("Podaj miasto w którym mieszka:" + System.lineSeparator());
                String city = czytnik.nextLine();
                System.out.println("Podaj Uslicę przy której mieszka oraz nr domu i mieszkania" +
                        System.lineSeparator() + "np: Zwycięstwa 16/2" + System.lineSeparator());
                String street = czytnik.nextLine();
                System.out.println("Podaj nr telefonu:" + System.lineSeparator());
                String phoneNumber = czytnik.nextLine();
                contactList.addContact(name, surname, country, postalCode, city, street, phoneNumber);
                start(czytnik,contactList);
                //System.out.println("Tu masz zawołać metodę która dopisze nowy kontakt do listy i wyświetli Urzytkownik XXX został dopisany do listy ");
            }
            if(scan.equals("4")) {
                System.out.println("Podaj pozycję którą według listy zajmuje żądany przez Ciebie kontakt:" + System.lineSeparator());
                Integer poz = czytnik.nextInt();
                String buffor = czytnik.nextLine();
                System.out.println("Podaj Imię kontaktu:" + System.lineSeparator());
                String name = czytnik.nextLine();
                System.out.println("Podaj Nazwisko kontaktu:" + System.lineSeparator());
                String surname = czytnik.nextLine();
                contactList.erazeContact(poz, name, surname);
                start(czytnik,contactList);
                //System.out.println("Tu masz zawołać metodę która usunie wybrany kontakt z listy i wyświetli Urzytkownik XXX został Usunięty ");
            }
            if(scan.equals("5")) {
                System.out.println("Podaj pozycję którą według listy zajmuje żądany przez Ciebie kontakt:" + System.lineSeparator());
                Integer poz = czytnik.nextInt();
                String buffor = czytnik.nextLine();
                System.out.println("Podaj Imię kontaktu:" + System.lineSeparator());
                String name = czytnik.nextLine();
                System.out.println("Podaj Nazwisko kontaktu:" + System.lineSeparator());
                String surname = czytnik.nextLine();
                System.out.println("Podaj kraj w którym mieszka:" + System.lineSeparator());
                String country = czytnik.nextLine();
                System.out.println("Podaj kod pocztowy:" + System.lineSeparator());
                String postalCode = czytnik.nextLine();
                System.out.println("Podaj miasto w którym mieszka:" + System.lineSeparator());
                String city = czytnik.nextLine();
                System.out.println("Podaj Uslicę przy której mieszka oraz nr domu i mieszkania" +
                        System.lineSeparator() + "np: Zwycięstwa 16/2" + System.lineSeparator());
                String street = czytnik.nextLine();
                System.out.println("Podaj nr telefonu:" + System.lineSeparator());
                String phoneNumber = czytnik.nextLine();
                contactList.editContact(poz, name, surname, country, postalCode, city, street, phoneNumber);
                start(czytnik,contactList);
                // Czy on napewno bierze metode edit ze stepa 1 A ??
                //System.out.println("Tu masz zawołać metodę która edytuje wybrany kontakt i wyświetli Urzytkownik XXX został zmodyfikowany ");
            }
            if(scan.equals("6")) {
                System.out.println("Do widzenia ;-)");
            }
        } catch(InputMismatchException ime) {
            System.out.println("Wprowadziłeś niepoprawną wartość. należy wprowadzić cyfrę od 1 do 5 odpowiadającą wybranej akcji" +
            System.lineSeparator() + "sprubój ponownie");
            start(czytnik,contactList);
        }
    }
}
