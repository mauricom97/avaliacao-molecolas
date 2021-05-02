# Avaliação - Moléculas

Você deverá desenvolver classes conforme as especificações abaixo:

## Visão Geral

O sistema deve permitir a criação de Moléculas a partir de Partículas. Uma Partícula possui um nome. Cada Partícula pode ser de dois tipos: Átomo ou Isótopo. Um Átomo possui um número de subpartículas (Prótons, Nêutrons e Elétrons) que é sempre o mesmo. Um Isótopo possui números de Prótons e Elétrons igual, mas pode ter um número de Nêutrons diferente). O peso atômico de uma Partícula é um atributo calculado a partir das quantidades de Prótons, Nêutrons e Elétrons pela seguinte fórmula:

`pesoAtomico = numProtons * 1.0073 + numNeutrons * 1.0087 + numEletrons * 1 / 1836`

*Obs.: o pesoAtomico é calculado em Unidades de Massa Atômica – UMA. Cada UMA equivale a 1.66*10-27 kg. Não é preciso modelar o cálculo da massa em quilogramas, ainda...*

## Questão 1

Crie uma classe `Particula`, *abstrata*, com um atributo `nome` de tipo `String`, um construtor que inicialize o `nome`, um método `getNome()`, e um método *abstrato* `getPesoAtomico()` que retorne um número real (`double`).

## Questão 2

Crie uma classe chamada de `Atomo`, subclasse de `Particula`. Um `Atomo` possui sempre o mesmo número de prótons, elétrons e nêutrons. Modele isto através de um atributo único `numSubPart` (`int`). Por exemplo, o `Atomo` de *Hélio* possui `numSubPart = 2` (ou seja, possui dois prótons, dois nêutrons e dois elétrons). Esta classe deve possuir um construtor que recebe um `nome` e o `numSubPart`. Deve possuir a *implementação* de um método que calcule o `pesoAtomico` (ou seja, deve implementar o método `getPesoAtomico()`).

## Questão 3

Crie uma classe chamada de `Isotopo`, subclasse de `Atomo`. Um `Isotopo` possui sempre o mesmo número de prótons e elétrons, mas pode ter um número diferente de nêutrons. Modele isto através de um atributo único `numNeutrons` (`int`). Por exemplo, o `Isotopo` Prótio possui um próton, um elétron e não possui nenhum nêutron, e o Trítio possui um próton, um elétron e dois nêutrons. Lembre-se de modelar o *construtor* recebendo um `nome`, `numSubPart` e `numNeutrons`.

## Questão 4

Crie uma classe `Molecula` que possua um nome, um `pesoMolecular` (`double`) e uma `listaDeParticulas` (`List<Atomo>`) que possa armazenar objetos de subclasses de Particula. Ainda, a classe `Molécula` deverá ter um método para incluir partículas à `listaDeParticulas` (`incluiParticula(Particula p)`), bem como outro para calcular a massa total da `Molécula` (o `pesoMolecular`), somando as massas individuais das Partículas que a compõe. 


## Questão 5 
Exemplifique seu código criando uma `Molécula` de H2O: um `Atomo` de Oxigênio (átomo com 8 prótons, 8 elétrons e 8 nêutrons), e dois `Isótopo`s “Prótio” de Hidrogênio (um próton, um elétron e zero nêutrons cada um), e calcule seu peso molecular. Isso deve ocorrer na sua classe `Principal` que deve ter um método `main`.
