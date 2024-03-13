public class class_task3 {
    String description;
    boolean status;

    public class_task3(String description, boolean status) {
        this.description = description;
        this.status = status;
    }

    public void printTaskDetails() {
        System.out.println("Task Description: " + description);
        System.out.println("Task Status: " + (status ? "Complete" : "Incomplete"));
    }

    public static void main(String[] args) {
        class_task3 task = new class_task3("Complete Java assignment", false);
        task.printTaskDetails();
    }
}
