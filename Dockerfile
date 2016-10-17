FROM java:8-alpine
MAINTAINER Johan Mena <johan.menac@gmail.com>

ADD target/uberjar/surely.jar /surely/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/surely/app.jar"]
