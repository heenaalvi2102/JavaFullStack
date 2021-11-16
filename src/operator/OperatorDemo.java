package operator;

/**
 * unary operator=> a++,++a,a--,--a
 * arithmetic operator=> +,-,*,/,%
 * shift=> << >>
 * relational=> < >
 * assignment=>
 *
 */
public class OperatorDemo {
    public static void main(String[] args) {
        int i= 10;
       System.out.println(i++);//10 i = i+1
        System.out.println(i); //11
        System.out.println(++i);//12 i+1 = i

        System.out.println(i--); //12 i=i-1
        System.out.println(i); //11
        System.out.println(--i);//10

        int j=3;
        int k=10;
        System.out.println(i/j);//3
        System.out.println(i%j);//1

        System.out.println(i<<2);//i*2^2 = 10*4=40
        System.out.println(k>>2);//k/2^2=10/4=2

        System.out.println(k & j);//2
        System.out.println(k|j);//11

        if(j==4 && k==10){
            System.out.println("If Executed");
        }else{
            System.out.println("Else");
        }
    }
}
