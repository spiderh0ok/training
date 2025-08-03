public class Room {
    private Closet closet;
    private Bed bed;

    public Room(Bed bed, Closet closet){
        this.bed = bed;
        this.closet = closet;
    }

    public Bed getBed() {
        return bed;
    }

    public Closet getCloset() {
        return closet;
    }
    public Room(Bed bed,Shirt[] shirts){
        Closet closet = new Closet(shirts);
        this.bed = bed;
        this.closet = closet;
    }
}
