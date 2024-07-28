import java.util.Scanner;

public class Task11 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many favorite things do you have?");
        int count = scanner.nextInt();
        scanner.nextInt();
        String[] favoriteThings = new String[count];
        for (int i = 0; i < count; i++){
            System.out.println("Enter favorite thing" + (i+1) + ":");
            favoriteThings[i] = scanner.nextLine();
            System.out.println("Your favorite things are:");
            for (String thing : favoriteThings){
                System.out.println(thing);
            }
            scanner.close();
        }

    }
}