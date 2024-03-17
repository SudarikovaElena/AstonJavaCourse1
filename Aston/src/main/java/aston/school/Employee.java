package aston.school;

/* Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
Конструктор класса должен заполнять эти поля при создании объекта.
Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
 */
public class Employee {

    public String fullName;
    public String jobTitle;
    public String email;
    public String phone;
    public double salary;
    public int age;
    //конструктор
    public Employee(String fullName, String jobTitle, String email, String phone, double salary, int age) {
        this.fullName = fullName;
        this.jobTitle = jobTitle;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    //Метод, выводящий информацию по сотруднику в консоль
    public void printEmployeeInfo () {
        System.out.println("ФИО сотрудника: "+fullName);
        System.out.println("Должность сотрудника: "+jobTitle);
        System.out.println("email сотрудника: "+email);
        System.out.println("Телефон сотрудника: "+phone);
        System.out.println("Оклад сотрудника: "+salary+" рублей");
        System.out.println("Возраст сотрудника: "+age);
    }

    // 2.Создать массив из 5 сотрудников
    public static void main(String[] args) {
        Employee[] employeesArray = new Employee[5];
        employeesArray[0] = new Employee("Семенов Семен Семенович","генеральный директор","semen@test.com",
                "88001234567",250100.14,35);
        employeesArray[1] = new Employee("Иванов Иван Иванович","финансовый директор","ivan@test.com",
                "88001234566",230100.13,45);
        employeesArray[2] = new Employee("Артемов Артем Артемович","главный инженер","artem@test.com",
                "88001234567",200100.12,38);
        employeesArray[3] = new Employee("Александров Александр Александрович","бухгалтер","alex@test.com",
                "88001234567",150100.11,28);
        employeesArray[4] = new Employee("Васильев Василий Васильевич","завхоз","vasiliy@test.com",
                "88001234567",50100.10,58);
        employeesArray[3].printEmployeeInfo();
    }
}