
package Model;

/**
 *
 * @author Clara
 */
public class Aluno {
     private int id;
    private String matricula;
    private String turma;
    private Responsavel responsavel;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public Responsavel getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Responsavel responsavel) {
        this.responsavel = responsavel;
    }
}

