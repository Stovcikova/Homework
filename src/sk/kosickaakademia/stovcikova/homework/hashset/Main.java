package sk.kosickaakademia.stovcikova.homework.hashset;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> mnozina = new HashSet<>();
        for(Integer temp:mnozina){
            System.out.println(temp);
        }
        printHowManyNames();
        }

    public static void printHowManyNames(){
        HashSet<String> mnozina = new HashSet<>();
        try {
            FileReader fr = new FileReader("resource/names.txt");
            BufferedReader reader = new BufferedReader(fr);
            String line;
            while ((line = reader.readLine()) != null) {
                mnozina.add(line);
            }
            fr.close();
        }catch (IOException e){
            System.out.println("Error: " + e);
        }
        printCount((HashSet) mnozina);
        System.out.println();
        printEveryone((HashSet)mnozina);

    }

    private static void printCount(HashSet mnozina){
        System.out.println("Pocet mien je: " + mnozina.size());
    }

    private static void printEveryone(HashSet mnozina){
        for (Object temp : mnozina){
            System.out.println(temp);
        }
    }
    /**/




}



