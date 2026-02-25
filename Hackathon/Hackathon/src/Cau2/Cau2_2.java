package Cau2;

public class Cau2_2 {

    public static void main(String[] args){

        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

        int cur = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (cur + arr[i] > arr[i]) {
                cur = cur + arr[i];
            } else {
                cur = arr[i];
            }

            if (cur > max) {
                max = cur;
            }
        }

        System.out.println(max);
    }
}