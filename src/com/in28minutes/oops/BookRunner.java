package com.in28minutes.oops;

public class BookRunner {
    public static void main(String[] args) {
        Book artOfComputerProgramming = new Book(1000);
        Book effectiveJava = new Book(2000);
        Book cleanCode = new Book(3000);

//        artOfComputerProgramming.noOfCopies = 5;
//        effectiveJava.noOfCopies = 10;
//        cleanCode.noOfCopies = 11;

//        artOfComputerProgramming.setNoOfCopies(5);
//        effectiveJava.setNoOfCopies(10);
//        cleanCode.setNoOfCopies(11);

        artOfComputerProgramming.increaseNoOfCopies(10);

        System.out.println(artOfComputerProgramming.getNoOfCopies());
    }
}
