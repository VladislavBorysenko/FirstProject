import java.util.Arrays;

public class operators {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
//int a[]=new int[10];
        int[]a ={8,2,7,-2,5,6,3,1,9,-3,-6,-8,-1,-4,-5,-7,-9};
        System.out.print("Массив целых чисел:\n");
        for (int i=0;i<a.length;i++)
            System.out.print(a[i] + " | ");
        {
            System.out.print("\nОтрицательные числа:");

        }
        {
            System.out.print("\nПоложительные числа числа:");
        }
        {
            Arrays.sort(a);
            System.out.print("\nСортировка по возрастанию:\n");
            for (int i=0;i<a.length;i++)
                System.out.print(a[i] + " | ");
        }
    }
}