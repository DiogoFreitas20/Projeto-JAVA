public class Cursos {
    private int idcurso;
    private String nome;
    private int horas;
    private String disciplinas;
    private Boolean adicionardisciplinas;

    public Cursos(int idcurso, String nome, int horas, String disciplinas, boolean adicionardisciplinas) {
        this.idcurso = idcurso;
        this.nome = nome;
        this.horas = horas;
        this.disciplinas = disciplinas;
        this.adicionardisciplinas = adicionardisciplinas;
    }

    public Boolean getAdiconardisciplinas() {
        return adicionardisciplinas;
    }

    public void setAdicionardisciplinas(Boolean adicionardisciplinas) {
        this.adicionardisciplinas = adicionardisciplinas;
    }

    public Cursos(Boolean adicionardisciplinas) {
        this.adicionardisciplinas = adicionardisciplinas;
    }

    public Cursos() {
    }

    public int getIdcurso() {
        return idcurso;
    }

    public void setIdCurso(int idcurso) {
        this.idcurso = idcurso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public String getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(String disciplinas) {
        this.disciplinas = disciplinas;
    }

    @Override
    public String toString() {
        return "Cursos [IDCurso= " + idcurso + " Nome= " + nome + " Horas= " + horas + " Disciplinas= " + disciplinas
                + "]";
    }
}
