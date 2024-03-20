package aston.school;

public class Lesson_3 {

    public static void main(String[] args) {
        // 2.Создать массив из 5 сотрудников
        Employee[] employeesArray = new Employee[5];
        employeesArray[0] = new Employee("Семенов Семен Семенович", "генеральный директор", "semen@test.com",
                "88001234567", 250100.14, 35);
        employeesArray[1] = new Employee("Иванов Иван Иванович", "финансовый директор", "ivan@test.com",
                "88001234566", 230100.13, 45);
        employeesArray[2] = new Employee("Артемов Артем Артемович", "главный инженер", "artem@test.com",
                "88001234567", 200100.12, 38);
        employeesArray[3] = new Employee("Александров Александр Александрович", "бухгалтер", "alex@test.com",
                "88001234567", 150100.11, 28);
        employeesArray[4] = new Employee("Васильев Василий Васильевич", "завхоз", "vasiliy@test.com",
                "88001234567", 50100.10, 58);
        //Выводим в консоль данные об одном из сотрудников
        employeesArray[3].printEmployeeInfo();

        //3. Создаю парк
        Park detskiyPark = new Park(3);
//        Добавляю аттракционы в detskiyPark через конструктор аттракциона
//        Park.Attraction attraction1 = detskiyPark.new Attraction("Чертово колесо","08:00","20:00",150.00);
//        Park.Attraction attraction2 = detskiyPark.new Attraction("Машинки","10:00","21:00",250.00);
//        Park.Attraction attraction3 = detskiyPark.new Attraction("Тир","09:00","22:00",200.00);
        //Добавляю аттракционы через метод, а не конструктор
        detskiyPark.addAttraction("Чертово колесо", "08:00", "20:00", 150.00);
        detskiyPark.addAttraction("Машинки", "10:00", "21:00", 250.00);
        detskiyPark.addAttraction("Тир", "11:00", "21:30", 200.00);
        detskiyPark.addAttraction("Батут", "10:00", "20:30", 250.00);
        detskiyPark.getParkInfo();
    }
}
