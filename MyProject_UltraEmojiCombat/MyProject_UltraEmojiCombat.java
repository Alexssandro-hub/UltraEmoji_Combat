package myproject_ultraemojicombat;

/**
 *
 * @author Alexssandro
 */
public class MyProject_UltraEmojiCombat {


    public static void main(String[] args) {
          
        Lutador l[] = new Lutador[6];
                
                
             l[0] =  new Lutador("\n Alexssandro ", "Brazil", 20, 1.69f,
        68.9f, 11, 2, 1);
             
             l[1] =  new Lutador("\n Putscript ", "Brazil", 29, 1.68f,
        57.9f, 14, 2, 3);
        
            l[2] =  new Lutador("\n HighElo ", "Brazil", 32, 1.78f,
        82.4f, 12, 2, 1);
            l[3] =  new Lutador ("\n LowElo ", "Brazil", 32, 1.75f,
        81.8f, 13, 0, 2);
            l[4] = new Lutador ("\n Hiper ", "Brazil", 25, 1.85f,
        119.0f, 5, 4, 3);
            l[5]= new Lutador ("\n SnapShadow ", "Brazil", 35, 1.89f,
        105.5f, 12, 2, 4);
            
       
        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[0], l[1]);
        UEC01.lutar();
        l[0].status();
        l[1].status();
        
        Luta UEC02 = new Luta();
        UEC02.marcarLuta(l[2], l[3]);
        UEC02.lutar();
        l[2].status();
        l[3].status();
        
        Luta UEC03 = new Luta();
        UEC03.marcarLuta(l[4], l[5]);
        UEC03.lutar();
        l[4].status();
        l[5].status();
            
        
    }
    
}
