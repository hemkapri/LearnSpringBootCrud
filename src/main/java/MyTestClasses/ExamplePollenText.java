package MyTestClasses;

public class ExamplePollenText {
    public static void main(String[] args) {
        
        String name = "AppA";
        String reverse = "";
        
        for (int i=name.length()-1; i>=0; i--){
          reverse = reverse + name.charAt(i);
        }
        if(name.equals(reverse)){
            System.out.println("String is palindrom");
        }
        else{
            System.out.println("Not Palindrom");
        }
    }
}
