import java.util.Scanner;

class EMPLOYEE {
  String Ename;
  int Eid;
  double Basic;
  double DA;
  double Gross_Sal;
  double Net_Sal;

  EMPLOYEE() {
    Ename = "Unknown";
    Eid = 0;
    Basic = 0.0;
    compute_net_sal();
  }

  EMPLOYEE(String ename, int eid, double basic) {
    Ename = ename;
    Eid = eid;
    Basic = basic;
    compute_net_sal();
  }

  void read() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Employee ID: ");
    Eid = sc.nextInt();
    sc.nextLine();
    System.out.print("Enter Employee Name: ");
    Ename = sc.nextLine();
    System.out.print("Enter Basic Salary: ");
    Basic = sc.nextDouble();
    compute_net_sal();
  }

  void compute_net_sal() {
    DA = 0.52 * Basic;
    Gross_Sal = Basic + DA;
    double IT = 0.30 * Gross_Sal;
    Net_Sal = Gross_Sal - IT;
  }

  void formatEmployeeName() {
    Ename = Ename.toLowerCase();
    char[] nameChars = Ename.toCharArray();
    boolean capitalizeNext = true;
    for (int i = 0; i < nameChars.length; i++) {
      if (nameChars[i] == ' ') {
        capitalizeNext = true;
      } else if (capitalizeNext) {
          nameChars[i] = Character.toUpperCase(nameChars[i]);
          capitalizeNext = false;
      }
    }
    Ename = new String(nameChars);
  }

  String generateEmail() {
    int spaceIndex = Ename.indexOf(' ');
    if (spaceIndex == -1) {
       return "Invalid Name";
    }
    char firstInitial = Ename.charAt(0);
    String lastName = Ename.substring(spaceIndex + 1);
    String email = Character.toLowerCase(firstInitial) + lastName.toLowerCase() + "@example.com";
    return email;
  }

  void display() {
    formatEmployeeName();
    System.out.println("Employee ID: " + Eid);
    System.out.println("Employee Name: " + Ename);
    System.out.println("Basic Salary: " + Basic);
    System.out.println("Dearness Allowance (DA): " + DA);
    System.out.println("Gross Salary: " + Gross_Sal);
    System.out.println("Net Salary: " + Net_Sal);
    System.out.println("Email: " + generateEmail());
  }

  void calculateSalary() {
    compute_net_sal();
  }
}

class PartTimeEmp extends EMPLOYEE {
  int hoursWorked;
  static final double hourlyRate = 15.50;

  PartTimeEmp() {
    super();
    hoursWorked = 0;
  }

  PartTimeEmp(String ename, int eid, int hoursWorked) {
    super(ename, eid, 0); 
    this.hoursWorked = hoursWorked;
    compute_net_sal();
  }

  @Override
  void compute_net_sal() {
    Net_Sal = hoursWorked * hourlyRate;
  }

  @Override
  void calculateSalary() {
    compute_net_sal();
  }

  @Override
  void display() {
    formatEmployeeName();
    System.out.println("Employee ID: " + Eid);
    System.out.println("Employee Name: " + Ename);
    System.out.println("Hours Worked: " + hoursWorked);
    System.out.println("Hourly Rate: " + hourlyRate);
    System.out.println("Net Salary: " + Net_Sal);
    System.out.println("Email: " + generateEmail());
  }
}

class FullTimeEmp extends EMPLOYEE {
  double bonus;
  double deductions;

  FullTimeEmp() {
    super();
    bonus = 0.0;
    deductions = 0.0;
  }

  FullTimeEmp(String ename, int eid, double basic, double bonus, double deductions) {
    super(ename, eid, basic);
    this.bonus = bonus;
    this.deductions = deductions;
    compute_net_sal();
  }

  @Override
  void compute_net_sal() {
    DA = 0.52 * Basic;
    Gross_Sal = Basic + DA + bonus - deductions;
    double IT = 0.30 * Gross_Sal;
    Net_Sal = Gross_Sal - IT;
  }

  @Override
  void calculateSalary() {
    compute_net_sal();
  }

  @Override
  void display() {
    formatEmployeeName();
    System.out.println("Employee ID: " + Eid);
    System.out.println("Employee Name: " + Ename);
    System.out.println("Basic Salary: " + Basic);
    System.out.println("Bonus: " + bonus);
    System.out.println("Deductions: " + deductions);
    System.out.println("Gross Salary: " + Gross_Sal);
    System.out.println("Net Salary: " + Net_Sal);
    System.out.println("Email: " + generateEmail());
  }
}

public class EmployeeMain {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("\nEnter the number of full-time employees: ");
    int n = sc.nextInt();
    FullTimeEmp[] fullTimeEmployees = new FullTimeEmp[n];

    for (int i = 0; i < n; i++) {
      System.out.println("\nEnter details for Full-Time Employee " + (i + 1) + ":");
      System.out.print("Enter Employee ID: ");
      int id = sc.nextInt();
      sc.nextLine(); 
      System.out.print("Enter Employee Name: ");
      String name = sc.nextLine();
      System.out.print("Enter Basic Salary: ");
      double basic = sc.nextDouble();
      System.out.print("Enter Bonus: ");
      double bonus = sc.nextDouble();
      System.out.print("Enter Deductions: ");
      double deductions = sc.nextDouble();
      fullTimeEmployees[i] = new FullTimeEmp(name, id, basic, bonus, deductions);
    }

    System.out.print("\nEnter the number of part-time employees: ");
    int m = sc.nextInt();
    PartTimeEmp[] partTimeEmployees = new PartTimeEmp[m];

    for (int i = 0; i < m; i++) {
      System.out.println("\nEnter details for Part-Time Employee " + (i + 1) + ":");
      System.out.print("Enter Employee ID: ");
      int id = sc.nextInt();
      sc.nextLine(); 
      System.out.print("Enter Employee Name: ");
      String name = sc.nextLine();
      System.out.print("Enter Hours Worked: ");
      int hours = sc.nextInt();
      partTimeEmployees[i] = new PartTimeEmp(name, id, hours);
    }

    System.out.println("\nFull-Time Employee Details:");
    for (int i = 0; i < n; i++) {
      fullTimeEmployees[i].display();
    }

    System.out.println("\nPart-Time Employee Details:");
    for (int i = 0; i < m; i++) {
      partTimeEmployees[i].display();
    }
  }
}

