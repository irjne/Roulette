# Roulette
Implementare il gioco della roulette seguendo le informazioni seguenti. 
Implementare, poi, un loop infinito per determinare quando il player finisce i soldi.

Classi: 
* Roulette 
  * griglia con 37 numeri (da 0 a 36), due colori (Rosso/Nero).
  * ogni volta che viene effettuata una puntata, la roulette deve estrarre un numero.
  
* Puntatore 
  * credito
  
* Puntate 
  * giocatore, tipo di puntata
  * ad ogni puntata, vengono sottratti soldi al puntatore. 
  * si può puntare su numero, colore o pari/dispari: 
    * se punto su 3 e punto x, vinco 36 volte x. Il banco paga la probabilità che esca quel numero. 
    * se punto su rosso e punto y, vinco 2 volte y. 
    * se punto su pari e punto z, vinco 2 volte z.
    

