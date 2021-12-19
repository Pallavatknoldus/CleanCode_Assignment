package com.knoldus;

public class FunctionsOfArray {
    static class SmallestandLargest {

        int smallest;
        int largest;
    }

    static SmallestandLargest findSmallestAndLargestNumber(int sequence[], int sizeofSequence) {
        SmallestandLargest numObject = new SmallestandLargest();
        int index;

        // This condition executes when size of array is 1.
        if (sizeofSequence == 1) {
            numObject.largest = sequence[0];
            numObject.smallest = sequence[0];
            return numObject;
        }

        // This condition executes when size of array is 2.
        if (sequence[0] > sequence[1]) {
            numObject.largest = sequence[0];
            numObject.smallest = sequence[1];
        } else {
            numObject.largest = sequence[1];
            numObject.smallest = sequence[0];
        }

        // This loop finds the Maximum and Minimum number when number of elements is more than 2.
        for (index = 2; index < sizeofSequence; index++) {
            if (sequence[index] > numObject.largest) {
                numObject.largest = sequence[index];
            } else if (sequence[index] < numObject.smallest) {
                numObject.smallest = sequence[index];
            }
        }

        return numObject;
    }

    public static void main(String args[]) {
        int sequence[] = {1000, 11, 445, 1, 330, 3000};
        int sizeofSequence = 6;
        SmallestandLargest numObject = findSmallestAndLargestNumber(sequence, sizeofSequence);
        System.out.printf("\nSmallest number in the array is %d", numObject.smallest);
        System.out.printf("\nLargest number in the array is %d", numObject.largest);
    }
}
