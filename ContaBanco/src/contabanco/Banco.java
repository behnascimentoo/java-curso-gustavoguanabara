package contabanco;
public class Banco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    //METODOS PERSONALIZADOS
    public void estadoAtual() {
        System.out.println("---------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
            
    public Banco(){
        this.saldo = 0;
        this.status = false;
    }

    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus (true);
            if (t == "CC") {
                this.setSaldo(50);
                System.out.println("Conta corrente aberta, voce recebeu 50 reias de bonus.");
            }
            else if (t == "CP"){
               this.setSaldo(150);
                System.out.println("Conta poupança aberta, voce recebeu 150 reais de bonus.");
            }
    } 
    
    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta com dinheiro!");
        } 
        else if (this.getSaldo() < 0) {
            System.out.println("Conta com debito!");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
    }
    }
    
    public void depositar(float v) {
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + v); 
            System.out.println("Deposito realizado na conta de " + this.getDono());
        } else {
            System.out.println("Voce não tem uma conta para depositar!");
        }
    }
    
    public void sacar(float v) {
        if (this.getStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de " + this.getDono());
            }else {
            System.out.println("Saldo suficiente!");
        } 
        } else {
            System.out.println("Impossivel sacar de uma conta fechada!");
        }
    }
    
    public void pagarMensal() {
        int v = 0;
        if (this.getTipo() == "CC") {
            v = 12;
            System.out.println("Foi descontado R$12,00 da sua conta corrente!");
        } else if (this.getTipo() == "CP"){
            v = 20;
        }
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por " + this.getDono());
        } else {
            System.out.println("Conta inexistente");
        }
    }
    // METODOS ESPECIAIS
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
}
