package EmpWagesOops;

public class EmpWagesUC1 {
        static void emp_Check() {
            System.out.println("Welcome To Employee Wages Computation Programme");
            int WAGESPERHOURS = 20;
            int FULLDAYHOURS = 8;
            int PARTTIMEHOURS = 4;
            double emp = Math.floor(Math.random() * 10) % 3;
            switch ((int) emp){
                case 1:
                    System.out.println("Employee is Present For Full Time");
               int TotalWages = WAGESPERHOURS * FULLDAYHOURS;
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
//            if (emp == 1) {
//                System.out.println("Employee is Present");
//               int TotalWages = WAGESPERHOURS * FULLDAYHOURS;
//                System.out.println( "TotalWages :" + TotalWages);
//            } else {
//                System.out.println("Employee is Absent");
//            }
    public static void main(String[] Kunal) {
            emp_Check();
    }
}
