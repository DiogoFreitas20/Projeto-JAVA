public class Formando {
    private int idformando;
    private String nomeformando;
    private boolean masculino;
    private int telefones;

    public int getIdFormando() {
        return idformando;
    }

    public void setIdFormando(int idformando) {
        this.idformando = idformando;
    }

    public String getNomeFormando() {
        return nomeformando;
    }

    public void setNomeFormando(String nomeformando) {
        this.nomeformando = nomeformando;
    }

    public boolean isMasculino() {
        return masculino;
    }

    public void setMasculino(boolean masculino) {
        this.masculino = masculino;
    }

    public int setTelefones() {
        return telefones;
    }

    public void setTelefones(int telefones) {
        this.telefones = telefones;
    }

    public Formando() {
        this.idformando = idformando;
        this.nomeformando = nomeformando;
        this.masculino = masculino;
        this.telefones = telefones;
    }

    @Override
    public String toString() {
        return "Formando [IDFormando= " + idformando + " Nome= " + nomeformando + " Masculino= " + masculino
                + " Telefone= " + telefones + "]";
    }
}