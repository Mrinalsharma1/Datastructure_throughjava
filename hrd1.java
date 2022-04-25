public class hrd1 {
    public static void main(String[] args) {
        String str = "Big black bit a big Big black bit dog black on";
        int count;
        str = str.toLowerCase();

        String words[] =str.split(" ");
        System.out.println("Print duplicate words");
        for(int i=0;i<words.length;i++){
            count=1;
            for(int j=i+1;j<words.length;j++){
                if(words[i].equals(words[j])){
                    count++;
                    words[j]="0";
                }
            }
            if(count>1 && words[i]!="0"){
                System.out.println(words[i]);
            }
        }
    }
}
