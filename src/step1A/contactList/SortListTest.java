package step1A.contactList;


import step1A.Person;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Szpak on 30.08.2017.
 */
class SortListTest {

    public static void main (String[] args){
        Person person0 = new Person("Mateusz","Szpak","Poland","oooo","dddd","strrr","000000");
        Person person1 = new Person("Marcin","Szpak","Poland","oooo","dddd","strrr","000000");
        Person person2 = new Person("Marta","Szpak","Poland","oooo","dddd","strrr","000000");
        Person person3 = new Person("Alfons","Szpak","Poland","oooo","dddd","strrr","000000");
        Map<Integer,Person> mapaTest = new HashMap<>();
        mapaTest.put(0,person0);
        mapaTest.put(1,person1);
        mapaTest.put(2,person3);
        mapaTest.put(3,person2);

        SortList sortList = new SortList();
        sortList.selectionSort(mapaTest);
        System.out.println("");
        for(Integer i:mapaTest.keySet()){
            printContact(i,mapaTest.get(i));
        }

    }
    private static void printContact(int i, Person person) {
        System.out.println(i + ") Imię: " + person.getName() + "   " +
                "Nazwisko: " + person.getSurname() + "  " +
                "Kraj: " + person.getCountry() + "  " +
                "Kod pocztowy: " + person.getPostalCode() + "  " +
                "Miasto: " + person.getCity() + "  " +
                "Ulica: " + person.getStreet() + "  " +
                "Nr telefonu: " + person.getPhoneNumber());
    }

}