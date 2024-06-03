package pckg_exc_1;

public class MyException extends Exception {

    private String msg;

    public MyException(String msg) {
        this.msg = msg;
    }

    public void provideMyExceptionInfo(){
        System.out.println(msg);
    }
}
