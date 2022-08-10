package EmpWagesOops;

public class EmpWagesUC1 {
    static int WAGESPERHOURS = 20;
    static int FULLDAYHOURS = 8;
    static int PARTTIMEHOURS = 4;
    static int TOTALWAGES = 0;

    static int WORKINGHOURS ;
    static void emp_Check() {
        double emp = Math.floor(Math.random() * 10) % 3;
            switch ((int) emp){
                case 1:
                    System.out.println("Employee is Present For Full Time");
                    TOTALWAGES = WAGESPERHOURS * FULLDAYHOURS;
                System.out.println( "TotalWages :" + TOTALWAGES);
                break;
                case 2:
                    System.out.println("Employee is Present For Part Time");
                    TOTALWAGES = WAGESPERHOURS * PARTTIMEHOURS;
                System.out.println( "TotalWages :" + TOTALWAGES);
                break;
                default:
                    System.out.println("Employee is Absent");
                }
            }
            static int WAGES;
            static  int TOTALWORKHOURS;
             static void monthlyWages(int MAXWORKINGDAYS ,int MAXWORKINGHOURS ) {
            int day = 1;
                while (  day <= MAXWORKINGDAYS && WORKINGHOURS <= MAXWORKINGHOURS) {
                    System.out.println("day :" + day);
                    emp_Check();
                    WAGES += TOTALWAGES;
                    TOTALWORKHOURS += WORKINGHOURS  ;
                    day++;

                }
                 System.out.println("Total Monthly Wages :" +WAGES);
                 System.out.println("Total Monthly Hours :" +TOTALWORKHOURS);

            }
//            if (emp == 1) {
//                System.out.println("Employee is Present");
//               int TotalWages = WAGESPERHOURS * FULLDAYHOURS;
//                System.out.println( "TotalWages :" + TotalWages);
//            } else {
//                System.out.println("Employee is Absent");
//            }
    public static void main(String[] Kunal) {
        System.out.println("Welcome To Employee Wages Computation Programme");
//            emp_Check();
            monthlyWages(20, 100) ;

    }
}
