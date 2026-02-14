package StartingBasics;

public class StringBuilderSB {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("hello");
        System.out.println(str);
        str.setCharAt(0,'H');
        System.out.println(str);
        str.append(" Ji");
        System.out.println(str);
        str.insert(2,'y');
        System.out.println(str);

        StringBuilder sb = new StringBuilder("John Doe");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.delete(4,5);
        System.out.println(sb);

    }
}
