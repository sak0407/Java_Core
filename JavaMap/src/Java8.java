import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


class Employee {
    String empId;
    String firstName;
    String lastName;
    String gender;
    long age;
    String designation;
    long salary;
    String dept;
    String location;

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "BasicMapOperation.Employee{" +
                "empId='" + empId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                ", dept='" + dept + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    public static List<Employee> employeeGenarator(){

        List<Employee> employees=new ArrayList<>();

        Employee e1=new Employee();
        e1.setEmpId("ABC-123");
        e1.setFirstName("Joseph");
        e1.setLastName("Carvalo");
        e1.setGender("M");
        e1.setAge(34);
        e1.setDesignation("Lead");
        e1.setSalary(25000);
        e1.setDept("CAP");
        e1.setLocation("Bangalore");
        employees.add(e1);

        Employee e2=new Employee();
        e2.setEmpId("ABD-123");
        e2.setFirstName("kanalio");
        e2.setLastName("Kukuma");
        e2.setGender("F");
        e2.setAge(25);
        e2.setDesignation("SoftwareI");
        e2.setSalary(5000);
        e2.setDept("PCI");
        e2.setLocation("Hydrabad");
        employees.add(e2);


        Employee e3=new Employee();
        e3.setEmpId("ABF-124");
        e3.setFirstName("Morphy");
        e3.setLastName("Carvalo");
        e3.setGender("F");
        e3.setAge(31);
        e3.setDesignation("SotwareII");
        e3.setSalary(17000);
        e3.setDept("CAP");
        e3.setLocation("Bangalore");
        employees.add(e3);

        Employee e4=new Employee();
        e4.setEmpId("ABG-124");
        e4.setFirstName("Jordon");
        e4.setLastName("Karan");
        e4.setGender("M");
        e4.setAge(29);
        e4.setDesignation("SoftwareI");
        e4.setSalary(7000);
        e4.setDept("PCI");
        e4.setLocation("Hydrabad");
        employees.add(e4);

        Employee e5=new Employee();
        e5.setEmpId("ABH-125");
        e5.setFirstName("Sunil");
        e5.setLastName("Kumar");
        e5.setGender("M");
        e5.setAge(38);
        e5.setDesignation("Manager");
        e5.setSalary(35000);
        e5.setDept("PCI");
        e5.setLocation("Bangalore");
        employees.add(e5);

        Employee e6=new Employee();
        e6.setEmpId("ABI-125");
        e6.setFirstName("Nikhil");
        e6.setLastName("Kumar");
        e6.setGender("M");
        e6.setAge(37);
        e6.setDesignation("Manager");
        e6.setSalary(34000);
        e6.setDept("CAP");
        e6.setLocation("Hydrabad");
        employees.add(e6);

        Employee e7=new Employee();
        e7.setEmpId("ABK-125");
        e7.setFirstName("Nikita");
        e7.setLastName("Gupta");
        e7.setGender("F");
        e7.setAge(39);
        e7.setDesignation("Manager");
        e7.setSalary(40000);
        e7.setDept("CAP");
        e7.setLocation("Bangalore");
        employees.add(e7);

        Employee e8=new Employee();
        e8.setEmpId("ABN-123");
        e8.setFirstName("Ashok");
        e8.setLastName("Sharma");
        e8.setGender("M");
        e8.setAge(32);
        e8.setDesignation("Lead");
        e8.setSalary(29000);
        e8.setDept("PCI");
        e8.setLocation("Hydrabad");
        employees.add(e8);

        Employee e9=new Employee();
        e9.setEmpId("ABM-123");
        e9.setFirstName("Manoj");
        e9.setLastName("Gupta");
        e9.setGender("M");
        e9.setAge(30);
        e9.setDesignation("Lead");
        e9.setSalary(26000);
        e9.setDept("PCI");
        e9.setLocation("Bangalore");
        employees.add(e9);

        Employee e10=new Employee();
        e10.setEmpId("ABL-123");
        e10.setFirstName("Nilima");
        e10.setLastName("Kumar");
        e10.setGender("F");
        e10.setAge(29);
        e10.setDesignation("Lead");
        e10.setSalary(23000);
        e10.setDept("CAP");
        e10.setLocation("Bangalore");
        employees.add(e10);

        Employee e11=new Employee();
        e11.setEmpId("ACG-124");
        e11.setFirstName("Bela");
        e11.setLastName("Karan");
        e11.setGender("F");
        e11.setAge(23);
        e11.setDesignation("SoftwareI");
        e11.setSalary(8000);
        e11.setDept("CAP");
        e11.setLocation("Hydrabad");
        employees.add(e11);

        Employee e12=new Employee();
        e12.setEmpId("ADG-124");
        e12.setFirstName("Roopa");
        e12.setLastName("Sharma");
        e12.setGender("F");
        e12.setAge(24);
        e12.setDesignation("SoftwareI");
        e12.setSalary(10000);
        e12.setDept("CAP");
        e12.setLocation("Bangalore");
        employees.add(e12);

        Employee e13=new Employee();
        e13.setEmpId("ACF-124");
        e13.setFirstName("Diogo");
        e13.setLastName("Kukuma");
        e13.setGender("M");
        e13.setAge(30);
        e13.setDesignation("SotwareII");
        e13.setSalary(18000);
        e13.setDept("CAP");
        e13.setLocation("Hydrabad");
        employees.add(e13);

        Employee e14=new Employee();
        e14.setEmpId("ADF-124");
        e14.setFirstName("Deepak");
        e14.setLastName("Kumar");
        e14.setGender("M");
        e14.setAge(30);
        e14.setDesignation("SotwareII");
        e14.setSalary(20000);
        e14.setDept("PCI");
        e14.setLocation("Bangalore");
        employees.add(e14);

        Employee e15=new Employee();
        e15.setEmpId("AEF-124");
        e15.setFirstName("Ruby");
        e15.setLastName("Sharma");
        e15.setGender("F");
        e15.setAge(29);
        e15.setDesignation("SotwareII");
        e15.setSalary(14000);
        e15.setDept("PCI");
        e15.setLocation("Bangalore");
        employees.add(e15);

        Employee e16=new Employee();
        e16.setEmpId("ACK-125");
        e16.setFirstName("Akhilesh");
        e16.setLastName("Gupta");
        e16.setGender("M");
        e16.setAge(38);
        e16.setDesignation("Manager");
        e16.setSalary(43000);
        e16.setDept("PCI");
        e16.setLocation("Hydrabad");
        employees.add(e16);

        Employee e17=new Employee();
        e17.setEmpId("ABP-123");
        e17.setFirstName("Mukhesh>");
        e17.setLastName("Kumar");
        e17.setGender("M");
        e17.setAge(25);
        e17.setDesignation("SoftwareI");
        e17.setSalary(7000);
        e17.setDept("PCI");
        e17.setLocation("Bangalore");
        employees.add(e17);

        Employee e18=new Employee();
        e18.setEmpId("ACP-123");
        e18.setFirstName("Manish");
        e18.setLastName("Gupta");
        e18.setGender("M");
        e18.setAge(26);
        e18.setDesignation("SoftwareI");
        e18.setSalary(7000);
        e18.setDept("CAP");
        e18.setLocation("Bangalore");
        employees.add(e18);

        Employee e19=new Employee();
        e19.setEmpId("ACB-122");
        e19.setFirstName("Robin");
        e19.setLastName("Sharma");
        e19.setGender("M");
        e19.setAge(25);
        e19.setDesignation("SotwareII");
        e19.setSalary(20000);
        e19.setDept("CAP");
        e19.setLocation("Hydrabad");
        employees.add(e19);

        Employee e20=new Employee();
        e20.setEmpId("ACA-122");
        e20.setFirstName("Lisa");
        e20.setLastName("Carvalo");
        e20.setGender("F");
        e20.setAge(26);
        e20.setDesignation("SotwareII");
        e20.setSalary(20000);
        e20.setDept("PCI");
        e20.setLocation("Bangalore");
        employees.add(e20);


        return employees;
    }

}


public class Java8 {
    public static void main(String[] args) {


        // Group the words according to there size

        Map<Integer, List<String>> words=Stream.of("A","RAM","SHYAM","Kalyan","Nilami")
                .collect(Collectors.groupingBy(s ->s.length()));
        System.out.println(words);

        List<Employee> emp=Employee.employeeGenarator();

        //Get all emp by there name size
       // Map<Integer, List<String>> namesize=emp.stream().collect(Collectors.groupingBy(Employee::getLastName));

        //Get all employee name into list
        List<String> emplName=emp.stream().map(e->e.getFirstName())
                .collect(Collectors.toList());
        System.out.println(emplName);

        //Count of employee
        long count=emp.stream().count();
        System.out.println(count);

        //Sum of the total salary of employees
        long totalSal=emp.stream().collect(Collectors.summingLong(Employee::getSalary));
        System.out.println(totalSal);

        //Get the salary in dept wise
        Map<String,Long> deptSal=emp.stream().collect(
                Collectors.groupingBy(Employee::getDept,Collectors.summingLong(Employee::getSalary)));
        System.out.println(deptSal);

        //Get All the emplyee in CAP department
        List<String> capemployee=emp.stream().filter(e->e.getDept()=="CAP").map(e-> e.getFirstName()).collect(Collectors.toList());
        System.out.println(capemployee);

        //Get the employee with Highest salary
        Long highestSalary= emp.stream().max(Comparator.comparingLong(Employee::getSalary)).get().salary;
        System.out.println(highestSalary);

        //Get Average salary of all employee
        double avgSalary=emp.stream().mapToDouble(Employee::getSalary).average().orElse(0);
        System.out.println(avgSalary);

       /* // 9. Get the name of the youngest employee
        Optional<String> youngestEmployeeName = employees.stream()
                .min(Comparator.comparingInt(Employee::getAge))
                .map(Employee::getName);
        youngestEmployeeName.ifPresent(name -> System.out.println("Youngest Employee: " + name));

        */

        //Get the names of employee sorted by salary in descending order
        Map<String,Long> sortedNamesBySalary= emp.stream()
                .sorted(Comparator.comparingLong(Employee::getSalary).reversed())
                .collect(Collectors.toMap(Employee::getFirstName,Employee::getSalary,(o,n)->o, LinkedHashMap::new));
        System.out.println(sortedNamesBySalary);

        //Check if any employee is in the 'CAP' department
        boolean anyFinanceEmployee = emp.stream()
                .anyMatch(e -> "CAP".equals(e.getDept()));
        System.out.println("Any employee in Finance: " + anyFinanceEmployee);










    }
}
