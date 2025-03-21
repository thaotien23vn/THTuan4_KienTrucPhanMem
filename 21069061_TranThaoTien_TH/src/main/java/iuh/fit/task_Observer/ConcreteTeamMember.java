package task_Observer;

public class ConcreteTeamMember implements TeamMember {
    private String name;

    public ConcreteTeamMember(String name) {
        this.name = name;
    }

    @Override
    public void update(String taskName, String newStatus) {
        System.out.println("Team member " + name + " notified. Task " + taskName + " is now " + newStatus);
    }
}