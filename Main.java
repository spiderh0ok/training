public class Main {
    public static void main(String[] args) {
        try{
            int[] array = new int[2];
            array[3] = 5;
        }
        catch (RuntimeException runtime){
            System.out.println("runtime error");
        }




        Exception runTimeException = new RuntimeException("Run time exeption");
        Exception indexOutOfBoundsException = new IndexOutOfBoundsException("Out of index");


        System.out.println(indexOutOfBoundsException.getStackTrace());
        throw new RuntimeException();
    }

    public static void exeptions(){



    }

}
