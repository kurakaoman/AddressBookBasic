package step1A.contactList;

import step1A.Parameters;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Marcin on 28.06.2017.
 */
public class SortList {

    public Map<Character,Integer> alphabeticOrder = new HashMap<>();

    private void SelectionSort() {
        alphabeticOrder.put('0',0);
        alphabeticOrder.remove(0);
        alphabeticOrder.put('_',1);
        alphabeticOrder.put(' ',2);
        alphabeticOrder.put('!',3);
        alphabeticOrder.put('"',4);
        alphabeticOrder.put('#',5);
        alphabeticOrder.put('$',6);
        alphabeticOrder.put('%',7);
        alphabeticOrder.put('&',8);
        alphabeticOrder.put('\'',9);
        alphabeticOrder.put('(',10);
        alphabeticOrder.put(')',11);
        alphabeticOrder.put('*',12);
        alphabeticOrder.put('+',13);
        alphabeticOrder.put(',',14);
        alphabeticOrder.put('-',15);
        alphabeticOrder.put('.',16);
        alphabeticOrder.put('/',17);
        alphabeticOrder.put('0',18);
        alphabeticOrder.put('1',19);
        alphabeticOrder.put('2',20);
        alphabeticOrder.put('3',21);
        alphabeticOrder.put('4',22);
        alphabeticOrder.put('5',23);
        alphabeticOrder.put('6',24);
        alphabeticOrder.put('7',25);
        alphabeticOrder.put('8',26);
        alphabeticOrder.put('9',27);
        alphabeticOrder.put(':',28);
        alphabeticOrder.put(';',29);
        alphabeticOrder.put('<',30);
        alphabeticOrder.put('=',31);
        alphabeticOrder.put('>',32);
        alphabeticOrder.put('?',33);
        alphabeticOrder.put('@',34);
        alphabeticOrder.put('A',35);
        alphabeticOrder.put('a',36);
        alphabeticOrder.put('Ą',37);
        alphabeticOrder.put('ą',38);
        alphabeticOrder.put('B',39);
        alphabeticOrder.put('b',40);
        alphabeticOrder.put('C',41);
        alphabeticOrder.put('c',42);
        alphabeticOrder.put('Ć',43);
        alphabeticOrder.put('ć',44);
        alphabeticOrder.put('D',45);
        alphabeticOrder.put('d',46);
        alphabeticOrder.put('E',47);
        alphabeticOrder.put('e',48);
        alphabeticOrder.put('Ę',49);
        alphabeticOrder.put('ę',50);
        alphabeticOrder.put('F',51);
        alphabeticOrder.put('f',52);
        alphabeticOrder.put('G',53);
        alphabeticOrder.put('g',54);
        alphabeticOrder.put('H',55);
        alphabeticOrder.put('h',56);
        alphabeticOrder.put('I',57);
        alphabeticOrder.put('i',58);
        alphabeticOrder.put('J',59);
        alphabeticOrder.put('j',60);
        alphabeticOrder.put('K',61);
        alphabeticOrder.put('k',62);
        alphabeticOrder.put('L',63);
        alphabeticOrder.put('L',64);
        alphabeticOrder.put('Ł',65);
        alphabeticOrder.put('ł',66);
        alphabeticOrder.put('M',67);
        alphabeticOrder.put('m',68);
        alphabeticOrder.put('N',69);
        alphabeticOrder.put('n',70);
        alphabeticOrder.put('Ń',71);
        alphabeticOrder.put('ń',72);
        alphabeticOrder.put('O',73);
        alphabeticOrder.put('o',74);
        alphabeticOrder.put('Ó',75);
        alphabeticOrder.put('ó',76);
        alphabeticOrder.put('P',77);
        alphabeticOrder.put('p',78);
        alphabeticOrder.put('R',79);
        alphabeticOrder.put('r',80);
        alphabeticOrder.put('S',81);
        alphabeticOrder.put('s',82);
        alphabeticOrder.put('Ś',83);
        alphabeticOrder.put('ś',84);
        alphabeticOrder.put('T',85);
        alphabeticOrder.put('t',86);
        alphabeticOrder.put('U',87);
        alphabeticOrder.put('u',88);
        alphabeticOrder.put('V',89);
        alphabeticOrder.put('v',90);
        alphabeticOrder.put('W',91);
        alphabeticOrder.put('w',92);
        alphabeticOrder.put('X',93);
        alphabeticOrder.put('x',94);
        alphabeticOrder.put('Y',95);
        alphabeticOrder.put('y',96);
        alphabeticOrder.put('Z',97);
        alphabeticOrder.put('z',98);
        alphabeticOrder.put('[',99);
        alphabeticOrder.put('\\',100);
        alphabeticOrder.put(']',101);
        alphabeticOrder.put('^',102);

        alphabeticOrder.put('{',103);
        alphabeticOrder.put('|',104);
        alphabeticOrder.put('}',105);
        alphabeticOrder.put('~',106);

    }

    public void selectionSort(Map<Integer, Parameters> mapToSort) {

            for (int a = 0; a < mapToSort.size(); a++) {
                int z = 0;
                int max = 0;
                Parameters paramTemp = mapToSort.get(0);
                System.out.println("");
                System.out.println("===>    a =" + a);
                for (int i = a; i < mapToSort.size(); i++) {
                    System.out.println("i=" + i);
                   // for(int y = 0; y < mapToSort.get(a).getName().length(); y++)
                    if (i == a) {
                        max = alphabeticOrder.get(mapToSort.get(a).getName().charAt(1));
                        z = a;
                        paramTemp = mapToSort.get(a);
                    }
                    if (alphabeticOrder.get(mapToSort.get(i).getName().charAt(1)) > max) {
                        max = alphabeticOrder.get(mapToSort.get(i).getName().charAt(1));
                        z = i;
                        paramTemp = mapToSort.get(i);
                        System.out.println("max=" + max);
                        System.out.println("z=" + z);
                        System.out.println("paramTemp" + paramTemp);
                    }
                    if (alphabeticOrder.get(mapToSort.get(i).getName().charAt(1)).equals(max)){
                        for(int b = 0; b < mapToSort.get(a).getName().length(); b++){
                            if(!(alphabeticOrder.get(mapToSort.get(z).getName().charAt(b)).equals(alphabeticOrder.get(mapToSort.get(a).getName().charAt(b))))){
                                b = mapToSort.get(a).getName().length();
                                if (alphabeticOrder.get(mapToSort.get(z).getName().charAt(b)) > alphabeticOrder.get(mapToSort.get(a).getName().charAt(b))){
                                    max = alphabeticOrder.get(mapToSort.get(i).getName().charAt(1));
                                    z = i;
                                    paramTemp = mapToSort.get(i);
                                }
                            }
                        }
                    }
                }
                mapToSort.put(z,mapToSort.get(a));//.replace?
                mapToSort.put(a,paramTemp);//replace

                System.out.println("mapToSort.get(z)= " + mapToSort.get(z));
                System.out.println("mapToSort.get(a)= " + mapToSort.get(a));
            }
            System.out.print("mapToSort = ");
            for (int i = 0; i < mapToSort.size(); i++)
                System.out.print(mapToSort.get(i) + ",");

    }
}
