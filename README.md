#Cheatsheet - testing 

##The dropwizard app

[Dropwizard](http://www.dropwizard.io/)
* Java framework for developing ops-friendly, high-performance, RESTful web services



Building dw app:

```
mvn clean install
```

Running the dw app:

```
java -jar target/hello-world-0.0.1.jar server config.yml
```

Making a few requests:

```
curl "localhost:8080/hello/java-community"
curl "localhost:8081/health"
curl "localhost:8081/threads"
curl "localhost:8081/metrics"
```

##Dockerizing the dropwizard app

```
docker --help
```

Build docker image:

```
docker build -t hello-world .
```

Pushing image to remote registry([DockerHub](https://hub.docker.com/)):
* skip this step
```
docker build -t docker.io/cataliniquest/hello-world . && docker push docker.io/cataliniquest/hello-world
```

Pulling image from remote registry:
* skip this step
```
docker pull cataliniquest/hello-world
```

View docker images:
```
docker images 
```

Creating a container from the docker image:
```
docker run --name hello-world-1 -p 8080:8080 -P cataliniquest/hello-world
```

There's no [magic](https://docs.docker.com/introduction/understanding-docker/) to it, "just" a kernel level feture of managing processes
```
ps auxwww | grep java
```


View information about containers:
```
docker ps
docker port hello-world-1
docker inspect hello-world-1
```

Connect to a running container
```
docker exec -ti hello-world-1 /bin/bash
```

Getting rid of containers
```
docker stop hello-world-1
docker rm hello-world-1
```

Getting rid of images:
```
docker rmi -f $(docker images -q)
```


