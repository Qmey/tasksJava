public class class_task5 {
    String name;
    int age;
    double gradePointAverage;

    public class_task5(String name, int age, double gradePointAverage) {
        this.name = name;
        this.age = age;
        this.gradePointAverage = gradePointAverage;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade Point Average: " + gradePointAverage);
    }

    public static void main(String[] args) {
        class_task5 student1 = new class_task5("Alice", 20, 3.8);
        class_task5 student2 = new class_task5("Bob", 21, 3.5);
        student1.displayInfo();
        student2.displayInfo();
    }
}
