INSERT INTO categoria (categoria) VALUES ('Eletronicos');
INSERT INTO categoria (categoria) VALUES ('Comida');
INSERT INTO produto (categoria_id,preco,estoque,nome) VALUES (1,200,999,'Celular');
INSERT INTO produto (categoria_id,preco,estoque,nome) VALUES (2,20,777,'Chocolate');
select * from carrinho_produtos;