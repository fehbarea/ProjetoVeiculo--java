public final class Carga extends Veiculo implements Calc {
    
    private int tara;
    private int carga;

    public Carga(String placa, String marca, String modelo, String cor, int qtdRodas, int velocMax, String dataCadastro, Motor motor, int tara, int carga) {
        super(placa, marca, modelo, cor, qtdRodas, velocMax, dataCadastro, motor);
        this.tara = tara;
        this.carga = carga;
    }
    public Carga(){
        this.tara = 0;
        this.carga = 0;
    }

    public final int calcVel(){
        return velocMax * 100000;
    }

    public int calcular(){
        return qtdRodas + velocMax + tara + carga;
    }
    
    public int getTara() {
        return tara;
    }
    public void setTara(int tara) {
        this.tara = tara;
    }
    public int getCarga() {
        return carga;
    }
    public void setCarga(int carga) {
        this.carga = carga;
    }

}

