package by.epam.classes.entity;

public class Student {
    private String lastNameAndInitials;
    private int groupNumber;
    private int[] progress;

    public Student(String lastNameAndInitials, int groupNumber, int[] progress) {
        this.lastNameAndInitials = lastNameAndInitials;
        this.groupNumber = groupNumber;
        this.progress = progress;
    }

    public String getLastNameAndInitials() {
        return lastNameAndInitials;
    }

    public void setLastNameAndInitials(String lastNameAndInitials) {
        this.lastNameAndInitials = lastNameAndInitials;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public int[] getProgress() {
        return progress;
    }

    public void setProgress(int[] progress) {
        this.progress = progress;
    }
}