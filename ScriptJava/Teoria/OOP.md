# TEORIA JAVA

## OOP

L'OOP è un paradigma di programmazione che permette di definire oggetti che possono interagire tra loro 
scambiandosi messaggi. 
Si possono definire relazioni di interdipendenza tra concetti da modellare secondo: 

- Uso - devo poter usare i pezzi del mio codice

- Contenimento - devo poter contenere i pezzi del mio codice
  ES. metodi

- Specializzazione - devo poter specializzare i pezzi del mio codice
  ES. Oggetti / metodi non void

----------------------------------------------------------------------------------------------------
## ISOLAMENTO FUNZIONALE

Ogni blocco di codice singolo dev'essere indipendente nella sua funzione. L'isolamento funzionale ha lo scopo di rendere le parti di codice
più piccole e testabili possibile.

----------------------------------------------------------------------------------------------------
## CLASSI

Una classe é un modello astratto per la creazione di un oggetto (BLUEPRINT)

- Incapsulamento - Capacità del codice di nascondere se stesso alle altre parti del codice - limitare l'accesso agli elementi degli oggetti
  ES. Quando usiamo i metodi 

- Ereditarietà - Creare classi parenti che prendono caratteristiche dalla classe "Madre"

  ES. 

- Polimorfismo - Capacità di un elemento di trasformarsi
  ES. Casting (Implicito, Esplicito | Widening Casting, Casting Restringente)

----------------------------------------------------------------------------------------------------
## METODI

La loro caratteristica, permette di chiamare i metodi che hanno un codice, che nonostante sia presente
dentro al programma, non verrà letto fino a quando non viene richiamato. Ciò permette al programma di 
non seguire l'ordine del codice, ma di saltare ad un altra parte del codice per poi tornare a seguire
l'ordine.

----------------------------------------------------------------------------------------------------
## ASTRAZIONE

L'Astrazione è il concetto di slegare il cosa dal come
Proprietà base quasi data per scontata.

----------------------------------------------------------------------------------------------------
## TIPIZZAZIONI

- Tipizzazione forte - dobbiamo specificare il tipo

- Tipizzazine debole - possiamo non specificare il tipo

----------------------------------------------------------------------------------------------------
## OGGETTI

L'oggetto è un instanza della classe che ha tutti i suoi metodi e i suoi attributi, tranne quelli di
tipo STATIC.
L'oggetto viene creato utilizzando la sua classe di appartenenza come se fosse un blueprint.

Un oggetto si crea con la keyword new.
Un metodo è composto tramite la classe di appartenenza e viene 

----------------------------------------------------------------------------------------------------
## PROPRIETARIETÀ 
Permette di definire elementi proprietari della classe e proprietari dell'oggetto

Static indica quando un metodo o un attributo è della classe e non dell'oggetto
Non statico indica quando un metodo o un attributo è dell'oggetto

----------------------------------------------------------------------------------------------------
## COSTRUTTORE

Un costruttore è un metodo che serve per la creazione degli oggetti.
Esistono costruttori con e senza parametri.

----------------------------------------------------------------------------------------------------
## MODIFICATORI DI ACCESSO 

Definiscono lo scope dell'elemento su cui sono applicate

- Private - Chiunque può accedere a quel dato
- Public - Solo la classe di appartenenza può accedere a quel dato
- Default: Fa si che sia visibile solo nel blocco di codice in cui lo abbiamo creato

Usiamo par le classi
- public - la classe è accessibile da qualsiasi altra classe
- default - la classe è accessibile solo dalle classi nello stesso pacchetto. Questo viene usato quando non si specifica un modificatore
 

Usiamo per attributi e metodi
- public - il codice è accessibile per tutte le classi
- private - il codice è accessibile solo all'interno della classe o dell'oggetto
- default - ...
- protected

MODIFICATORI NON DI ACCESSO

Per le classi usiamo 
- final - la classe non può essere ereditata da altre classi
- abstract - la classe non può essere usata per creare oggetti...

Per attributi metodi e costruttori
- final - attributi e metodi non possono essere sovrascritti/modificati
- static - attributi e metodi che appartengono alla classe, piuttosto che all'oggetto
- abstract - può essere usato solo in una classe astratte e può essere...
- synchronized
- volatile


----------------------------------------------------------------------------------------------------
## ARRAY E ARRAYLIST

Sono entrambi dei tipi di aggregazione, che servono per aggregare tipi di variabili dello stesso tipo
con un unico nome ma con diverso indice.

Gli ArrayList sono degli oggetti e non abbiamo il bisogno di specificare la dimensione di questo.

Gli array non sono oggetti, ma semplici aggregazioni di dati, e una volta dichiarati non possiamo aggiungere
valori oltre il numero presente durante la creazione.

----------------------------------------------------------------------------------------------------
## BLOCCHI CONDIZIONALI

Un blocco condizionale è un blocco di codice che andrà eseguito quando una condizione verificabile è
vera.

Esistono diversi tipi di condizioni:

- IF - controlla condizione e se vera esegue blocco di codice
- IF ELSE - controlla condizione e se vera esegue blocco di codice, altrimenti (ELSE) esegue un altro 
            blocco di codice
- ELSE IF - controlla condizione, se vera esegue blocco di codice, altrimenti passa alla seconda 
            condizione
- SWITCH - controlla valore passato, e esegue il blocco di codice corrispondente, in base al case
           corrispondente

----------------------------------------------------------------------------------------------------
## ITERAZIONI / LOOP

L'iterazione è un blocco di codice ripetuto fintanto che una condizione è vera.

Esistono diversi tipi di iterazioni:

- WHILE - verifica la condizione prima che si esegua il blocco di codice e poi lo esegue fintato che
          la condizione è vera

- DO WHILE - verifica la condizione solo dopo la prima esecuzione del blocco di codice e poi lo esegue fintato che
             la condizione è vera

- FOR - crea indice che viene utilizzato per il numero delle volte, in base alla condizione, che il blocco di codice
        andrà ripetuto

- FOR EACH - Valuta la lunghezza di un elemento e esegue il ciclo sulla base di ciò

----------------------------------------------------------------------------------------------------
## FINAL

Si può usare su:

- Variabili - permette di creare costanti che rimangono tali nel codice, senza essere modificate

- Metodi - impediscono l'overload e quindi il cambiamento della lista delle variabili utilizzate

----------------------------------------------------------------------------------------------------
## INCAPSULAMENTO
Due definizioni collegate ma distinte:

- meccanismo del linguaggio atto a limitare l'accesso diretto agli elementi dell'oggetto
- costrutto del linguaggio che favorisce l'integrazione dei metodi apropri della classe all'interno della classe stessa

L'incaplusamento da:
- Migliore controllo degli attributi e dei metodi di classe
- Gli attributi di classe possono essere resi di sola lettua o di sola lettura con getter e setter
- Flessibilità: il programmatore può modificare una parte del codice senza influire sulle altre parti
- Maggiore sicurezza e mascheramento dei dati



----------------------------------------------------------------------------------------------------
## STATIC

Static associa la proprietarietà alla classe e non all'oggetto. Quindi il metodo/variabile sarà di proprietà della classe.

Usato su una classe non permette di creare istante/oggetti ma diventa lei stessa un oggetto unico. 
Per accedere ad essa non si usa il nome dell'oggetto ma direttamente quello della classe.

----------------------------------------------------------------------------------------------------
## OVERRIDE
Funzionalità che consente a una sottoclasse o classe figlia di fornire un'implementazione specifica di un metodo che è già fornito da una delle sue superclassi o classi genitore.
Quando un metodo in una classe ha lo stesso nome, gli stessi parametri o firma e lo stesso tipo restituito (o sottotipo) di un metodo nella sua superclasse, si dice che il metodo nella sottoclasse sovrascrive il metodo della superclasse -classe.

----------------------------------------------------------------------------------------------------
## EREDITARIETÀ

Permette di poter definire un legame di dipendenza di tipo gerarchico tra classi diverse. Una classe deriva dall'altra se da essa ne eredita il comportamento e le caratteristiche. 
La classe "figlia"si dice classe derivata
La classe "padre" si dice classe base o superclasse, e contiene il codice comune a tutte le classi derivate

Ogni classe derivata rappresenta una specializzazione della superclasse, ma eredita da essa i suoi comportamenti. Per ereditare una classe usiamo il comando extend nella creazione di una classe.

    public class Ciao extend Saluti{
      String ciao;
    }

----------------------------------------------------------------------------------------------------
## OVERRIDING

Sovrascrizione del metodo della superclasse da parte di una classe derivata.

I meotdi privati non possono essere sovrascritti.

Il metodo di override deve avere lo stesso tipo di ritorno.

Da Java 5.0

Non possiamo sovrascrivere il costruttore

L'overriding, a differenza dell'overloading, si verifica solamente quando una classe viene ereditata da un altra

----------------------------------------------------------------------------------------------------
## POLIMORFISMO

Capacità di un elemento di trasformarsi
ES. Casting (Implicito, Esplicito | Widening Casting, Casting Restringente)

Il polimorfismo rappresenta il principio in funzione della quale diverse classi derivate possono implementare uno stesso comportamento definito nella classe base in modo differente. (ES. tutti gli animali fanno)

Elementi fondamentali del polimorfismo sono:
- il polimorfismo in fase di compilazione
- il linker

----------------------------------------------------------------------------------------------------
## ERRORI ED ECCEZIONI

Lo strumento per gestire le eccezioni è il try catch

try: istruzione che consente di definire un blocco di codice da verificare per gli errori durante l'esecuzione
catch: istruzione che consente di definire locco di codice in caso di errore

throw: definisce un eccezione per un metodo o un blocco di codice

finally: definisce un blocco di codice che viene eseguito quando esiste un try

----------------------------------------------------------------------------------------------------
## WRAPPING

Sono delle classi che incapsulano dei tipi convertendo questi tipi ad oggetti.
Come da int a Integer.

----------------------------------------------------------------------------------------------------
## INNER CLASS
Sono classi nidificate, cioè mettere classi dentro un altra classe, rendendo il codice più leggibile. Per accedere alla classe interna, creiamo un oggetto della classe esterna, quindi crea un oggetto della classe interna.

Gli elementi della classe interna non sono anche della classe esterna ma solo di quella interna

    class Classefuori{
      int x = 10;
      class Classedentro{
        int y=10;
      }
    }
    public class Main{
      public static void main(String[] args){
        Classefuori fuori = new Classefuori():
        Classefuori.Classedentro Dentro = Fuori.new Classedentro();
        System.out.println(Dentro.y + Fuori.x);
      }
    }
    
----------------------------------------------------------------------------------------------------

