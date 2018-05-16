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

Implemente um programa em Java que leia um arquivo txt, no qual cada linha corresponda a um documento, no formato <id do documento>; <conteúdo> e calcule o tf-idf de cada termo presente no arquivo. 

Por exemplo, seja o arquivo de entrada exemplo.txt:
```
1; este é um texto de exemplo
2; este é um outro texto de exemplo
...
```

A saída gerada pelo seu programa deve ser uma matriz, no formato N x |w| (número de documentos x número de palavras nos documentos)

*Observações:*
- Defina as classes / interfaces que julgar necessárias para que seu sistema tenha aderência aos conceitos de OO vistos na disciplina. 
    - Por exemplo, quais os atributos/métodos que deverão ser implementados na classe para representar um Documento?

#### Entrega
Cada aluno deve criar um repositório no GitHub, e enviar pelo AVA o link para 
O repositório deve seguir uma estrutura semelhante a este repositório, contendo os seguintes artefatos:
- `/doc`: Diagrama de classes do sistema
- `/src`: Código fonte do sistema
- `README.md`: arquivo explicando como executar seu programa
- `<seu_programa>.jar`: arquivo empacotado (JAR) para executar seu programa
