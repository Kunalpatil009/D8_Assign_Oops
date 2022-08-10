package EmpWagesOops;

public class EmpWagesUC1 {
        static void emp_Check(int  ISPRESENT) {
            System.out.println("Welcome To Employee Wages Computation Programme");
            int WAGESPERHOURS = 20;
            int FULLDAYHOURS = 8;
            double emp = Math.floor(Math.random() * 10) % 2;
            if (emp == 1) {
                System.out.println("Employee is Present");
               int TotalWages = WAGESPERHOURS * FULLDAYHOURS;
                System.out.println( "TotalWages :" + TotalWages);
            } else {
                System.out.println("Employee is Absent");
            }
        }

    public static void main(String[] Kunal) {
            emp_Check(1);
    }
}
