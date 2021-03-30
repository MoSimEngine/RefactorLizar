### InputClassen
target muss hierbei nicht existieren
```java
 sourceClass(String source)
```
```java
targetClass(String target)
```
### Naming

nur simple names kein paket movement
```java
renameSource(String newName)
```
```java
renameTarget(String newName)
```
### Movement
name wäre bei einem Feld der name, bei einer Methode name + signatur
  aufteilen in Methode,Feld, innerClass denkbar
```java
moveMember(String name)
```


```java
moveSourcePackage(String packageName)
```

```java
moveTargetPackage(String packageName)
```
### Für Vererbung
```java
sourceAsSuperClass()
```
```java
targetAsSuperClass()
```
### Endergebnis
So sollte das am ende aussehen:
```java
    builder.sourceClass("edu.kit.dsis.Source")
            .targetClass("edu.kit.dsis.Target")
            .moveTypeMember("a")
            .moveTypeMember("A")
            .sourceAsSuperClass()
            .createClassSplit()
            .refactor();
```

