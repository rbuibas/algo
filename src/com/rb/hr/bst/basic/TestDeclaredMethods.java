package com.rb.hr.bst.basic;
import java.util.*;

class Printer <T> {

    /**
    *    Method Name: printArray
    *    Print each element of the generic array on a new line. Do not return anything.
    *    @param array generic array
    **/
    
    public <E> void printArray(E[] array)
    {
        Arrays.asList(array).forEach(item->System.out.println(item));
        //for (E el : array) { System.out.println(el); }
    }

}

public class TestDeclaredMethods {
    
    public static void main(String args[]){
        
        Integer[] intArray = {1,2,3};
        
        Printer<Integer> intPrinter = new Printer<Integer>();
        intPrinter.printArray( intArray  );

        System.out.println("Number of Methods in the Printer class: " + Printer.class.getDeclaredMethods().length);
    } 
}