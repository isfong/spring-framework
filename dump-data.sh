#!/usr/bin/env bash
docker_container=mysql-utf8mb4-gtid-13306
username=root
password=root
db=spring-framework
docker exec ${docker_container} mysqldump -u${username} -p${password} ${db} > ${db}.sql