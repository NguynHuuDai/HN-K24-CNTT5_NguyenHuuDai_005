package Cau2;

public class Cau2_1 {
    public static void main(String[] args) {

        Number[] arr = new Number[100];

        int k = 2;
        arr = new Number[]{1, 2, 3, 4, 5, 6 };

        for (int i = 0; i <= k; i++) {
            Number temp = 0;
            temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;

        }
        for (int i = k; i < arr.length - k; i++) {
            Number temp = 0;
            int n = 0;
            temp = arr[i];
            arr[i] = arr[arr.length - n - 1];
            arr[arr.length - n - 1] = temp;
        }
        for (int i = 0; i < arr.length; i ++){
            System.out.println(arr[i]);
        }

    }



}

