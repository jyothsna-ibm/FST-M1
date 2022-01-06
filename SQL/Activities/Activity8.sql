REM   Script: Activity8
REM   Activity8

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

 select * from salesman;

 update salesman set grade = 200 where SALESMAN_CITY = 'Rome' and set grade = 300 where SALESMAN_NAME= 'James Hoog' and set SALESMAN_NAME ='Pierre' where SALESMAN_NAME='McLyon';

update salesman set grade = 200 where SALESMAN_CITY = 'Rome' ;

update set grade = 300 where SALESMAN_NAME= 'James Hoog' ;

update salesman set grade = 300 where SALESMAN_NAME= 'James Hoog';

update  salesman set SALESMAN_NAME ='Pierre' where SALESMAN_NAME='McLyon';

SELECT distinct from salesman;

SELECT distinct salesman_id  from salesman;

SELECT order_no from orders order by order_date ASC  
;

SELECT order_no from orders ORDER BY order_date ASC;

SELECT order_no,order_date from orders ORDER BY order_date 
;

create table orders( 
    order_no int primary key, purchase_amount float, order_date date, 
    customer_id int, salesman_id int);

INSERT ALL 
    INTO orders VALUES(70001, 150.5, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3005, 5002)  
    INTO orders VALUES(70009, 270.65, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3001, 5005) 
    INTO orders VALUES(70002, 65.26, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70004, 110.5, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70007, 948.5, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3005, 5002) 
    INTO orders VALUES(70005, 2400.6, TO_DATE('2012/07/27', 'YYYY/MM/DD'), 3007, 5001) 
    INTO orders VALUES(70008, 5760, TO_DATE('2012/08/15', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70010, 1983.43, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3004, 5006) 
    INTO orders VALUES(70003, 2480.4, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70012, 250.45, TO_DATE('2012/06/27', 'YYYY/MM/DD'), 3008, 5002) 
    INTO orders VALUES(70011, 75.29, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3003, 5007) 
    INTO orders VALUES(70013, 3045.6, TO_DATE('2012/04/25', 'YYYY/MM/DD'), 3002, 5001) 
SELECT 1 FROM DUAL;

SELECT order_no,order_date from orders ORDER BY order_date;

SELECT order_no ,purchase_amount from orders ORDER BY purchase_amount desc  
;

SELECT * from orders where purchase_amount < 500;

SELECT * from orders where purchase_amount BETWEEN (1000,2000) 
;

SELECT * from orders where purchase_amount BETWEEN {1000,2000} 
;

CREATE TABLE salesman(salesman_id int,salesman_name varchar2(20),salesman_city varchar2(20),commission int) 
 
INSERT ALL   
      INTO salesman VALUES (5001,'James Hoog','NewYork',15)  
      INTO salesman VALUES (5002,'Nail Knite','Paris',13)  
      INTO salesman VALUES (5003,'Pit Alex','London',11)  
      INTO salesman VALUES (5004,'McLyon','Paris',14)  
      INTO salesman VALUES (5005,'Paul Adam','Rome',13)  
      INTo salesman VALUES (5006,'Lauson Hen','san Jose',12)  
      select 1 FROM DUAL 
 
ALTER table salesman 
 ADD  grade int;

 update salesman set grade=100 
 select * from salesman 
  
 update salesman set grade = 200 where SALESMAN_CITY = 'Rome'  
 update salesman set grade = 300 where SALESMAN_NAME= 'James Hoog'  
update  salesman set SALESMAN_NAME ='Pierre' where SALESMAN_NAME='McLyon' 
 
 
-- Create a table named orders 
create table orders( 
    order_no int primary key, purchase_amount float, order_date date, 
    customer_id int, salesman_id int);

INSERT ALL 
    INTO orders VALUES(70001, 150.5, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3005, 5002)  
    INTO orders VALUES(70009, 270.65, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3001, 5005) 
    INTO orders VALUES(70002, 65.26, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70004, 110.5, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70007, 948.5, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3005, 5002) 
    INTO orders VALUES(70005, 2400.6, TO_DATE('2012/07/27', 'YYYY/MM/DD'), 3007, 5001) 
    INTO orders VALUES(70008, 5760, TO_DATE('2012/08/15', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70010, 1983.43, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3004, 5006) 
    INTO orders VALUES(70003, 2480.4, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70012, 250.45, TO_DATE('2012/06/27', 'YYYY/MM/DD'), 3008, 5002) 
    INTO orders VALUES(70011, 75.29, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3003, 5007) 
    INTO orders VALUES(70013, 3045.6, TO_DATE('2012/04/25', 'YYYY/MM/DD'), 3002, 5001) 
SELECT 1 FROM DUAL;

SELECT distinct salesman_id  from salesman 
 
SELECT order_no,order_date from orders ORDER BY order_date 
 
SELECT order_no ,purchase_amount from orders ORDER BY purchase_amount desc  
 
SELECT * from orders where purchase_amount < 500 
 
SELECT * from orders where purchase_amount BETWEEN [1000,2000] 
;

SELECT * from orders where purchase_amount BETWEEN 1000 and 2000;

select * from orders;

select SUM(purchase_amount) from orders;

select SUM(purchase_amount) as "Total_Purchases"  from orders;

select AVG(purchase_amount) as "Avg_Purchases" from orders 
;

select Max(purchase_amount) as "Max_Purchase" from orders 
;

select Min(purchase_amount) as "Min_Purchase" from orders 
;

select Count(salesman_id) as "Sales_Count" from orders;

select Count(distinct salesman_id) as "Sales_Count" from orders;

select * from orders 
;

select SALESMAN_ID ,Max(purchase_amount)  from orders GROUP_BY SALESMAN_ID 
;

select SALESMAN_ID ,Max(purchase_amount)  from orders GROUP_BY SALESMAN_ID;

select SALESMAN_ID ,Max(purchase_amount) as "Max_Amount" from orders GROUP BY SALESMAN_ID;

select * from orders 
;

select SALESMAN_ID ,ORDER_DATE ,MAX(purchase_amount) as "Max_Amount" from orders where ORDER_DATE = TO_DATE('2012-08-17','YYYY/MM/DD') GROUP BY  
SALESMAN_ID,ORDER_DATE;

SELECT customer_id, order_date, MAX(purchase_amount) AS "Max Amount" FROM orders 
GROUP BY customer_id, order_date 
HAVING MAX(purchase_amount) IN(2030, 3450, 5760, 6000);

