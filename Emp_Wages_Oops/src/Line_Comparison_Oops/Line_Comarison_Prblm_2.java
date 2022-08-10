package Line_Comparison_Oops;

public class Line_Comarison_Prblm_2 {
    static double length1() {
        int x1 =7 ,x2= 8,y1 = 5,y2 = 3;
        double LENGTH1 = Math.sqrt(Math.pow(x2-x1,2)+ Math.pow(y2-y1,2));
        return LENGTH1;

    } static double length2() {
        int x3 =3 ,x4= 5,y3 = 6,y4 = 7;
        double LENGTH2 = Math.sqrt(Math.pow(x4-x3,2)+ Math.pow(y4-y3,2));
        return LENGTH2 ;

    }

    public static void main(String[] kunal) {
        System.out.println("Length of Line 1 : "+length1());
        System.out.println("Length of Line 2 : "+length2());
        if (length1() == length2() ) {
            System.out.println("Both Lines Are Equal In Length");
        } else {
            System.out.println("Both Lines Are Not Equal In Length");
        }
    }
}
