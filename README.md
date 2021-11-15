# EsercitazioneJPA

esercitazioneJpa is a spring boot project for studyng Spring boot feature, in particular

- Spring boot v. 2.5.6
- spring jpa
- lombok
- mapstruct 1.4.2
- spring web
- support sqlite
- support postgres

Note: this project is shared with all studies component


## Course Description

In this course i show you how to implements rest services, in particular

- Connect to database
- sqlite
- postgres
- Jpa Mapping
- Pagination and Sorting
- 1:1 Relationships
- 1:M Relationships
- M:M Many to Many relationships
- Transactions

## Database Supported

- SQLite
- PostgreSQL

## Data Model

The PostTag data model represents a digital media store, including tables for artists, albums, media tracks, invoices and customers.

## How do I Download and Create the Post Database?

Download the repository, compile and launch in intellij or eclipse or visualstudio code.
After installation run the command

```
mvn clean install
java -jar .\target\esercitazione-jpa-0.0.1-SNAPSHOT.jar --server.port=8080 --spring.profiles.active=sqlite
```

## active profiles

- sqlite
- postgres

An embedded database, SQLite and SQL Server Compact, it is also provided the embedded database in src/main/resourse/esercitazione.db

Notes:

## Postgres

- Tested with Postgres v 13.2

## SQLite

- Tested with SQLite 3.25.2

## Development

### System Requirements

- Intellij comunity edition
- Eclipse
- Visual Studio Code
- MySql V8.0.1
- Postgres v 13.2
- Sqlite v 3.25.2

## database: ER



## License

[MIT](https://choosealicense.com/licenses/mit/)

## swagger catalog at 

http://localhost:8090/esercitazioneJpa/swagger-ui/index.html?configUrl=/postTag/v3/api-docs/swagger-config#/tag-controller/findAll_1