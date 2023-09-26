public class Tarefa {
    private String titulo;
    private String descricao;
    private String data;
    public Tarefa (String titulo, String descricao, String data){
        this.titulo = titulo;
        this.descricao = descricao;
        this.data = data;
}

    public String getData() {
        return data;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void retornaTudo(){
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Descrição: " + getDescricao());
        System.out.println("Data: " + getData());
    }
}


