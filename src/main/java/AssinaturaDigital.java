public class AssinaturaDigital extends DiplomaDecorator {

    public AssinaturaDigital(Diploma diploma) {
        super(diploma);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + ", Assinatura Digital";
    }

    @Override
    public double getCusto() {
        return super.getCusto() + 10.0;
    }
}
