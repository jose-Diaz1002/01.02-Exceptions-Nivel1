public class EmptySaleException extends Exception{
    public EmptySaleException() {
        super("To make a purchase you must first add products");
    }
}
