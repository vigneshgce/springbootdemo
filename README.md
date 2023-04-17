1. ./gradlew clean build -> war , jar 
2. docker build -t test_vinis .
3. docker run -d --name vinis-container -p 8080:8080 test_vinis
4. docker logs b3e117da51b6b20299bd9f3126fc1578dc3de4b28ad3dbeb3485129195d66d35
   docker logs <container_id>




docker run -d --name vinis-container -p 8089:8080 \
-e MYSQL_HOST=host.docker.internal \
-e MYSQL_PORT=3306 \
-e MYSQL_DB=mydb \
-e MYSQL_USER=root \
-e MYSQL_PASSWORD= \
test_vinis