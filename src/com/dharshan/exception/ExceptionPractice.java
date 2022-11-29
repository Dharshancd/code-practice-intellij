package com.dharshan.exception;

import javax.imageio.IIOException;
import java.io.*;

public class ExceptionPractice {

    private int numberOfVotes = 0;

    public static void main(String[] args) throws Exception {
    ExceptionPractice e = new ExceptionPractice();
        String [] names = {"Pavan", "Dharshan"};
    e.print(names);
    String s = "Hi this is pava";
        try {
            e.increment(10);
            e.print(s);
        } catch (Exception ex) {
            System.err.println(ex);
//            throw new RuntimeException(ex);
        }
    }


    private void print(String [] str) {
        int i = 10;
        if(str.length > i ){
            System.out.println(str[i]);

        }
    }


    public  void increment(int age) throws Exception{
        if(age < 18) {
            throw new Exception("age is less than 18");
        }
        numberOfVotes++;

    }
    private void print(String s) throws InputLengthTooLargeException  {
            if(s.length() > 10) {
                System.out.println("inside if");
                throw new InputLengthTooLargeException("Lenght of input" + s.length() + " is more than 10");
            }

            System.out.print(s.length());


        }




    private void readFile(String fileName) throws NullPointerException {
        try {
            File file = new File(fileName);
            BufferedReader br
                    = new BufferedReader(new FileReader(file));
            System.out.println(br.readLine());
        }
        catch (FileNotFoundException e) {
            System.out.println(fileName + "is not found");
        } catch (IOException e) {
            System.out.println("Inside IO catch block");
        }


        finally {
            System.out.println("Inside finally");
        }

    }



}




class InputLengthTooLargeException extends Exception {
    InputLengthTooLargeException(String msg) {
        super(msg);
    }
}