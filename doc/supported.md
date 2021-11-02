## (1) Classplit:
  - (i) nein, da hier ein Decorator erzeugt wird.
  - (ii) Ja
## (2) Class Merge:
  - (i) Ja, movement von typemembers ist vorhanden.
## (3) Breaking Dependency Cycles
  - (i) Nein, da es `1.i` ausführt.
  - (ii) ????
## (4a) Inheritance
  - (i) Ja Inheritance umdrehen kann Refactorlizar
  - (ii) Der Nutzer müsste manuell die Typemember von A und S verschieben, eher nicht unterstützt
  - (iii) Nein, Extension Erstellung mittels Decorator ist nicht vorhanden
## (4b) Reference
  - (i) Nein, Extension Erstellung mittels Decorator ist nicht vorhanden.
  - (ii)  Nein, Extension Erstellung mittels Decorator ist nicht vorhanden
  - (iii) Nein, Extension Erstellung mittels Decorator ist nicht vorhanden

## (4c) Bidir. Ref.
  - (i) Öh, das klingt fragwürdig im Text. 
> The bidirectional nature implies a redundant reference, which can be removed so that only one reference remains.

Da bin ich mir nicht so sicher.
```java
class Foo {

  static int sum(a,b) ...
  optimization to use Bar.multiply
}
class Bar {

  static int multiply(a,b) ...
  optimization to use Bar.sum and shifts

}
```
Da erscheint mir die bidirectionale reference in beide richtungen notwendig.
## (4d) Containment
  - (i) Nein
## (5) Horizontal Split
  - (i) jein
  - (ii) jein
  - (iii) jein
  - (iiii) jein
Das alles bieten wir ja auf Type Ebene an => auf Komponenten vorhanden, aber wir können keine neue Komponenten erstellen
## (6) Vertical Split
  siehe 5
## (7) Merge
  siehe 5
## (8) Extension Extraction
  siehe 5