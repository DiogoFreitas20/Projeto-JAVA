public class Inscrição {
    private int idformando;
    private int idcurso;
    private String nome;
    private String nomeformando;
    private int idformandoinscrição;

    public int getIdformando() {
        return idformando;
    }

    public void setIdformando(int idformando) {
        this.idformando = idformando;
    }

    public int getIdcurso() {
        return idcurso;
    }

    public void setIdcurso(int idcurso) {
        this.idcurso = idcurso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeformando() {
        return nomeformando;
    }

    public void setNomeformando(String nomeformando) {
        this.nomeformando = nomeformando;
    }

    public int getIdformandoinscrição() {
        return idformandoinscrição;
    }

    public void setIdformandoinscrição(int idformandoinscrição) {
        this.idformandoinscrição = idformandoinscrição;
    }

    @Override
    public String toString() {
        return "Inscrição [IDFormando= " + idformando + " IDCurso= " + idcurso + " IDFormandoInscrição= "
                + idformandoinscrição + " NomeCurso= " + nome + " NomeFormando= " + nomeformando + "]";
    }

}