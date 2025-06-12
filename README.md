# Java RPG Sheets API

Sistema backend em Java para gerenciamento de fichas de RPG, especialmente voltado para o sistema *Dungeons & Dragons (DnD)*.

## Sumario

- [Introducao](#introducao)
- [Tecnologias Utilizadas](#tecnologias-utilizadas)
- [Estrutura do Projeto](#estrutura-do-projeto)
- [Seguranca e Autenticacao](#seguranca-e-autenticacao)
- [Requisitos Funcionais](#requisitos-funcionais)
- [Endpoints](#endpoints)
- [Como Executar](#como-executar)
- [Funcionalidades](#funcionalidades)
- [Conclusao](#conclusao)

---

## Introducao

Este projeto tem como objetivo o desenvolvimento de uma API backend para gerenciamento de fichas de personagens de RPG, com foco no sistema Dungeons & Dragons (DnD). Utilizando Java e Spring Boot, oferece funcionalidades de autenticacao, persistencia de dados e operacoes CRUD seguras e eficientes.

---

## Tecnologias Utilizadas

- Java 17  
- Spring Boot  
- Spring Data JPA  
- Spring Security (JWT)  
- Hibernate  
- MySQL  

---

## Estrutura do Projeto

Diretorio: `backend/backendRPG/`

```
├── controller/        # Controladores REST (User, DnDSheet)
├── model/             # Entidades JPA (User, Sheet, DnDSheet)
├── repository/        # Repositorios Spring Data
├── config/            # Configuracoes (CORS, Security, etc.)
├── resources/
│   └── application.properties
└── RpgSheetsApplication.java
```

---

## Seguranca e Autenticacao

- JWT via Spring Security  
- Autenticacao em `/user/login`  
- JWT enviado via header `Authorization`  
- CORS configurado em `WebConfig.java`

---

## Requisitos Funcionais

1. Cadastro de usuario (`POST /user/register`)
2. Login e geracao de JWT (`POST /user/login`)
3. CRUD de fichas (`GET`, `POST`, `PUT`, `DELETE` em `/dndsheet`)

---

## Endpoints

### Autenticacao

- `POST /user/register` – Cadastrar novo usuario  
- `POST /user/login` – Login e retorno de token JWT  

### Fichas de Personagem (DnDSheet)

- `GET /dndsheet` – Lista fichas do usuario autenticado  
- `POST /dndsheet` – Cria nova ficha  
- `PUT /dndsheet/{id}` – Atualiza ficha existente  
- `DELETE /dndsheet/{id}` – Remove ficha  

---

## Como Executar

1. Configure o `application.properties`:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/rpg
spring.datasource.username=root
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
jwt.secret=mysecret
jwt.expiration=3600000
```

2. Va ate a pasta:
```bash
cd backend/backendRPG
```

3. Execute:
```bash
mvn spring-boot:run
```

A API estara disponivel em: [http://localhost:8080](http://localhost:8080)

---

## Funcionalidades

### 1. Criacao de Personagem
- Nome, classe, nivel, raca, alinhamento, antecedentes
- Atributos: Forca, Destreza, Constituicao, Inteligencia, Sabedoria, Carisma
- Modificadores e bonus de proficiencia

### 2. Sistema de Combate
- Pontos de vida (total, atual, temporario)
- CA, iniciativa, deslocamento
- Dados de vida, testes contra a morte

### 3. Magias e Ataques
- Ataques: nome, bonus, tipo de dano
- Magias: niveis 0–9, espacos disponiveis, magias conhecidas

### 4. Historico e Personalidade
- Ideais, vinculos, tracos, defeitos, aliados, organizacoes

### 5. Equipamentos e Itens
- Inventario visual e controle de moedas

---

## Conclusao

Este projeto consolida praticas de desenvolvimento backend com Java e serve como ferramenta para jogadores de RPG gerenciarem fichas de forma digital e segura. Planeja-se expandir futuramente com suporte a novos sistemas e frontend grafico.