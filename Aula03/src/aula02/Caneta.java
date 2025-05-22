package aula02;
public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    public void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Esta tampada? " + this.tampada);
    }
    public void rabiscar() {
        if (this.tampada == true){
            System.out.println("ERRO! Não posso rabiscar!");
        }else {
            System.out.println("Estou Rabiscando!");
        }
    }
    //this = é o lugar que sera substituido pelo objeto, usado this dentro da classe
    public void tampar() {
        this.tampada = true;
    }
    
    public void destampar() {
        this.tampada = false;
    }
}
