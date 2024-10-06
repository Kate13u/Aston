package Lesson_3;

public class Employee {
    private String name;
    private String possition;
    private String email;
    private String phoneNumer;
    private double salary;
    private int age;

    public Employee(String name, String possition, String email, String phoneNumer, double salary, int age) {
        this.name = name;
        this.possition = possition;
        this.email = email;
        this.phoneNumer = phoneNumer;
        this.salary = salary;
        this.age = age;
    }

    public void info() {
        System.out.println("Имя: " + name);
        System.out.println("Должность: " + possition);
        System.out.println("Имейл: " + email);
        System.out.println("Номер телефона: " + phoneNumer);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
        System.out.println("- - - - - - - ");

    }

    public static void main(String[] args) {
        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Ревинский Егор Николаевич", "CV-speacialist", "Revinsky@gmail.com", "79961025898", 100.0, 27);
        empArray[1] = new Employee("Чубуков Артем Сергеевич", "QA", "abc@gmail.com", "78966655210", 100.6, 26);
        empArray[2] = new Employee("Петров Иван Васильевич", "Developer", "qwerty@gmail.com", "7965489654", 100.0, 30);
        empArray[3] = new Employee("Вежновец Мария Леонидовна", "BA / SA", "masha@gmail.com", "375449875698", 100.3, 55);
        empArray[4] = new Employee("Ганкевич Константин Сергеевич", "DevOps", "zaqwer@gmail.com", "375296874596", 100.9, 43);

        for (Employee list : empArray) {
            if (list.age > 40) {
                list.info();
            }
        }
    }
}