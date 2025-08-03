public class Closet {
    private Shirt[] shirts;

    public Closet(Shirt[] shirts){
        this.shirts = shirts;
    }

    public Shirt[] getShirts() {
        return shirts;
    }

    public Shirt[] getShirtsBySize(int size){
        Shirt[] sizeMatch = {};
        int emptyslot = 0;
        for (int i = 0; i < shirts.length; i++) {
            if (shirts[i].getSize()==size) {
                sizeMatch[emptyslot] = shirts[i];
                emptyslot++;
            }
        }
        return sizeMatch;
    }
    public Shirt[] addShirtToArray(Shirt shirt,Shirt[] Shirts){
        addShirtToArray(shirt,shirts);
    }
}
