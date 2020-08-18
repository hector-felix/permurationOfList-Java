package problem2;


import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mac
 */
public class permuteRecursion {
    
    public ArrayList<ArrayList<Integer>> permuteRecursion(int[] array) {
        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();
        
        permuteRecursion(array, 0, arrayList);
        
        return arrayList;
    }

    void permuteRecursion(int[] array, int first, ArrayList<ArrayList<Integer>> arrayList) {

        if (first >= array.length) {
            
            ArrayList<Integer> AL1 = convertArrayToList(array);
            
            arrayList.add(AL1);
        }

        for (int i = first; i < array.length; i++) {
            swap(array, first, i);
            
            permuteRecursion(array, first + 1, arrayList);
            
            swap(array, first, i);
        }
    }

    private ArrayList<Integer> convertArrayToList(int[] array) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        for (int i = 0; i < array.length; i++) {
        
            arrayList.add(array[i]);
        }
        return arrayList;
    }
//simlar to hanoi tower using 'temp' variable
    private void swap(int[] array, int a, int b) {
        if (a==b) return; //
        
        int placeHolder = array[a];
        
        array[a] = array[b];
        
        array[b] = placeHolder;
    }
    
}