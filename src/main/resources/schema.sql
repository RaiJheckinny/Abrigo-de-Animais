CREATE TABLE raca (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(255) NOT NULL
);

CREATE TABLE animal (
    id SERIAL PRIMARY KEY,
    nome_provisorio VARCHAR(255) NOT NULL,
    idade_estimada INT NOT NULL,
    raca_id INT,
    data_entrada DATE NOT NULL,
    data_adocao DATE,
    condicao_chegada VARCHAR(255) NOT NULL,
    nome_recebedor VARCHAR(255) NOT NULL,
    data_obito DATE,
    porte VARCHAR(50) NOT NULL,
    FOREIGN KEY (raca_id) REFERENCES raca(id) ON DELETE CASCADE
);