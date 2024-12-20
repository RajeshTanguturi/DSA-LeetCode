# Write your MySQL query statement below
select p.project_id
,round(avg(experience_years),2) as average_years 
from employee e
left join project p on e.employee_id = p.employee_id where p.project_id is not null
group by project_id;