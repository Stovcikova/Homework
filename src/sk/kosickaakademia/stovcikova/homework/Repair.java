package sk.kosickaakademia.stovcikova.homework;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Repair {
    public void rewriteFile(){
        try {
            FileReader fr = new FileReader("resource/git.txt");

            File file = new File("output/repair.txt");
            file.createNewFile();
            FileWriter fw = new FileWriter(file);

            int i;
            while((i=fr.read())!=-1){
                if(i == '?'){
                    continue;
                }
                if(i == 'y'){
                    i = 'i';
                }else if(i == 'i'){
                    i = 'y';
                }
                fw.write(i);
            }
            fw.close();
            fr.close();

        }catch (IOException ex){
            System.out.println("Chyba: " + ex);
        }
    }
}
