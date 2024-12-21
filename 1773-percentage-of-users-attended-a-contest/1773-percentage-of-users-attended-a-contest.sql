# Write your MySQL query statement below
select r.contest_id
, round(count(u.user_id)*100/(select count(user_id) from users),2) as percentage
from register r left join users u on u.user_id  = r.user_id 
group by r.contest_id
order by percentage desc, contest_id asc;