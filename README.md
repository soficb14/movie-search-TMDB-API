# 🎬 Movie Search - TMDB API

Aplicação em Java que permite pesquisar filmes diretamente pelo terminal utilizando a API do The Movie Database (TMDB).

O programa envia uma requisição para a API, recebe os dados em formato JSON e apresenta no terminal informações sobre os filmes encontrados.

---

## 🚀 Funcionalidades

- Buscar filmes pelo nome
- Exibir informações como:
  - Título
  - Sinopse
  - Avaliação média
- Suporte a buscas com espaços no nome
- Resultados em português (pt-BR)
- Consumo de API REST
- Conversão de JSON para objetos Java

---

## 🛠 Tecnologias utilizadas

- Java
- HTTP Client (Java 11+)
- Gson (para conversão de JSON)
- API do The Movie Database
- Git e GitHub

API utilizada:

https://www.themoviedb.org/

---

## 📂 Estrutura do projeto
movie-search-TMDB-API
│
├── src
│ ├── Main.java
│ │
│ ├── model
│ │ ├── Filme.java
│ │ └── RespostaApi.java
│ │
│ └── service
│ └── ConsumoApi.java
│
└── README.md


---

## ⚙️ Como executar o projeto

### 1️⃣ Clonar o repositório

```bash
git clone https://github.com/sofieb14/movie-search-TMDB-API.git
2️⃣ Acessar a pasta do projeto
cd movie-search-TMDB-API
3️⃣ Criar variável de ambiente

Para utilizar a API é necessário um Token de Leitura da API do TMDB.

Crie uma variável de ambiente chamada:

TMDB_TOKEN

Exemplo:

Linux / Mac:

export TMDB_TOKEN=seu_token_aqui

Windows:

setx TMDB_TOKEN seu_token_aqui
4️⃣ Executar o programa

Compile e execute a aplicação Java.

Ao rodar o programa, o terminal solicitará o nome de um filme para pesquisa.

Exemplo:

Digite o nome do filme:
interestelar

Saída esperada:

Título: Interestelar
Avaliação: 8.4
Sinopse: Um grupo de exploradores utiliza um buraco de minhoca...


📚 Aprendizados com o projeto

Este projeto foi desenvolvido com o objetivo de aprofundar conhecimentos em:

Programação Orientada a Objetos

Consumo de APIs REST

Manipulação de JSON

Tratamento de requisições HTTP em Java

Organização de projetos

Versionamento com Git


👩‍💻 Autora

Desenvolvido por Sofia Carvalho
