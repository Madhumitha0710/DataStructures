package org.example;

public class LinearSearch {
 int arr[]={21,45,67,87,10};
 int target = 45;

   int linearSearchMethod() {
       for (int i = 0; i < arr.length; i++) {
           if (arr[i] == target)
               return i;
       }
       return -1;

   }
}
