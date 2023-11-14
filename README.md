# Proyecto - Examen IVb - Divisiones

El alumno debe implementar la jerarquía Division descrita en el diagrama de clases

## Ejecución

Tu programa debería ejecutarse de la siguiente manera:

```
La Mas Grande
=============

Division Internacional:
Proporcione el nombre de la division:La Mas Grande Int - UK
Proporcione el numero de empleados de la division:2000
Proporcione el pais donde se ubica la division:England
Proporcione el idioma del pais:English
Division Local:
Proporcione el nombre de la division:La Mas Grande - Tijuana
Proporcione el numero de empleados de la division:150
Proporcione el estado donde se ubica la division:Baja California

Nombre: La Mas Grande Int - UK, Empleados: 2000, Tipo Internacional, Pais: England, Idioma: English
Nombre: La Mas Grande - Tijuana, Empleados: 150, Tipo Local, Estado: Baja California
```

## Diagrama de clases
[Editor en línea](https://mermaid.live/)
```mermaid
---
title: Division
---
classDiagram
      Division <|-- DivisionInternacional
      Division <|-- DivisionLocal
      Division: -nombre
      Division: -numeroEmpleados
      Division: +tipoDivision()*
      class DivisionInternacional{
            -pais
            -idioma
            +tipoDivision()
      }
      class DivisionLocal{
            -estado
            +tipoDivision()
      }
```
[Referencia-Mermaid](https://mermaid.js.org/syntax/classDiagram.html)

## Diagrama de clases UML con draw.io
El repositorio está configurado para crear Diagramas de clases UML con ```draw.io```. Para usarlo simplemente agrega un archivo con extensión ```.drawio.png```, das doble clic sobre el mismo y se activará el editor ```draw.io``` incrustado en ```VSCode``` para edición. Asegúrate de agregar las formas UML en el menú de formas del lado izquierdo (opción ```+Más formas```).

## Uso del proyecto con make

### Default - Compilar+Probar+Ejecutar
```
make
```
### Compilar
```
make compile
```
### Probar todo
```
make test
```
### Ejecutar App
```
make run
```
### Limpiar binarios
```
make clean
```
## Comandos Git-Cambios y envío a Autograding

### Por cada cambio importante que haga, actualice su historia usando los comandos:
```
git add .
git commit -m "Descripción del cambio"
```
### Envíe sus actualizaciones a GitHub para Autograding con el comando:
```
git push origin main
```
## Comandos individuales
### Compilar

```
find ./ -type f -name "*.java" > compfiles.txt
javac -encoding utf-8 -d build -cp lib/junit-platform-console-standalone-1.5.2.jar @compfiles.txt
```
Ejecutar ambos comandos en 1 sólo paso:

```
find ./ -type f -name "*.java" > compfiles.txt ; javac -encoding utf-8 -d build -cp lib/junit-platform-console-standalone-1.5.2.jar @compfiles.txt
```


### Ejecutar Todas la pruebas locales de 1 Test Case

```
java -jar lib/junit-platform-console-standalone-1.5.2.jar -class-path build --select-class miTest.AppTest
```
### Ejecutar 1 prueba local de 1 Test Case

```
java -jar lib/junit-platform-console-standalone-1.5.2.jar -class-path build --select-method miTest.AppTest#testPais
```
### Ejecutar App
```
java -cp build miPrincipal.Principal
```
Los comandos anteriores están considerados para un ambiente Linux. [Referencia.](https://www.baeldung.com/junit-run-from-command-line)