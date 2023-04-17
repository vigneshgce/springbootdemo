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



	1) Create RDS and Setup user name , password , endpoint

	2) Creat the database mydb

	 create database mydb;

	3) Create the table 
	
	
	


	CREATE TABLE `user` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `first_name` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `email` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci
