# light-spring-boot
Spring Boot customizers that allow light-4j middleware handlers to be injected in Undertow core

[Stack Overflow](https://stackoverflow.com/questions/tagged/light-4j) |
[Google Group](https://groups.google.com/forum/#!forum/light-4j) |
[Gitter Chat](https://gitter.im/networknt/light-4j) |
[Subreddit](https://www.reddit.com/r/lightapi/) |
[Youtube Channel](https://www.youtube.com/channel/UCHCRMWJVXw8iB7zKxF55Byw) |
[Documentation](https://doc.networknt.com/style/light-spring-boot/) |
[Contribution Guide](https://doc.networknt.com/contribute/) |

Recently, one of the big customers asked if we can integrate light-4j middleware handlers to address cross-cutting concerns to Spring Boot applications. They want to leverage the light-4j middleware handlers as they are faster, smaller and easier to implement and customize. Most importantly, these handlers working with light platform infrastructure to form an ecosystem to support microservices architecture. In this way, they can migrate their existing Spring Boot applications to the light platform without changing the controllers and business logic. The different development teams welcome the idea as they can still use Spring Boot to develop or maintain their applications without knowing the light-4j middleware injections as the DevOps team handles it in the pipeline.


### Performance

There is a significant performance boost in using light-4j handlers to address cross-cutting concerns. We have done a [performance test](https://doc.networknt.com/benchmark/spring-boot/) on the same Spring Boot application with two different paths implemented with Spring Boot controller and Light-4j handler. The Light-4j handler is about 20 times more throughput and 20 times less latency.

### Getting Started

It is very easy to follow this [tutorial](https://doc.networknt.com/tutorial/springboot/servlet/) to convert your existing Spring Boot applications to inject Light-4j middleware handlers. For a new application, they should be built on light-rest-4j directly to maximize the performance gain.


### Document

To learn about how the injection works, please visit the [reference document](https://doc.networknt.com/style/light-spring-boot/servlet/) for the spring-servlet component for details.
