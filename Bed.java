public class Bed {
    private double hight;
    private int PillowAmount;
    private String color;
    private int price;
    public Bed(String color,int pillowAmount,double hight,int price){
        this.color = color;
        this.hight = hight;
        this.PillowAmount = pillowAmount;
        this.price = price;
    }

    public double getHight() {
        return hight;
    }

    public int getPillowAmount() {
        return PillowAmount;
    }

    public String getColor() {
        return color;
    }

    public Bed(double hight,String color){
        this(color,1,hight,100);
    }

    public void changeColor (String color){
        this.color = color;
    }
}
