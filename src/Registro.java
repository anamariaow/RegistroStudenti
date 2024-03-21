import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Registro {
    private HashMap<String, Studente> registroStudenti;

    public Registro() {
        this.registroStudenti = new HashMap<>();
    }

    public HashMap<String, Studente> getRegistroStudenti() {
        return registroStudenti;
    }

    public void setRegistroStudenti(HashMap<String, Studente> registroStudenti) {
        this.registroStudenti = registroStudenti;
    }

    public void aggiungiStudente(Studente studente) {
        registroStudenti.put(studente.getMatricola(), studente);
    }
    public void rimuoviStudente(String matricola) {
        registroStudenti.remove(matricola);
    }

    public void visualizzaElencoCompleto() {
        for (Map.Entry<String, Studente> entry : registroStudenti.entrySet()) {
            //System.out.println("Matricola: " + entry.getKey());
            entry.getValue().stampaStudente();
        }
    }

    public Studente getStudenteFromMatricola(String matricola){
        return registroStudenti.get(matricola);
    }

//    public void cercaStudentePerMatricola(String matricola) {
//        Studente studenteVar = null;
//        for (Map.Entry<String, Studente> entry : registroStudenti.entrySet()) {
//            if(matricola.equals(entry.getKey())) {
//                System.out.println("Studente trovato");
//                entry.getValue().stampaStudente();
//            }
//        }
//    }

    public void studentiTotali() {
        Integer numeroStudenti = 0;
        for(Map.Entry<String, Studente> entry : registroStudenti.entrySet()) {
            numeroStudenti = numeroStudenti + 1;
        }
        System.out.println("Numero studenti presenti: " + numeroStudenti);
    }

    public Integer etaMedia() {
        Integer etaTotale = 0;
        for(Map.Entry<String, Studente> entry : registroStudenti.entrySet()) {
            etaTotale += entry.getValue().getAnnoDiNascita();
        }
        return etaTotale/registroStudenti.size();
    }

    public void ordinaStampaStudentiEta() {
        ArrayList<Studente> studenteArrayList = new ArrayList<>(registroStudenti.values());
        studenteArrayList.sort(Comparator.comparing(Studente::getAnnoDiNascita));
        for(Studente studente : studenteArrayList) {
            studente.stampaStudente();
        }
    }
}
