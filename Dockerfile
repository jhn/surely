FROM java:8-alpine
MAINTAINER Your Name <you@example.com>

ADD target/uberjar/surely.jar /surely/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/surely/app.jar"]
