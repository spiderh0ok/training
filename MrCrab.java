public class MrCrab extends Fish {

    public MrCrab(String name, int age, String favFood) {
        super("MrCrab", 32, "money");
    }
    @Override
    public void goToWork() {
        takeTheTrain();
    }
}

