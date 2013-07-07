package jsf.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class SumaBean {
    
    private int num1;
    private int num2;
    private int suma;

    public SumaBean() {
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getSuma() {
        return suma;
    }
    
    public void sumar(){
        suma = num1 + num2;
    }
}
