package Assignment2;

/**
* Counts how many words in files.
* @author King, Chandler
* @assignment CSCI 428 Assign02Qn1
* @date 04/04/2022
*/


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ass2Qn1 {
    public static void main(String[] args) throws IOException{
        try {
            File myObj = new File("Assignment2/Hello.tx");
            String[]words=null;
            int NumberWords=0;
            FileReader reader = new FileReader(myObj);
            BufferedReader buffer = new BufferedReader(reader);
            String s;
            while ((s=buffer.readLine())!= null){
                words=s.split("");
                NumberWords=NumberWords+words.length;
               
            }
            reader.close();
            System.out.println("Words in HEllO.tx: " + NumberWords);
        } catch (FileNotFoundException e) {
            System.out.println("An error occured.");
            e.printStackTrace();
        }

        }
    }
    

