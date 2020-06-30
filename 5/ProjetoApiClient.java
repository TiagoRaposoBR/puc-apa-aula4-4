public class ProjetoApiClient {

    private final BackEndDeveloper backEndDeveloper;
    private final FrontEndDeveloper frontEndDeveloper;

    public ProjetoApiClient(BackEndDeveloper backEnd, FrontEndDeveloper frontEnd) {
        this.backEndDeveloper = backEnd;
        this.frontEndDeveloper = frontEnd;
    }
    
    public void implementar() {
        this.backEndDeveloper.writeAPI();
        this.frontEndDeveloper.writeClientConsumer();
    }
}