##########################################
Anotacions sobre les propietats protegides
##########################################

* Autor/a: Laura Martin

* Data: 6-mar-2022

Introducció
===========

En aquest exercici incloc les meves anotacions sobre el tema de
*propietats protegides* dins de la *programació orientada a objectes*.

Considerarem la nova versió de ``GatRenat``::


::

    01   public class GatRenat {
    02       private int vides = 7;
    03       public int getVides() {  //  retorna el nombre de vides
    04           return vides;
    05       }
    06       public void setVides(int novesVides) {   // modifica el nombre de vides si ens donen un de vàlid
    07           if (novesVides >= 0) {
    08               vides = novesVides;
    09           }
    10       }
    11   }


Pregunta 1. L'accés de sempre
=============================

Si ``UsaGatRenat`` fos:

::

       public class UsaGatRenat {
           public static void main(String[] args) {
               GatRenat renat = new GatRenat();
               System.out.println("El gat Renat té " + renat.vides + " vides");
           }
       }

Ens trobem que com la propietat vides és privada

Penso que passa perquè UsaGatRenat no pot accedir

Pregunta 2. Un nou accés
========================

En modificar el codi de ``UsaGatRenat`` com:

::

     public class UsaGatRenat {
         public static void main(String[] args) {
             GatRenat renat = new GatRenat();
             System.out.println("El gat Renat té " + renat.getVides() + " vides");
         }
     }

La diferència respecte a la versió de la pregunta anterior és .

El resultat ara és XXX

Penso que passa això perquè esta agafant del métode setVides que és públic

Pregunta 3. Canviant valor
==========================

Per què des del ``main()`` de ``UsaGatRenat`` poguem dir que ``renat`` té
5 vides, cal fer Posant setVides a 5.

El codi de ``UsaGatRenat`` seria:

::

    public class UsaGatRenat {
     public static void main(String[] args) {
         GatRenat renat = new GatRenat();
         renat.setVides(5);
         System.out.println("El gat Renat té " + renat.getVides() + " vides");
     }
 }

La sortida en executar-lo seria:

:: 

    $ java UsaGatRenat
     El gat Renat té 5 vides


La meva explicació de perquè això és així és li dones un valor a setVides


Pregunta 4. Un valor absurd
===========================

En intentar assignar de la manera anterior -12 en comptes de 5 vides, ens
trobem que XXX

El codi seria:

::
public class UsaGatRenat {
     public static void main(String[] args) {
         GatRenat renat = new GatRenat();
         renat.setVides(-12);
         System.out.println("El gat Renat té " + renat.getVides() + " vides");
     }
 }
  

La sortida en executar-lo seria:

:: 

    $ java UsaGatRenat
    El gat Renat té 7 vides


La meva explicació de perquè això és així és Crec que realment no pasa res, a setVides hi ha una limitació de 0, al ser -12, no fa res, i continua tenint les 7 vides inicials


Pregunta 5. I des de ``GatRenat``?
==================================

He experimentat com es comporta ``private`` des del ``main()`` del propi
``GatRenat``. En concret, he provat:

::

   public class GatRenat {
       private int vides = 7;
       public int getVides() {  //  retorna el nombre de vides
           return vides;
       }
       public void setVides(int novesVides) {   // modifica el nombre de vides si ens donen un de vàlid
           if (novesVides >= 0) {
               vides = novesVides;
           }
       }
       public static void main(String[] args) {
           GatRenat renat = new GatRenat();
           renat.vides = -12;
           System.out.println("El gat Renat té " + renat.vides + " vides");
       }
   }

En intentar compilar i executar aquesta versió em trobo què Compila perfectament

Comparant-lo amb el que passava a la pregunta 1, veiem que 

La meva explicació és Crec que com GatRenat pot accedir a la propietat vides directament,
 pots possar-li qualsevol valor

Pregunta 6. Valors absurds novament
===================================

Un cop hem vist el funcionament d'aquesta versió de ``GatRenat``, ens
podem fer la següent pregunta:

    És possible posar un valor absurd a les vides d'una instància de
    GatRenat sense modificar el programa ``GatRenat.java``?

La meva resposta és XXX perquè XXX.

Pregunta 7. públic i privat
===========================

La meva idea del paper que juguen les paraules ``public`` i ``private`` a
les propietats d'una classe és XXX

Pregunta 8. Només *getter*
==========================

Aquesta implementació de ``GatRenat`` disposa de *getter* i de *setter*.
Aquests venen definits pels mòduls XXX i XXX.

En cas que ``GatRenat`` només disposés de *getter*, el resultat seria XXX.

En canvi, si només en tingués *setter* el que passaria és XXX.

Finalment, si no en tingués cap dels dos, ens trobaríem que XXX.


Pregunta 9. Diferències amb els mòduls ja coneguts
==================================================

Els mòduls ``getVides()`` i ``setVides()`` tenen una definició
lleugerament diferent als mòduls que hem declarat abans del tema de POO.
En concret XXX
