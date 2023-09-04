package computer;

import MyException.IllegalBugPriorityException;

import java.util.Objects;

public class Bug implements ConsoleNotification, Comparable<Bug> {
    private String bugDescription;
    private int bugPriority;
    private boolean bugStatus;
    private BugReporter bugReporter;

    public Bug(String bugDescription, int bugPriority, BugReporter bugReporter) {
        this.bugDescription = bugDescription;
        this.bugPriority = bugPriority;
        this.bugStatus = false;
        this.bugReporter = bugReporter;
    }

    public String getBugDescription() {
        return bugDescription;
    }

    public void setBugDescription(String bugDescription) {
        if (bugDescription.length() < 10) {
            System.out.println("Incorrect bug description");
        } else {
            this.bugDescription = bugDescription;
        }
    }

    public boolean isBugStatus() {
        notifyStatuschange();
        return bugStatus;
    }

    public int getBugPriority() {

        return bugPriority;
    }

    public void setBugPriority(int bugPriority) {
        if (bugPriority > 10) {
            throw new IllegalBugPriorityException("Incorrect bug priority");
        }
        this.bugPriority = bugPriority;
    }

    public void setBugReporter(BugReporter bugReporter) {
        this.bugReporter = bugReporter;
    }

    @Override
    public void notifyStatuschange() {
        System.out.println("Bug status has changed");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bug bug = (Bug) o;
        return bugPriority == bug.bugPriority && bugStatus == bug.bugStatus && Objects.equals(bugDescription, bug.bugDescription) && Objects.equals(bugReporter, bug.bugReporter);
    }


    @Override
    public int hashCode() {
        return Objects.hash(bugDescription, bugPriority, bugStatus, bugReporter);
    }

    @Override
    public String toString() {
        return "Bug{" +
                "bugDescription='" + bugDescription + '\'' +
                ", bugPriority=" + bugPriority +
                ", bugStatus=" + bugStatus +
                ", bugReporter=" + bugReporter +
                '}';
    }

    @Override
    public int compareTo(Bug bug) {
        return this.getBugDescription().compareTo(bug.getBugDescription());
    }

    public void setBugStatus(boolean bugStatus) {
        this.bugStatus = bugStatus;
    }

    public BugReporter getBugReporter() {
        return bugReporter;

    }
}
