package problem2;


import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mac
 */
public class permutationDriver {

    public static void main(String[] args) {
        // TODO code application logic here

        Scanner s = new Scanner(System.in);

        System.out.print("Please Specify Size of List: ");
        int size = s.nextInt();

        int[] permArray = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Please Enter Element " + (i + 1) + ": ");
            permArray[i] = s.nextInt();
        }
        
        long startTime = System.nanoTime();
        
        System.out.println("\nUser Entered Set: "+Arrays.toString(permArray));

        permuteIteration p0 = new permuteIteration();
        System.out.println("\nIteration:");
        p0.permuteIteration(permArray).forEach(System.out::println);
        
        permuteRecursion p1 = new permuteRecursion();
        System.out.println("\nRecursion:");
        p1.permuteRecursion(permArray).forEach(System.out::println);
        System.out.println();
        
        long elapsedTime = System.nanoTime() - startTime;
        System.out.println("Total elapsed time: " + elapsedTime * .000001 + " Milliseconds\n");
    }
}
