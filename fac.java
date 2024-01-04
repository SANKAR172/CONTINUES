public class fac{

   public static void main(String[] args) {
       int num1 = 5;
       int num2 = 10;

       long result1 = fac(num1);
       long result2 = fac(num2);

       System.out.println("fac of " + num1 + " is " + result1);
       System.out.println("fac of " + num2 + " is " + result2);
   }

   public static long fac(int num) {
       long result = 1;
       for (int i = 1; i <= num; i++) {
           result = result * i;
       }
       return result;
   }
}
