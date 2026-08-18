/*select distinct num as ConsecutiveNums
from (
    select num,
           lag(num, 1) over (order by id) as prev1,
           lag(num, 2) over (order by id) as prev2
    from Logs
) t
where num = prev1
and num = prev2;
*/
select distinct l1.num as ConsecutiveNums
from Logs l1
join Logs l2
on l2.id = l1.id + 1
join Logs l3
on l3.id = l1.id + 2
where l1.num = l2.num
and l2.num = l3.num;