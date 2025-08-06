public class Bed {
    private double hight;
    private int pillowAmount;
    private String color;
    private int price;
    private static final int DEFAULT_PRICE = 100;
    public Bed(String color,int pillowAmount,double hight,int price){
        this.color = color;
        this.hight = hight;
        this.pillowAmount = pillowAmount;
        this.price = price;
    }

    public double getHight() {
        return hight;
    }

    public int getPillowAmount() {
        return pillowAmount;
    }

    public String getColor() {
        return color;
    }

    public Bed(double hight,String color){
        this(color,1,hight,DEFAULT_PRICE);
    }

    public void changeColor (String color){
        this.color = color;
    }
}
