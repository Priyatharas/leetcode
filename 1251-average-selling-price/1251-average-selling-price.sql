select prices.product_id,
       round(coalesce(sum(unitsSold.units * prices.price) / sum(unitsSold.units), 0), 2) as average_price
from prices
left join unitsSold
on prices.product_id = unitsSold.product_id
and unitsSold.purchase_date between prices.start_date and prices.end_date
group by prices.product_id;