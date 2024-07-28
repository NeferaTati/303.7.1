import java.util.Arrays;

public class Task3 {
    public static void main(String[]args){
        String[] colors = {"red","green","blue","yellow"};
        String[] clonedColers = colors.clone();
        System.out.println("Cloned array"+ Arrays.toString(clonedColers));
    }
}