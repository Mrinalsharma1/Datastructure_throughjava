class myclass {
    private int id;
    private String name;

    void abc() {
        id = 100;
        name = "name";
        System.out.println(+id + name);
    }

    void setid(int i) {
        id = i;
    }

    void setname(String n) {
        name = n;
    }

    int getid() {
        return id;
    }

    String getname() {
        return name;
    }
}

public class cwh_geeter_setter {
    public static void main(String[] args) {
        myclass mk = new myclass();
        mk.abc();
        mk.setid(302);
        mk.setname("mrinal");
        System.out.println(mk.getid());
        System.out.println(mk.getname());

    }
}
