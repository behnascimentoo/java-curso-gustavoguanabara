package aula12;
public class Peixe extends Animal{
    private String corEscama;
    
    //Metodos
    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Substancias");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe nao faz som!");
    }
    
    public void soltarBolha() {
        System.out.println("Soltou uma bolha");
    }
    
    //Metodos Especiais

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
}
