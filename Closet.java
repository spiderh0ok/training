public class Closet {
    private Shirt[] shirts;

    public Closet(Shirt[] shirts){
        this.shirts = shirts;
    }

    public Shirt[] getShirts() {
        return shirts;
    }

    public Shirt[] getShirtsBySize(int size){
        int emptyslot = 0;
        for (int i = 0; i < shirts.length; i++) {
            if (shirts[i].getSize()==size) {
                emptyslot++;
            }
        }
        Shirt[] sizeMatch = new Shirt[emptyslot];
        emptyslot = 0;
        for (int i = 0; i < shirts.length; i++) {
            if (shirts[i].getSize()==size) {
                sizeMatch[emptyslot] = shirts[i];
                emptyslot++;
            }
        }
        return sizeMatch;
    }
    public void addShirtToArrayOfCloset(Shirt shirt){
        shirts = Util.addShirtToArray(shirt,shirts);
    }
}
