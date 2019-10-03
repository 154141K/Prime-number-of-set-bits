
package primeNo;

import java.util.Scanner;

public class kth_no {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        while(T>0){
        int m = s.nextInt();
        int k = s.nextInt();
        int n = s.nextInt();
        kth_no kno = new kth_no();
        kno.find_KthNo(m,k,n);
     
        T--;
        }
    }
    //m-given decimal no
    //k- find kth character
    //n-iteration
    public void find_KthNo(int m, int k, int n)
    {
      
         String mBinary1="";
         while (m > 0) {
                int a = m % 2;
                    
                mBinary1=a+mBinary1;
                m = m / 2;
            }
         System.out.println(mBinary1);
      
         String p=iteration(mBinary1,n);
         System.out.println(p);
         System.out.println(p.charAt(k));
    }
    
    public String iteration(String mBinary1, int n){
       
        String nmBinary="";   //Binary no after iteration
        for(int i=0;i<n;i++){
            int x=mBinary1.length();
            while(x>0){
                if(mBinary1.charAt(x-1)=='0'){
                    
                    nmBinary=mBinary1.substring(0,x)+"1"+mBinary1.substring(x);
                }
                else 
                    nmBinary=mBinary1.substring(0,x)+"0"+mBinary1.substring(x);
                mBinary1=nmBinary;
                x--;
            }
        
        }
    
    return mBinary1;
    }
    
}
