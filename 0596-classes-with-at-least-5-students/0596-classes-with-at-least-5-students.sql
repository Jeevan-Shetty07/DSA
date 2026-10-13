# Write your MySQL query statement bel
select class from courses group by class  having count(class)>=5;