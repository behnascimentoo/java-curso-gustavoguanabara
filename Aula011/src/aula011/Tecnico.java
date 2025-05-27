package aula011;
public class Tecnico extends Aluno{
    private String registroProfissional;
    
    //Metodos
    public void praticar() {
        System.out.println("Aluna " + this.getNome() + " do curso tecnico de " + this.getRegistroProfissional() + " praticou " + this.getCurso());
    }
    
    //Metodos Especiais
    public String getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(String registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
    
}
