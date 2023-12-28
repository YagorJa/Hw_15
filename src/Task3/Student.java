package Task3;

import java.util.List;

public class Student {
    private String name;
    private long group;
    private int course;
    private List<Integer> marks;

    public Student(String name, long group, int course, List<Integer> mark) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.marks = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getGroup() {
        return group;
    }

    public void setGroup(long group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public List<Integer> getMarks() {
        return marks;
    }

    public void setMarks(List<Integer> marks) {
        this.marks = marks;
    }

    public double getAverage() {
        if (marks.isEmpty()) {
            return 0.0;
        }
        int sum = 0;
        for (Integer mark : marks) {
            sum +=mark;
        }

        return (double) sum / marks.size();
    }

}

