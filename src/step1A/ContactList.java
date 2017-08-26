package step1A;

import step1A.contactList.SortList;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Szpak on 25.08.2017.
 */
public class ContactList {

    public ContactList() {
        //!!!!!!!!!!!!!! Daj tu obsluge wyjatku.. ktoa moglby np chcec wyświetlić kontakt o numerze rzekraczajacym faktyczny rozmar mapy
        // do każdej metody dodaj na koncu SortList!!!
        //-sprawdz czy dziala- rozwiaz problem z wyswieltalniem tego kontaktu który właśnie utworzyliśmy ( jego numeru porzadkowego na liście... może poprzez nie equals a == (?), narazie masz rozwiazanie tymczasowe, bedzie się kopać jak uporzadkujeszliste , tzn zmieni swoja pozycje na liście
        //On napewno bierze metode edit ze stepa 1 A w AdressBook ... i pozosdtałe metody?, nie rozuemim dla czego tak i jak sobie z tym radzić , możliwe że źle przekopiowąłem to wszystko bo używałem Refactor/Copy...
        //zmien nazwe mapy contactList
    }

    public Map<Integer, Parameters> contactList = new HashMap<>();
    public SortList sortList = new SortList()

    private void sortList(){

    }

    public void showContactList() {
        for (int i = 0; i < contactList.size(); i++) {

            System.out.println(i + ") Imię: " + contactList.get(i).getName() + "   " +
                    "Nazwisko: " + contactList.get(i).getSurname() + "  " +
                    "Kraj: " + contactList.get(i).getCountry() + "  " +
                    "Kod pocztowy: " + contactList.get(i).getPostalCode() + "  " +
                    "Miasto: " + contactList.get(i).getCity() + "  " +
                    "Ulica: " + contactList.get(i).getStreet() + "  " +
                    "Nr telefonu: " + contactList.get(i).getPhoneNumber());
        }
        sortList.selectionSort(contactList);
    }

    public void showContact(Integer positionAtList, String name, String surname) {
        if (contactList.get(positionAtList).getName().equals(name) && contactList.get(positionAtList).getSurname().equals(surname)) {
            System.out.println(positionAtList + ") Imię: " + contactList.get(positionAtList).getName() + "   " +
                    "Nazwisko: " + contactList.get(positionAtList).getSurname() + "  " +
                    "Kraj: " + contactList.get(positionAtList).getCountry() + "  " +
                    "Kod pocztowy: " + contactList.get(positionAtList).getPostalCode() + "  " +
                    "Miasto: " + contactList.get(positionAtList).getCity() + "  " +
                    "Ulica: " + contactList.get(positionAtList).getStreet() + "  " +
                    "Nr telefonu: " + contactList.get(positionAtList).getPhoneNumber());
        } else {
            System.out.println("Wpisane dane nie identyfikują żadnego kontaktu z listy");
        }
        sortList();
    }

    public void addContact(String name, String surname, String country, String postalCode, String city, String streat, String phoneNumber) {
        Parameters parametersTemp = new Parameters(name, surname, country, postalCode, city, streat, phoneNumber)
        contactList.put(contactList.size(), parametersTemp);
        System.out.println(contactList.size() + ") Imię: " + contactList.get(contactList.size()).getName() + "   " +
                "Nazwisko: " + contactList.get(contactList.size()).getSurname() + "  " +
                "Kraj: " + contactList.get(contactList.size()).getCountry() + "  " +
                "Kod pocztowy: " + contactList.get(contactList.size()).getPostalCode() + "  " +
                "Miasto: " + contactList.get(contactList.size()).getCity() + "  " +
                "Ulica: " + contactList.get(contactList.size()).getStreet() + "  " +
                "Nr telefonu: " + contactList.get(contactList.size()).getPhoneNumber());
        sortList();
        for(int i = 0; i < contactList.size(); i++){
            if(contactList.get(i)==parametersTemp){
                System.out.println(i + ") Imię: " + contactList.get(i).getName() + "   " +
                "Nazwisko: " + contactList.get(i).getSurname() + "  " +
                "Kraj: " + contactList.get(i).getCountry() + "  " +
                "Kod pocztowy: " + contactList.get(i).getPostalCode() + "  " +
                "Miasto: " + contactList.get(i).getCity() + "  " +
                "Ulica: " + contactList.get(i).getStreet() + "  " +
                "Nr telefonu: " + contactList.get(i).getPhoneNumber());
            }
        }

    }

    public void erazeContact(Integer positionAtList, String name, String surname) {
        if (contactList.get(positionAtList).getName().equals(name) && contactList.get(positionAtList).getSurname().equals(surname)) {
            Map<Integer, Parameters> contactListTemp = contactList;
            contactList = new HashMap<>();
            for (int i = 0; i < contactListTemp.size() - 1; i++) {
                if (i < positionAtList) {
                    contactList.put(i, contactListTemp.get(i));
                } else {
                    contactList.put(i, contactListTemp.get(i + 1));
                }
            }
            System.out.println("Żądany kontakt został usunięty z listy, by to sprawdzić proszę wyświetlić całą listę");
        } else {
            System.out.println("Wpisane dane nie identyfikują żadnego kontaktu z listy");
        }
        sortList();
    }

    public void editContact(Integer positionAtList, String name, String surname, String country, String postalCode, String city, String streat, String phoneNumber) {
        if (contactList.get(positionAtList).getName().equals(name) && contactList.get(positionAtList).getSurname().equals(surname)) {
            contactList.replace(positionAtList,new Parameters(name,surname, country, postalCode, city, streat, phoneNumber));
            System.out.println("Żądany kontakt został zmoyfikowany z listy, by to sprawdzić proszę wyświetlić całą listę " +
            System.lineSeparator() + "Zmodyfikowany kontakt teraz to:" + System.lineSeparator());
            System.out.println(positionAtList + ") Imię: " + contactList.get(positionAtList).getName() + "   " +
                    "Nazwisko: " + contactList.get(positionAtList).getSurname() + "  " +
                    "Kraj: " + contactList.get(positionAtList).getCountry() + "  " +
                    "Kod pocztowy: " + contactList.get(positionAtList).getPostalCode() + "  " +
                    "Miasto: " + contactList.get(positionAtList).getCity() + "  " +
                    "Ulica: " + contactList.get(positionAtList).getStreet() + "  " +
                    "Nr telefonu: " + contactList.get(positionAtList).getPhoneNumber());

        } else {
            System.out.println("Wpisane dane nie identyfikują żadnego kontaktu z listy");
        }
        sortList();
    }
}
