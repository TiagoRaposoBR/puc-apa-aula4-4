public class Iss implements IImposto {
    
    @Override
    public float getImposto(String estado) {
        switch (estado.toLowerCase()) {
            case "mg":
                return 0.18f;
            case "sp":
                return 0.14f;
            default:
                return 0f;
        }
    }
}