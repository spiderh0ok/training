public class Patrick extends Fish {

    public Patrick(String name, int age, String favFood) {
        super("Patrick", 23, "crabPatty");
    }
    @Override
    public void goToWork() {
        walkByFoot();
    }
}

