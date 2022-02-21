interface Triangle{
    void calculater_Tarea();
}
interface Rectangle{
    void calculater_Rarea();
}
class Trin implements Triangle, Rectangle{
    int l,b;
    Trin(int x,int y){
        this.l =x;
        this.b =y;
    }
    public void calculater_Tarea(){
       System.out.println("Area of Rectangle is :"+(l*b));
    }
    public void calculater_Rarea(){
        int w =7,h=5;
        System.out.println("Rectangle is :"+(w*h/2));
    }
}
public class interface1{
    public static void main(String[] args) {
     Trin obj = new Trin(6,9);
     obj.calculater_Tarea();
     obj.calculater_Rarea();
     
     
    }
}