public class SpongebobTheCooker extends Spongebob{
    public SpongebobTheCooker(String name, int age, String favFood) {
        super("bob", 12, "oil");
        super.playBasketBall();
    }

    @Override
    public void playBasketBall() {
        super.playBasketBall();
        System.out.println("I hate basketball!");
    }
}
