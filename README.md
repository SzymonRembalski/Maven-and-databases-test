# Maven and databases test

A Java 17 Maven learning project using Spring Boot, Spring Data JPA, Hibernate, and SQLite.

The demo models dogs and their owners. Supplying an owner name as a command-line argument saves an owner and a randomly named and aged dog; without arguments, the application queries the average dog age.

The project includes Maven Wrapper scripts for Windows and Unix. Application configuration is in `src/main/resources/application.properties`; its SQLite URL currently points to the original local development directory. Configure a suitable database path and initialize the database schema before running on another computer.

Local database files, generated build output, and IDE settings are excluded from this repository.
