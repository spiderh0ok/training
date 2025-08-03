public record Student(String name,int grade,int classNum) {
    @Override
    public String toString() {
        return "Student " + name + " is in grade " + grade + "th and in class " + classNum;
    }
    public boolean isInTichon(){
        if (grade>=10)
            return true;
        return false;
    }

    public Student(String name,int classNum){
        this(name,9,classNum);
    }

}
