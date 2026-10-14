# Write your MySQL query statement below
-- select salary as  SecondHighestSalary  from Employee  where id in(select id from Employee order by salary desc limit 2 ) order by salary asc limit 1;
select (select distinct salary from Employee order by   salary  desc  limit 1  offset 1) as  SecondHighestSalary  ;