// package Hashing;
// Hashing = pre-storing and fething when required ,
// hashmap ,key must be uique
//  hashset ,= no dublicate allow  , only sinle items, no K,V 
// hashtable , = key  must be unique , no null values 
//  linkedHash=

import java.util.*;;

public class Basics {
    // we need to ensure that the big number in array shoudl be in comes in the
    // index
    public void frequencycount() {

        int[] arr = { 2, 3, 4, 6, 6, 7, 3, 5, 9, 3, 8, 3, 10, 12 };
        // means the hashset will be the size of 13
        int[] hasharr = new int[14];

        for (int i = 0; i < arr.length; i++) {
            // make the simple element in hash array
            int number = arr[i];
            hasharr[number] = hasharr[number] + 1; // means ,index of hasharray is 5 , but the value is initially =0 but
            // after checking that 5 , the value becames 0 to 1 , means the 5 number
            // is counted as 1 , then next 1+++++++ e
        }
        System.out.println("frquency of number is " + hasharr[3]);
    }

    public static void main(String[] args) {
        Basics Basics = new Basics();
        Basics.frequencycount();

    }
}
