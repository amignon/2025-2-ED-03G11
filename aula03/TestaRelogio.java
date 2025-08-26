public class TestaRelogio {
    public static void main(String[] args) {
        RelogioDigital relogio = new RelogioDigital(10, 8, 59);
        while (true) {
            System.out.println(relogio.getHorario());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.exit(0);
            }
            relogio.tick();
        }
    }
}