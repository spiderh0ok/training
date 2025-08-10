public class Patrick extends Fish implements ProfessionalBasketBallPlayer{

    public Patrick(String name, int age, String favFood) {
        super("Patrick", 23, "crabPatty");
    }
    @Override
    public void goToWork() {
        walkByFoot();
    }

    @Override
    public void playBasketBall(){
        System.out.println(":)");
    }


}

