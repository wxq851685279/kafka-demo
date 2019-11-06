FROM openjdk

ENV LANG en_US.UTF-8
ENV LC_ALL en_US.UTF-8
ENV TZ Asia/Shanghai

COPY target/kafka-demo-producer.jar /opt/

EXPOSE 10002
ENTRYPOINT ["java","-Dfile.encoding=UTF-8", "-Djava.security.egd=file:///dev/urandom","-jar","/opt/kafka-demo-producer.jar"]
