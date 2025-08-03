public class Bed {
    private double hight;
    private int PillowAmount;
    private String color;

    public Bed(String color,int pillowAmount,double hight){
        this.color = color;
        this.hight = hight;
        this.PillowAmount = pillowAmount;
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
        this(color,1,hight);
    }
}
