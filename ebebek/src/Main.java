import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        double salary;
        int workHours;
        int hireYear;
        System.out.println("Lutfen calisanin adini giriniz :");
        name = scanner.next();
        System.out.println("Lutfen calisanin maasini giriniz :");
        salary = scanner.nextDouble();
        System.out.println("Lutfen calisanin haftalik calisma saatini giriniz :");
        workHours = scanner.nextInt();
        System.out.println("Lutfen calisanin ise giris yilini giriniz :");
        hireYear = scanner.nextInt();

        Employee employee = new Employee(name,salary,workHours,hireYear);
        System.out.println(employee);
    }
}
