public class Moldura extends DiplomaDecorator {

    public Moldura(Diploma diploma) {
        super(diploma);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + ", Moldura";
    }

    @Override
    public double getCusto() {
        return super.getCusto() + 30.0;
    }
}
