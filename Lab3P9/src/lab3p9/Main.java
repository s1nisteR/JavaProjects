package lab3p9;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //given array
        int[] example = { 2, 3, 10, 15, 20, 25};


        ArrayList<Integer> answer = new java.util.ArrayList<Integer>();


        //Assumption - no sorting since not mentioned

        //even numbers go first
        for(int x : example)
        {
            if(x % 2 == 0)
            {
                answer.add(x);
            }
        }

        //odd goes second
        for(int x : example)
        {
            if(x % 2 != 0)
            {
                answer.add(x);
            }
        }

        //Now print it back
        for(int x : answer)
        {
            System.out.print(x + " ");
        }
    }

}
