public class stringtoken {
    public static void main(String[] args){
        String s="This is a string token , and it is used";
        s=s.trim();

        if(s.length()==0){
            System.out.println("No tokens");
            return;
        }
        String[] words=s.split("[ !,?._'@]+");
        System.out.println(words.length);
        for(String word:words){
            System.out.println(word);
        }

        
    }
    
}
