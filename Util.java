public class Util {
    protected static Shirt[] addShirtToArray(Shirt shirt,Shirt[] shirtArray){
        Shirt[] newShirts = new Shirt[shirtArray.length+1];
        for (int i = 0; i < shirtArray.length; i++) {
            newShirts[i] = shirtArray[i];
        }
        newShirts[shirtArray.length+1] = shirt;
        return newShirts;
    }
}
