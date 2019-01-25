package app;

import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        App app = new App();
        app.algoTestLinkedList();
    }
    
    @SuppressWarnings("unused")
		private void algoTestArray() {
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
    
    private void algoTestLinkedList() {
    	AlgoLinkedList aList = new AlgoLinkedList();
  		Node head = aList.getHead();
  		Node ebony, ivory = null;
  		head = aList.addFront(new Node("Node a"));
  		ivory = head = aList.addFront(new Node("Node b"));
  		head = aList.addFront(new Node("Node c"));
  		head = aList.addFront(new Node("Node d"));
  		ebony = head = aList.addFront(new Node("Node e"));
  		head = aList.addFront(new Node("Node f"));
  		head = aList.addFront(new Node("Node g"));
  		head = aList.addFront(new Node("Node h"));
//  		ivory.setNext(ebony);
  		if (!aList.isLLCircular()) {
  			aList.printAll();
  		} else {
  			System.out.println("List is circular. Not risking SIGSEGV.");
  		}

    }
}