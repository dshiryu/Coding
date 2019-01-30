public class Hanoi {

    public static void main(String[] args) {
        int n = args.length > 0 ? Integer.parseInt (args[0]) : 5;
        int pause = args.length > 1 ? Integer.parseInt (args[1]) : 1000;
        hanoiTxt(n,1,3);
    }

    // Bewege n Schreiben von start nach ziel
    // Start und Ziel sind die Nummern der Stangen, also 1, 2 oder 3
    // Als Ausgabe schreibe die Zuege, z.B. 1 --> 2 bedeutet ziehe
    // die obere Scheibe von Stange 1 zu Stange 2
    
    public static void hanoiTxt (int n, int start, int ziel) {
        // Nur eine Scheibe muss bewegt werden
        if (n==1) {
            System.out.println(start + " --> " + ziel);
            return;
        }

        // Berechne die dritte Stange (nicht start oder ziel)
        int dritte = 6-start-ziel;

        // n-1 Scheiben von start zu dritte
        hanoiTxt(n-1,start,dritte);
        
        // 1 Scheibe von start zu ziel
        System.out.println(start + " --> " + ziel);
        
        // n-1 Schreiben von dritte zu ziel
        hanoiTxt(n-1,dritte,ziel);
    }


}
