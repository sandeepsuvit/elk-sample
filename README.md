# Description

This project is a sample configuration that represents the usage of ELK stack using spring boot

Check out the configuration `logback-spring.xml` for TCP mode of pushing logs to ELK that is running on a container

## Docker
- Run the elk container using command `docker-compose up`
- If you want to access the container run `docker exec -it elk-sample_elk_1  /bin/bash`