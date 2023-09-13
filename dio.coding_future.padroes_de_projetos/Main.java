public class Main {
    public static void main(String[] args) {

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();

        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        System.out.println("\n");

        robo.setComportamento(defensivo);
        robo.mover();
        robo.mover();
        System.out.println("\n");

        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        


    }
}