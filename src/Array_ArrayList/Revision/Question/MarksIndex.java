package Array_ArrayList.Revision.Question;
//if student marks are less than 35 than print their roll no.(index no.)
public class MarksIndex {
    public static void main(String[] args) {
        int [] marks = {100,99,7,21,35,36,12};
        for(int i=0;i<marks.length;i++){
            if(marks[i]<35){
                System.out.print(i + " ");
            }
        }
    }
}
