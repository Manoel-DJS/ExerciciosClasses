package ClasseTV;

public class TV {
    private int numeroCanal;
    private int volume;

    public TV(){
        this.numeroCanal = 2;
        this.volume = 50;
    }

    public void mudarCanal(int novoCanal){
        if(novoCanal > 0 && novoCanal <= 30){
            this.numeroCanal = novoCanal;
        } else{
            System.out.println("Faixa de canais vai de 1 a 30");
            System.out.println("O canal continuará o mesmo!");
        }
    }

    public void aumentarVolume(int aumentaVolume){
        if(this.volume <= 100){
            this.volume += aumentaVolume;
            if(this.volume > 100){
                System.out.println("Volume máximo Atingido");
                this.volume -= this.volume - 100;
            }
        } else{
            System.out.println("Faixa de volume só vai 0 a 100");
        }
    }

    public void diminuirVolume(int diminuiVolume){
        if(this.volume > 0){
            this.volume -= diminuiVolume;
            if(this.volume < 0){
                System.out.println("Volume minimo atingido");
                this.volume -= this.volume;
            }
        } else{
            System.out.println("Faixa de volume só vai 0 a 100");
        }

    }

    public int getNumeroCanal() {
        return numeroCanal;
    }
    public int getVolume() {
        return volume;
    }
}
