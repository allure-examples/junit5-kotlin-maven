### Allure JUnit5 Example (using Maven)

Clone the repo:

```bash
$ git clone git@github.com:allure-examples/allure-junit5-example.git
```

Then build the project (build requires JDK 1.8 or higher):

```bash
$ ./mvnw clean verify
```

Then, to build Allure report run

```bash
$ ./mvnw allure:report
```

In order to view the report run

```bash
$ ./mvnw allure:serve
```

