# WEB DEVELOPMENT
## 1. Set Up Env
* ```<groupid>``` means the company domain for this project, ```artifactID``` means the name for this project.

## 2. Model
* ```private``` cannot automatically serialize, use ```getID``` get method to visit private attribute.
* ```@JsonIgnore``` avoid serialization and display on frontend

* ```get```get data
```post```add data
```put```update data

* address transfer mapping metadata
    ```java
    @DeleteMapping(path = "{id1}/{id2}")
    public String deleteStudent(@PathVariable("id1") UUID id, @PathVariable("id2") UUID id2) {
        studentService.deleteStudent(id);
        return "delete Student";
    }
    ```

* Identify class to use
    * Method 1\
    Use ```Qualifer(lowercaseClassName)``` to help server understand which implemention class to use.\
    * Method 2
        ```java
        @Repository("dao1")
        public class FakeStudentDao implements StudentDao {...}
        ```

        ```java
        @Repository("dao2")
        public class RealStudentDao implements StudentDao {...}
        ```

        ```java
        @Repository("dao2")
        public class RealStudentDao implements StudentDao {...}
        ```

        ```java
        @Service
        public class StudentService {
            @Autowired
            public StudentService(@Qualifier("dao1")  StudentDao studentDao) {
                this.studentDao = studentDao;
            }
        ```




