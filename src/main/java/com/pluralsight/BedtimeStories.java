package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BedtimeStories {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Please enter the text name like 'goldilocks, hansel_and_gretel, mary_had_a_little_lamb'");
        String input=scanner.nextLine();
        String fileName="src/main/resources/"+input+".txt";
        int lineNumer=1;

        int lineNumber=1;

        try{
            FileReader filereader= new FileReader(fileName);
            BufferedReader bufReader=new BufferedReader(filereader);

            String line=bufReader.readLine();
            while(line!=null){
                    if(!line.isEmpty()) {

                        System.out.println(lineNumber + line);

                        lineNumber++;
                    }
                line = bufReader.readLine();

                }
            }

         catch (FileNotFoundException n){
            System.out.println("no file named "+n.getMessage());
        }catch(IOException e){
            System.out.println("no input or output");
        }


    }
}
