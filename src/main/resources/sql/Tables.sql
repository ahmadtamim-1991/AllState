

create table policy(
id bigint auto_increment,
type varchar(20),
policyNumber varchar(20),
startDate date,
expireDate date,
price double,
costumerId bigint,
primary key(id),
foreign key(costumerId) references costumer(id)
);

select * from policy;


create table costumer(
id bigint auto_increment,
firstName varchar(20),
lastName varchar(20),
email varchar(50),
phone varchar(10),
gender varchar(6),
ssn int (4),
primary key(id)
);

select * from costumer;

create table address(
id bigint auto_increment,
type varchar (10),
street varchar (20),
city varchar (20),
state varchar(20),
zip varchar (5),
costumerId bigint,
primary key(id),
foreign key(costumerId) references costumer(id)
);


create table coveredDrivers(
id bigint auto_increment,
firstName varchar(50),
lastName varchar(50),
licenseNumber varchar(10),
licenseState varchar(15),
status boolean default 1,
policyId bigint,
primary key(id),
foreign key(policyId) references policy(id)
);

select * from coveredDrivers;

create table coveredVehicles(
id bigint auto_increment,
make varchar (20),
model varchar (30),
year int (5),
color varchar (20),
vin varchar (30),
status boolean default 1,
policyId bigint,
primary key(id),
foreign key(policyId) references policy(id)
);