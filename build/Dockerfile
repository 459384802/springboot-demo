FROM java:8-jre-alpine
RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime

ADD app.jar /app.jar
EXPOSE 80
ENTRYPOINT ["/usr/bin/java","-jar", "-Dspring.profiles.active=branch","app.jar"]
