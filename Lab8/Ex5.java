package Lab8;

import java.util.Random;

public class Ex5 {
    static final Random rand = new Random();

    public void f() throws E2 {
        try {
            g();
        } catch (E1 e) {
            throw new E2();
        }
    }

    public void g() throws E1 {
        throw new E1();
    }

    public void h() throws E1, E2 {
        int r = rand.nextInt(10);
        if (r <= 5)
            throw new E1();
        else
            throw new E2();
    }
}
