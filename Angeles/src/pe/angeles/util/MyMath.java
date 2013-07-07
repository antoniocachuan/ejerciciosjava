/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.angeles.util;

/**
 *
 * @author Alumno-CT
 */
public class MyMath {
    
    private MyMath(){
    
    }
    
    public static long factorial(int n){
        long f=1;
        while(n>1){
            f *= n--;
        }
        return f;
    }
    
    public static int mcd(int n1, int n2){
        while(n1 != n2){
            if(n1 >n2){
                n1 -= n2;
            } else {
                n2 -= n1;
            }
        }
        return n1;
    }
    
    public static int mcm(int n1, int n2){
        int p;
        p=n1*n2/mcd(n1,n2);
        return p;
    }
    
    public static int Fibonacci (int n1){
        int inicial =0;
        int inicial2 =1;
        int fibo=0;
        for (int i = n1; i > 0;i--) {
            if (i==2){
                fibo= inicial+inicial2;
            }else{
                if(i==1){
                    fibo=inicial;
                }else{
                
                }
                
            } 
                       
        }
        return 1;
    }
    
    public static int NumeroPrimo (int n1){
        boolean bandera = false;
        int i=n1;
        while(!bandera){
            if(n1/(i-1)==0){
            
            }
        }
        return 1;
    }
}
