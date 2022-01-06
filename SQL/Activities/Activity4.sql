REM   Script: Activity4
REM   Activity4

SELECT * FROM salesman;

CREATE TABLE salesman(salesman_id int,salesman_name varchar2(20),salesman_city varchar2(20),commission int) 
;

SELECT * FROM salesman;

INSERT ALL   
      INTO salesman VALUES (5001,'James Hoog','NewYork',15)  
      INTO salesman VALUES (5002,'Nail Knite','Paris',13)  
      INTO salesman VALUES (5003,'Pit Alex','London',11)  
      INTO salesman VALUES (5004,'McLyon','Paris',14)  
      INTO salesman VALUES (5005,'Paul Adam','Rome',13)  
      INTo salesman VALUES (5006,'Lauson Hen','san Jose',12)  
      select 1 DUAL;

INSERT ALL   
      INTO salesman VALUES (5001,'James Hoog','NewYork',15)  
      INTO salesman VALUES (5002,'Nail Knite','Paris',13)  
      INTO salesman VALUES (5003,'Pit Alex','London',11)  
      INTO salesman VALUES (5004,'McLyon','Paris',14)  
      INTO salesman VALUES (5005,'Paul Adam','Rome',13)  
      INTo salesman VALUES (5006,'Lauson Hen','san Jose',12)  
      select 1 FROM DUAL;

SELECT * FROM salesman;

SELECT SALESMAN_ID,SALESMAN_CITY from salesman;

SELECT * from salesman where SALESMAN_CITY ='Paris';

SELECT SALESMAN_ID,COMMISSION from salesman where SALESMAN_NAME ='Paul Adam';

CREATE TABLE salesman(salesman_id int,salesman_name varchar2(20),salesman_city varchar2(20),commission int) 
;

ALTER table salesman 
 ADD  COLUMN GRADE int;

ALTER table salesman 
 ADD  COLUMN grade int;

ALTER table salesman 
 ADD  grade int;

update salesman set grade=100;

select * from salesman;

