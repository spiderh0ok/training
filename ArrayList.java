
public class ArrayList<T> {
    public Object[] arrayList;
    public int size = 0;


    public ArrayList(int size){
          arrayList = new Object[size];
    }

    public void add (Object added){
        size++;
        if (size == arrayList.length){
            Object[] newArray = new Object[arrayList.length*2];
            for (int i = 0; i < arrayList.length; i++) {
                newArray[i] = arrayList[i];
            }
            newArray[arrayList.length] = added;
            arrayList = newArray;
        }
        arrayList[size] = added;
    }




    public Object get (int location){
        return arrayList[location];
    }

    public void set (int location,Object added){
        arrayList[location] = added;

    }


}
