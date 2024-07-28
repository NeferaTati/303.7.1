import java.util.Arrays;

public class Task9 {
    public static void main(String[]args){
        int[] array = {4,2,9,13,1,0};
        Arrays.sort(array);
        System.out.println("Array in ascending order:"+Arrays.toString(array));
        System.out.println("The smallest number is"+array[0]);
        System.out.println("The biggest number is "+array[array.length - 1]);
    }
}