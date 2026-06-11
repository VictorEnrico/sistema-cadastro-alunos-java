# Sistema de Cadastro e Grade Horária de Alunos

## 📖 Descrição

Este projeto foi desenvolvido em Java com o objetivo de simular um sistema acadêmico simples para cadastro de alunos, validação de matrícula e montagem de grade horária.

O programa utiliza estruturas de repetição, tratamento de exceções e listas dinâmicas (`ArrayList`) para armazenar informações dos usuários durante a execução.

---

## 🚀 Funcionalidades

### 1. Cadastro de Alunos

* Solicita o nome do aluno.
* Solicita uma senha numérica.
* Valida se a senha contém apenas números.
* Armazena o nome do aluno no sistema.

### 2. Matrícula

* Solicita o número da matrícula.
* Verifica se o valor informado é numérico.
* Exibe uma mensagem de boas-vindas.

### 3. Montagem da Grade Horária

* Permite ao aluno selecionar os dias de aula.
* Armazena os dias escolhidos em uma lista.
* Exibe a grade montada ao finalizar.
* O usuário pode encerrar a seleção digitando **"sair"**.

### 4. Encerramento do Sistema

* Permite finalizar a execução do programa.

---

## 🛠️ Tecnologias Utilizadas

* Java
* Scanner
* ArrayList
* Tratamento de Exceções (`try-catch`)

---

## 📂 Estrutura do Projeto

```java
Main.java
```

Todo o código está concentrado na classe principal `Main`, responsável pela interação com o usuário através do terminal.

---

## ▶️ Como Executar

1. Instale o Java JDK.
2. Salve o arquivo como `Main.java`.
3. Compile o programa:

```bash
javac Main.java
```

4. Execute:

```bash
java Main
```

---

## 📋 Exemplo de Uso

```text
1-Nome aluno
2-Matricula
3-Horarios
4-Encerrar Sistema

Escolha: 1

Informe o nome cadastrado do aluno:
Jonas

Agora informe a sua senha:
1234

Aluno cadastrado com sucesso!
```

---

## 🔍 Conceitos Aplicados

* Estruturas condicionais (`switch-case`)
* Estruturas de repetição (`do-while` e `while`)
* Coleções (`ArrayList`)
* Entrada de dados com `Scanner`
* Tratamento de erros com `try-catch`
* Programação Orientada a Objetos (conceitos básicos)

---

## 📌 Melhorias Futuras

* Cadastro completo de alunos.
* Armazenamento de matrícula e senha.
* Sistema de login.
* Validação de horários disponíveis.
* Persistência de dados em arquivos ou banco de dados.
* Interface gráfica para facilitar o uso.

---

## 👨‍💻 Autor

Projeto desenvolvido para fins acadêmicos e prática de programação em Java.
