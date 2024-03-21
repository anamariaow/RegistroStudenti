public class Main {
    public static void main(String[] args) {
        Registro registro = new Registro();

        Studente studente1 = new Studente("Stu101", "Nome1", "Cognome1", 2000);
        Studente studente2 = new Studente("Stu102", "Nome2", "Cognome2", 2001);
        Studente studente3 = new Studente("Stu103", "Nome3", "Cognome3", 2002);

        registro.aggiungiStudente(studente1);
        registro.aggiungiStudente(studente2);
        registro.aggiungiStudente(studente3);

//        registro.rimuoviStudente("Stu101"); sbagliato
//        registro.rimuoviStudente(studente1.getMatricola());
        registro.visualizzaElencoCompleto();

        registro.getStudenteFromMatricola(studente2.getMatricola()).stampaStudente();

        registro.studentiTotali();
        System.out.println("Media anno: " + registro.etaMedia());
        registro.ordinaStampaStudentiEta();

    }
}