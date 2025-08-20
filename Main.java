import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

    }

    public static void ex1 (List<String> list){
        String enteredText = "";
        enteredText = input.next();
        while (!Objects.equals(enteredText, "q")){

            list.add(enteredText);
            enteredText = input.next();
        }

    }
}
