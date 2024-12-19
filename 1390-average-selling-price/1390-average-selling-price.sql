# Write your MySQL query statement below
select p.product_id, IFNULL(ROUND(sum((price * units))/sum(units),2),0) as average_price from Prices p left join unitssold u on p.product_id = u.product_id and DATEDIFF(u.purchase_date, p.end_date) <=0  and  DATEDIFF(u.purchase_date,p.start_date) >=0 
group by product_id;