public interface Information<T> {

    T getLatestValue();
    void update(T infromation);


    T[] asArray();

}
