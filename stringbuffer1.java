public class stringbuffer1 {
    

    public void stringnor(){

        String ch = "car is red";
        String w="green";
        System.out.println(ch.charAt(4));
        System.out.println(ch.toLowerCase());
        System.out.println(ch.toUpperCase());
        System.out.println(ch.length());
        System.out.println(ch.replace("is", "lion"));
        System.out.println(ch.equals(w));
        System.out.println(w.substring(4));

    }
    public void stringbuff(){
        StringBuffer s = new StringBuffer("this is car");
        System.out.println(s);
        System.out.println(s.length());
        System.out.println(s.capacity());
        // int a=98;
        String d = "good";
        System.out.println(s.append(d));
        System.out.println(s.reverse());
        System.out.println(s.insert(6,"abc"));
        System.out.println(s.delete(4, 10));

    }
    public static void main(String[] args) {
        stringbuffer1 obj = new stringbuffer1();
        obj.stringnor();
        obj.stringbuff();
    }
}
