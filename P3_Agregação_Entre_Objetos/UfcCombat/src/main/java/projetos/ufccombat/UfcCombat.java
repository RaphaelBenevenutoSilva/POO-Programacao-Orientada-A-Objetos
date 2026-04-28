package projetos.ufccombat;

public class UfcCombat {

    public static void main(String[] args) {
        Lutador l[] =  new Lutador[6];
                
        l[0] = new Lutador("Robin wood", "Belgica", 30, 1.75f, 70.3, 11, 2, 1);
        l[1] = new Lutador("Nelson Pitbull", "Brasil", 29, 1.68f, 70.0, 14, 0, 0);
        l[2] = new Lutador("Amarok", "Croacia", 35, 1.85f, 83.9, 21, 7, 0);
        l[3] = new Lutador("Brandon", "EUA", 32, 1.79f, 83.0, 15, 1, 2);
        l[4] = new Lutador("Ramirez", "Mexico", 29, 1.95f, 110.0, 29, 5, 0);
        l[5] = new Lutador("Carakchov", "Bielorussia", 28, 1.89f, 89.0, 30, 0, 0);
                                
        
        Luta UFC220 = new Luta();
        UFC220.marcarLuta(l[1], l[5]);
        UFC220.lutar();
        l[4].Status();
        l[5].Status();
        
                                
    }
}
