package org.example.model.exercise;

import java.util.*;


public class Exercise7 {

// Create a new hashSet and populate it with random names. Then convert the hashSet to an arrayList. Lastly, manually sort the list in alphabetical order and print it out.



    public static void main(String[] args) {

        System.out.println("hello");
        System.out.println("Enter the string ");

        HashSet<String> stringHashSet = new HashSet<>();

            for(int i=0;i<5;i++) {                             //Entering values in HashSet
            Scanner scanner = new Scanner(System.in);
            String st1= scanner.nextLine();
             stringHashSet.add(st1);
       }


         //   System.out.println(stringHashSet);           //Output : [Tobi, Amer, Habib, Salman, Zara]

            List<String> stringHashSet1 = new ArrayList<String>(stringHashSet);  // Hashset being converted to Arraylist

            System.out.println(stringHashSet1);       //display list Behoves ingen loop through

         Collections.sort(stringHashSet1);

       System.out.println(stringHashSet1);







    }
}
