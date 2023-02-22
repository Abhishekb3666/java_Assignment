//Name: Abhishek B
//PRN: 21070126007
//Batch: AIML-A1
/*
This is a Java code that performs several operations.
It has 4 classes: arraytoArrayList, even_odd, ArrayListtoarray, Assignment2.

The Assignment_2 class is the main class that contains the main method. It creates objects of other
classes and calls their methods. The even_odd class takes n numbers from the user and separates
them into two arrays, one for even numbers and one for odd numbers and displays the even and odd numbers.

The arraytoArrayList and ArrayListtoarray classes converts an array to an ArrayList and ArrayList to an array
Respectively.
*/
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assignment2{
    void arraytoArrayList() {
        String names[] = {"Aman", "Anjan", "Shreya", "Siri"};
        List<String> list = Arrays.asList(names);
        ArrayList al = new ArrayList(list);
        System.out.println(al);
    }
    void even_odd(){
            Scanner sc = new Scanner(System.in);
            int size;
            System.out.print("Enter size of arrays: ");
            size = sc.nextInt();
            int[] even = new int[size];
            int[] odd = new int[size];
            int evenIndex = 0;
            int oddIndex = 0;
            for (int i = 0; i < size; i++) {
                System.out.print("Enter number: ");
                int num = sc.nextInt();
                if (num % 2 == 0) {
                    even[evenIndex++] = num;
                } else {
                    odd[oddIndex++] = num;
                }
            }
            System.out.print("Even numbers: ");
            for (int i = 0; i < evenIndex; i++) {
                System.out.print(even[i] + " ");
            }
            System.out.println();
            System.out.print("Odd numbers: ");
            for (int i = 0; i < oddIndex; i++) {
                System.out.print(odd[i] + " ");
            }
            System.out.println();
    }
    void ArrayListtoarray() {
        List<String> al = new ArrayList<String>();
        al.add("Aman");
        al.add("Anjan");
        al.add("Shreya");
        al.add("Siri");


        String[] arr = new String[al.size()];

        for (int i = 0; i < al.size(); i++)
            arr[i] = al.get(i);

        for (String x : arr)
            System.out.print(x + "\n");
    }
    public static void main(String[] args) {
       Assignment2 obj = new Assignment2();
        System.out.println("Even or odd");
        obj.even_odd();
        System.out.println("\nArray to Array List:\n");
        obj.arraytoArrayList();
        System.out.println("\nArray List to Array:\n");
        obj.ArrayListtoarray();

    }
}
