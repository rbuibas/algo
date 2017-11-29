package com.rb.hr.testing;

import java.util.*;


public class ProfessorClassTester {

    private static List<Integer> randomizableList = new ArrayList<>();
    private static Queue<Integer> randomizableQueue = new LinkedList<>();

    private static void initiateRandomizableList() {
        for (int i = 3; i <= 20; i++) {
            randomizableList.add(i);
        }
        Collections.shuffle(randomizableList);
        for (int i = 0; i <= 17; i++) {
            randomizableQueue.add(randomizableList.get(i));
        }
    }

    private static int popRL() {
        return randomizableQueue.remove();
    }

    private static int classMembersGenerator() {
        // 3 <= n <= 200

        return (new Random()).nextInt(198) + 3;
    }

    private static int presenceThresholdGenerator(int n) {
        // 1 <= k <= n
        return (n * (new Random().nextInt(71) + 30)) / 100; // randomize the percentage of n (30% at least)
    }

    private static int[] timeArrivalGenerator(int n) {
        // -1000 <= a(i) <= 1000
        Random rand = new Random();
        int[] arrivals = new int[n];
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                arrivals[i] = rand.nextInt(1001) - 1000;
            } else {
                arrivals[i] = rand.nextInt(1001) + 1;
            }
            if (i == n / 2) {
                arrivals[i] = 0;
            }
        }
        return arrivals;
    }

    public static void main(String[] args) {

        int numberOfClasses = 5;

        // print number of classes
        System.out.println(numberOfClasses);

        for (int i = 0; i < numberOfClasses; i++) {
            //System.out.println(presenceThresholdGenerator(classMembersGenerator()));
            //int classMembers = classMembersGenerator();
            initiateRandomizableList();
            int classMembers = popRL();
            int thresholdPresence = presenceThresholdGenerator(classMembers);
            int[] arrivalSamples = timeArrivalGenerator(classMembers);

            // generate class
            System.out.print(classMembers + " ");

            // randomize presence threshold
            System.out.println(thresholdPresence);

            // generate arrival times

            for (int j = 0; j < classMembers; j++) {
                System.out.print(arrivalSamples[j] + " ");
            }
            System.out.println();
        }

    }
}