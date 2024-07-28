public class Task5 {
    public static void main(String[]args){
        int[] array = new int[5];
        for (int i = 0;i < array.length;i++){
            array[i] = i;
        }
        for (int i =0;i < array.length;i++){
            System.out.println("Element at indez"+i+":"+array[i]);
        }
    }
}