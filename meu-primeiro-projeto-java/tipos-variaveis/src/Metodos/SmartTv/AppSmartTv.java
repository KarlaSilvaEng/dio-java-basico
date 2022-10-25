package Metodos.SmartTv;

public class AppSmartTv {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();
        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal atual: "+ smartTv.canal);
        System.out.println("Volume atual: "+ smartTv.volume);
        
        smartTv.ligar();
        System.out.println("Novo status -> TV ligada? "+ smartTv.ligada);;
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Novo status -> Volume: "+smartTv.volume);

        smartTv.mudarCanal(13);
       
    }
    
}
