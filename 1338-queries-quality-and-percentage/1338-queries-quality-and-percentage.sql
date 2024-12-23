# Write your MySQL query statement below
SELECT
    query_name,
    ROUND(AVG(rating / position), 2) AS quality,
    ROUND(100 * (SELECT COUNT(rating)
                 FROM Queries AS subquery
                 WHERE rating < 3
                   AND subquery.query_name = Queries.query_name
                ) / COUNT(rating), 2) AS poor_query_percentage
FROM
    Queries
GROUP BY
    query_name;