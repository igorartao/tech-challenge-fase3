CREATE TABLE IF NOT EXISTS cliente (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100),
    endereco VARCHAR(255),
    cpf VARCHAR(11) UNIQUE
);

CREATE TABLE IF NOT EXISTS produto (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100),
    categoria ENUM('LANCHE', 'ACOMPANHAMENTO', 'BEBIDA', 'SOBREMESA'),
    valor DECIMAL(10, 2),
    descricao VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS pedido (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    cliente_id BIGINT,
    status ENUM('RECEBIDO', 'EM_PREPARACAO', 'PRONTO', 'FINALIZADO'),
    FOREIGN KEY (cliente_id) REFERENCES cliente(id)
);

CREATE TABLE IF NOT EXISTS produto_pedido (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    pedido_id BIGINT,
    produto_id BIGINT,
    quantidade INT,
    FOREIGN KEY (pedido_id) REFERENCES pedido(id),
    FOREIGN KEY (produto_id) REFERENCES produto(id)
);