package com.company;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int size,i,c;
        do {
            System.out.print("Enter a size: ");
            size = scanner.nextInt();
            if (size <= 0) {
                System.out.println("size should be smaller than 0");
            }
        } while (size <=0 );
        int[] array = new int[size];
        for (i = 0; i < array.length; i++) {
            System.out.print("enter element " + (i + 1) + ":");
            array[i] = scanner.nextInt();
        }
        System.out.print("Array: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        System.out.print("\n which number do you want to delete? ");
        int number = scanner.nextInt();
//        System.out.println("\n which index do you want to delete? ");
//        int index = scanner.nextInt();
      for(c=i=0;i<size;i++) {
           if(array[i]!= number){
               array[c]=array[i];
               c++;
           }
       }
      size=c;

//           deleteElement(number,array);
        System.out.println("array.length: "+array.length);
        System.out.println("size: "+ size);
           System.out.println("new array: ");

           for (int j = 0; j < size; j++) {
               System.out.print(array[j] + "\t");
           }
    }
}

//    public static int[] deleteElement(int number, int[] array) {
//        int index=-1;
//        int i,c;
//
//        for (i = 0; i < array.length; i++) {
//            if(number== array[i]){
//                index=i;
//                System.out.println("index: "+index+" ");
//            }
//     }
//        if(index==-1){
//            System.out.println("cannot find "+number+"in array!");
//            System.exit(1);
//        }
//            for(c=i=0;i<array.length;i++){
//                if(array[i] != number) {
//                    array[c] = array[i];
//                    c++;
//                }
//            }
//            c=array.length;
//        return array;
//   }
//}
