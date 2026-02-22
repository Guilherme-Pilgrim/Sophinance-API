# ⚙️ Sophinance API

O **Sophinance API** é o motor de inteligência do ecossistema Sophinance. Desenvolvida em Java com o framework Spring Boot, esta API RESTful é responsável por gerenciar as regras de negócio, garantir a persistência segura dos dados e servir as interfaces (Web e Mobile) com eficiência e escalabilidade.

---

## 🎯 Objetivo do Back-end

O núcleo da API visa garantir que todo o processamento financeiro ocorra de forma íntegra e segura. Ela atua como a ponte entre a interface do usuário e o banco de dados, assegurando que cada transação seja validada e vinculada corretamente ao seu proprietário.

### Responsabilidades principais:
* **Gestão de Identidade:** Autenticação e autorização de usuários utilizando tokens JWT.
* **Processamento Financeiro:** Cálculos de saldo, validação de entradas e gestão de fluxos de caixa.
* **Segurança de Dados:** Implementação de regras de negócio para garantir a integridade referencial.
* **Persistência:** Comunicação otimizada com o banco de dados relacional.

---

## 🛠️ Stack Tecnológica

A arquitetura foi construída utilizando ferramentas de mercado que priorizam a robustez e a tipagem forte:

* **Java (JDK 17+):** Linguagem base pela sua maturidade e performance em sistemas financeiros.
* **Spring Boot:** Framework para criação de microsserviços e APIs REST de alta produtividade.
* **Spring Data JPA / Hibernate:** Para o mapeamento objeto-relacional (ORM) e abstração do banco de dados.
* **Spring Security & JWT:** Implementação de camadas de segurança para proteção de rotas.
* **PostgreSQL (via Supabase):** Banco de dados relacional para garantir a consistência dos dados financeiros.
* **Maven:** Gerenciador de dependências e automação de build.

---

## 🏗️ Arquitetura e Fluxo

A API segue o padrão de camadas para facilitar a manutenção e os testes:

1.  **Controller:** Camada de exposição dos endpoints REST.
2.  **Service:** Onde reside a lógica de negócio e validações.
3.  **Repository:** Interface de comunicação direta com o banco de dados.
4.  **Entity:** Representação das tabelas do banco como objetos Java.

---

## 🚀 Roadmap de Desenvolvimento

O desenvolvimento da API está dividido nos seguintes ciclos:

1.  **Setup de Infraestrutura:** Configuração do Spring Boot e conexão com PostgreSQL (Supabase).
2.  **Módulo de Segurança:** Implementação de filtros de autenticação e geração de tokens.
3.  **CRUD de Transações:** Endpoints para criação, leitura, edição e exclusão de registros financeiros.
4.  **Agregação de Dados:** Desenvolvimento de lógicas para cálculos de saldo e resumos mensais.
5.  **Otimização para Mobile:** Preparação de endpoints específicos para consumo da futura aplicação Android.

---

## 👨‍💻 Autor

**Guilherme** - Estudante de Análise e Desenvolvimento de Sistemas (ADS).
> Este projeto demonstra competências em desenvolvimento Back-end, arquitetura de software e integração com serviços de nuvem (BaaS).
