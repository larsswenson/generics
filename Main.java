public class Main {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        intBox.set(123);
        Box.printAnyBox(intBox);

        Box<String> strBox = new Box<>();
        strBox.set("Hello Generic World!");
        Box.printAnyBox(strBox);

        Box<Double> doubleBox = new Box<>();
        doubleBox.set(45.67);
        Box.printAnyBox(doubleBox);

        NumberBox<Integer> intNumberBox = new NumberBox<>();
        intNumberBox.set(789);
        Box.printAnyBox(intNumberBox);

        NumberBox<Double> doubleNumberBox = new NumberBox<>();
        doubleNumberBox.set(123.45);
        Box.printAnyBox(doubleNumberBox);

        // NumberBox<String> strNumberBox = new NumberBox<>(); * Compile-time error *

        StringProcessor processor = new StringProcessor();
        String original = "Generics!";
        String reversed = processor.process(original);
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);

        Library<String> bookLibrary = new Library<>();
        bookLibrary.addItem("Journey to the End of the Night");
        bookLibrary.addItem("Darkness at Noon");
        bookLibrary.addItem("Crime and Punishment");
        System.out.println("Finding 'Journey to the End of the Night': " + bookLibrary.findItemByName("Journey to the End of the Night"));
        bookLibrary.removeItem("Journey to the End of the Night");
        System.out.println("Finding 'Journey to the End of the Night' after removal: " + bookLibrary.findItemByName("Journey to the End of the Night"));

        Library<Integer> idLibrary = new Library<>();
        idLibrary.addItem(101);
        idLibrary.addItem(102);
        idLibrary.addItem(103);
        System.out.println("Finding '101': " + idLibrary.findItemByName("101"));
        idLibrary.removeItem(101);
        System.out.println("Finding '101' after removal: " + idLibrary.findItemByName("101"));
    }
}


