# Projeto Desafio Banco

Este projeto é uma simulação simples de um sistema bancário implementado em Java.

## Classes

O projeto é composto pelas seguintes classes e interfaces:

### `Cliente`

A classe `Cliente` representa um cliente do banco. Cada cliente tem um nome, sobrenome, CPF, endereço e número do WhatsApp. A classe também inclui um método para verificar a validade do CPF.

### `InterfaceConta`

A interface `InterfaceConta` define os métodos que todas as contas devem implementar: `sacar`, `depositar`, `transferir` e `imprimirDados`.

### `Conta`

A classe abstrata `Conta` implementa a interface `InterfaceConta` e define a estrutura básica de uma conta. Cada conta tem uma agência, número e saldo. Além disso, cada conta está associada a um cliente.

### `ContaCorrente` e `ContaPoupanca`

As classes `ContaCorrente` e `ContaPoupanca` são subclasses de `Conta` e representam diferentes tipos de contas bancárias.

### `Banco`

A classe `Banco` contém o método `main` para executar a simulação. Neste método, um `Cliente` é criado, bem como uma `ContaCorrente` e uma `ContaPoupanca` para esse cliente. Em seguida, várias operações são realizadas nessas contas para demonstrar a funcionalidade do sistema.

## Como executar

Para executar a simulação, compile e execute a classe `Banco`.

javac desafiobancopackage/Banco.java java desafiobancopackage.Banco


Isso irá executar a simulação e imprimir os resultados no console.

