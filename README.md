# spring-boot-jsondoc-demo
Spring Boot with [JsonDoc](http://jsondoc.org/) demo for your REST APIs documentation and playground. In this project is used also [Lombok](https://projectlombok.org/) for simplifing POJOs.

## How to run demo

```shell
mvn clean install
java -jar spring-boot-jsondoc-demo-0.0.1-SNAPSHOT.jar
go to http://localhost:8080/jsondoc-ui.html?url=jsondoc
```

## How it looks like

### JsonDoc hello REST

![1](https://github.com/peterszatmary/just-like-that/blob/master/imgs/spring-boot-jsondoc-demo/hello.png)

#### ApplicationController.java

```java
  @RequestMapping(value = "/hello")
    public @ResponseBody
    String hello() {
        return "hello";
    }
```

### JsonDoc car REST

![2](https://github.com/peterszatmary/just-like-that/blob/master/imgs/spring-boot-jsondoc-demo/jsondoc-car.png)

#### ApplicationController.java

```java
@RequestMapping(value = "/car")
    public @ResponseBody
    Car car() {
        return new Car("BMW", new Owner("owner of BMW"));
    }
```

#### Car.java

```java
@ApiObject(name="Car", description = "Car object represents cars.")
@AllArgsConstructor
@NoArgsConstructor
public @Data class Car {

    @ApiObjectField(description = "Just simple car name")
    private String name;

    @ApiObjectField(description = "Car owner")
    private Owner owner;

}
```

#### Owner.java

```java
@AllArgsConstructor
@NoArgsConstructor
@ApiObject(name="Owner", description = "Owner of car.")
public @Data class Owner {
    @ApiObjectField(description = "Owner name and surname.")
    private String name;
}
```

### JsonDoc objects

![3](https://github.com/peterszatmary/just-like-that/blob/master/imgs/spring-boot-jsondoc-demo/jsondocOwner.png)

