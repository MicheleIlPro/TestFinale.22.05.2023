public class DomandaERisposta {

    private String domanda;
    private String risposta;

    public DomandaERisposta(String domanda, String risposta) {
        this.domanda = domanda;
        this.risposta = risposta;
    }

    public void setRisposta(String risposta) {
        this.risposta = risposta;
    }

    public String getDomanda() {
        return domanda;
    }

    public String getRisposta() {
        return risposta;
    }
}
