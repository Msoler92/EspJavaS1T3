Sprint 1, Tasca 6, Nivell 3, Exercici 1

"Per fer aquest exercici necessites una interfície anomenada Telefon i tres classes: Smartphone, Generica i la Principal.

 La interfície Telefon ha de tenir un mètode anomenat trucar(). La classe Smartphone ha d’implementar Telefon, i a més del mètode trucar(), també ha de tenir el mètode ferFotos().

 La classe Generica ha de tenir dos mètodes genèrics, el primer ha de rebre un tipus d’argument limitat per la interfície Telefon i el segon ha de rebre un argument limitat per la classe Smartphone. Des d’aquests dos mètodes crida els mètodes pertinents de Telefon i Smartphone. En el main() de la classe Principal, passa un objecte de la classe Smartphone als dos mètodes genèrics de la classe Generica.

 El mètode limitat per la interfície Telefon, de la classe Generica, pot cridar al mètode ferFotos()?"

 Notes:
 - Resposta a la pregunta: el mètode limitat per la interfície Telefon no pot cridar el mètode ferFotos, ja que no totes les classes que implementen Telefon necessariament extenen Smartphone.