public class Professor {
    private String nomeDoProfessor;
    private String horarioDoAtendimento;
    private String periodo;

    public Professor(String nomeDoProfessor, String horarioDoAtendimento, String periodo) {
        this.nomeDoProfessor = nomeDoProfessor;
        this.horarioDoAtendimento = horarioDoAtendimento;
        this.periodo = periodo;
    }

    public String getNomeDoProfessor() {
        return nomeDoProfessor;
    }

    public void setNomeDoProfessor(String nomeDoProfessor) {
        this.nomeDoProfessor = nomeDoProfessor;
    }

    public String getHorarioDoAtendimento() {
        return horarioDoAtendimento;
    }

    public void setHorarioDoAtendimento(String horarioDoAtendimento) {
        this.horarioDoAtendimento = horarioDoAtendimento;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
}
