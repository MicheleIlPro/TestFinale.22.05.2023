import java.util.ArrayList;
import java.util.Scanner;

public class Principale {

    public static void main(String[] args) {

        DomandaERisposta d1 = new DomandaERisposta("Cos'è Java quali sono le sue caratteristiche?","le principali caratteristiche di java sono la programmazione ad oggetti, l'astrazione e la portabilità.");
        DomandaERisposta d2 = new DomandaERisposta("Cosa sono le condizioni e quali conosciamo?","Le condizioni sono i parametri che diamo ad un if, o ad un for, che servono a far entrare o meno in un ciclo, per esempio in un for troviamo (variabile dell'iterazione;condizione;incremento");
        DomandaERisposta d3 = new DomandaERisposta("Cosa sono i cicli e quali conosciamo?","I cicli sono delle ripetizioni, per esempio i for, i while, i do while, ognuno si gestisce in modo dicerso ma ci permettono di avere un ciclo fino a quando la condizione è vera.");
        DomandaERisposta d4 = new DomandaERisposta("Cosa sono i metodi e cosa sono le classi e gli oggetti e cosa hanno in comune questi due elementi?","I metodi sono come delle funzioni, possiamo dargli una visibilità, un tipo di ritorno, un nome della funzione, e dei parametri. La differenza tra classe e oggetto è che l'oggetto è l'istanza della classe istanziata. (quando utilizziamo new). La classe può contenere variabili di classe, un metodo di classe e altri metodi.");
        DomandaERisposta d5 = new DomandaERisposta("Cosa sono le tre regole fondamentali quali sono e qual'è la quarta?","le regole fondamentali in java che mi vengono in mente sono l'incapsulamento, l'astrazione il poliformismo e l'eredarietà ");

        //per aggiungere una domanda e risposta basta creare una nuova DomandaERisposta e metterla nell'array list domande.

        ArrayList<DomandaERisposta> domande = new ArrayList();
        domande.add(d1);
        domande.add(d2);
        domande.add(d3);
        domande.add(d4);
        domande.add(d5);


        boolean condizione = true;

        while(condizione){
            System.out.println("Cosa vuoi fare? \n1-vedere le domande e risposte \n2-modificare una risposta \n3-uscire dal programma.");
            Scanner sc = new Scanner(System.in);
            int primaScelta = sc.nextInt();

            switch (primaScelta){
                case 1: //vediamo le domande e risposte.
                    mostraDomandeERisposte(domande,false);
                    break;
                case 2: //modifichiamo una risposta.

                    mostraDomandeERisposte(domande,true);
                    System.out.println("Quale risposta vuoi modificare?");
                    int secondaScelta = sc.nextInt();

                    if (secondaScelta>=domande.size()){
                        System.out.println("Selezione errata");
                        break;
                    }

                    //se esiste procediamo con la sovrascrizione
                    System.out.println(domande.get(secondaScelta).getDomanda());
                    System.out.println(domande.get(secondaScelta).getRisposta());
                    System.out.println("Scrivi la nuova risposta.");
                    sc.nextLine();
                    String nuovaRisposta = sc.nextLine();
                    System.out.println("Risposta aggiornata.");
                    domande.get(secondaScelta).setRisposta(nuovaRisposta);

                    break;
                case 3:
                    System.out.println("Usciamo dal programma.");
                    condizione = false;
                    break;
                default:
                    System.out.println("Selezione Errata.");
                    break;
            }


        }


    }

    public static void mostraDomandeERisposte(ArrayList<DomandaERisposta> domande, boolean indici){
        for (int i = 0; i<domande.size();i++){

            if (indici){
                System.out.println("Domanda "+i+" "+ domande.get(i).getDomanda());
                System.out.println("Risposta "+i+" "+ domande.get(i).getRisposta());
            }else{
                System.out.println("Domanda "+ domande.get(i).getDomanda());
                System.out.println("Risposta "+ domande.get(i).getRisposta());
            }
        }
    }
}
