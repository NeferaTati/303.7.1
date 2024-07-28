public class Task4 {
    public static void main(String[]args){
        int[] numbers = {1,2,3,4,5};
        System.out.println("Using for loop:");
        for (int i = 0; i < numbers.length;i++){
            System.out.println("Using enhanced for loop:");
            for (int number : numbers){
                System.out.println(number);
            }
        }
    }
}