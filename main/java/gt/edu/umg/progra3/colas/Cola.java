package gt.edu.umg.progra3.colas;

public interface Cola {

    void enqueue(String item);

    String deque();

    String peek();

    int size();

    boolean isEmpty();
}
