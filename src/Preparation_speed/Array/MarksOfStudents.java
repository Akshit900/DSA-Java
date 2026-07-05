package Preparation_speed.Array;

public class MarksOfStudents {
    public static void main(String[] args) {
        int [] marks = {95,54,63,6,34,78,20};
        for(int i=0;i<marks.length;i++){
            if(marks[i]<35){
                System.out.print(i+" ");
            }
        }
    }

}
