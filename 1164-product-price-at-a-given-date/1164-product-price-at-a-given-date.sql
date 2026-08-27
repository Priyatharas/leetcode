select product_id ,10 as price 
from Products 
group by product_id 
having min(change_date)  >'2019-08-16'
union
select product_id,new_price as price
from Products 
where change_date = (
    select max(change_date)
    from products p2
    where p2.product_id = products.product_id
    and change_date<='2019-08-16'
);