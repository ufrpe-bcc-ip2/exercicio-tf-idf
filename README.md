## Implementando o algoritmo TF-IDF

#### Definição
TF-IDF (Term Frequency - Inverse Document Frequency) é uma medida estatística que tem o intuito de indicar a importância de uma palavra de um documento em relação a uma coleção de documentos ou em um corpus.

Seu valor pode ser obtido através da fórmula:

```tfidf(w) = tf(w) * idf(w)```

Onde:
```
tf(w) = número de vezes que o termo w aparece no documento\
idf(w) = log (N / D(w))\
N = número total de documentos\
D(w) = número de documentos contendo o termo w
```

Implemente um programa em Java que receba como argumento um diretório, e leia todos os arquivos txt existentes
e calcule o tf-idf de cada termo presente no arquivo. 

Por exemplo, a execução do seu programa para o diretório doc
```
doc/
  |
  +--arquivo1.txt
  |
  +--arquivo2.txt
```
 
```
java -jar app.jar doc
```
Deve ler os arquivos txt do diretório doc, e gerar um arquivo CSV com o TF-IDF de cada termo, para cada documento (matriz N x |w|, N=número de documentos, |w|=número de palavras nos documentos), por exemplo:
```
    arquivo,        casa, texto, exemplo, ....
    arquivo1.txt,   0.1,    0.5,    0.9, ... 
    arquivo2.txt,   0.24,   0.25,   0.7, ...
``` 


*Observações:*
- Defina as classes / interfaces que julgar necessárias para que seu sistema tenha aderência aos conceitos de OO vistos na disciplina. 
    - Por exemplo, quais os atributos/métodos que deverão ser implementados na classe para representar um Documento?
    - Quais os tipos de coleções mais adequadas?

#### Entrega
- Seu projeto deve ser um projeto maven válido, i.e., `mvn clean package` deve produzir 
um executável chamado `java -jar target/<seu-projeto>.jar`
