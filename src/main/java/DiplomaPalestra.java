public class DiplomaPalestra implements Diploma {

    @Override
    public String getDescricao() {
        return "Diploma de Palestra";
    }

    @Override
    public double getCusto() {
        return 20.0;
    }
}
