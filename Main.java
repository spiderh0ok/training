import javax.naming.AuthenticationException;
import java.io.FileNotFoundException;
import java.net.BindException;
import java.util.Scanner;

public class Main {
    public static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        try {
            Exception runTimeException = new RuntimeException("Run time exeption");
            Exception indexOutOfBoundsException = new IndexOutOfBoundsException("Out of index");


            indexOutOfBoundsException.printStackTrace();

            throw runTimeException;
        }
        catch (RuntimeException runtimeException) {
        }


        try{
            int[] array = new int[2];
            array[3] = 5;
        }
        catch (RuntimeException runtime){
            System.out.println("runtime error");
        }
        int input;

        while (true) {
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







    }

    public static void errors(int num) throws FileNotFoundException, BindException, AuthenticationException {
        if (num==1)
            throw new FileNotFoundException("file error");
        if (num==2)
            throw new BindException("bind error");
        if(num==3)
            throw new AuthenticationException("authection error");

    }

    public static void ex5(int num) {
        try {
            errors(num);
        }
        catch (FileNotFoundException fileError){
            System.out.println(1);
        }
        catch (BindException bindException){
            System.out.println(2);
        }
        catch (AuthenticationException authenticationException){
            System.out.println(3);
        }

    }
    public static void ex6(int num) {
        try {
            errors(num);
        }
        catch (FileNotFoundException fileError){
            System.out.println(1);
        }
        catch (BindException bindException){
            System.out.println(2);
        }
        catch (AuthenticationException authenticationException){
            System.out.println(3);
        }
        finally {
            System.out.println("here");
            throw new RuntimeException("error");
        }

    }
//ex7
//להאחריך את השם

//ex8

//arr.length-1
}
