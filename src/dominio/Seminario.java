package dominio;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Local local;

    public Seminario(String titulo,Local local) {
        this.titulo = titulo;
    }

    public Seminario(String titulo, Aluno[] alunos, Local local) {
        this.titulo = titulo;
        this.alunos = alunos;
        this.local = local;
    }

    static{
        System.out.println("Bem vindo ao sistema de gerenciamento de seminário!");
    }

    public void imprime(){
        System.out.println("DADOS SEMINARIO:--------------");
        System.out.println("titulo seminário: "+ this.titulo);
        System.out.println("Local:"+local.getEndereco());
        if(getAlunos()==null)return;
        System.out.println("alunos do seminario:-----");
        for(Aluno aluno: alunos){
            System.out.println("nome: "+aluno.getNome()+ " ,idade: "+ aluno.getIdade());
        }
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
