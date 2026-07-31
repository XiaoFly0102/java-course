package lesson05;

public class Student {

    private String name;
    private int id;
    private double score;

    static int totalCount = 0; //進階：記錄總人數

    public Student(String name, int id, double score) {
        this.name = name;
        this.id = id;
        this.score = score;
        totalCount++;
    }
    public void showInfo() {
        System.out.println("姓名:" + this.name + " 學號:" + this.id + " 成績:" + this.score);
    }

    public boolean isPass() { return this.score >= 60;}

    //測試
    public static void main(String[] args) {
        Student s1 = new Student("小明", 9527 , 61);
        Student s2 = new Student("小華", 9528 , 50);
        Student s3 = new Student("小美", 9529 , 90);

        s1.showInfo();
        System.out.println("是否及格:" + s1.isPass());
        s2.showInfo();
        System.out.println("是否及格:" + s2.isPass());
        s3.showInfo();
        System.out.println("是否及格:" + s3.isPass());
        boolean pass = s1.isPass() && s2.isPass() && s3.isPass();

        int count = Student.totalCount;
        System.out.println("總人數:" + Student.totalCount);
    }

}
