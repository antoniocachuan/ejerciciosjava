package controller;

import ejb.MateBeanRemote;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class MateController {
    
    @EJB
    private MateBeanRemote mateBean;

    
    private int num;
    private long fact;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public long getFact() {
        return fact;
    }
    
    public void procesar(){
        fact = mateBean.factorial(num);
    }
}
