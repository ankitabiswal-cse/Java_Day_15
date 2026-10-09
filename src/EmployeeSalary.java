public class EmployeeSalary {
    String role = "Java FullStack Developer";
    int salary = 40000;

    void display(){
        System.out.println("Role :"+role);
        System.out.println("Salary :"+salary);
    }
    public static void main(String[] args){
        EmployeeSalary e = new EmployeeSalary();

        e.display();
    }
}
