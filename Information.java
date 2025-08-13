public interface Information<T> {

    T GetLatestValue();
    void Update();
    T[] AsArray();

}
