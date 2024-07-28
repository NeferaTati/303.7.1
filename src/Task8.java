public class Task8 {
    public static void main(String[]args){
        String[] array = {"apple","banana","cherry","date","elderberry"};
        int middleIndex = array.length / 2;
        String temp = array[0];
        array[0] = array[middleIndex];
        array[middleIndex] = temp;
        for (String element : array){
            System.out.println(element);
        }

    }
}