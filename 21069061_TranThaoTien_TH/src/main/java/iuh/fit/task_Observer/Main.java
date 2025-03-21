package task_Observer;

public class Main {
    public static void main(String[] args) {
        Task task = new Task("Design Database", "Pending");
        TeamMember member1 = new ConcreteTeamMember("Alice");
        TeamMember member2 = new ConcreteTeamMember("Bob");

        task.addObserver(member1);
        task.addObserver(member2);

        task.setStatus("In Progress");
        task.setStatus("Completed");
    }
}