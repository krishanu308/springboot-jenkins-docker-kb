FROM openjdk:8

EXPOSE 8080

ADD target/sb-jen-dock-k8s-demo.jar sb-jen-dock-k8s-demo.jar

ENTRYPOINT ["java","-jar","/sb-jen-dock-k8s-demo.jar"]