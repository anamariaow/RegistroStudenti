import java.time.LocalDate;

public class Studente {
    private String matricola;
    private String nome;
    private String cognome;
    private Integer annoDiNascita;

    public Studente(String matricola, String nome, String cognome, Integer annoDiNascita) {
        this.matricola = matricola;
        this.nome = nome;
        this.cognome = cognome;
        this.annoDiNascita = annoDiNascita;
    }

    public String getMatricola() {
        return matricola;
    }

    public void setMatricola(String matricola) {
        this.matricola = matricola;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCoome(String cognome) {
        this.cognome = cognome;
    }

    public Integer getAnnoDiNascita() {
        return annoDiNascita;
    }

    public void setAnnoDiNascita(Integer annoDiNascita) {
        this.annoDiNascita = annoDiNascita;
    }

    public void calcoloEta() {
        Integer annoCorrente = LocalDate.now().getYear();
        Integer eta = annoCorrente - annoDiNascita;
        System.out.println("Età studente: " + eta);

    }

    public void stampaStudente() {
        System.out.println(matricola + " - " + nome + " " + cognome + " - " + annoDiNascita);
    }

    @Override
    public String toString() {
        return "Studente: " + matricola +
                " - " + nome + " - " + cognome + " - " + annoDiNascita;
    }
}
