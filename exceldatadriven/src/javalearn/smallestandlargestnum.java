package javalearn;

public class smallestandlargestnum {
    public static void main(String[] args){

        int number[] = {10,20,-50,-10,50,60,70,90};

        int largest = number[0];
        int smallest = number[0];

        for(int i=1;i<=number.length;i++) {
            if (number[i] > largest) {
                largest = number[i];
            } else if (number[i] < smallest) {
                smallest = number[i];
            }
        }

        }
    }

