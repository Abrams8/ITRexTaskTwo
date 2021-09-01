package com.company;

import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        int counter = 0;
        try(FileReader reader = new FileReader("src/com/company/INPUT.TXT")){
            int c;
            while ((c=reader.read())!=-1){
                System.out.print((char)c);
            }
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }


    }
}
