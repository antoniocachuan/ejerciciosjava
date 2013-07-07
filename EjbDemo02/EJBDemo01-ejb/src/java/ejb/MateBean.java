package ejb;

import javax.ejb.Stateless;

@Stateless
public class MateBean implements MateBeanRemote {

    @Override
    public long factorial(int n) {
        long f = 1;
        while (n > 1) {
            f *= n--;
        }
        return f;
    }
}
