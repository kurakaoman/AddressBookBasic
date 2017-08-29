package step1A;

import step1A.contactList.SortList;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Szpak on 25.08.2017.
 */
public class ContactList {


    public ContactList() {
        System.out.println("contactList melduje gotowość do działania");
        //- Daj tu obsluge wyjatku.. ktoa moglby np chcec wyświetlić kontakt o numerze rzekraczajacym faktyczny rozmar mapy
        // -do każdej metody dodaj na koncu SortList!!!
        //-sprawdz czy dziala- rozwiaz problem z wyswieltalniem tego kontaktu który właśnie utworzyliśmy ( jego numeru porzadkowego na liście... może poprzez nie equals a == (?), narazie masz rozwiazanie tymczasowe, bedzie się kopać jak uporzadkujeszliste , tzn zmieni swoja pozycje na liście
        //-On napewno bierze metode edit ze stepa 1 A w AdressBook ... i pozosdtałe metody?, nie rozuemim dla czego tak i jak sobie z tym radzić , możliwe że źle przekopiowąłem to wszystko bo używałem Refactor/Copy...
        //-zmien nazwe mapy contactMap
    }

    public Map<Integer, Parameters> contactMap = new HashMap<>();
    public SortList sortList = new SortList();
    public Integer lastPosition = contactMap.size() - 1;
    public Parameters lastParameter = contactMap.get(lastPosition);
    public Parameters firstParameter = contactMap.get(0);


    public void showContactList() {
        if (contactMap == null) {
            System.out.println("Lista jest pusta" +
                    System.lineSeparator() + "wprowadź kontakty do listy, a następnie wyswietl całą listę");
        } else {
            for (int i = 0; i < contactMap.size(); i++) {

                System.out.println(i + ") Imię: " + contactMap.get(i).getName() + "   " +
                        "Nazwisko: " + contactMap.get(i).getSurname() + "  " +
                        "Kraj: " + contactMap.get(i).getCountry() + "  " +
                        "Kod pocztowy: " + contactMap.get(i).getPostalCode() + "  " +
                        "Miasto: " + contactMap.get(i).getCity() + "  " +
                        "Ulica: " + contactMap.get(i).getStreet() + "  " +
                        "Nr telefonu: " + contactMap.get(i).getPhoneNumber());
            }
        }
    }

    public void showContact(Integer positionAtList, String name, String surname) {
        sortList.selectionSort(contactMap);
        if (contactMap.get(positionAtList).getName().equals(name) && contactMap.get(positionAtList).getSurname().equals(surname)) {
            System.out.println(positionAtList + ") Imię: " + contactMap.get(positionAtList).getName() + "   " +
                    "Nazwisko: " + contactMap.get(positionAtList).getSurname() + "  " +
                    "Kraj: " + contactMap.get(positionAtList).getCountry() + "  " +
                    "Kod pocztowy: " + contactMap.get(positionAtList).getPostalCode() + "  " +
                    "Miasto: " + contactMap.get(positionAtList).getCity() + "  " +
                    "Ulica: " + contactMap.get(positionAtList).getStreet() + "  " +
                    "Nr telefonu: " + contactMap.get(positionAtList).getPhoneNumber());
        } else {
            System.out.println("na tej pozycji w liście nie ma osoby o tym imieniu i nazwisku" +
                    System.lineSeparator() + "na pozycji z numerem " + positionAtList + "znajduje się: " +
                    "Nazwisko: " + contactMap.get(positionAtList).getSurname() + "  " +
                    "Kraj: " + contactMap.get(positionAtList).getCountry() + "  " +
                    "Kod pocztowy: " + contactMap.get(positionAtList).getPostalCode() + "  " +
                    "Miasto: " + contactMap.get(positionAtList).getCity() + "  " +
                    "Ulica: " + contactMap.get(positionAtList).getStreet() + "  " +
                    "Nr telefonu: " + contactMap.get(positionAtList).getPhoneNumber());
        }

    }

    public void addContact(String name, String surname, String country, String postalCode, String city, String streat, String phoneNumber) {
        Parameters parametersTemp = new Parameters(name, surname, country, postalCode, city, streat, phoneNumber);
        if (contactMap.isEmpty()) {
            System.out.println("jest to pierwsza pozycja w mapie");
            contactMap.put(0, parametersTemp);
            System.out.println(0 + ") Imię: " + contactMap.get(0).getName() + "   " +
                    "Nazwisko: " + contactMap.get(0).getSurname() + "  " +
                    "Kraj: " + contactMap.get(0).getCountry() + "  " +
                    "Kod pocztowy: " + contactMap.get(0).getPostalCode() + "  " +
                    "Miasto: " + contactMap.get(0).getCity() + "  " +
                    "Ulica: " + contactMap.get(0).getStreet() + "  " +
                    "Nr telefonu: " + contactMap.get(0).getPhoneNumber());
            sortList.selectionSort(contactMap);
            for (int i = 0; i < contactMap.size(); i++) {
                if (contactMap.get(i) == parametersTemp) {
                    System.out.println(i + ") Imię: " + contactMap.get(i).getName() + "   " +
                            "Nazwisko: " + contactMap.get(i).getSurname() + "  " +
                            "Kraj: " + contactMap.get(i).getCountry() + "  " +
                            "Kod pocztowy: " + contactMap.get(i).getPostalCode() + "  " +
                            "Miasto: " + contactMap.get(i).getCity() + "  " +
                            "Ulica: " + contactMap.get(i).getStreet() + "  " +
                            "Nr telefonu: " + contactMap.get(i).getPhoneNumber());
                }
            }

        } else {
            System.out.println("jak na razie lista ma  " + contactMap.size() + "pozycji(/e)");
            contactMap.put(lastPosition, parametersTemp);
            System.out.println(contactMap.size() + ") Imię: " + lastParameter.getName() + "   " +
                    "Nazwisko: " + lastParameter.getSurname() + "  " +
                    "Kraj: " + lastParameter.getCountry() + "  " +
                    "Kod pocztowy: " + lastParameter.getPostalCode() + "  " +
                    "Miasto: " + lastParameter.getCity() + "  " +
                    "Ulica: " + lastParameter.getStreet() + "  " +
                    "Nr telefonu: " + lastParameter.getPhoneNumber());
            sortList.selectionSort(contactMap);
            for (int i = 0; i < contactMap.size(); i++) {
                if (contactMap.get(i) == parametersTemp) {
                    System.out.println(i + ") Imię: " + contactMap.get(i).getName() + "   " +
                            "Nazwisko: " + contactMap.get(i).getSurname() + "  " +
                            "Kraj: " + contactMap.get(i).getCountry() + "  " +
                            "Kod pocztowy: " + contactMap.get(i).getPostalCode() + "  " +
                            "Miasto: " + contactMap.get(i).getCity() + "  " +
                            "Ulica: " + contactMap.get(i).getStreet() + "  " +
                            "Nr telefonu: " + contactMap.get(i).getPhoneNumber());
                }
            }

        }
    }

    public void erazeContact(Integer positionAtList, String name, String surname) {
        if (contactMap.get(positionAtList).getName().equals(name) && contactMap.get(positionAtList).getSurname().equals(surname)) {
            Map<Integer, Parameters> contactListTemp = contactMap;
            contactMap = new HashMap<>();
            for (int i = 0; i < contactListTemp.size() - 1; i++) {
                if (i < positionAtList) {
                    contactMap.put(i, contactListTemp.get(i));
                } else {
                    contactMap.put(i, contactListTemp.get(i + 1));
                }
            }
            System.out.println("Żądany kontakt został usunięty z listy, by to sprawdzić proszę wyświetlić całą listę");
        } else {
            System.out.println("Wpisane dane nie identyfikują żadnego kontaktu z listy");
        }
        //sortList.selectionSort(contactMap);
    }

    public void editContact(Integer positionAtList, String name, String surname, String country, String postalCode, String city, String streat, String phoneNumber) {
        if (contactMap.get(positionAtList).getName().equals(name) && contactMap.get(positionAtList).getSurname().equals(surname)) {
            contactMap.replace(positionAtList, new Parameters(name, surname, country, postalCode, city, streat, phoneNumber));
            System.out.println("Żądany kontakt został zmoyfikowany z listy, by to sprawdzić proszę wyświetlić całą listę " +
                    System.lineSeparator() + "Zmodyfikowany kontakt teraz to:" + System.lineSeparator());
            System.out.println(positionAtList + ") Imię: " + contactMap.get(positionAtList).getName() + "   " +
                    "Nazwisko: " + contactMap.get(positionAtList).getSurname() + "  " +
                    "Kraj: " + contactMap.get(positionAtList).getCountry() + "  " +
                    "Kod pocztowy: " + contactMap.get(positionAtList).getPostalCode() + "  " +
                    "Miasto: " + contactMap.get(positionAtList).getCity() + "  " +
                    "Ulica: " + contactMap.get(positionAtList).getStreet() + "  " +
                    "Nr telefonu: " + contactMap.get(positionAtList).getPhoneNumber());

        } else {
            System.out.println("Wpisane dane nie identyfikują żadnego kontaktu z listy");
        }
        //sortList.selectionSort(contactMap);
    }
}
