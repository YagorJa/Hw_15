package Task3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> studs = new ArrayList<>();
        List<Integer> marksR = List.of(3,3,4,2,3);
        Student romych = new Student("Roma",174001,3,marksR);
        List<Integer> marksJ = List.of(4,4,4,2,3);
        Student jonson = new Student("Vanek",174001,3,marksJ);
        List<Integer> marksL = List.of(1,1,4,2,2);
        Student loh = new Student("Loshped",344004,2,marksL);
        List<Integer> marksE = List.of(5,5,4,2,3);
        Student me = new Student("Egor",174001,3,marksE);
        studs.add(romych);
        studs.add(jonson);
        studs.add(me);
        studs.add(loh);
        execute(studs);
        print(studs,3);
    }
    private static void execute(List<Student> students){
        students.removeIf(student -> student.getAverage() < 3);
    }
    private static void print(List<Student> students,int course){
        for (Student student:students) {
            if (student.getCourse() == course) {
            System.out.println(student.getName() + " ");

            }
        }
    }
}
