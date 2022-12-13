package day42_Encapsulation;

class FadyException extends RuntimeException {

    public FadyException() {
        super("Time for a short break");
    }

    public FadyException(String message) {
        super(message);
    }
}//custom unchecked exception

class NoBreakException extends Exception {//custom checked exception

}

public class CustomExceptions {
    public static void main(String[] args) throws NoBreakException {
        //throw new FadyException("Time for a short break");
        try {
            throw new NoBreakException();
        }catch(NoBreakException e){
            e.printStackTrace();
        }
    }
}
