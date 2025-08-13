public class InformationInt implements Information<Integer> {
    public ArrayList<Integer> information;

    public InformationInt(){

    }

    @Override
    public Integer getLatestValue() {
        return information.get(information.size);
    }

    @Override
    public void update(Integer integerInfo) {
        information.add(integerInfo);
    }

    @Override
    public Integer[] asArray() {

        return information.asArray();
    }
}
