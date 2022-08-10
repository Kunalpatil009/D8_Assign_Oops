package EmpWagesOops;

public class EmpWagesUC1 {
    static int WAGESPERHOURS = 20;
    static int FULLDAYHOURS = 8;
    static int PARTTIMEHOURS = 4;
    static int TotalWages = 0;
    static void emp_Check() {
        double emp = Math.floor(Math.random() * 10) % 3;
            switch ((int) emp){
                case 1:
                    System.out.println("Employee is Present For Full Time");
                TotalWages = WAGESPERHOURS * FULLDAYHOURS;
                System.out.println( "TotalWages :" + TotalWages);
                break;
                case 2:
                    System.out.println("Employee is Present For Part Time");
                TotalWages = WAGESPERHOURS * PARTTIMEHOURS;
                System.out.println( "TotalWages :" + TotalWages);
                break;
                default:
                    System.out.println("Employee is Absent");
                }
            }
            static int WAGES;
             static int monthlyWages(int workingDaysPerMonth) {
            int day = 1;
                while ( day <= workingDaysPerMonth) {
                    System.out.println("day :" + day);
                    emp_Check();
                    WAGES += TotalWages;
                    day++;

                }
                 System.out.println("Total Monthly Wages :" +WAGES);
                return workingDaysPerMonth;
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
            monthlyWages(20) ;

    }
}
