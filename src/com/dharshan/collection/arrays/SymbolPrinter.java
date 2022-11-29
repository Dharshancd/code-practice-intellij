package com.dharshan.collection.arrays;

public class SymbolPrinter {
    public static void main(String[] args) {
        SymbolPrinter s = new SymbolPrinter();
        s.symbol(6,10);
    }
    public void symbol(int x,int y){
        for(int i=0;i<x;i++) {
            for (int j = 0; j < y; j++) {
                if (i>j) {

                    System.out.print("*" + " ");
                }
            }
            System.out.println(" ");
        }
    }
}
