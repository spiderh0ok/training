public record Student(String name,int grade,int classNum) {

    public static final int DEFAULT_GRADE = 9;
    public static final int GRADE_FOR_TICHON = 10;


    public Student(String name,int classNum){
        this(name,DEFAULT_GRADE,classNum);
    }

    public boolean isInTichon(){
        return grade>=GRADE_FOR_TICHON;

    }
    public String toString() {
        return "Student " + name + " is in grade " + grade + "th and in class " + classNum;
    }



}
