FROM payara/micro:5.2020.7-jdk11
COPY  ./target/payara-5091-reproducer.war ${DEPLOY_DIR}