package computer;

public class Bug implements ConsoleNotification {
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
        return bugStatus;
    }

    public void setBugStatus(boolean bugStatus) {
        notifyStatuschange();
        this.bugStatus = bugStatus;
    }

    public int getBugPriority() {
        return bugPriority;
    }

    public void setBugPriority(int bugPriority) {
        this.bugPriority = bugPriority;
    }

    public BugReporter getBugReporter() {
        return bugReporter;
    }

    public void setBugReporter(BugReporter bugReporter) {
        this.bugReporter = bugReporter;
    }

    @Override
    public void notifyStatuschange() {
        System.out.println("Bug status has changed");
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
}
