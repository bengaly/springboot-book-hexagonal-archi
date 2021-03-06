# Book manager apis with spring boot based on hexagonal architecture
## Hexagonal architecture
To read about hexagonal architecture : https://www.urbanisation-si.com/architecture-hexagonale-un-exemple-de-mise-en-pratique-de-la-methode-ddd-domain-driven-design-1
## Stack
- Spring Web
- Spring Data JPA
- Hibernate validator
- Lombok
- MapsStruct
- H2 database

## Test: to create a book
Use this endpoint: <code> http://localhost:8080/v1/books </code>

Body value :

````json lines
{
  "name": "Java for beginners",
  "description": "Java for beginners",
  "numberOfPages": 20
}
````

## Test: to find a book
Use this endpoint: <code> http://localhost:8080/v1/books/:id </code> where <code> id </code> is the identifier of book.

Response:
````json lines
{
    "id": 1,
    "name": "Java for beginners",
    "description": "Java for beginners",
    "numberOfPages": 20
}
````
## Handling exception cases

Try to create a book with <code> numberOfPages </code> less than 5 or greater than 200, you should receive <code> Bad request </code> error.

Request :
````json lines
{
  "name": "Java for beginners",
  "description": "Java for beginners",
  "numberOfPages": 2
}
````
Response:

<code>400 Bad Request </code>
````json lines
{
    "date": "2022-06-21T12:02:42.934",
    "message": "Validation Failed",
    "details": [
        "A Book should have 5 or more than 5 pages"
    ]
}
````
