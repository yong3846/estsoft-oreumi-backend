package day05;

public class Student {
    private String name;
    private int korean;
    private int math;
    private int english;

    private void validateScore(int score) {
        if (score > 0 && score <= 100);
    }
    public Student(String name, int korean, int math, int english) {
        validateScore(korean);
        validateScore(math);
        validateScore(english);
        this.name = name;
        this.korean = korean;
        this.math = math;
        this.english = english;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setKorean(int korean) {
        this.korean = korean;
    }
    public void setMath(int math) {
        this.math = math;
    }
    public void setEnglish(int english) {
        this.english = english;
    }

    public String getName() {
        return name;
    }
    public int getKorean() {
        validateScore(korean);
        return korean;
    }
    public int getMath() {
        validateScore(math);
        return math;
    }
    public int getEnglish() {
        validateScore(english);
        return english;
    }
    public int getTotal() {
        return korean + math + english;
    }
    public double getAverage() {
        return (double) getTotal() / 3.0;
    }
    public String getGrade() {
        double avg = getAverage();
        if (avg >= 90) {
            return "A";
        } else if (avg >= 80) {
            return "B";
        } else if (avg >= 70) {
            return "C";
        } else if (avg >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public void print() {
        System.out.println("Name: " + name);
        System.out.printf("Average: %.2f\n", getAverage());
        System.out.println("Grade: " + getGrade());
        System.out.println();
    }
}
