# Desafio Lanchonete

Este é um projeto Java Spring Boot desenvolvido para uma lanchonete. O objetivo é criar um sistema de controle de pedidos que permita aos clientes fazerem e acompanharem seus pedidos, bem como permitir que o  estabelecimento possa gerenciar clientes, produtos e pedidos.

## Objetivos

- Permitir que os clientes façam pedidos através de um sistema de autoatendimento.
- Possibilitar o acompanhamento do status do pedido em tempo real.
- Gerenciar clientes, produtos e pedidos.

## Iniciando o Projeto Localmente

Para iniciar o projeto localmente, você pode usar Docker e Docker Compose para facilitar a configuração do ambiente.

### Pré-requisitos

- Docker: [Instalação do Docker](https://docs.docker.com/get-docker/)
- Docker Compose: [Instalação do Docker Compose](https://docs.docker.com/compose/install/)


As demais dependências (JDK, MySQL, nc), serão atendidas via docker compose.

### Instruções

1. Clone o repositório:

    ```bash
    git clone https://github.com/igorartao/tech-challenge-fase1.git
    ```

2. Navegue até o diretório do projeto:

    ```bash
    cd lanchonete
    ```

3. Execute o Docker Compose para buidar e iniciar os containers:

    ```bash
    docker-compose up --build
    ```

4. Após a conclusão do build e start, a aplicação estará disponível em [http://localhost:8080](http://localhost:8080).

### Swagger

O Swagger está disponível para visualização e teste das APIs. Após iniciar a aplicação, acesse [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html) no navegador para ver a documentação e testar as APIs.

### Acesso ao Banco de Dados

O MySQL estará disponível na porta padrão `3306`. Você pode se conectar ao banco de dados usando as credenciais padrão (root \ root). Configurações mais detalhadas no arquivo `docker-compose.yml`.
