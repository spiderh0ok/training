public class MrCrab extends Fish {

    public MrCrab(String name, int age, String favFood) {
        super(name,age, favFood);
    }
    @Override
    public void goToWork() {
        takeTheTrain();
    }
}

