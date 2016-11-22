FROM rangalo/wildfly8

MAINTAINER rangalo "hard.mehta@gmail.com"

ADD target/jee-rest.war /opt/redhat/wildfly/standalone/deployments/
