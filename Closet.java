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
    public void addShirtToArray(Shirt shirt){
        Shirt[] newShirts = new Shirt[shirts.length+1];
        for (int i = 0; i < shirts.length; i++) {
            newShirts[i] = shirts[i];
        }
        newShirts[shirts.length] = shirt;
        shirts = newShirts;
    }
}
