package aston.school;

/* Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
Конструктор класса должен заполнять эти поля при создании объекта.
Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
 */
public class Employee {

    private String fullName;
    private String jobTitle;
    private String email;
    private String phone;
    private double salary;
    private int age;

    //конструктор
    public Employee(String fullName, String jobTitle, String email, String phone, double salary, int age) {
        this.fullName = fullName;
        this.jobTitle = jobTitle;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    //геттеры для private переменных
    public String getFullName() {
        return fullName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    //Метод, выводящий информацию по сотруднику в консоль
    public void printEmployeeInfo() {
        System.out.println("ФИО сотрудника: " + getFullName());
        System.out.println("Должность сотрудника: " + getJobTitle());
        System.out.println("email сотрудника: " + getEmail());
        System.out.println("Телефон сотрудника: " + getPhone());
        System.out.println("Оклад сотрудника: " + getSalary() + " рублей");
        System.out.println("Возраст сотрудника: " + getAge());
    }
}