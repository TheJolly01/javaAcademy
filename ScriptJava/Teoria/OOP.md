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

Ogni blocco di codice singolo dev'essere indipendente nella sua funzione. Rendere le parti di codice
più piccole e testabili possibile.

----------------------------------------------------------------------------------------------------
## CLASSI

Una classe é un modello astratto per la creazione di un oggetto (BLUEPRINT)

- Incapsulamento - Capacità di far si che il nostro codice non sappia cosa fa
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
- public 
- default
 

Usiamo per attributi e metodi
- public
- private
- default
- protected

MODIFICATORI NON DI ACCESSO
Per le classi usiamo 
- final
- abstract

Per attributi metodi e costruttori
- final
- static
- abstract
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

----------------------------------------------------------------------------------------------------
## STATIC

Static associa la proprietarietà alla classe e non all'oggetto. Quindi il metodo/variabile sarà di proprietà della classe.

Usato su una classe non permette di creare istante/oggetti ma diventa lei stessa un oggetto unico. 
Per accedere ad essa non si usa il nome dell'oggetto ma direttamente quello della classe.

----------------------------------------------------------------------------------------------------
