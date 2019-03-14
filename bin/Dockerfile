FROM quay.io/peterszatmary/java_build_base

RUN git clone https://github.com/peterszatmary/spring-boot-jsondoc-demo.git
WORKDIR /home/psz/spring-boot-jsondoc-demo

RUN mvn clean package
RUN mv target/spring-boot-jsondoc-demo-0.0.1-SNAPSHOT.jar app.jar
RUN mv src/main/resources/application.properties app.properties

CMD ["java", "-Dspring.config.location=app.properties", "-jar", "app.jar"]