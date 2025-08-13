public class FuncSmallNumPower implements SmallNumToPower {

    @Override
    public int smallNumToPower(int num1, int num2) {
        if (num1>num2){
            return (int) Math.pow(num1,num2);
        }
        return (int) Math.pow(num2,num1);
    }
}
