package exeptions;

public class OutOfMachines extends Exception{
    public OutOfMachines(String message) {
        super(message);
    }

    public OutOfMachines(String message, Throwable cause) {
        super(message, cause);
    }
}
