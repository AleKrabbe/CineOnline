INSERT INTO ROOT.CUPPON ("CODE", "PERCENTAGE", "DESCRIPTION") VALUES
('PROGWEB', 0.5, 'Desconto especial para os alunos de ProgWeb'),
('XMAS2018', 0.2, 'Desconto de Natal');

INSERT INTO ROOT.ACTOR ("FNAME", "LNAME") VALUES 
('Mark','Ruffalo'),
('Chris','Evans'),
('Tom','Cruise'),
('Leonardo','DiCapprio'),
('Jennifer','Lopez'),
('Megan','Fox'),
('Samuel','L Jackson'),
('Adam','Sandler'),
('Shia','LaBeouf'),
('Michael','Caine'),
('Bruce','Willis'),
('Chris','Tucker'),
('Gal','Gadot'),
('Amber','Heard'),
('Eddie','Murphy'),
('Chris','Pratt'),
('Bradley','Cooper'),
('Mark','Hamill'),
('Emma','Stone'),
('Harrison','Ford'),
('Robert','Downey Jr'),
('Zoe','Saldana'),
('Johnny','Deep'),
('Keira','Knightley'),
('Orlando','Bloom'),
('Meryl','Streep'),
('Emily','Blunt'),
('Matt','Damon'),
('Ryan','Goslin'),
('Charlize','Theron'),
('Tom','Hardy'),
('Emma','Watson'),
('Amy','Addams'),
('Henry','Cavill'),
('Ben','Affleck'),
('Mila','Kunis'),
('Scarlett','Johansson'),
('Gwyneth','Patrol'),
('Christian','Bale'),
('Kurt','Russel'),
('Channing','Tatum'),
('Daniel','Craig'),
('Judi','Dench'),
('Javier','Bardem'),
('Martin','Freeman'),
('Gary','Oldman'),
('Anne','Hathaway'),
('Heath','Ledger'),
('Elijah','Wood'),
('Keanu','Reaves'),
('Jamie','Fox'),
('Michael','Cera'),
('Mary','E. Winstead'),
('Eva','Green'),
('Mark','Wahlberg'),
('Jackie','Chan'),
('Rachel','Weisz'),
('Gerard','Butler'),
('Carrie','Fischer'),
('Zach', 'Galifianakis');

INSERT INTO ROOT.GENRE ("NAME") VALUES 
('Ação'),
('Comédia'),
('Terror'),
('Suspense'),
('Animação'),
('Infantil'),
('Drama'),
('Romance'),
('Aventura'),
('Ficção Científica'),
('Espião'),
('Policial'),
('Comédia Romântica');

INSERT INTO ROOT.DIRECTOR ("FNAME", "LNAME") VALUES 
('Steven','Spielberg'),
('Martin','Scorsese'),
('Christopher','Nolan'),
('Alfred','Hitchcock'),
('James','Cameron'),
('Joe','Russo'),
('Anthony','Russo'),
('Quentin','Tarantino'),
('Guy','Ritchie'),
('David','Fincher'),
('George','Lucas'),
('Peter','Jackson'),
('Ridley','Scott'),
('Joss','Weadon'),
('Tim','Burton'),
('Zack','Snyder'),
('Gore', 'Verbinski'),
('Todd','Phillips'),
('Martin','Campbell'),
('Sam','Mendes'),
('Jonh','Krasinski'),
('Carlos','Saldanha'),
('John','Lasseter'),
('Michael','Bay'),
('Brett','Ratner'),
('Brian','De Palma'),
('John','Woo'),
('Edgar','Wright'),
('Marc','Forster');

INSERT INTO ROOT.USR ("FNAME", "LNAME", "CPF", "USERNAME", "BDAY", "EMAIL") VALUES 
('Thomaz','Palmeira','027.890.332-00','palmeiira','1997-05-03','palmeiirat@gmail.com'),
('Alexandre','Krabbe','111.222.333-00','alekrabbe','1994-05-14','alekrabbe@gmail.com'),
('Isabela','Lacerda','111.222.333-01','isa','1996-07-29','larissa.yukimi@aluno.ufms.br'),
('Larissa','Yukimi','111.222.333-02','lyukimi','1996-01-19','isalacerda@teste.com'),
('Jane','Eleuterio','111.222.333-03','jane','1996-01-19','jane@facom.ufms.br'),
('Nádia','Margareth','111.222.333-04','nadiam','1962-04-17','nadia@teste.com');

INSERT INTO ROOT.AWARD ("NAME","YEAR") VALUES 
('Oscar - Melhor Filme', 1),
('Oscar - Melhor Ator', 1),
('Oscar - Melhor Atriz', 1),
('Oscar - Melhor Atriz Coadjuvante', 1),
('Oscar - Melhor Ator Coadjuvante', 1),
('Oscar - Melhor Roteiro', 1),
('Oscar - Melhor Animação', 1),
('Melhor Fotografia', 1),
('Oscar - Melhor Trilha', 1);

INSERT INTO ROOT.CARD ("NUMBER", "ENDS_WITH", "EXP_DATE", "VALIDATOR", "FLAG") VALUES 
('6666777788841234', '1234', '2019-10-11', 122, 1),
('4012001011124567', '4567', '2020-12-19', 444, 2),
('3764490473357890', '7890', '2023-01-11', 331, 2),
('4901024626611467', '1467', '2025-07-30', 222, 2),
('6370950000056812', '6812', '2019-07-13', 752, 1),
('6282562425409032', '9032', '2018-12-26', 766, 2),
('6362970000422390', '2390', '2018-10-11', 977, 1),
('3764111122249021', '9021', '2019-03-05', 666, 2),
('5078324744919023', '9023', '2021-03-11', 455, 2),
('8410011112221834', '1834', '2024-05-13', 988, 1);

INSERT INTO ROOT.USR_CARD ("CARDS_NUMBER", "USER_ID") VALUES 
('6666777788841234',2),
('4012001011124567',1),
('6370950000056812',1),
('5078324744919023',2),
('3764490473357890',2),
('5078324744919023',5),
('8410011112221834',6),
('6666777788841234',3),
('8410011112221834',1),
('4012001011124567',3),
('3764490473357890',3),
('6370950000056812',6),
('3764111122249021',5),
('6666777788841234',5),
('3764111122249021',4);

INSERT INTO ROOT.MOVIE ("DURATION","POSTER","RATING","RELEASE_DATE","TITLE","TRAILER","DIRECTOR_ID", "PRICE", "SINOPSYS") VALUES 
(120,'ligadajustica.jpeg',3.7,'2017-11-16','Liga da Justiça','ligadajustica.mp4',16, 10.0, 'Impulsionado pela restauração de sua fé na humanidade e inspirado pelo ato altruísta do Superman, Bruce Wayne convoca sua nova aliada Diana Prince para o combate contra um inimigo ainda maior, recém-despertado. Juntos, Batman e Mulher-Maravilha buscam e recrutam com agilidade um time de meta-humanos, mas mesmo com a formação da liga de heróis sem precedentes, poderá ser tarde demais para salvar o planeta de um catastrófico ataque. '),
(143,'vingadores1.jpg',4.1,'2012-04-27','Vingadores','vingadores1.mp4',14, 10.0, ' Loki, o irmão de Thor, ganha acesso ao poder ilimitado do cubo cósmico ao roubá-lo de dentro das instalações da S.H.I.E.L.D. Nick Fury, o diretor desta agência internacional que mantém a paz, logo reúne os únicos super-heróis que serão capazes de defender a Terra de ameaças sem precedentes. Homem de Ferro, Capitão América, Hulk, Thor, Viúva Negra e Gavião Arqueiro formam o time dos sonhos de Fury, mas eles precisam aprender a colocar os egos de lado e agir como um grupo em prol da humanidade. '),
(142,'vingadores2.jpeg',3.4,'2015-05-23','Vingadores: Era de Ultron','vingadores2.mp4',14, 10.0, ' Ao tentar proteger o planeta de ameaças, Tony Stark constrói um sistema de inteligência artificial que cuidaria da paz mundial. O projeto acaba dando errado e gera o nascimento do Ultron. Com o destino da Terra em jogo, Capitão América, Homem de Ferro, Thor, Hulk, Viúva Negra e Gavião Arqueiro terão que se unir para mais uma vez salvar a raça humana da extinção. '),
(280,'vingadores3.jpeg',4.8,'2018-04-26','Vingadores: Guerra Infinita','vingadores3.mp4',6, 15.0, ' Homem de Ferro, Thor, Hulk e os Vingadores se unem para combater seu inimigo mais poderoso, o maligno Thanos. Em uma missão para coletar todas as seis pedras infinitas, Thanos planeja usá-las para infligir sua vontade maléfica sobre a realidade. '),
(91,'umlugarsilencioso.jpeg',2.1,'2018-04-05','Um Lugar Silencioso','umlugarsilencioso.mp4',21, 15.0, ' Em uma fazenda nos Estados Unidos, uma família do Meio-Oeste é perseguida por uma entidade fantasmagórica assustadora. Para se protegerem, eles devem permanecer em silêncio absoluto, a qualquer custo, pois o perigo é ativado pela percepção do som. '),
(81,'eradogelo.jpeg',5.0,'2002-03-22','A Era do Gelo','eradogelo.mp4',22, 7.50, ' Vinte mil anos atrás, num mundo coberto de gelo, o mamute Manfred e a preguiça Sid resgatam um bebê humano órfão. Agora, os dois vão enfrentar muitas aventuras até devolver o filhote de gente à sua tribo, que migrou para um novo acampamento. '),
(105,'eradogelo2.jpeg',5.0,'2006-03-31','A Era do Gelo 2','eradogelo2.mp4',22, 7.50, ' O aquecimento global traz ameaças de inundações generalizadas a regiões que antes eram geladas. Manny, Sid e Diego partem, então, em busca de um refúgio seguro. Ao longo do caminho, um outro mamute, que acha que é um gambá, junta-se aos viajantes em sua perigosa missão. '),
(81,'toystory.jpg',4.8,'1995-12-22','Toy Story','toystory.mp4',23, 7.50, ' Woody é um boneco cowboy de bom coração que pertence a um jovem chamado Andy. Porém vê sua posição como o brinquedo favorito de Andy comprometida quando seus pais lhe compram um outro brinquedo, o Buzz Lightyear, uma figura de ação. Ainda pior, Buzz é arrogante e acha que ele é um astronauta de verdade em uma missão para retornar ao seu planeta natal. '),
(110,'mi.jpg',2.1,'1996-07-12','Missão Impossível','mi.mp4',26, 5.0, ' O agente do governo Ethan Hunt e seu mentor, Jim Phelps, embarcam em uma missão secreta que toma um rumo desastroso, na qual Jim é morto e Ethan torna-se o principal suspeito do assassinato. Agora um fugitivo, Hunt recruta o brilhante Luther Stickell e o piloto Franz Krieger para ajudá-lo a entrar no prédio da CIA, fortemente vigiado, a fim de pegar um arquivo de computador confidencial que vai provar sua inocência. '),
(123,'mi2.jpeg',1.8,'2000-05-24','Missão Impossível 2','mi2.mp4',27, 5.0, ' Ethan Hunt retorna para liderar sua equipe em uma missão que pretende capturar um vírus mortal alemão antes que ele seja liberado por terroristas. Sua missão é fazer o impossível, até porque ele não é a única pessoa procurando as amostras da doença. Ele também compete com uma gangue de terroristas internacionais, liderados por um ex-agente que já roubou a cura para o vírus. '),
(144,'transformers.jpg',0.3,'2007-07-18','Transformers','transformers.mp4',24, 7.50, ' O destino da humanidade está em jogo quando duas raças de robôs, os Autobots e os vilões Decepticons, chegam à Terra. Os robôs possuem a capacidade de se transformarem em diferentes objetos mecânicos enquanto buscam a chave do poder supremo com a ajuda do jovem Sam. '),
(116,'carros.jpg',2.9,'2006-06-09','Carros','carros.mp4',23, 7.50, ' Ao viajar para a Califórnia para competir contra The King e Chick Hicks para o Campeonato da Copa Pistão, Lightning McQueen se perde depois de cair do seu caminhão na cidade chamada Radiator Springs. Aos poucos, ele faz amizade com os moradores da cidade, incluindo Sally, Doc Hudson e Mate. Quando chega a hora de McQueen ir embora, o campeonato não é mais a sua prioridade. '),
(143,'piratas1.jpg',4.1,'2003-08-29','Piratas do Caribe: A Maldição do Pérola Negra','piratas1.mp4',17, 7.50, ' O excêntrico capitão Jack Sparrow pretende salvar a bela Elizabeth, filha do governador, e seu navio, o Pérola Negra, levados pelo temido capitão Barbossa. Ele desbrava os mares e parte em direção à misteriosa Ilha da Morte, tentando impedir que os piratas-esqueleto derramem o sangue de Elizabeth para desfazer a maldição que os assola. '),
(151,'piratas2.jpg',1.9,'2006-07-21','Piratas do Caribe: O Báu da Morte','piratas2.mp4',17, 7.50, ' Will e Elizabeth estão prestes a se casar quando o lendário pirata Davy Jones, comandante do invencível navio assombrado, aparece para cobrar uma dívida do capitão Jack Sparrow, amigo do casal. A única chance de Sparrow se livrar de uma maldição de Jones é encontrando o baú da morte. '),
(169,'piratas3.jpeg',2.9,'2007-05-25','Piratas do Caribe: No fim do Mundo','piratas3.mp4',17, 7.50, ' Will Turner e Elizabeth Swann unem forças com o Capitão Barbossa para libertarem Jack Sparrow da prisão de Davy Jones. Enquanto isso, a tripulação do barco fantasma O Holandês Voador causa estragos nos Sete Mares. Os amigos devem navegar através de águas perigosas para enfrentarem o pirata chinês São Feng e, finalmente, eles devem escolher em que lado ficar na batalha, pois a vida do pirata está em jogo. '),
(126,'atirador.jpg',3.3,'2007-03-23','O Atirador','oatirador.mp4',25, 7.50, ' O atirador Marksman Bob Lee Swagger deixa o exército e desaparece sem deixar rastros, depois que uma missão acaba muito mal. Swagger é persuadido a voltar, para ajudar a impedir o assassinato do Presidente dos Estados Unidos. Só que ele foi enganado e passa a ser perseguido como criminoso. '),
(98,'horadorush.jpg',3.7,'1998-09-18','A hora do Rush','horadorush.mp4',25, 5.0, ' Quando a filha de um diplomata chinês é sequestrada em Los Angeles, o cônsul chama o inspector Lee em Hong Kong para ajudar o FBI com o caso. O FBI não se importa com Lee e o deixa de lado no Departamento de Polícia de Los Angeles, pedindo ao detetive James Carter que o vigie. Apesar de Lee e Carter não se suportarem, eles resolvem trabalhar juntos para resolver o caso por conta própria ao descobrirem que foram abandonados tanto pelo FBI quanto pela polícia. '),
(140,'batman1.jpg',4.6,'2005-06-17','Batman: Begins','batman1.mp4',3, 7.50, ' O jovem Bruce Wayne viaja para o Extremo Oriente, onde recebe treinamento em artes marciais do mestre Henri Ducard, um membro da misteriosa Liga das Sombras. Quando Ducard revela que a verdadeira proposta da Liga é a destruição completa da cidade de Gotham, Wayne retorna à sua cidade com o intuito de livrá-la de criminosos e assassinos. Com a ajuda do mordomo Alfred e do expert Lucius Fox, nasce Batman. '),
(153,'batman2.jpg',5.0,'2008-07-18','Batman: O cavaleiro das Trevas','batman2.mp4',3, 7.50, ' Com a ajuda de Jim Gordon e Harvey Dent, Batman tem mantido a ordem na cidade de Gotham. Mas um jovem e anárquico criminoso conhecido como Coringa ganha força e decide instaurar um verdadeiro caos na cidade. O justiceiro será testado psicologicamente e fisicamente como nunca fora antes em um confronto bastante pessoal. Cabe a Batman encontrar uma maneira de deter o sádico vilão antes que mais vidas sejam perdidas. '),
(165,'batman3.jpg',4.2,'2012-07-27','Batman: O cavaleiro das Trevas Ressurge','batman3.mp4',3, 7.50, ' Após ser culpado pela morte de Harvey Dent e passar de herói a vilão, Batman desaparece. As coisas mudam com a chegada de uma ladra misteriosa, a Mulher-Gato, e Bane, um terrorista mascarado, que fazem Batman abandonar seu exílio forçado. '),
(117,'300.jpeg',3.9,'2007-03-09','300','300.mp4',16, 7.50, ' Em 480 A.C., existe uma guerra entre a Pérsia, liderada pelo rei Xerxes, e a Grécia. Na batalha de Thermopylae, Leônidas, rei da cidade grega de Sparta, lidera seu guerreiros em desvantagem contra o massivo exército persa. Mesmo sabendo que a morte certa os espera, seus sacrifícios inspiram toda a Grécia a unir-se contra o seu inimigo comum. '),
(235,'senhordosaneis1.jpg',5,'2002-01-01','Senhor dos Anéis','senhordosaneis1.mp4',12, 7.50, ' Um hobbit recebe de presente de seu tio um anel mágico e maligno que precisa ser destruído antes que caia nas mãos do mal, pois o futuro da civilização depende do destino desse anel. Para isso, o hobbit Frodo terá um caminho árduo pela frente. Ao seu lado, para o cumprimento desta jornada, ele poderá contar com outros hobbits. '),
(125,'starwarsiv.jpeg',5,'1977-11-18','Star Wars: Episodio IV','starwars.mp4',11, 5.0, ' A princesa Leia é mantida refém pelas forças imperiais comandadas por Darth Vader. Luke Skywalker e o capitão Han Solo precisam libertá-la e restaurar a liberdade e a justiça na galáxia. '),
(113,'scottpilgrim.jpeg',4.1,'2010-11-05','Scott Pilgrim: Contra o Mundo','scottpilgrim.mp4',28, 10.0, ' Guitarrista de uma banda de rock, Scott Pilgrim nunca teve problemas para conseguir namorada. O problema é se livrar delas. Mas com Ramona Flowers é diferente. Ela tem o maior de todos os problemas: um exército de ex-namorados que não medem esforços para eliminar Scott da lista de interessados.'),
(108,'sebebernaocase.jpg',1.8,'2009-06-05','Se Beber, Não Case!','sebebernaocase.mp4',18, 7.50, ' Em Se Beber, Não Case, três amigos vão para Las Vegas curtir uma festa de despedida de solteiro, mas perdem o noivo a apenas 40 horas do início da cerimônia. Na manhã seguinte, todos estão de ressaca e ninguém se lembra do que aconteceu na noite anterior. '),
(101,'tartarugasninjas.jpg',1.3,'2014-08-08','As Tartarugas Ninjas','tartarugasninjas.mp4',24, 10.0, ' Um grupo de tartarugas é afetado por uma substância radioativa, ganha força, conhecimento e cresce. Vivendo no esgoto, quatro jovens tartarugas descobrem um novo destino como Tartarugas Ninja. Elas unirão forças com a corajosa repórter April O Neil para salvar Nova York do domínio do diabólico Shredder, o Destruidor, e seu grupo maligno. '),
(182,'ohobbit.jpg',2.9,'2012-12-14','O Hobbit','ohobbit.mp4',12, 10.0, ' Como a maioria dos hobbits, Bilbo Bolseiro leva uma vida tranquila até o dia em que recebe uma missão do mago Gandalf. Acompanhado por um grupo de anões, ele parte numa jornada até a Montanha Solitária para libertar o Reino de Erebor do dragão Smaug. '),
(187,'osoitoodiados.jpg',3.5,'2016-01-07','Os 8 Odiados','osoitoodiados.mp4',8, 10.0, ' Em busca de abrigo para se proteger de uma nevasca, dois caçadores de recompensas, um prisioneiro e um homem que alega ser xerife conhecem quatro estranhos. '),
(178,'pulpfiction.jpeg',4.2,'1995-02-18','Pulp Fiction','pulpfiction.mp4',8, 5.0, ' Os caminhos de vários criminosos se cruzam nestas três histórias de Quentin Tarantino. Um pistoleiro se apaixona pela mulher de seu chefe, um boxeador não se sai bem em uma luta e um casal tenta executar um plano de roubo que foge do controle. '),
(165,'django.jpeg',4.8,'2013-01-18','Django','django.mp4',8, 10.0, ' No sul dos Estados Unidos, anos antes da Guerra Civil, um ex-escravo Django faz uma aliança inesperada com o caçador de recompensas Schultz para caçar os criminosos mais procurados do país e resgatar sua esposa de um fazendeiro que força seus escravos a participarem de competições mortais. '),
(145,'cassinoroyale.jpg',4.8,'2006-11-14','007: Cassino Royale','cassinoroyale.mp4',19, 7.50, ' Após receber licença para matar, James Bond embarca em sua primeira missão. O agente secreto participa de um jogo de pôquer de alto escalão para prejudicar os negócios de Le Chiffre, homem que financia grupos terroristas. '),
(143,'skyfall.jpg',3.7,'2012-10-26','007: Skyfall','skyfall.mp4',20, 10.0, ' Após uma missão mal sucedida de James Bond, a identidade de agentes secretos é revelada e o M16, atacado. Ajudado por um agente de campo, Bond deverá seguir a trilha de Silva, um homem que habita o passado de M e que tem contas a acertar. '),
(147,'quantumofsolace.jpeg',2.3,'2008-11-07','007: Quantum ofSolace','quantumofsolace.mp4',29, 7.50, ' Após a morte de Vesper Lynd, James Bond faz com que sua próxima missão seja pessoal. A caçada àqueles envolvidos na morte da mulher de sua vida o leva ao encontro do cruel empresário Dominic Greene, que faz parte da organização que coagiu Vesper. Bond descobre que Greene planeja obter o controle total de um recurso natural vital e deve enfrentar perigo e traição para frustrar o plano. ');

INSERT INTO ROOT.MOVIE_ACTOR ("MOVIE_ID", "CAST_ID") VALUES (1,13),
(1,35),
(1,34),
(2,21),
(2,2),
(2,37),
(2,7),
(3,21),
(3,2),
(3,37),
(3,7),
(4,21),
(4,2),
(4,37),
(4,7),
(4,16),
(4,22),
(4,17),
(5,27),
(9,3),
(10,3),
(11,6),
(11,9),
(13,23),
(13,24),
(13,25),
(14,23),
(14,24),
(14,25),
(15,23),
(15,24),
(15,25),
(16,55),
(17,56),
(17,12),
(18,39),
(18,46),
(18,57),
(18,10),
(19,39),
(19,46),
(19,10),
(19,48),
(20,39),
(20,46),
(20,10),
(20,47),
(20,31),
(21,58),
(22,45),
(22,25),
(22,49),
(23,18),
(23,20),
(23,59),
(24,52),
(24,53),
(25,17),
(25,60),
(26,6),
(27,45),
(27,25),
(28,7),
(28,40),
(28,41),
(29,11),
(29,7),
(30,7),
(30,4),
(30,51),
(31,42),
(31,43),
(31,54),
(33,42),
(33,43),
(32,42),
(32,44);

INSERT INTO ROOT.ACTOR_AWARD("ACTOR_ID", "AWARDS_ID") VALUES (4,2),
(10,5),
(26,4),
(26,3),
(30,3),
(39,5),
(44,5),
(46,2),
(48,5),
(51,2);

INSERT INTO ROOT.MOVIE_AWARD("MOVIE_ID", "AWARDS_ID") VALUES (28,9),
(23,9),
(22,8),
(6,7),
(8,7),
(12,7);

INSERT INTO ROOT.MOVIE_GENRE ("MOVIE_ID", "GENRES_NAME") VALUES (1,'Ação'),
(1,'Aventura'),
(2,'Aventura'),
(2,'Infantil'),
(3,'Aventura'),
(3,'Infantil'),
(4,'Aventura'),
(4,'Infantil'),
(5,'Terror'),
(5,'Suspense'),
(6,'Comédia'),
(6,'Infantil'),
(6,'Animação'),
(7,'Comédia'),
(7,'Infantil'),
(7,'Animação'),
(8,'Comédia'),
(8,'Infantil'),
(8,'Animação'),
(9,'Ação'),
(10,'Ação'),
(11,'Ação'),
(12,'Comédia'),
(12,'Infantil'),
(12,'Animação'),
(13,'Ação'),
(14,'Aventura'),
(14,'Comédia'),
(15,'Aventura'),
(15,'Comédia'),
(16,'Aventura'),
(16,'Comédia'),
(17,'Ação'),
(18,'Aventura'),
(18,'Ação'),
(19,'Ação'),
(20,'Policial'),
(20,'Ação'),
(21,'Ação'),
(22,'Aventura'),
(23,'Aventura'),
(23, 'Ficção Científica'),
(24,'Comédia'),
(24, 'Aventura'),
(25,'Comédia'),
(26,'Ação'),
(26,'Comédia'),
(27,'Aventura'),
(28,'Suspense'),
(29,'Ação'),
(30,'Drama'),
(30,'Ação'),
(30,'Romance'),
(31,'Espião'),
(31,'Ação'),
(32,'Espião'),
(32,'Ação'),
(33,'Espião'),
(33,'Ação');