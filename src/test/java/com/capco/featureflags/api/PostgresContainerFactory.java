package com.capco.featureflags.api;

import lombok.extern.slf4j.Slf4j;
import org.testcontainers.containers.PostgreSQLContainer;

@Slf4j
public final class PostgresContainerFactory {
    private static final String POSTGRES_IMAGE_VERSION = "14.1";
    private static final String POSTGRES_DOCKER_IMAGE_NAME = "postgres";
    private static final String POSTGRES_CREDENTIALS = "test";
    private static final String POSTGRES_DATABASE_NAME = "feature_flags";

    public PostgresContainerFactory() {
    }

    public static PostgreSQLContainer<?> postgreSQLContainer() {
        final PostgreSQLContainer<?> postgreSQLContainer = new PostgreSQLContainer<>(
                POSTGRES_DOCKER_IMAGE_NAME + ":" + POSTGRES_IMAGE_VERSION)
                .withUsername(POSTGRES_CREDENTIALS)
                .withPassword(POSTGRES_CREDENTIALS)
                .withDatabaseName(POSTGRES_DATABASE_NAME);
        postgreSQLContainer.start();
        setSpringBootProperties(postgreSQLContainer);
        log.info("Created new postgres container: {} ", postgreSQLContainer.getContainerId());
        return postgreSQLContainer;
    }

    private static void setSpringBootProperties(PostgreSQLContainer container) {
        System.setProperty("spring.datasource.url", container.getJdbcUrl());
        System.setProperty("spring.datasource.username", container.getUsername());
        System.setProperty("spring.datasource.password", container.getPassword());
    }
}
