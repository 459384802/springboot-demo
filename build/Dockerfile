FROM java:8-jre-alpine
RUN apk update && apk add curl bash tree tzdata \
    && cp -r -f /usr/share/zoneinfo/Asia/Shanghai /etc/localtime \
    && echo -ne "Alpine Linux 3.4 image. (`uname -rsv`)\n" >> /root/.built

ADD app.jar /app.jar
EXPOSE 80
ENTRYPOINT ["/usr/bin/java","-jar", "-Dspring.profiles.active=branch","app.jar"]
