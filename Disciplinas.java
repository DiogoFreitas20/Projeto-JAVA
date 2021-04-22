public class Disciplinas {
    private String nomedisciplina;
    private int iddisciplina;
    private int horasdisciplina;

    
    public String getNomedisciplina() {
        return nomedisciplina;
    }


    public void setNomedisciplina(String nomedisciplina) {
        this.nomedisciplina = nomedisciplina;
    }


    public int getIddisciplina() {
        return iddisciplina;
    }


    public void setIddisciplina(int iddisciplina) {
        this.iddisciplina = iddisciplina;
    }


    public int getHorasdisciplina() {
        return horasdisciplina;
    }


    public void setHorasdisciplina(int horasdisciplina) {
        this.horasdisciplina = horasdisciplina;
    }


    @Override
    public String toString() {
        return "Disciplina [IDDisciplina= " + iddisciplina + " Nome= " + nomedisciplina + " Horas= " + horasdisciplina
                + "]";
    }
}
