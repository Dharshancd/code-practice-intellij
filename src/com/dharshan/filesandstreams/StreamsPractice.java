package com.dharshan.filesandstreams;

import java.io.*;

public class StreamsPractice {

//    public static void main(String[] args) {
//        DataInputStream dis = new DataInputStream(System.in);
//        File f = new File("mytext.txt");
//        System.out.println(f.exists());
//        System.out.println(f.getPath());
//        System.out.println(f.getAbsolutePath());
//        System.out.println(f.length());
//        System.out.println(f.isDirectory());
//
//
//
//        try {
//            FileOutputStream out = new FileOutputStream(f, true);
//            BufferedOutputStream br = new BufferedOutputStream(out);
//
//            char ch;
//
//            while ((ch = (char) dis.read()) != '@') {
//                br.write(ch);
//            }
//
//            br.flush();
//        }catch (IOException e) {
//            System.err.println(e);
//        }
//    }
public static void main(String[] args) {
    FileWriter w = null;
    BufferedWriter br = null;
    try {
        String s = "Hi This is pavan";
         w = new FileWriter("mytext.txt", true);
         br = new BufferedWriter(w);
        for (int i = 0; i < s.length(); i++) {
            br.write(s.charAt(i));
        }
        br.flush();
    }catch (IOException e) {
        System.err.println(e);
    } finally {
        try {

            w.close();
            br.close();
        } catch (IOException e ) {
            System.err.println(e);
        }
    }
}
}
