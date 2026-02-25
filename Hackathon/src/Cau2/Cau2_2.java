package Cau2;

import java.util.Scanner;

public class Cau2_2 {
    public static void main(String[] args){


            Scanner sc = new Scanner(System.in);
            int[] arr = new int[100];

            int k = 2;
            arr = new int[]{1, 2, 3, 4, 5, 6};

            int maxNum = arr[0];
            for (int i = 0; i < arr.length; i++){
                if(arr[i] > maxNum){
                    maxNum = arr[i];
                }
            }
            for (int i = 0; i < arr.length - 1; i++){
                if(arr[i] + arr[i + 1] > maxNum){

                }
            }


    }







}
