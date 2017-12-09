package main.java.algorithms;

public class K_Smallest {
    public static void main(String[] args) {
        k_smallest(new int[]{1, 9, 8, 3, 2, 4, 7}, 3);
    }


    /**
     *
     * @param arr is a given int array
     * @param k defines how many smallest number
     * example: given array is {1, 9, 8, 3, 2, 4, 7}
     *          k is 2
     *          prints 1 , 2
     */
    public static void k_smallest(int[] arr, int k) {
        int[] heap = new int[k];

        for (int i = 0; i < k; i++) {
            heap[i] = arr[i];
        }


        for (int j = k; j < arr.length; j++) {
            int[] result = getMax(heap);
            if (arr[j] < result[0]) {
                heap[result[1]] = arr[j];
            }
        }

        for (int m = 0; m < heap.length; m++) {
            System.out.println(heap[m]);
        }

    }

    /*
       result[0] is value of Biggest element in the given array
       result[1] is index of the biggest element
    */
    public static int[] getMax(int[] heap) {
        int max = 0;
        int[] result = new int[2];
        for (int i = 0; i < heap.length; i++) {
            if (heap[i] > max) {
                max = heap[i];
                result[0] = max;
                result[1] = i;
            }
        }

        return result;
    }
}
