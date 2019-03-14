# spring-boot-jsondoc-demo #

[![Build Status](https://travis-ci.org/travis-examples/travis-java-ant-example.svg?branch=master)](https://travis-ci.org/peterszatmary/spring-boot-jsondoc-demo)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/1059cf60bb4b4de7aed78f2ffe57ea4d)](https://www.codacy.com/app/peterszatmary/spring-boot-jsondoc-demo?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=peterszatmary/spring-boot-jsondoc-demo&amp;utm_campaign=Badge_Grade)
[![Docker Repository on Quay](https://quay.io/repository/peterszatmary/spring-boot-jsondoc-demo/status "Docker Repository on Quay")](https://quay.io/repository/peterszatmary/spring-boot-jsondoc-demo)

Spring Boot with [JsonDoc](http://jsondoc.org/) demo for your REST APIs documentation and playground. In this project is used also [Lombok](https://projectlombok.org/) for simplifing POJOs.

## How to run demo ##

```bash
mvn clean install
java -jar spring-boot-jsondoc-demo-0.0.1-SNAPSHOT.jar
go to http://localhost:8080/jsondoc-ui.html?url=jsondoc
```

## How to run demo with docker from project ##
```bash
cd bin
sh build.sh
sh run.sh
```

## How to run demo with docker (if you have Windows) from project ##
```bash
docker build -t spring-boot-jsondoc-demo:latest .
docker run -d -p 8080:8080 -ti spring-boot-jsondoc-demo:latest
```

## How to run demo with docker (if you have Windows) from Quay ##
```bash
docker pull quay.io/peterszatmary/spring-boot-jsondoc-demo
docker run -d -p 8080:8080 -ti spring-boot-jsondoc-demo:latest
```

## How it looks like ##

### JsonDoc hello REST ###

![1](https://github.com/peterszatmary/just-like-that/blob/master/imgs/spring-boot-jsondoc-demo/hello.png)

#### ApplicationController.java hello endpoint ####

```java
  @RequestMapping(value = "/hello")
    public @ResponseBody
    String hello() {
        return "hello";
    }
```

### JsonDoc car REST ###

![2](https://github.com/peterszatmary/just-like-that/blob/master/imgs/spring-boot-jsondoc-demo/jsondoc-car.png)

#### ApplicationController.java car endpoint ####

```java
@RequestMapping(value = "/car")
    public @ResponseBody
    Car car() {
        return new Car("BMW", new Owner("owner of BMW"));
    }
```

#### Car.java ####

```java
@ApiObject(name="Car", description = "Car object represents cars.")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Car {

    @ApiObjectField(description = "Just simple car name")
    private String name;

    @ApiObjectField(description = "Car owner")
    private Owner owner;
}
```

#### Owner.java ####

```java
@AllArgsConstructor
@NoArgsConstructor
@Data
@ApiObject(name="Owner", description = "Owner of car.")
public class Owner {
    @ApiObjectField(description = "Owner name and surname.")
    private String name;
}
```

### JsonDoc objects ###

![3](https://github.com/peterszatmary/just-like-that/blob/master/imgs/spring-boot-jsondoc-demo/jsondocOwner.png)