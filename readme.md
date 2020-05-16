<img src="https://ffxivita.it/wp-content/uploads/2019/11/215b08a5.png" align="center">

## ChocoColor
<img src="https://ffxivita.it/wp-content/uploads/2020/05/330c403c.png" align="right">
Qusto semplice algoritmo risolverà il problema del Feeding del Chocobo in FFXIV per poterlo colorare. Quando avrete inserito il colore attuale del vostro Chocobo e quello desiderato, lo script vi mosterà a video gli items richiesti e l'ordine corretto per assicurarvi il risultato corretto.

### Perchè?
Ho visto parecchi siti dove potete controllare il numero di item totali per modificare il colore al Chocobo. Raccomandano di alternare le bacche per evitare di andare oltre il range del valore RGB (da 0 a 255), che causa il fallimento di tutto il processo. Questo algoritmo assicura che non andrete mai fuori scala e assicura quindi l'esito desiderato.

### Uso
Eseguite il file exe o il file jar compilato con due parametri. Il primo sarà il colore di partenza del vostro chocobo, mentre il secondo sarà il colore desiderato. Una corretta scrittura dei colori, vi darà il processo da seguire assieme agli item corretti. In caso contrario, mosterà la lista dei colori disponibili.

### Esempi
<img src="https://ffxivita.it/wp-content/uploads/2020/05/eba23a64.png" align="left">

```bash
choco-color.exe "Desert Yellow" "Dalamud Red"
```
```bash
java -jar choco-color.jar "Desert Yellow" "Dalamud Red"
``` 

### Release
Le release sono pubblicate a [questo indirizzo](https://github.com/DarkArtek/ChocoColor/releases/latest/)
