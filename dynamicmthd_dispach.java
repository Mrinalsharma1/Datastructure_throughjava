class phone{
    void on(){
        System.out.println("phone is booting....");
    }
    void music(){
        System.out.println("play honey singh song");
    }
}
class smaptphone extends phone{
    void call(){
        System.out.println("call to sima");
    }
    void music(){
        System.out.println("play arjit singh song");
    }
}
public class dynamicmthd_dispach {
    public static void main(String[] args) {
        phone obj = new smaptphone();
        obj.on();
        obj.music();
        // obj.call();
    }
}
