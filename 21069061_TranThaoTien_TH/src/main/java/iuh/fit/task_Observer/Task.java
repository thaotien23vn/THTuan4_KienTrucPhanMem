package task_Observer;

import java.util.ArrayList;
import java.util.List;

public class Task {
    private String name;
    private String status;
    private List<TeamMember> teamMembers = new ArrayList<>();

    public Task(String name, String status) {
        this.name = name;
        this.status = status;
    }

    public void addObserver(TeamMember teamMember) {
        teamMembers.add(teamMember);
    }

    public void removeObserver(TeamMember teamMember) {
        teamMembers.remove(teamMember);
    }

    public void setStatus(String status) {
        this.status = status;
        notifyObservers();
    }

    private void notifyObservers() {
        for (TeamMember teamMember : teamMembers) {
            teamMember.update(name, status);
        }
    }
}