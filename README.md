# greeting
A basic Dockerized Springboot Maven application with a single REST endpoint GET /greeting.

Build docker img with the command: "docker build -f Dockerfile -t greeting ." 

Run docker img by the following command: "docker run -p 5000:5000 greeting"

Given the following input values account=personal and id=123 the application returns "Hi, userId 123"
(http://localhost:5000/greeting?account=personal&id=123)
In case of invalid input the application returns "No user found matching account: (input account) and id: (input id)".

Given the following input values account=business and type=small the application throws an exception and
returns "The path is not yet implemented".
(http://localhost:5000/greeting?account=business&type=small)

Given the following input values account=business and type=big the application returns "Welcome, business user!"
(http://localhost:5000/greeting?account=business&type=big)
In case of invalid input the application returns "No user found matching account: (input account) and type: (input type)".

The allowable values for an account are personal and business.
The allowable values for id are all positive integers.
The allowable values for type are small and big.
