package com.capco.featureflags.api;

import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.testcontainers.containers.PostgreSQLContainer;

public class PostgresExtension implements BeforeAllCallback {

    private static final ExtensionContext.Namespace POSTGRES_CONTAINER_NAMESPACE =
            ExtensionContext.Namespace.create(PostgresExtension.class);
    private static final String POSTGRES_CONTAINER_KEY = "POSTGRES_EXTENSION_KEY";

    @Override
    public void beforeAll(final ExtensionContext context) {
        context.getRoot().getStore(POSTGRES_CONTAINER_NAMESPACE)
                .getOrComputeIfAbsent(POSTGRES_CONTAINER_KEY,
                        k -> PostgresContainerFactory.postgreSQLContainer(),
                        PostgreSQLContainer.class);

    }
}
