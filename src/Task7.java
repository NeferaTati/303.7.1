public class Task7 {
    public static void main(String[]args){
        int[] array = {10,20,30,40,50};
        for(int i = 0;i < array.length;i++){
            if (i==2){
                continue;
            }
            System.out.println("Element at index"+i+":"+array[i]);
        }
    }
}