import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character here: ");
        char x = sc.next().charAt(0);
        String vowels = "aAEeIiOoUu";
        if (vowels.indexOf(x) != -1)
            System.out.println("It is a vowel");
        else
            System.out.println("It is a consonant");
    }
}
