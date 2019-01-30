import java.util.Scanner;

public class Rekursiv {

    public static int fib (int n) {
	if (n==0 || n==1) return 1;
	return fib (n-1) + fib (n-2);
    }

    public static int fakultaet (int n) {
	if (n==0) return 1;
	return n*fakultaet(n-1);
    }

    public boolean gerade(int n) {
	if (n==0) return true;
	if (n==1) return false;
	return ungerade (n-1);
    }

    public boolean ungerade(int n) {
	if (n==0) return false;
	if (n==1) return true;
	return gerade (n-1);
    }
    
    public String changePi(String str) {
	if (str.length()<2) return str;
	if (str.startsWith("pi")) return "3.14" + changePi(str.substring(2));
	return str.charAt(0) + changePi(str.substring(1));
    }

    public String endX(String str) {
	if (str.length()==0) return "";
	if (str.charAt(0)=='x') return endX(str.substring(1)) + "x";
	return str.charAt(0) + endX(str.substring(1));
    }

    public static void main (String[] args) {

        int n = args.length > 0 ? Integer.parseInt (args[0]) : 8;
        String x = args.length > 1 ? args[1] : "";
	System.out.println(fib(n));
	System.out.println(fakultaet(n));
	System.out.println(gerade(n));
	System.out.println(ungerade(n));
	System.out.println(changePi(x));
	System.out.println(endX(x));
	
    }


}
