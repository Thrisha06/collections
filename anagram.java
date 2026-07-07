public class anagram {
    public static void main(String[] args){
        String a="anagram";
        String b="magrana";
        a=a.toLowerCase();
        b=b.toLowerCase();

        if(a.length() !=b.length()){
            System.out.println("Not anagrams");
            return;
        }

        int[] count = new int[26];
        for(int i=0; i<a.length(); i++){
            count[a.charAt(i)-'a']++;
            count[b.charAt(i)-'a']--;
        }

        for(int i=0; i<26; i++){
            if(count[i] !=0){
                System.out.println("Not anagrams");
                return;
            }
        }
        System.out.println("Anagrams");
    }
    
}
