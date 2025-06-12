# 🛡️ Java RPG Sheets API

Sistema backend em Java para gerenciamento de fichas de RPG, especialmente voltado para o sistema *Dungeons & Dragons (DnD)*.

## 📚 Sumário

- [Introdução](#introdução)
- [Tecnologias Utilizadas](#tecnologias-utilizadas)
- [Estrutura do Projeto](#estrutura-do-projeto)
- [Segurança e Autenticação](#segurança-e-autenticação)
- [Requisitos Funcionais](#requisitos-funcionais)
- [Endpoints](#endpoints)
- [Como Executar](#como-executar)
- [Funcionalidades](#funcionalidades)
- [Conclusão](#conclusão)

---

## 📘 Introdução

Este projeto tem como objetivo o desenvolvimento de uma API backend para gerenciamento de fichas de personagens de RPG, com foco no sistema Dungeons & Dragons (DnD). Utilizando Java e Spring Boot, oferece funcionalidades de autenticação, persistência de dados e operações CRUD seguras e eficientes.

---

## 🛠️ Tecnologias Utilizadas

- Java 17  
- Spring Boot  
- Spring Data JPA  
- Spring Security (JWT)  
- Hibernate  
- MySQL  

---

## 🗂️ Estrutura do Projeto

Diretório: `backend/backendRPG/`

```
├── controller/        # Controladores REST (User, DnDSheet)
├── model/             # Entidades JPA (User, Sheet, DnDSheet)
├── repository/        # Repositórios Spring Data
├── config/            # Configurações (CORS, Security, etc.)
├── resources/
│   └── application.properties
└── RpgSheetsApplication.java
```

---

## 🔐 Segurança e Autenticação

- JWT via Spring Security  
- Autenticação em `/user/login`  
- JWT enviado via header `Authorization`  
- CORS configurado em `WebConfig.java`

---

## ✅ Requisitos Funcionais

1. Cadastro de usuário (`POST /user/register`)
2. Login e geração de JWT (`POST /user/login`)
3. CRUD de fichas (`GET`, `POST`, `PUT`, `DELETE` em `/dndsheet`)

---

## 📡 Endpoints

### Autenticação

- `POST /user/register` – Cadastrar novo usuário  
- `POST /user/login` – Login e retorno de token JWT  

### Fichas de Personagem (DnDSheet)

- `GET /dndsheet` – Lista fichas do usuário autenticado  
- `POST /dndsheet` – Cria nova ficha  
- `PUT /dndsheet/{id}` – Atualiza ficha existente  
- `DELETE /dndsheet/{id}` – Remove ficha  

---

## 🚀 Como Executar

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

2. Vá até a pasta:
```bash
cd backend/backendRPG
```

3. Execute:
```bash
mvn spring-boot:run
```

A API estará disponível em: [http://localhost:8080](http://localhost:8080)

---

## 🎮 Funcionalidades

### 1. Criação de Personagem
- Nome, classe, nível, raça, alinhamento, antecedentes
- Atributos: Força, Destreza, Constituição, Inteligência, Sabedoria, Carisma
- Modificadores e bônus de proficiência

### 2. Sistema de Combate
- Pontos de vida (total, atual, temporário)
- CA, iniciativa, deslocamento
- Dados de vida, testes contra a morte

### 3. Magias e Ataques
- Ataques: nome, bônus, tipo de dano
- Magias: níveis 0–9, espaços disponíveis, magias conhecidas

### 4. Histórico e Personalidade
- Ideais, vínculos, traços, defeitos, aliados, organizações

### 5. Equipamentos e Itens
- Inventário visual e controle de moedas

---

## 🧩 Conclusão

Este projeto consolida práticas de desenvolvimento backend com Java e serve como ferramenta para jogadores de RPG gerenciarem fichas de forma digital e segura. Planeja-se expandir futuramente com suporte a novos sistemas e frontend gráfico.