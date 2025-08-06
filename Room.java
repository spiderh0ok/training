public class Room {
    private Closet closet;
    private Bed bed;

    public Room(Bed bed, Closet closet){
        this.bed = bed;
        this.closet = closet;
    }
    public Room(Bed bed,Shirt[] shirts){
        this(bed,new Closet(shirts));
    }

    public Bed getBed() {
        return bed;
    }

    public Closet getCloset() {
        return closet;
    }

}
