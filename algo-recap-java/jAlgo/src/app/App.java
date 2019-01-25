package app;

import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("En passent");
        
        System.out.println("\tARRAYS");
        AlgoArray aArray = new AlgoArray();
        int testArray[] = new int[] { 1,7,4,6,9,2,8,3 };
        System.out.println("1. Missing number from the array " + Arrays.toString(testArray) + 
        		" is: " + aArray.findMissingNumber(1, testArray.length + 1, testArray));
        
        testArray = new int[] { 1,1,2,4,5,8,7,9,6,4,1,8,7 };
        
        System.out.println("2. Duplicates inside the array " + Arrays.toString(testArray) + 
        		" are: " + Arrays.toString(aArray.getDuplicates(testArray)));
        
        
        testArray = new int[] { 1,1,2,4,5,8,7,9,6,4,1,8,7 };
        
        System.out.println("2. Array " + Arrays.toString(testArray) + 
        		" adter removing duplicates: " + Arrays.toString(aArray.removeDuplicates(testArray)));
        
        String testString = "Ana voli Milovana.";
        System.out.println("String: " + testString);
        System.out.println("Reversed: " + aArray.reverseString(testString));
    }
}