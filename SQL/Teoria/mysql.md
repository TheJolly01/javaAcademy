# TEORIA SQL
## SELECT 

Serve per selezionare la colonna, unito con DISTINCT serve per restituire solo valori distinti tra loro, mai uguali.
-----------------------------------------------------------------------------------------------------------------------------------------------
## FROM 

Serve per indicare database e tabella

	FROM database.tabella
	
-----------------------------------------------------------------------------------------------------------------------------------------------
## WHERE

WHERE è una clausola che serve per mettere una condizione in modo da filtrare

	SELECT * FROM world.country
	WHERE Region ='Antarctica'

-----------------------------------------------------------------------------------------------------------------------------------------------
## OPERATORI

	= uguale
	> maggiore
	< minore
	<= minore o uguale
	>= maggiore o uguale
	<> o |= not

-----------------------------------------------------------------------------------------------------------------------------------------------
## BETWEEN 

Si usa in un intervallo

	(BETWEEN 0 and 10)

-----------------------------------------------------------------------------------------------------------------------------------------------
## LIKE 

Cerca un eguaglianza parziale o totale specificando il pattern fisso, usando metacarattere % (LIKE 's%').
Ci sono diversi metacaratteri ... es _ qualsiasi carattere singolo.

-----------------------------------------------------------------------------------------------------------------------------------------------
## IN 

Per specificare più valori possibili 

	(IN(0,1000)

-----------------------------------------------------------------------------------------------------------------------------------------------
## NULL

Valore nullo, IS NULL o IS NOT NULL serve per verifare se un campo è null o no.

-----------------------------------------------------------------------------------------------------------------------------------------------
## AND, OR, NOT

- AND visualizza il record se tutte le condizioni sono soddisfatte
- OR visualizza il record se almeno una condizione è soddisfatta
- NOT visualizza il record se la condizione NON è soddisfatta

-----------------------------------------------------------------------------------------------------------------------------------------------
## ORDER BY 

Ordinare crescente o decrescente, standard = crescente

	SELECT * FROM world.country
	ORDER BY Region, SurfaceArea DESC

-----------------------------------------------------------------------------------------------------------------------------------------------
## INSERT INTO

Serve per inserire nuovi record in una tabella

	INSERT INTO table_name(column1,column2, column3)
	VALUES (value1, value2, value3)

-----------------------------------------------------------------------------------------------------------------------------------------------
## COPIA TABELLA:

	CREATE TABLE world.cityPersonal LIKE world.city;	- crea tabella simile alla prima
	INSERT world.cityPersonal SELECT * FROM world.city;	- inserisce tutti i valori della tabella che gli diciamo

-----------------------------------------------------------------------------------------------------------------------------------------------
## UPDATE

Serve per modificare i record esistenti in una tabella
	
	UPDATE table_name
	SET column1 = value1
	WHERE condition

-----------------------------------------------------------------------------------------------------------------------------------------------
## DELETE

Serve per eliminare i record esistenti in una tabella

	DELETE FROM table_name
	WHERE condition;
	
Questa istruzione va ad eliminare solo i record, la struttura della tabella rimane invariata

-----------------------------------------------------------------------------------------------------------------------------------------------
## SELECT TOP

Serve per specificare il numero di record da restituire
"Non tutti i sistemi di database supportano questa istruzione, in MYSQL supporta LIMI per selezionare un numero limitato di record"
	
	SELECT column_name
	FROM table_name
	WHERE condition
	LIMIT number;

-----------------------------------------------------------------------------------------------------------------------------------------------
## LIMIT

Ci permette di indicare il numero massimo di record da recuperare da un database, questa operazione
tendenzialmente si esegue per tabelle con un grande numero di record ottimizzando le prestazioni

	SELECT * FROM Customers
	LIMIT 50;

-----------------------------------------------------------------------------------------------------------------------------------------------
## ALIAS

Servono per assegnare un nome temporaneo ad un elemento come una tabella, colonna, eisultato ecc

Gl ALIAS possono essere utili quando:
- sono coinvolte più tabelle in una Query
- vengono usate le funzioni in una Query
- i nomi delel colonne sono grandi o poco leggibili;
- due o più coilonne vengono combinate insieme

In ALIAS viene usata la parola AS quando andiamo a selezionare o richiamare in SELECT o in FROM l'elemento a cui assegnare il nome

	SELECT column_name AS aliaa_columnName
	FROM table_name AS alias_tableName

-----------------------------------------------------------------------------------------------------------------------------------------------
## FUNZIONI

	MIN() e MAX()
	
restituiscono il massimo e il minimo valore

	SELECT MIN(column_name)
	FROM table_name
	WHERE condition;
	
ES pratico: 	SELECT MAX(Price) AS LargestPrice
			FROM Product;

-----------------------------------------------------------------------------------------------------------------------------------------------
## COUNT() AVG() SUM()

Ssono funzioni che eseguono un calcolo restituendo un valore specifico

- COUNT() restuisce il numero di record selezionati
- AVG() restituisce il valore medio di una colonna con valori numerici
- SUM() restituisce la somma totale di una colonna con valori numerici

Tutte e tre le funzioni hanno lo stesso tipo di sintassi e possono essere associate a delle condizioni con WHERE

	SELECT SUM(column_name)
	FROM table_name
	WHERE condition;

-----------------------------------------------------------------------------------------------------------------------------------------------
## METACARATTERI

- I metacaratteri sono dei caratteri che servono per sostituire uno o più caratteri in una stanza. Vengono utilizzati nelle condizioni come WHERE e sono:
- - % zero o più caratteri	"bl%"= bl, black, blue, blob
- - "_" un singolo carattere	"h_o" = hot, hat,hit
- - "[]" ogni singolo carattere all'interno delle parentesi	"h[oa]t" = hot e hat
- - "^" qualsiasi carattere non compreso tra parentesi		"h[^oa]t" = hit
- - "-" qualsiasi carattere all'interno del range specificato	"c[a-b]t" = cat e cbt

I metacaratteri possono essere usati in combo

-----------------------------------------------------------------------------------------------------------------------------------------------
## IN

È un operatore che consente di specificare più valori in una clausola, una scorciatoioa per più condizioni OR

	SELECT column_name(s)
	FROM table_name
	WHERE column_name IN (value1,value2,...);

-----------------------------------------------------------------------------------------------------------------------------------------------
## BETWEEN

È un operatore che seleziona valori all'interno di un determinato intervallo, l'operatore è inclusivo, ovver osono inclusi i valori di inizo e fine

	SELECT column_name(s)
	FROM table_name
	WHERE column_name BETWEEN value1 AND value2;

DATE IN BETWEEN

	#07/01/1996#
	'1996-07-01'

-----------------------------------------------------------------------------------------------------------------------------------------------
## GROUP BY

Serve per raggruppare righe con lo stesso valore, come ad esempio il codice della nazione in country e quello in city

	SELECT column_name(s)
	FROM table_name
	WHERE condition
	GROUP BY column_name(s)
	ORDER BY column_name(s);

-----------------------------------------------------------------------------------------------------------------------------------------------
## JOIN

- (INNER) JOIN - restituisce record con valore in comune
- LEFT (OUTER) JOIN - restituisce tutti i record della tabella di sinistra e i record con valori in comune
- RIGHT (OUTER) JOIN - restituisce tutti i record della tabella di destra e i record con valori in comune
- FULL (OUTER) JOIN - restituisce tutti i record quando è presente una corrispondenza in uno dei due a sinistra o a destra

Il comando è:

	SELECT Orders.OrderID, Customers.CustomerName, Orders.OrderDate
	FROM orders
	INNER JOIN Customers ON Orders.CustomerID=Customers.CustomerID;
	--------------------------------------------------------------
	USE world;
	WITH
	ctr AS (SELECT country.Code, country.name FROM country),
	lng AS (SELECT countrylanguage.Language, countrylanguage.CountryCode FROM countrylanguage)
	SELECT ctr.Code, ctr.Name, lng.Language, city.population
	FROM
	((ctr
	INNER JOIN lng ON ctr.Code = lng.CountryCode)
	INNER JOIN city ON city.countryCode = lng.countryCode)
	ORDER BY country.Code ASC;

	---------------------------------------------------------------
	CROSS JOIN o FULL JOIN
	UNISCE DUE TABELLE

	SELECT column_name(s)
	FROM table1
	CROSS JOIN table2;

	---------------------------------------------------------------

	SELF JOIN
	SELECT coumn_name(s)
	FROM table1
	SELF JOIN table2;

-----------------------------------------------------------------------------------------------------------------------------------------------
## UNION

Viene utilizzato per combinare il result set di risultati distinti di due o più istruzioni. Vanno però rispettate queste condizioni:

-Ogni istruzione SELECT all'interno deve avere lo stesso numero di colonne
-Le colonne devono inoltre avere tipi di dati simili
-Le colonne devono inoltre essere nello stesso ordine

	SELECT column_name(s) FROM table1
	UNION
	SELECT column_name(s) FROM table2;

-----------------------------------------------------------------------------------------------------------------------------------------------
## UNION ALL

Identico allo UNION solo che include tutti i valori anche i duplicati

	SELECT column_name(s) FROM table1
	UNION ALL
	SELECT column_name(s) FROM table2;

-----------------------------------------------------------------------------------------------------------------------------------------------
## HAVING

È una clausola che opera sui raggruppamenti invece che sui campi della tabella

	SELECT column_name(s)
	FROM table_name
	WHERE condition
	GROUP BY column_name(s)
	HAVING condition
	ORDER BY column_name(s);

Da una condizione al GROUP BY, se vera verrà visualizzato il raggruppamento altrimenti no


-----------------------------------------------------------------------------------------------------------------------------------------------
## EXISTS

viene utilizzato per verificare l'esistenza di qualsiasi recond in una sottoquery, restituisce TRUE se la sottoquery restituisce uno o più record

	SELECT column_name(s)
	FROM table_name
	WHERE EXISTS
	(SELECT column_name FROM table_name WHERE condition);

-----------------------------------------------------------------------------------------------------------------------------------------------
## ANY

restituisce TRUE se UNO qualsiasi dei valori della sottoquery soddisfa la condizione dell'operazione
	
	SELECT column_name(s)
	FROM table_name
	WHERE column_name operator ANY
	(SELECT column_name FROM table_name WHERE condition);

-----------------------------------------------------------------------------------------------------------------------------------------------
## ALL

restituisce TRUE se TUTTI i valori della sottoquery soddisfa la condizione dell'operazione

	SELECT column_name(s)
	FROM table_name
	WHERE column_name operator ALL
	(SELECT column_name FROM table_name WHERE condition);

-----------------------------------------------------------------------------------------------------------------------------------------------
## ALL nel SELECT:

	SELECT ALL column_name(s)
	FROM table_name

-----------------------------------------------------------------------------------------------------------------------------------------------
## CREATE DATABASE

	CREATE DATABASE nomedatabase;
	
-----------------------------------------------------------------------------------------------------------------------------------------------

## CREATE TABLE

	CREATE TABLE nometabella(
	columnName1 columnType1,
	columnName2 columnType2,
	...
	PRIMARY KEY (column)
	FOREIGN KEY(column) REFERENCES otherTable(column)
	)

-----------------------------------------------------------------------------------------------------------------------------------------------

## DATATYPE

- CHAR(size) - stringa grandezza fissa max 255  caratteri
- VARCHAR - stringa grandezza variabile max 65536 caratteri
- MEDIUMTEXT - stringa lunga fino a 16777215 caratteri
- LONGTEXT - stringa lunga fino a 4294967295 caratteri
- ENUM(val1, val2, val3...) - lista di valori possibili
- BOOL - valore booleano, 0 false e 1 true
- INT - valore numerico intero
- FLOAT - valore numero con virgola mobile
- DATE - data in formato YYYY-MM-DD

-----------------------------------------------------------------------------------------------------------------------------------------------

## DROP/TRUNCATE TABLE

DROP TABLe ci permette di eliminare un atabella con tutto il suo contenuto
	
	DROP TABLE table_name

TRUNCATE TABLE ci permette di eliminare tutti i record di un atabella senza eliminare la tabella

	TRUNCATE TABLE table_name
	
-----------------------------------------------------------------------------------------------------------------------------------------------

## ALTER TABLE

Permette di aggiungere, eliminare o modificare colonne in una tabella esistente
- ADD - per aggiungere una colonna
- DROP COLUMN - per eliminare una colonna
- MODIFY COLUMN - per modificare una colonna

	ALTER TABLE table_name
	ADD column_name datatype

È possibile modificare anche i vincoli di una tabella

-----------------------------------------------------------------------------------------------------------------------------------------------

##CONTRAINT

Per ogni colonna si possono specificare dei vincoli sul tipo di dato
	
	CREATE TABLE table_name(
	column1 datatype constraint,
	....);
	
I vincoli più utilizzati sono:
- NOT NULL - non ci può essere valore NULL
- UNIQUE - tutti i valori in una colonna sono differenti
- PRIMARY KEY - identifica in modo univoco ogni riga di una tabella
- FOREIGN KEY - identifica una chiave esterna
- CHECK - i valori in una colonna devono soddisfare una condizione
- DEFAULT - imposta un valore di default
- CREATE INDEX - crea un index per recuperare dati più velocemente

Esempio di utilizzo:

	CREATE TABLE Person(
	ID int NOT NULL,
	LastName varchar(255) NOT NULL
	First Name varchar(255) NOT NULL,
	Age int
	);

	CREATE TABLE Persona(
	ID Int NOT NULL,
	LastName varchar(255) NOT NULL,
	FirstName varchar (255),
	Age int,
	UNIQUE(ID));

È possibile indicare più colonne UNIQUE modificando la sintassi indicando il nome del vincolo:
	
	CONSTRAINT ctnt_name UNIQUE (ID, LastName)

Per poi elimimare un vincolo bisogna fare:

	ALTER TABLE table_name
	DROP INDEX ctnt_name;

-----------------------------------------------------------------------------------------------------------------------------------------------

##



