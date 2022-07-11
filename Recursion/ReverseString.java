public class ReverseString {
    public static void main(String[] args) {
        reverse("asdfghjklmnbvcxz");
    } 
    static void reverse(String str ){
        if((str.length()<=1)||(str == null)) {
            System.out.print(str);
            return;
        }
        System.out.print(str.charAt(str.length()-1));  
        reverse(str.substring(0,str.length()-1)); 
    }
}