package myexpetions;

public class IncorrectArgumentExeption extends RuntimeException {
    public IncorrectArgumentExeption (String message) {
        super(message);
    }
}
