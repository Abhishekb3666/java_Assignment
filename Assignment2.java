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
