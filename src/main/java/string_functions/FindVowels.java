package string_functions;

public class FindVowels {
    public int coutVowels(String s){
        int cnt=0;
        if(s==null){
            return cnt;
        }
        for (Character var:s.toLowerCase().toCharArray()) {
            if(var=='a'||var=='e'|| var=='i'||var=='o'||var=='u') {
                cnt += 1;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        
        FindVowels obj = new FindVowels();
        System.out.println(obj.coutVowels("SURESH"));

    }
}
