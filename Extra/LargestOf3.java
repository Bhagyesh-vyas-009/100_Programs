public class LargestOf3
{
    public static void main(String[] args) {
        
        int a=50,b=20,c=60;

        System.out.print((a>b && a>c)?a+" is greater ":((b>c)?b+" is greater":c+" is greater"));
    }
}