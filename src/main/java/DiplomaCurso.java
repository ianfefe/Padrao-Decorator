public class DiplomaCurso implements Diploma {

    @Override
    public String getDescricao() {
        return "Diploma de Curso";
    }

    @Override
    public double getCusto() {
        return 50.0;
    }
}
