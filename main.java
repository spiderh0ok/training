public class main {
    public static void main(String[] args) {
        Shirt sh1 = new Shirt(5,"yellow");
        Shirt sh2 = new Shirt(5,"yellow");
        Shirt sh3 = new Shirt(3,"yellow");
        Shirt sh4 = new Shirt(7,"red");
        Shirt[] clos = {sh1,sh2,sh3};
        Closet closet = new Closet(clos);

        System.out.println(closet.getShirts().length);
    }
}
