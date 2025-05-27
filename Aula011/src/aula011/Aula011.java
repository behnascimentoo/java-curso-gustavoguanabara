package aula011;
public class Aula011 {
    public static void main(String[] args) {
        //Pessoa p1= new Pessoa();
        Visitante v1 = new Visitante();
        v1.setNome("Juvenal");
        v1.setIdade(22);
        v1.setSexo("M");
        System.out.println(v1.toString());
        
        Aluno a1 = new Aluno();
        a1.setNome("Claudio");
        a1.setMatricula(1111);
        a1.setCurso("Informatica");
        a1.setIdade(16);
        a1.setSexo("M");
        a1.pagarMensalidade();
        
        Bolsista b1 = new Bolsista();
        b1.setMatricula(1112);
        b1.setNome("Jubileu");
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.pagarMensalidade();
        
        Professor p1 = new Professor();
        p1.setNome("Jose");
        p1.setIdade(55);
        p1.setSexo("M");
        p1.setSalario(2500.00f);
        p1.receberAumento(500f);
        
        Tecnico t1 = new Tecnico();
        t1.setNome("Brenda");
        t1.setCurso("JAVA");
        t1.setIdade(22);
        t1.setRegistroProfissional("Java POO");
        t1.praticar();
        
    }
    
}
