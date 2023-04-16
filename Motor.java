public class Motor{

    private int qtdPistoes;
    private int potencia;

    public Motor(int qtdPistoes, int potencia){
        this.potencia = potencia;
        this.qtdPistoes = qtdPistoes;
    }

    public Motor(){
        potencia = 0;
        qtdPistoes = 0;
    }

    public final void  setQtdPistoes(int qtdPistoes){
        
        this.qtdPistoes = qtdPistoes;
    }

    public final int getQtdPistoes(){
        return qtdPistoes;
    }

    public final int getPotencia(){
        return potencia;
    }

    public final void setPotencia(int potencia){

        this.potencia = potencia;
    }


}