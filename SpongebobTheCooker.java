public class SpongebobTheCooker extends Spongebob{
    public SpongebobTheCooker(String name, int age, String favFood) {
        super("bob", 12, "oil");
    }

    @Override
    public void playBasketBall() {
        super.playBasketBall();
        System.out.println("I hate basketball!");
    }
}
