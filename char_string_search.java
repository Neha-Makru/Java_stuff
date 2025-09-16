import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = "Neha";
        System.out.print("Enter the character here: ");
        char target = sc.next().trim().charAt(0);
        boolean res = search(word, target);
        System.out.println(res);
    }
    static boolean search(String w, char c){
        if (w.isEmpty()) System.out.println("The String is empty. ");

        for (int i =0; i< w.length(); i++){
            if (c == w.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
