import java.util.Scanner;

public class Program6{
    public static void main(){
        Scanner scan = new Scanner(System.in);
        final double pi = 3.1415926;
        System.out.println("enter radius");
        double radius = scan.nextDouble();
        double diameter = 2*radius;
        double area = pi*radius*radius;
        double circumference = pi*diameter;
        
       
        System.out.println("diameter is "+round(diameter));
        System.out.println("area is "+round(area));
        System.out.println("circumference is "+round(circumference));
        
       
       //System.out.println(round(radius));
        
    }
    public static double round(double value)
    {
        if((value*10000)%10<5){
            //if remainder <5, round down
            double d = (double)(((int)(value*1000)));
            return d/1000;
        }
        else
        {
            //remainder >=5, up
            double c = (double)(((int)(value*1000+1)));
            return c/1000;
        }
    }
}

//Paste console output below:
/*
enter radius
4.789
diameter is 9.578
area is 72.051
circumference is 30.09

*/
