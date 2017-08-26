package step0ConspectusB;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Szpak on 25.08.2017.
 */
public class ContactList {
    public Map<Integer,Parameters> contactList = new HashMap<>();

    public String showContactList(){ return " W pętli wypisuje w kolejnych wierszach numery kontaktu i ich parametry"; }
    public String showContact(Integer positionAtList, String name, String surname) {return" Wyświetl kontakt odpowiadający podanym argumentom, IF() parametry się nei zgadzają to wypisz ze parametry się nie zgadzają"; }
    public String addContact( String name, String surname, String country, String postalCode, String City, String streat, String phoneNumber) {return" Wyświetl kontakt odpowiadający podanym argumentom, IF() parametry się nei zgadzają to wypisz ze parametry się nie zgadzają"; }
    public String erazeContact(Integer positionAtList, String name, String surname) {return" Wyświetl komunikat że kontakt o podanych parametrach został usunięty, IF() parametry się nei zgadzają to wypisz ze parametry się nie zgadzają"; }
    public String editContact(Integer positionAtList, String name, String surname) {return" ... no wiec tutaj zastanów się do czego się odwołasz żeby zmodyfikować podane parametry, IF() parametry się nei zgadzają to wypisz ze parametry się nie zgadzają"; }

}
