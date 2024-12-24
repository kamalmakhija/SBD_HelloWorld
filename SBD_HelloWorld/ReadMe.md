This application is a demo application for using docker
Two main files are here : DockerFile and docker-compose.yaml
First create Docker Image using docker command.
Then use 'docker-compose up' command to start the application
To hit the endpoint use http://localhost:8080/hello


There is another branch 'Sending Logs To AWS CloudWatch'
For this we have just added one log statement.
Thats it.
All major changes to be done on EC2 Machine and EC2 Console.
Motive here is to redirect logs from a spring boot application to AWS Console.
This spring boot appliction is deployed in EC2 but not localhost. This is imp
Read Note : Tech Notes Yahoo => Cloud => EC2: Docker Logs to AWS Cloud Watch