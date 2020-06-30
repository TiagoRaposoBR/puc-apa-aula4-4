public class Iss implements IImposto {
    
    @Overrides
    public float getImposto(String estado) {
        return 0.02f;
    }
}