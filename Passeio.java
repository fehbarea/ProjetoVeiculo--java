public final class Passeio extends Veiculo implements Calc {

    private int qtdPassageiros;


    public Passeio(String placa, String marca, String modelo, String cor, int qtdRodas, int velocMax,String dataCadastro, Motor motor, int qtdPassageiros) {
        super(placa, marca, modelo, cor, qtdRodas, velocMax, dataCadastro, motor);
        this.qtdPassageiros = qtdPassageiros;

    }

    public Passeio(){
        this.qtdPassageiros = 0;
    }

    public final int calcVel(){
        return velocMax * 1000;
    }

    public int calcular(){
        return placa.length() + marca.length() + modelo.length() + cor.length() + dataCadastro.length();
    }
    public int getQtdPassageiros() {
        return qtdPassageiros;
    }
    public void setQtdPassageiros(int qtdPassageiros) {
        this.qtdPassageiros = qtdPassageiros;
    }
}
