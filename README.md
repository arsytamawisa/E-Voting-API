# ELECTION REST API

A formal and organized choice by vote of a person for a political office or other position.



## Features

- Search: search topic by topic name using query parameter

  ![Search](images/feature/search.png)

  

- Pagination: page numbering topic and sorting id by descending

  ![Pagination](images/feature/pagination.png)

  

- Custom Validation Message Response

![Validation 1](images/feature/validation1.png)

![Validation 2](images/feature/validation2.png)

![Validation 3](images/feature/validation3.png)

## Configuration

- Server port        : 8080
- MySQL port     : 3306
- Database name : enigma_example
- Context path     : /api



## API Swagger Documentation

This [URL](http://localhost:8080/api/documentation) can be used to access Swagger UI when the spring-boot application is run locally.



## Images Screenshot

Show all topics

![Find All](images/topic/findAll.png)



Find topic by id

![Find Topic](images/topic/findById.png)



Add topic

![Add Topic](images/topic/add.png)



Delete topic

![Delete](images/topic/delete.png)



Search topic by name

![Search](images/topic/search.png)



Show all candidates by topic

![Find All](images/candidate/findAll.png)



Add candidate

![Add](images/candidate/add.png)



Find candidate by id

![Find By Id](images/candidate/findById.png)



Edit candidate by id

![Edit](images/candidate/edit.png)



Delete candidate by id

![Delete](images/candidate/delete.png)



Show all elections by topic

![Delete](images/election/findAll.png)



Election candidate by topic

![Delete](images/election/add.png)



Results of all elections by topic 

![Delete](images/election/result.png)