package Package18Generic;

public class GenericMethod {

    public <M> void method(M m) {
        System.out.println(m);
    }

    public <S> void methodStatic(S s) {
        System.out.println(s);
    }
}
