package com.in28minutes.firstjavaproject;

public class MultiplicationTable {
//    void print(){
//        for(int i=1 ; i<=10 ; i++){
//            System.out.printf("%d * %d = %d", 5, i , 5 * i).println();
//        }
//    }

    void print(){
        print(1);
    }

//    void print(int table){
//        for(int i=1 ; i<=10 ; i++){
//            System.out.printf("%d * %d = %d", table , i , table * i).println();
//        }
//    }

    void print(int table){
        print(table, 2, 3);
    }

    void print(int table, int from, int to){
        for(int i=from ; i<=to ; i++){
            System.out.printf("%d * %d = %d", table, i, table * i).println();
        }
    }
}
