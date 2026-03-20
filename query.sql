-- finding the average salary first and then checking which employees earn more than that
SELECT emp_name, salary 
FROM employees 
WHERE salary > (
    SELECT AVG(salary) 
    FROM employees
);
