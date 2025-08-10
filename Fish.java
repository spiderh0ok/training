public class Fish {

    public String name;
    public int age;
    public String favFood;


    public Fish (String name,int age,String favFood){
        this.name = name;
        this.age = age;
        this.favFood = favFood;


    }

    public void takeTheCar(){
        System.out.println("I took the car");
    }

    public void takeTheTrain(){
        System.out.println("I took the train");
    }

    public void walkByFoot(){
        System.out.println("I walked");
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getFavFood() {
        return favFood;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFavFood(String favFood) {
        this.favFood = favFood;
    }
}
