create table User_Token (
	id int AUTO_INCREMENT,
	user VARCHAR(50),
	token VARCHAR(50),
	PRIMARY KEY (id)
);
insert into User_Token (id, user, token) values (1, 'dummyUser', 'UUID');