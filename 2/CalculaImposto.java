public class CalculaImposto {
    
    public static float getTotal(NotaFiscal nota, List<IImposto> impostos) {
        float impostosTotais = 0f;

        for (IImposto imp : impostos) {
            impostosTotais += imp.getImposto(nota.estado);
        }

        return nota.valor * impostosTotais;
    }
}