select(select distinct salary as SecondHighesttSalary 
from Employee
order by salary desc
limit 1,1 ) as  SecondHighestSalary  ;