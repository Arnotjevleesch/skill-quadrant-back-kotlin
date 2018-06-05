# build

## dev
- ./mvnw clean install

- docker run -d --name mongodb-sqb -p 27017:27017 mongo:latest
- mvn spring-boot:run
or
- docker-compose up --build

## endpoints

- curl -I --user serge:dabordonseditvousetpuisonsedittout http://localhost:8080/mongo

## heroku

- install mlab add-on

- heroku update
- heroku login
- heroku container:login
- heroku container:push web
- heroku container:release web




# mongo vs spring vs heroku

- https://spring.io/guides/gs/accessing-data-mongodb/
- https://dev-pages.info/how-to-run-spring-boot-and-mongodb-in-docker-using-docker-compose/
- https://devcenter.heroku.com/articles/container-registry-and-runtime
- https://devcenter.heroku.com/articles/deploying-spring-boot-apps-to-heroku
- https://devcenter.heroku.com/articles/mongolab#connecting-to-existing-mlab-deployments-from-heroku

# kotlin vs spring

- https://soat.developpez.com/tutoriels/kotlin-application-backend/
- https://fabiomsr.github.io/from-java-to-kotlin/
- http://blog.ippon.fr/2017/12/11/introduction-a-kotlin-pour-android/
- https://spring.io/blog/2016/02/15/developing-spring-boot-applications-with-kotlin
- https://github.com/Arnotjevleesch/kotlin-spring-realworld-example-app

