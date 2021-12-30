create database Bank;
create table Bank.Customer(
CustomerID varchar(225),
CustomerName varchar(225),
Email varchar(225),
MobileNumber varchar(225),
Address varchar(225),
AccountNumber varchar(225),
BranchName varchar(225));
alter table Bank.Customer add primary key(CustomerID);
select * from  Bank.Customer;
insert into Bank.Customer values("1","Sneha","snehapradeep915@gmail.com","9867543241","New Delhi","101","Kalkaji");
insert into Bank.Customer values("2","Sonali","sonali@gmail.com","98634563241","Lucknow","102","Allahabad");
insert into Bank.Customer values("3","Shweta","shweta@gmail.com","8967543241","Rajasthan","103","Jaipur");
insert into Bank.Customer values("4","Ashwini","ashwini@gmail.com","8967673241","Kochi","104","Kerala");
insert into Bank.Customer values("5","Aashtha","shweta@gmail.com","8967543232","Kollam","105","Kerala");