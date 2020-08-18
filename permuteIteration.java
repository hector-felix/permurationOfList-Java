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
public class permuteIteration {

    public ArrayList<ArrayList<Integer>> permuteIteration(int[] num) {
        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();

        arrayList.add(new ArrayList<>()); //arrayList needs to begin with empty element

        for (int outLoopCount = 0; outLoopCount < num.length; outLoopCount++) {
            //arraylist of type arraylist at the start
            
            ArrayList<ArrayList<Integer>> currentAL = new ArrayList<>();
            
            for (ArrayList<Integer> AL1 : arrayList) {
                
               // for (int inLoopCount = 0; inLoopCount < AL1.size() + 1; inLoopCount++) {
                for (int inLoopCount = 0; inLoopCount <= AL1.size(); inLoopCount++) {
                    
                    AL1.add(inLoopCount, num[outLoopCount]);
                    
                    ArrayList<Integer> temp = new ArrayList<>(AL1);
                    
                    currentAL.add(temp);
                    
                    AL1.remove(inLoopCount);
                }
            }

            arrayList = new ArrayList<>(currentAL);
        }
        return arrayList;
    }  
}
