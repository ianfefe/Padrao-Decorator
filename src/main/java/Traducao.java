public class Traducao extends DiplomaDecorator {

    public Traducao(Diploma diploma) {
        super(diploma);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + ", Tradução";
    }

    @Override
    public double getCusto() {
        return super.getCusto() + 25.0;
    }
}
