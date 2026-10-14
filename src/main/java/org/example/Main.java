package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
LinearSearch ls = new LinearSearch();

int result = ls.linearSearchMethod();
if(result != -1){
    System.out.println("Element found at Index "+result);
}
else
    System.out.println("Element not Found");
}
}