# Basic Web API built using spring Boot, JAVA and Maven  

# To Test
```
mvn clean install
``` 

# Run this file
/src/main/java/com/example/demo/todo/TodoApplication.java

# Open Postman 
API has the following endpoints:
- GET /api/todos - Get all todos
- GET /api/todos/{id} - Get a specific todo by ID
- POST /api/todos - Create a new todo
- PUT /api/todos/{id} - Update an existing todo
- DELETE /api/todos/{id} - Delete a todo

<br>

1) Create a new request with
- Method: Post
- URL: http://localhost:8080/api/todos
- Headers: Content-Type: application/json
- Body (raw JSON):
```
{
  "id": 1,
  "task": "Learn Spring Boot",
  "completed": false
}
```
<br>

2) Get All Todos (GET)
After adding a todo, you can retrieve all todos:
- Method: GET
- URL: http://localhost:8080/api/todos
- Send the request

<br>

3) Get a Specific Todo (GET)
To get a specific todo by ID:

1. Method: GET
2. URL: http://localhost:8080/api/todos/1 (replace 1 with the ID you used)
3. Send the request

<br>

4) Update a Todo (PUT)
To update an existing todo:

- Method: PUT
- URL: http://localhost:8080/api/todos/1 (replace 1 with the ID you want to update)
- Headers: Content-Type: application/json
- Body (raw JSON):
```
{
  "task": "Learn Spring Boot Advanced",
  "completed": true
}
```

<br>

5. Delete a Todo (DELETE)
To delete a todo:

- Method: DELETE
- URL: http://localhost:8080/api/todos/1 (replace 1 with the ID you want to delete)
- Send the request