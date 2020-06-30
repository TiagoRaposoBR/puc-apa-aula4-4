public class Retangulo implements IForma {
    
    private float altura;
    private float largura;

    @Override
    public float getLargura() {
        return largura;
    }
    @Override
    public float getAltura() {
        return altura;
    }
    @Override
    public void setLargura(float valor) {
        largura = valor;
    }
    @Override
    public void setAltura(float valor) {
        altura = valor;
    }
}