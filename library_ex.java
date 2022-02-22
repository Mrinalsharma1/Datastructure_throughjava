import java.util.Random;
import java.util.Scanner;

class Library{
    String arr[] = new String[40];
    void AddBook(){
        Scanner sc = new Scanner(System.in);
        System.out.println("How Many Books You want to Enter");
        int num = sc.nextInt();
        for(int i =0;i<num;i++){
            System.out.println("Enter your Book Name");
            arr[i]=sc.nextLine();
        }
    }
    void IssueBook(){
        Random rand = new Random();
        int isue = rand.nextInt(10000);
        System.out.println("randome number is : "+isue);
    }
    void ReturnBook(){

    }
    void ShowAvalibleBook(){

    }
}
public class library_ex {
    public static void main(String[] args) {
        Library obj = new Library();
        obj.AddBook();
        obj.IssueBook();
        
        
    }
}
