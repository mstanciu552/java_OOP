package Lab8;

public class Ex2Exception extends Exception {
    private String s;

    public Ex2Exception(String s) {
        this.s = s;
    }

    @Override
    public String getMessage() {
        return this.s;
    }
}
