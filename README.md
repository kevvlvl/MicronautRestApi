## Example of Rest API using Micronaut

Using features such as
- Controllers
- Jackson serialize/deserialize

## Commands

| Action                                             | Command                                                 |
| :------------------------------------------------- | :------------------------------------------------------ |
| Run the microservice                               | ```./gradlew run```                                     |
| Query an endpoint                                  | ```curl http://localhost:8080/fin/stock```              |
| Causes all refreshable beans to get reinstantiated | ```curl -X POST http://kevthinkpad:8080/mgmt/refresh``` |

## Management Endpoints

The following endpoints provide observability to the application:

| Endpoint        | Purpose                    |  Command                                        |
| :-------------- | :------------------------- | :---------------------------------------------- |
| Health          | Health status              | ```curl http://kevthinkpad:8080/mgmt/health```  |
| Metrics         | Metrics                    | ```curl http://kevthinkpad:8080/mgmt/metrics``` |
| Loggers         | View and obtain log levels | ```curl http://kevthinkpad:8080/mgmt/loggers``` |


endpoints available:
* blocking: http://localhost:8080/fin/stock
* non-blocking Single: http://kevthinkpad:8080/fin/nb/stock
* non-blocking Multiple: http://kevthinkpad:8080/fin/nb/stocks

## Micronaut 2.4.2 Documentation

- [User Guide](https://docs.micronaut.io/2.4.2/guide/index.html)
- [API Reference](https://docs.micronaut.io/2.4.2/api/index.html)
- [Configuration Reference](https://docs.micronaut.io/2.4.2/guide/configurationreference.html)
- [Micronaut Guides](https://guides.micronaut.io/index.html)
---

## Feature http-client documentation

- [Micronaut HTTP Client documentation](https://docs.micronaut.io/latest/guide/index.html#httpClient)

