public class Fraktal {

    public static void main (String[] args) {

        int n = args.length > 0 ? Integer.parseInt (args[0]) : 8;
        StdDraw.enableDoubleBuffering();
        tree (0.5, 0, Math.PI / 2, 0.15, 15);
	//stern(0.5,0.5,0.3,n);
        StdDraw.show();
    }

    static void tree (double x, double y, double angle, double len, double n) {
        if (n <= 0) return;
        double x2 = x + Math.cos (angle) * len;
        double y2 = y + Math.sin (angle) * len;

        StdDraw.setPenRadius (len / 10);
        StdDraw.line (x, y, x2, y2);

        if(n % 2 == 0) {   
            tree ( x2, y2, (angle - Math.toRadians (10)), len * 0.8, n - 1);
            tree ( x2, y2, (angle + Math.toRadians (22)), len * 0.6, n - 2);
            return;
        }

        if(n % 3 == 0) {
            tree ( x2, y2, (angle + Math.toRadians (15)), len * 0.9, n - 1);
            tree ( x2, y2, (angle - Math.toRadians (15)), len * 0.6, n - 1);
            return;

        } else {
            tree ( x2, y2, (angle + Math.toRadians (5)), len * 0.9, n - 1);
            tree ( x2, y2, (angle - Math.toRadians (15)), len * 0.8, n - 1);
        }
    }
    
    public static void stern(double x, double y, double l, int tiefe) {
	if (tiefe==0) return;
	// a und b sind die Koordinaten der vier "krummen Ecken"
	double a = 0.5 * l;
	double b = 0.5 * Math.sqrt(3) * l;		 
	StdDraw.line(x,y+l,x,y-l);
	StdDraw.line(x+b,y+a,x-b,y-a);
	StdDraw.line(x-b,y+a,x+b,y-a);
	stern(x,y+l,l/3,tiefe-1);
	stern(x,y-l,l/3,tiefe-1);
	stern(x+b,y+a,l/3,tiefe-1);
	stern(x-b,y-a,l/3,tiefe-1);
	stern(x-b,y+a,l/3,tiefe-1);
	stern(x+b,y-a,l/3,tiefe-1);    
    }

}
