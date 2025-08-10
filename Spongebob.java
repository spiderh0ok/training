public class Spongebob extends Fish{

    public Spongebob(String name, int age, String favFood) {
        super("Spongebob", 22, "crabPatty");
    }

    @Override
    public void goToWork() {
        takeTheCar();
    }
}
