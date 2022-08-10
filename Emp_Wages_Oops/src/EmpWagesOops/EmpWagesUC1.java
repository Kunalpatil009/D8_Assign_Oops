package EmpWagesOops;



public class EmpWagesUC1 {
    static void emp_Check(){
        System.out.println("Welcome To Employee Wages Computation Programme");
    double emp = Math.floor(Math.random()*10) % 2;
    if(emp == 1){
        System.out.println("Employee is Present");
    }
    else {
        System.out.println("Employee is Absent");
    }
    }
    public static void main(String[] Kunal) {
     emp_Check();
    }
}
