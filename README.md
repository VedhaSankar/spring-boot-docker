# spring-boot-docker
POC on Spring Boot API using docker compose

Spring Boot Installation
```
wget https://repo.spring.io/release/org/springframework/boot/spring-boot-cli/2.3.3.RELEASE/spring-boot-cli-2.3.3.RELEASE-bin.tar.gz
tar -xzf spring-boot-cli-2.3.3.RELEASE-bin.tar.gz
sudo mv spring-boot-cli-2.3.3.RELEASE /opt/
sudo ln -s /opt/spring-2.3.3.RELEASE/bin/spring /usr/bin/spring
sudo ln -s /opt/spring-boot-cli-2.3.3.RELEASE/shell-completion/bash/spring /etc/bash_completion.d/spring
```

Installing IntelliJ:
```
sudo snap install intellij-idea-community --classic
``` 

Initialize your spring project, by providing your requirements here and download the resulting zip file.
    https://start.spring.io/

References:
* [IntelliJ Idea](https://medium.com/danielpadua/java-spring-boot-intellij-idea-b919b0097a0)
* [Building Docker Image](https://docs.docker.com/language/java/build-images/)
