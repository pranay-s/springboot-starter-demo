# springboot-starter-demo-starter-kit
## Objective:
Run and test Sprint boot with open jdk-hotspot 11 vs openj9-jdk11 and compare performance, memory test results.

### Pre-requisites:
* Install jdkhotspot 11
* Install [openj9-jdk11](https://projects.eclipse.org/projects/technology.openj9/downloads)
* Use k6 to mock performance load test using Virtual Users, to setup k6 in local refer to this [link](https://k6.io/docs/getting-started/installation/).
* Create database: `hms_user`

### About the setup:
- Setup using postgresql jdbc dependency for connecting with a PostgreSQL local server, Hibernate and Spring Web API.
Refer to [pom.xml](https://github.com/pranay-s/springboot-starter-demo/blob/main/pom.xml)
- Created one entity `User` and using two APIs
  * `GET  /user/list` to list all users
  * `POST /user` to create an user entity
