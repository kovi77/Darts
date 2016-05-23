# Darts scoreboard

### Program leírása

A program egy Darts játék levezető, ami a pontok számításában segít. A program 
használatához egy egyszerű regisztáció szükséges, a statisztikák vezetéséhez.

### Rendszerkövetelmények

A program lefordításához `Maven 3.x` és `Java 1.8` szükséges.

### Futtatás

A `pom.xml` mappájába a következő parancsok kiadása szükséges:

```
mvn clean package
java -jar target/Darts-1.0-jar-with-dependencies.jar
```

A site legenerálásához:

```
mvn site
```
