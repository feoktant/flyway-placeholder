package io.feoktant.flyway;

import org.flywaydb.core.Flyway;

public class Main {

    public static void main(String[] args) {
        String schemaName = "test_schema";
        Flyway.configure()
            .dataSource(
                "jdbc:postgresql://localhost:5432/postgres",
                "postgres",
                "mysecretpassword")
            .locations("db/migrations")
            .defaultSchema(schemaName)
            .schemas(schemaName)
            .load()
            .migrate();
    }
}
