package projetopessoas;
public class Aluno extends Pessoa{ // Aluno herda todas as caracteristicas da classe Pessoa e add outras
    private int mat;
    private String curso;
    
    // Metodo
    public void cancelarMat() {
        System.out.println("Matricula sera cancelada!");
    }
    
    // Metodos Especiais

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
}
