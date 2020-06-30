public class Quadrado implements IForma {
    
    private float lado;

    @Override
    public float getLargura() {
        return lado;
    }
    @Override
    public float getAltura() {
        return lado;
    }
    @Override
    public void setLargura(float valor) {
        lado = valor;
    }
    @Override
    public void setAltura(float valor) {
        lado = valor;
    }
}