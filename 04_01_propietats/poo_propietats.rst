###########################
Anotacions sobre propietats
###########################

* Autor/a: Laura Martin

* Data: 27-Feb-2022

Introducció
===========

En aquest exercici incloc les meves anotacions sobre el tema de *propietats*
dins de la *programació orientada a objectes*.

Les anotacions responen a diferents preguntes sobre aquest codi:

::

    01   public class GatRenat {
    02       public int vides = 7;         // vides disponibles del gat Renat
    03       public static void main(String[] args) {
    04           GatRenat renat;           // declarem la referència al gat
    05           renat = new GatRenat();   // creem la instància del gat Renat.
    06           System.out.println("Al gat Renat li queden " + renat.vides + " vides");
    07       }
    08   }

Pregunta 1. El nom del fitxer
=============================

Per que funcioni, el nom del fitxer que contingui el programa anterior ha
de ser ``GatRenat.java``.

Pregunta 2. Sortida
===================

En executar el programa ``GatRenat`` m'ha generat la següent sortida:

::

    $ java GatRenat
    Al gat Renat li queden 7 vides


Pregunta 3. Declaració de ``renat``.
====================================

La línia en que està declarada la variable ``renat`` que apareix a la
línia 6 és la línia 4.

Pregunta 4. Inicialització
==========================

El valor que es mostra per pantalla, és assignat a la línia 2.

Pregunta 5. No inicialització
=============================

Si a la línia especificada per la pregunta anterior no li assignem cap
valor, el que es mostrarà per pantalla és:

::

    Al gat Renat li queden 0 vides

Pregunta 6. Eliminem la línia 5
===============================

En cas que la línia 5 no hi sigui (per exemple, si la comento), es
produeix el següent resultat:

GatRenat.java:6: error: variable renat might not have been initialized
               System.out.println("Al gat Renat li queden " + renat.vides + " vides");
                                                              ^
1 error


Penso que passa això perquè renat no ha estat inicialitzat. .

Pregunta 7. Referència
======================

Penso que el el comentari de la línia 4 parla de *referència* perquè creem un objecte nou de classe GatRenat. A les variables declarem el tipus 'int', i el nom amb que ens referirem a aquesta variable 'vides', es treballa de la mateixa manera, la classe será 'GatRenat' i el nom, 'renat'.renat fa referencia a index de memories.

Crec que la  relació entre *referència* i *variable* és: Per exemple en el cas de GatRenat...


Pregunta 8. Instància
=====================

Respecte la línia 5:

* la instància és: Lo que hi ha a la memoria de GatRenat

* la variable és: renat

* la referència és: vides

* la classe és: GatRenat

Pregunta 9. ``vides`` i variables globals
=========================================

Les diferències presenta la variable ``vides`` respecte les 
*variables globals* són:

1. No te el static

2. No es pot accedir a vides, sense el renat.
