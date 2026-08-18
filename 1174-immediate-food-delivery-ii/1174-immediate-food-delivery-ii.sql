select
    round(
        sum(order_date = customer_pref_delivery_date) * 100.0 / count(*),
        2
    ) as immediate_percentage
from Delivery d
join (
    select customer_id, min(order_date) as first_date
    from Delivery
    group by customer_id
) f
on d.customer_id = f.customer_id
and d.order_date = f.first_date;