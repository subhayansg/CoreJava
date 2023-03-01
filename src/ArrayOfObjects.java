class Subject {
    private String subId;
    private String name;
    private int maxMarks;
    private int marksObtained;

    public String getSubId() {
        return subId;
    }

    public String getName() {
        return name;
    }

    public int getMaxMarks() {
        return maxMarks;
    }

    public void setMaxMarks(int maxMarks) {
        this.maxMarks = maxMarks;
    }

    public int getMarksObtained() {
        return marksObtained;
    }

    public void setMarksObtained(int marksObtained) {
        this.marksObtained = marksObtained;
    }

    public Subject(String subId, String name) {
        this.subId = subId;
        this.name = name;
    }

    public Subject(String subId, String name, int maxMarks) {
        this.subId = subId;
        this.name = name;
        this.maxMarks = maxMarks;
    }

    public Subject(String subId, String name, int maxMarks, int marksObtained) {
        this.subId = subId;
        this.name = name;
        this.maxMarks = maxMarks;
        this.marksObtained = marksObtained;
    }

    public String toString() {
        return "\n subjectId: " + subId + "\n name: " + name + "\n MarksObtained: " + marksObtained;
    }
}
public class ArrayOfObjects {
    public static void main(String[] args) {
        Subject[] s = new Subject[3];
        s[0] = new Subject("s101", "DS", 100);
        s[1] = new Subject("s102", "Algo", 100);
        s[2] = new Subject("s103", "DBMS", 100);

        for(Subject sub:s)
            System.out.println(sub);
    }
}
