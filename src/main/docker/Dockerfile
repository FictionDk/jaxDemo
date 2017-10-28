FROM java:8
#将容器内的/tmp内容映射到宿主机
VOLUME /tmp
#将构建好的微服务jar拷贝到容器的根目录,命名为my_app.jar
ADD jaxDemo-1.0.jar my_app.jar
#用户定义构建镜像时执行的命令
RUN bash -c 'touch /my_app.jar'
#用于容器执行时运行的命令.类似CMD
#一个dockerfile内可定义多个CMD,但只能定义一个ENTRYPOINT
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/my_app.jar"]