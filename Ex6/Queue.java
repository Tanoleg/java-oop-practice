public interface Queue {
    void put(Command c);
    Command take();
}