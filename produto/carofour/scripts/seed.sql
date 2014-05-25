insert into clientes (nome, email, senha, dataNascimento, sexo, endereco, telefone) values ("admin", "admin@mail.com", "12345", CURDATE(), 'm', "Rua A", "3125413698");

insert into categorias (id, nome, urlImagem) values (1, "Laticinios", "assets/images/3.jpg");
insert into categorias (id, nome, urlImagem) values (2, "Carnes", "assets/images/1.jpg");
insert into categorias (id, nome, urlImagem) values (3, "Padaria", "assets/images/6.jpg");
insert into categorias (id, nome, urlImagem) values (4, "Horti Fruti", "assets/images/7.jpg");

insert into produtos (idCategoria, nome, descricao, urlImagem, preco) values (1, "Iogurte", "AKUT", "assets/images/3.jpg", 3.00);
insert into produtos (idCategoria, nome, descricao, urlImagem, preco) values (1, "Mussarela", "Mieirinha", "assets/images/3.jpg", 8.00);
insert into produtos (idCategoria, nome, descricao, urlImagem, preco) values (1, "Requijao", "DeLeiite", "assets/images/3.jpg", 5.00);
insert into produtos (idCategoria, nome, descricao, urlImagem, preco) values (1, "Leite", "NaVaqui", "assets/images/3.jpg", 4.00);
insert into produtos (idCategoria, nome, descricao, urlImagem, preco) values (2, "Frango", "Frango Fatiado", "assets/images/1.jpg", 10.00);
insert into produtos (idCategoria, nome, descricao, urlImagem, preco) values (2, "Alcatra", "Alcatra Bovina", "assets/images/1.jpg", 15.00);
insert into produtos (idCategoria, nome, descricao, urlImagem, preco) values (2, "Toucinho", "Da porcalhada", "assets/images/1.jpg", 6.00);
insert into produtos (idCategoria, nome, descricao, urlImagem, preco) values (2, "Costela", "A legitima", "assets/images/1.jpg", 12.00);
insert into produtos (idCategoria, nome, descricao, urlImagem, preco) values (3, "Pao-de-Queijo", "Mineiro original", "assets/images/6.jpg", 3.00);
insert into produtos (idCategoria, nome, descricao, urlImagem, preco) values (3, "Pao-de-forno", "Forno de lenha", "assets/images/6.jpg", 2.00);
insert into produtos (idCategoria, nome, descricao, urlImagem, preco) values (3, "Broa", "Broa de milho", "assets/images/6.jpg", 2.00);
insert into produtos (idCategoria, nome, descricao, urlImagem, preco) values (3, "Bolo", "Bolo de banana", "assets/images/6.jpg", 4.00);
insert into produtos (idCategoria, nome, descricao, urlImagem, preco) values (4, "Alface", "A verdinha", "assets/images/7.jpg", 2.00);
insert into produtos (idCategoria, nome, descricao, urlImagem, preco) values (4, "Espinafre", "Marinheiro Popeye", "assets/images7.jpg", 3.00);
insert into produtos (idCategoria, nome, descricao, urlImagem, preco) values (4, "Ovos", "Galinha pintadinha", "assets/images/7.jpg", 5.00);
insert into produtos (idCategoria, nome, descricao, urlImagem, preco) values (4, "Tomate", "O vermelhinho", "assets/images/7.jpg", 6.00);