public class Main {
    public static void main(String[] args) {
        FuncForPrint intReturner = new FuncForPrint() {
            @Override
            public int power(int num) {
                return num*num;
            }
        };

        PrintLambda lambdaPrint = new PrintLambda() {
            @Override
            public void printLambda(int num, FuncForPrint func) {
                System.out.println(func.power(num));
            }
        };

        FuncSmallNumPower power = new FuncSmallNumPower() {
            @Override
            public int FuncSmallNumToPower(int num1, int num2) {
                if (num1 > num2) {
                    return (int) Math.pow(num1, num2);
                }
                return (int) Math.pow(num2, num1);
            }

        };

        CharInString charIn = new CharInString() {
            @Override
            public boolean charInString(String word, char sign) {
                for (int i = 0; i < word.length(); i++) {
                    if (word.toCharArray()[i] == sign) {
                        return true;
                    }
                }
                return false;
            }
        };


    }
}
