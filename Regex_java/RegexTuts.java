import java.util.regex.*;
public class RegexTuts {
 public static void main(String[] args) {
     String regex = "[A-Za-z.+]{5}\s[A-Za-z.+]{6}+";
     String text = "Harsh Bansal";
     boolean c =  Pattern.matches(regex, text);
     System.out.println(c);
 }   
