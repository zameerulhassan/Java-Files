
public class TestingMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //isPalindrome("level");
        System.out.println(isPalindrome("levem"));
    }

    public static String isPalindrome(String original){
    //System.out.println("Enter input String");
        //Scanner sc = new Scanner(System.in);
        //String original = sc.nextLine();
        String result;
        String reverse = "";
        String originalLower = original.toLowerCase();
        originalLower = originalLower.replaceAll("[^a-zA-Z]", ""); // removing all no alpha characters.
        //originalLower = originalLower.replaceAll("[a-zA-Z]", ""); // removing all no numbers characters.
     for(int i = originalLower.length()-1; i >=0;i-- ){
         reverse = reverse + originalLower.charAt(i);
     }
       if (originalLower.equals(reverse)){
           result = ("Given String is Palindrom");
       }   
       else {
           result = ("Given String is NOT Palindrom");
       }   
       return result;
}
    
}
