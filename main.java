public class main {
    public static void main(String[] args) {
        Student rafael = new Student("Rafael",8,1);
        System.out.println(rafael.toString());
        System.out.println(rafael.isInTichon());




    }

    public static Classroom[] sortStudentsToClassrooms (Student[] students){
        int classesCounter = 0;
        for (int i = 0; i < students.length; i++) {

            for (int j = 0; j <i ; j++) {
                if (students[i].grade()==students[j].grade()&&students[i].classNum()==students[j].classNum())
                    classesCounter--;
                classesCounter++;
            }
        }


    }
}
