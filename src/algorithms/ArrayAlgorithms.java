package algorithms;

public class ArrayAlgorithms {
    public static void main(String[] args) {

    }

    // Finds the minimum value in an array
    public static int findMin(int[] array) {
        int minValue = array[0];
        for (int num:array){
            if(num <= minValue){
                minValue = num;
            }
        }
        return minValue;
    }

    // Finds the maximum value in an array
    public static int findMax(int[] array) {
        int maxValue = array[0];
        for (int num:array){
            if(num >= maxValue){
                maxValue = num;
            }
        }
        return maxValue;
    }

    // Finds the average value of elements in an array
    public static double findAverage(int[] array) {
        double total = 0.0;
        for (int num:array){
            total +=array[num];
        }
        return total/array.length;
    }

    // Shifts the array to the left by one position
    public static int[] shiftLeft(int[] array) {
        int[] array2 = new int[array.length];
        for (int num:array){
            if (num != 0) {
                array2[num] = array[num+1];
            } else {
                array2[array.length-1] = array[num];
            }
        }
        return array2;
    }

    // Shifts the array to the right by one position
    public static int[] shiftRight(int[] array) {
        int[] array2 = new int[array.length];
        for (int num : array) {
            if (num != array.length - 1) {
                array2[num] = array[num - 1];
            } else {
                array2[0] = array[array.length - 1];
            }
        }
        return array2;
    }

    // Reverses the elements in the array
    public static int[] reverseArray(int[] array) {
        int[] array2 = new int[array.length];
        for (int num:array){
            array2[num] = array[array.length - (num+1)];
        }
        return array2;
    }
}
