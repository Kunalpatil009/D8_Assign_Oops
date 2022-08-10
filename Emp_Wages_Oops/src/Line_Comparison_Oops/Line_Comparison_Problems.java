package Line_Comparison_Oops;

public class Line_Comparison_Problems {
 static class Co_ordinates{
int x1 = 2, x2 = 6;
int  y1 = 7,  y2 = 4;

double LENGTH = Math.sqrt(Math.pow(x2-x1,2)+ Math.pow(y2-y1,2));
}
    public static void main(String[] kunal) {
        System.out.println("Welcome To Line Comparison Computation Programme ");
    Co_ordinates co = new Co_ordinates();
        System.out.println("Length of the line is : "+ co.LENGTH);
    }
}
