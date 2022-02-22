public class cmd_intrest {
    public static void main(String[] mca) {
        int length = mca.length;
        if(length == 0){
            System.out.print("No Command line argument found : ");
        }
        else if(length >0){
            int Pi = Integer.parseInt(mca[0]); //principle Amount
            int Rate = Integer.parseInt(mca[1]); // Rate 
            int Time = Integer.parseInt(mca[2]); // Time 
            int si = (Pi*Rate*Time)/100; // Calulating Simple intrest
            System.out.println("\n\n\t************ Simple Intrest ****************");
            System.out.println("simple intrest is :- "+si);
        }
        
    }
}
