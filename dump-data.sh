#!/usr/bin/env bash
docker_container=mysql-5.7
username=root
password=root
db=spring-framework
docker exec ${docker_container} mysqldump -u${username} -p${password} ${db} > ${db}.sql