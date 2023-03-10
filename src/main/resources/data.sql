create table User_Token (
	id int,
	username VARCHAR(50),
	tokenREST VARCHAR(50),
	tokenSOAP VARCHAR(50)
);

insert into User_Token (id, username, tokenREST, tokenSOAP) values (1, 'dummyUser', 'UUID1','UUID2');