1>  CREATE TABLE employees (
    empno INT,
    ename VARCHAR(50),
    job VARCHAR(50),
    mgr int(50),
    hiredate DATE,
    sal DECIMAL(10 , 2),
    comm DECIMAL(10, 2),
	deptno int
);

2> INSERT INTO employees(empno,ename,job,mgr,hiredate,sal,comm,deptno) VALUES
(8369,"SMITH","CLERK",8902,1990-12-18,800.00,NULL,20),
(8499,"ANYA","SALESMAN",8698,1991-02-20,1600.00,300.00,30),
(8521,"SETH","SALESMAN",8698,1990-02-22,1250.00,500.00,30),
(8566,"SMITH","MANAGER",8839,1990-04-02,2985.00,NULL,20),
(8654,"MAHADEVAN","SALESMAN",8698,1990-09-28,1250.00,1400.00,30),
(8698,"MOMIN","MANAGER",8839,1990-05-01,2850.00,NULL,30),
(8882,"BINA","MANAGER",8839,1990-06-09,2450.00,NULL,10),
(8888,"SHIVANSH","ANAYST",8566,1990-12-09,3000.00,NULL,20),
(8839,"SCOTT","PRESIDENT",NULL,1990-11-18,5000.00,NULL,10),
(8844,"AMIR","SALESMAN",8698,1990-09-08,1500.00,0.00,30)
;
<img width="877" height="302" alt="2" src="https://github.com/user-attachments/assets/d498d795-dafa-4e56-95aa-e12f552f7944" />

3> Select ename,sal from employees where sal >= 2200;
<img width="900" height="347" alt="3" src="https://github.com/user-attachments/assets/4a68f437-f446-43ff-aba6-daf9ae7b228c" />


4> Select * from employees where comm = 0.00 OR comm IS null;
<img width="886" height="283" alt="4" src="https://github.com/user-attachments/assets/f8e5de94-cc2d-404c-be29-dde7dd112c4d" />


5> Select ename,job,sal from employees where job IS NOT "MANAGER";
<img width="898" height="288" alt="5" src="https://github.com/user-attachments/assets/71ea1662-c8fe-4b0d-8108-7011d63f9f53" />

6>Select ename from employees where ename LIKE "--A%";

<img width="932" height="141" alt="6" src="https://github.com/user-attachments/assets/02c1a684-a62e-4350-acf2-55e9e265d565" />

7>Select ename from employees where ename LIKE "%T";
<img width="918" height="240" alt="7" src="https://github.com/user-attachments/assets/c8faed76-8210-4a15-bb7b-f305576c6035" />
