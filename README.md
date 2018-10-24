# Security

In this repository you'll find the web exercise solved. Note that you are also provided
with the initialization of the tables *user_lab* and *authorities* with some initial data (see schema.sql and data.sql). The 
password of the users is always their username. For example, the password of user *roure* is also *roure*.

The exercise consists on securing the web application following the example seen in class. 
Concretely you need to:

* Use a JDBC security scheme (not a memory one)
* To list all classrooms the user must be logged in
* A given classroom (find a class by name) can only be done by user *riera*. No other user is able to list a single class
* A classroom can only be created by a user with role "ADMIN"
