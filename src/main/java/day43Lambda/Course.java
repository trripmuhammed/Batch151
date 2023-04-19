package day43Lambda;

/*
    Icinde
        1)private veriable'lar
        2)Parametreli ve parametresiz construct'lar
        3)Getter'lar
        4)Setter'lar
        5)ToString() method'u
        barindiran class'lara "POJO" Class denir.
        POJO: Plain Old Java Object      API-> da gorucez
        farkli turdeki data'lari POJO ya cevirip kullaniriz
 */

public class Course {

    private String courseName;
    private int numOfStudent;
    private String season;
    private double averageScore;

    public Course(String courseName, int numOfStudent, String season, double averageScore) {
        this.courseName = courseName;
        this.numOfStudent = numOfStudent;
        this.season = season;
        this.averageScore = averageScore;
    }

    public Course(){

    }

    public String getCourseName() {
        return courseName;
    }

    public int getNumOfStudent() {
        return numOfStudent;
    }

    public String getSeason() {
        return season;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setNumOfStudent(int numOfStudent) {
        this.numOfStudent = numOfStudent;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", numOfStudent=" + numOfStudent +
                ", season='" + season + '\'' +
                ", averageScore=" + averageScore +
                '}';
    }



}
