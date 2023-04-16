import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TstVeic {

    public static void main(String arg[]){

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Leitura leitura = new Leitura();
        System.out.println("Cadastre seu veículo de Carga ou Passeio ");
        int op = Integer.parseInt(leitura.entDados("Digite 1 para Passei ou 2 para Carga: "));

        int qtdPistoes, potencia;

        qtdPistoes = Integer.parseInt(leitura.entDados("Quantos pistões existem no motor? "));
        potencia = Integer.parseInt(leitura.entDados("Qual a potencia do motor ? "));

        Motor motor = new Motor(qtdPistoes, potencia);  

        switch(op){
            case 1:
                System.out.println("Você selecionou Passeio, agora digite os dados do veículo");
                String pPlaca = leitura.entDados("Digite a placa do veículo: ");
                String pMarca = leitura.entDados("Digite a marca: ");
                String pModelo = leitura.entDados("Digite o modelo: ");
                String pCor = leitura.entDados("Digite a cor: ");
                int pQtdRodas = Integer.parseInt(leitura.entDados("Digite a quantidade de rodas: "));
                int pVelocMax = Integer.parseInt(leitura.entDados("Digite a velocidade maxima: "));
                int qtdPassageiros = Integer.parseInt(leitura.entDados("Digite a Quantidade de passageiros: "));
                String pDataCadastro = LocalDate.now().format(formato);

                Passeio p = new Passeio(pPlaca, pMarca, pModelo, pCor, pQtdRodas, pVelocMax, pDataCadastro, motor, qtdPassageiros);
                
                System.out.println("\n\n\n ----------------- Os dados salvos foram ---------------------------");
                System.out.println("\n Placa: "+ p.getPlaca() + "\n Marca: " + p.getMarca() + "\n Modelo: " + p.getModelo() + "\n Cor: " + p.getCor());
                System.out.println("\n Quantidade de rodas: " + p.getQtdRodas() + "\n Velocidade maxima: " + p.calcVel() + "\n Quantidade de passageiros: " + p.getQtdPassageiros());
                System.out.println("\n O dados foram salvos as : " + p.getDataCadastro());
            break;
            case 2:

                System.out.println("Você selecionou Carga, agora digite os dados do veículo");
                String cPlaca = leitura.entDados("Digite a placa do veículo: ");
                String cMarca = leitura.entDados("Digite a marca: ");
                String cModelo = leitura.entDados("Digite o modelo: ");
                String cCor = leitura.entDados("Digite a cor: ");
                int cQtdRodas = Integer.parseInt(leitura.entDados("Digite a quantidade de rodas: "));
                int cVelocMax = Integer.parseInt(leitura.entDados("Digite a velocidade maxima: "));
                int tara = Integer.parseInt(leitura.entDados("Digite a tara do veículo: "));
                int carga = Integer.parseInt(leitura.entDados("Digite a carga do veículo: "));
                String cDataCadastro = LocalDate.now().format(formato);
                Carga c = new Carga(cPlaca, cMarca, cModelo, cCor, cQtdRodas, cVelocMax, cDataCadastro, motor, tara, carga);
                
                System.out.println("\n\n\n ----------------- Os dados salvos foram ---------------------------");
                System.out.println("\n Placa: "+ c.getPlaca() + "\n Marca: " + c.getMarca() + "\n Modelo: " + c.getModelo() + "\n Cor: " + c.getCor());
                System.out.println("\n Quantidade de rodas: " + c.getQtdRodas() + "\n Velocidade maxima: " + c.calcVel()  + "\n Tara: " + c.getTara() + "\n Carga: " + c.getCarga());
                System.out.println("\n O dados foram salvos as : " + c.getDataCadastro());
            break;

            default:
                System.out.println("Digite uma opcao valida");
            break;
        }
    }
}
