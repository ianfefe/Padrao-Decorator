public abstract class DiplomaDecorator implements Diploma {

    protected Diploma diploma;

    public DiplomaDecorator(Diploma diploma) {
        this.diploma = diploma;
    }

    @Override
    public String getDescricao() {
        return diploma.getDescricao();
    }

    @Override
    public double getCusto() {
        return diploma.getCusto();
    }
}
