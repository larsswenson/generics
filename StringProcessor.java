public class StringProcessor implements Processor<String> {
    public String process(String input) {
        return new StringBuilder(input).reverse().toString();
    }
}


