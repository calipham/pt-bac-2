import java.util.Scanner;
public class Exer1
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner( System.in);
        double a, b, c, x, x1, x2, formula, delta;
        System.out.print(" Enter a= ");
        a = sc.nextDouble();
        System.out.print("Enter b= ");
        b = sc.nextDouble();
        System.out.print(" Enter c= ");
        c = sc.nextDouble();
        System.out.println("(a * x*x) + (b * x) + c) = 0 , a !=0");
        delta = b*b - 4*a*c;
        if ( delta < 0) {
            System.out.println( " Phuong trinh vo nghiem " );
        }
            else if ( delta == 0 ){
                System.out.println( " Phuong trinh co nghiem kep " );
                x1 = x2 = -b / (2*a);
                System.out.println( " x1 = x2 = -b / (2 *a) = " + String.format("%.2f",x1) );
            }
            else if ( delta > 0 ){
                System.out.println( " Phuong trinh co 2 nghiem phan biet ");
                x1 = (-b + Math.sqrt(delta))/(2*a);
                System.out.println(" x1 = " + String.format("%.2f",x1));
                x2 = (-b - Math.sqrt(delta))/(2*a);
                System.out.println(" x2 = " + String.format("%.2f",x2));
            }
        }
    }
                
                
        
        
