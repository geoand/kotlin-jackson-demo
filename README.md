# kotlin-demo project

Test a bunch of deserialization scenarios with for Kotlin + Jackson

## Create native image

```shell script
mvn package -Dnative 
```

## Test

Start application using: 

```shell script
./target/kotlin-demo-1.0-SNAPSHOT-runner
```      

Run `rest-api.http` tests (I used IntelliJ)
