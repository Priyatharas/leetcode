select user_id,count(user_id) as followers_count
from Followers 
group by user_id 
order by user_id asc;
-- SELECT user_id, COUNT(user_id) AS followers_count
-- FROM Followers
-- GROUP BY user_id
-- ORDER BY user_id;