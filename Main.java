import java.util.Scanner;

public class Main {
    public static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {

        try{
            int[] array = new int[2];
            array[3] = 5;
        }
        catch (RuntimeException runtime){
            System.out.println("runtime error");
        }
        int input;

        for (int i = 0; i < 5; i--) {
            input = reader.nextInt();
            try {
                if (input == 45) {
                    throw new IllegalArgumentException();

                }
            }
            catch (IllegalArgumentException illegalArgumentException){
                System.out.println("error");
            }
            if (input==100){
                throw new RuntimeException();
            }
        }






        Exception runTimeException = new RuntimeException("Run time exeption");
        Exception indexOutOfBoundsException = new IndexOutOfBoundsException("Out of index");


        indexOutOfBoundsException.printStackTrace();
        throw new RuntimeException();
    }

    public static void exeptions(){



    }

}
