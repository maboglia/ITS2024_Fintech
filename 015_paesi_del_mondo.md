# Esercizio Java: Quiz sui Paesi del Mondo

Realizzate un'applicazione Java che metta alla prova le conoscenze geografiche degli utenti tramite un quiz sui paesi del mondo. Ogni pagina presenterà una domanda relativa a un determinato paese, ad esempio indicare la capitale del paese date fornirà tre (o più) opzioni di risposta, di cui solo una corretta.

## Descrizione del Quiz

Il quiz conterrà una serie di domande riguardanti vari aspetti dei paesi del mondo, come la capitale, la lingua ufficiale, la popolazione, la bandiera, ecc. Ad esempio, una domanda potrebbe essere: "Qual è la capitale dell'Italia?" con le seguenti opzioni di risposta:

1. Roma
2. Madrid
3. Berlino

La risposta corretta sarebbe "Roma".

## Implementazione

1. Utilizzare una tabella per memorizzare le informazioni dei paesi del mondo: è fornita in allegato la tabella `countries` con tutti i dati.
2. Definire una classe `Country`, o `Paese` che costituisce la mappatura in Java della entity del DB.
3. Definire (opzionale) una classe `Domanda` che rappresenti una singola domanda del quiz. Ogni domanda avrà un testo, un'opzione corretta e due (o più) opzioni errate, potete gestire un punteggio differente per ogni risposta.
4. Creare una classe `Quiz` (o un `@Service` in Spring) che gestisca la logica del quiz. Questa classe dovrebbe contenere un elenco di domande e gestire il caricamento delle domande da un file di dati o da una sorgente dati.
5. Implementare una classe `QuizRunner` (o un `@Controller` in Spring) che gestisca le viste dell'interfaccia utente. 
6. Implementare le viste web per presentare le domande agli utenti e raccogliere le loro risposte, fornendo feedback sull'accuratezza delle risposte (p.es punteggio, applausi, ...).


## Funzionalità Aggiuntive (per gruppi di lavoro)

Per arricchire l'esperienza del quiz, potete considerare l'implementazione delle seguenti funzionalità:

- Aggiungere un timer per ogni domanda, dando agli utenti un limite di tempo per rispondere.
- Tenere traccia del punteggio dell'utente e visualizzare il punteggio finale alla fine del quiz.
- Consentire agli utenti di scegliere tra diversi livelli di difficoltà del quiz.
- Aggiungere domande bonus o domande a risposta multipla.
- Implementare una funzionalità di salvataggio dei punteggi migliori per tener traccia delle prestazioni degli utenti nel tempo.

Implementate il quiz seguendo le best practice di programmazione orientata agli oggetti e utilizzando classi, metodi e attributi appropriati per garantire la chiarezza e la manutenibilità del codice.

---

### In allegato:

- Dump SQL del db
- Workflow e Wireframe del progetto
- Flags