# Abrigo de Animais

Este projeto é uma API para gerenciar um abrigo de animais, permitindo o cadastro e consulta de animais e raças, com dados armazenados em um banco de dados H2.

## Tecnologias Utilizadas

- Java
- Spring Boot
- Spring Data JPA
- H2 Database

## Endpoints

### Criar um Animal

**POST** `/animal`

- Cria um novo animal.
- Parâmetros: Nome, Idade, Raça, Data de Recebimento.

### Listar Todos os Animais

**GET** `/animal`

- Retorna todos os animais cadastrados.

### Consultar Animais Recebedores (últimos 12 meses)

**GET** `/animal/recebedores`

- Retorna animais cadastrados nos últimos 12 meses.

### Criar uma Raça

**POST** `/raca`

- Cria uma nova raça de animal.
- Parâmetros: Nome da Raça.

### Listar Todas as Raças

**GET** `/raca`

- Retorna todas as raças cadastradas.

## Como Executar

1. Clone o repositório.
2. Configure o ambiente Java e Spring Boot.
3. Execute o projeto.
4. Acesse a API em `http://localhost:8080`.

## Contribuição

Sinta-se à vontade para contribuir! Abra uma issue ou faça um pull request.
