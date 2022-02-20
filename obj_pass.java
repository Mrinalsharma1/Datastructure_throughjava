class Abc{
    int num, one;
    void Text(){
        System.out.println("Your Number is : "+num);
    }
    public int Increment(Abc mk){
        int b =++mk.num;
        return b;
        // System.out.println("hey : "+mk.one++);
        // System.out.println("check Increment value is : "+b );
    }
    static void check(Abc mk){
        System.out.println("check Increment value is : "+mk.num++);
    }
}
public class obj_pass {
    public static void main(String[] args) {
        Abc mk= new Abc();
        mk.Text();
        int y = mk.Increment(mk);
        System.out.println("Incremented value is : "+y);
        // mk.Increment(mk);
        Abc.check(mk);

    }
}
