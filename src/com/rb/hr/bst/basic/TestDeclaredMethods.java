package com.rb.hr.bst.basic;

import java.util.Arrays;

class Printer <T> {

    /**
    *    Method Name: printArray
    *    Print each element of the generic array on a new line. Do not return anything.
    *    @param array generic array
    **/
    
    public <E> void printArray(E[] array)
    {
        Arrays.asList(array).forEach(System.out::println);
        //for (E el : array) { System.out.println(el); }
    }

}

public class TestDeclaredMethods {
    
    public static void main(String args[]){
        
        Integer[] intArray = {1,2,3};
        
        Printer<Integer> intPrinter = new Printer<>();
        intPrinter.printArray( intArray  );

        System.out.println("Number of Methods in the Printer class: " + Printer.class.getDeclaredMethods().length);
    } 
}