public class Box<T> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return this.value;
    }

    public void printBox() {
        System.out.println("Box value: " + value);
    }

    // Wildcards
    public static void printAnyBox(Box<?> box) {
        System.out.println("Box value: " + box.get());
    }
}





