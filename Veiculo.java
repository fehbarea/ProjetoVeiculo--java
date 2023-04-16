public abstract class Veiculo {
    
    String placa; 
    String marca; 
    String modelo; 
    String cor; 
    int qtdRodas; 
    int velocMax;
    String dataCadastro = new String();
    Motor motor;


    public Veiculo(String placa, String marca, String modelo, String cor, int qtdRodas, int velocMax,String dataCadastro, Motor motor) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.qtdRodas = qtdRodas;
        this.velocMax = velocMax;
        this.dataCadastro = dataCadastro;
        this.motor = motor;
    }

    public Veiculo() {
        placa = "";
        marca = "";
        modelo = "";
        cor = "";
        qtdRodas = 0;
        velocMax = 0;
        dataCadastro = "";
        motor = new Motor();
    }

    public String getPlaca() {
        return placa;
    }


    public void setPlaca(String placa) {
        this.placa = placa;
    }


    public String getMarca() {
        return marca;
    }


    public void setMarca(String marca) {
        this.marca = marca;
    }


    public String getModelo() {
        return modelo;
    }


    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public String getCor() {
        return cor;
    }


    public void setCor(String cor) {
        this.cor = cor;
    }


    public int getQtdRodas() {
        return qtdRodas;
    }


    public void setQtdRodas(int qtdRodas) {
        this.qtdRodas = qtdRodas;
    }


    public int getVelocMax() {
        return velocMax;
    }


    public void setVelocMax(int velocMax) {
        this.velocMax = velocMax;
    }


    public String getDataCadastro() {
        return dataCadastro;
    }


    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }


    public Motor getMotor() {
        return motor;
    }


    public void setMotor(Motor motor) {
        this.motor = motor;
    }
    
    public abstract int calcVel();


}
