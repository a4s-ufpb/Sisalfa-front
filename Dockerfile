FROM tomcat:8.5.57-jdk8-openjdk
RUN sed -i 's/8080/8082/' /usr/local/tomcat/conf/server.xml
EXPOSE 8082
COPY Sisalfa-front.war /usr/local/tomcat/webapps/

