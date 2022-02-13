import java.util.Scanner;

public class marks_pre {
    public static void main(String[] args) {
        Scanner mk = new Scanner(System.in);
        System.out.println("Enter five subject marks here :-");
        System.out.println("Enter first sub Marks :- ");
        int sub1 = mk.nextInt();
        System.out.println("Enter second sub Marks :- ");
        int sub2 = mk.nextInt();
        System.out.println("Enter third sub Marks :- ");
        int sub3 = mk.nextInt();
        System.out.println("Enter fourth sub Marks :- ");
        int sub4 = mk.nextInt();
        System.out.println("Enter five sub Marks :- ");
        int sub5 = mk.nextInt();
        int total = sub1 + sub2 + sub3 + sub4 + sub5;
        float per = total / 5;
        System.out.println("Total markes Is -:" + total);
        System.out.println("presentage is :- " + per + "%");

    }
}
