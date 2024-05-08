public class UsuarioTv {
    public static void main(String[] args) throws Exception {
        SmarTV smarTV = new SmarTV();
        System.out.println("TV Ligada? " + smarTV.ligada);
        System.out.println("Canal atual - " + smarTV.canal);
        System.out.println("Volume atual - " + smarTV.volume);

        smarTV.ligar();
        System.out.println("TV ligada? " + smarTV.ligada);

        smarTV.aumentarVolume();
        System.out.println("AUMENTANDO VOLUME PARA " + smarTV.volume);

        smarTV.baixarVolume();
        System.out.println("DIMINUINDO VOLUME PARA " + smarTV.volume);

        smarTV.aumentarCanal();
        System.out.println("AUMENTANDO CANAL PARA " + smarTV.canal);

        smarTV.baixarCanal();
        System.out.println("DIMINUINDO CANAL PARA " + smarTV.canal);

        smarTV.definirCanal(13);
        System.out.println("DEFININDO NOVO CANAL PARA " + smarTV.canal);

        smarTV.desligar();
        System.out.println("TV ligada? " + smarTV.ligada);
    }
}