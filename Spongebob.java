public class Spongebob extends Fish implements ProfessionalBasketBallPlayer{

    public Spongebob(String name, int age, String favFood) {
        super("Spongebob", 22, "crabPatty");
    }

    @Override
    public void goToWork() {
        takeTheCar();
    }

    @Override
    public void playBasketBall(){
        System.out.println(";)");
    }
}
