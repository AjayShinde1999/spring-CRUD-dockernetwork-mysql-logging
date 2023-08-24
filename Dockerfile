FROM openjdk:8

ADD target/dockernetwork-mysql-logging.jar dockernetwork-mysql-logging.jar

ENTRYPOINT ["java","-jar","dockernetwork-mysql-logging.jar"]