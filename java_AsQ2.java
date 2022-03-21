class rectungle{
    int length, bredth;
    rectungle(int l,int b){
        this.length =l;
        this.bredth=b;
    }
    public int area(){
        return length*bredth;
    }
}

public class java_AsQ2 {
    public static void main(String[] args) {
        rectungle obj = new rectungle(4, 5);
        rectungle obj1= new rectungle(4, 9);
        System.out.println("\n\n********** Area Of Rectungle ************\n");
        System.out.println("first Area of Rectungle is : " +obj.area());
        System.out.println("first Area of Rectungle is : " +obj1.area());
    }
}
