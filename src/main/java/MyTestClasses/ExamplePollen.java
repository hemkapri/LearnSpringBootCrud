package MyTestClasses;

public class ExamplePollen {
    public static void main(String[] args) {

        int n = 565;
        int sum = 0;
        int r;

        while (n>0){
            r = n%10;
            sum = (sum*10) + r;
            n = n/10;
        }

        if(n == sum){
            System.out.println("Palindrom Number");
        }
        else{
            System.out.println("Not Palindrom");
        }


    }
}
