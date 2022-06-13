import java.util.Scanner;


/**
 * ucsayaSıralama
 */
public class ucsayaSıralama {

    public static void main(String[] args) {
        

        int a,b,c;
        Scanner input = new Scanner(System.in);
        System.out.println("A degrini yaz");
        a= input.nextInt();
        System.out.println("B degrini yaz");
        b= input.nextInt();
        System.out.println("C degrini yaz");
        c= input.nextInt();


        if (a>b && a>c){
            if ( b>c){
                System.out.println("buyuk kucuge   " + a +  "  "  + "  "  + b  +  "   "  + c  );
            }else{
                System.out.println("buyuk kucuge   " + a +  "  "  + "  "  + c  +  "   "  + b  );
            }

        }else if (b>a && b>c){
            if (a>c ){
                System.out.println("buyuk kucuge   " + b +  "  "  + "  "  + a  +  "   "  + c  );
            }else{
                System.out.println("buyuk kucuge   " + b +  "  "  + "  "  + c  +  "   "  + a  );

            }
        }else if ( c>a && c>b){
            if( a>b)
            {
                System.out.println("buyuk kucuge   " + c +  "  "  + "  "  + a  +  "   "  + b  );

            }else{
                System.out.println("buyuk kucuge   " + c +  "  "  + "  "  + b  +  "   "  + a  );

            }

        }





    }
}