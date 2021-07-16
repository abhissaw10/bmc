# Read Me First
The following was discovered as part of building this project:

* The original package name 'com.bmc.doctor-service' is invalid and this project uses 'com.bmc.doctorservice' instead.

# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.5.1/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.5.1/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.5.1/reference/htmlsingle/#boot-features-developing-web-applications)
* [Spring Data MongoDB](https://docs.spring.io/spring-boot/docs/2.5.1/reference/htmlsingle/#boot-features-mongodb)
* [Spring for Apache Kafka](https://docs.spring.io/spring-boot/docs/2.5.1/reference/htmlsingle/#boot-features-kafka)
* [Wavefront for Spring Boot documentation](https://docs.wavefront.com/wavefront_springboot.html)
* [Wavefront for Spring Boot repository](https://github.com/wavefrontHQ/wavefront-spring-boot)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)
* [Accessing Data with MongoDB](https://spring.io/guides/gs/accessing-data-mongodb/)

## Observability with Wavefront

If you don't have a Wavefront account, the starter will create a freemium account for you.
The URL to access the Wavefront Service dashboard is logged on startup.

You can also access your dashboard using the `/actuator/wavefront` endpoint.
