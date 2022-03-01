import javax.sound.sampled.SourceDataLine;

public class Gaseosa {
   
   public static void main(String[] args) {
    Bebida beb = new Bebida(4, 234,"Fanat");
    System.out.println(beb.toString());
    Bebida beb1 = new Bebida(5, 456, "Coca");
    System.out.println(beb1.toString());

    BebidaAzucarada ba = new BebidaAzucarada(12, true,140,100,"Manaos");
    System.out.println(ba.toString());
   }
}
