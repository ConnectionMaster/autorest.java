/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.azureparametergrouping.implementation;

import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.resources.fluentcore.arm.AzureConfigurable;
import com.microsoft.azure.management.resources.fluentcore.arm.implementation.AzureConfigurableImpl;
import com.microsoft.azure.management.resources.fluentcore.arm.implementation.Manager;
import com.microsoft.azure.management.resources.fluentcore.utils.ProviderRegistrationInterceptor;
import com.microsoft.azure.v2.AzureEnvironment;
import com.microsoft.azure.v2.AzureResponseBuilder;
import com.microsoft.azure.v2.credentials.AzureTokenCredentials;
import com.microsoft.azure.v2.serializer.AzureJacksonAdapter;
import com.microsoft.rest.v2.RestClient;

/**
 * Entry point to Azure  resource management.
 */
@Beta(SinceVersion.V1_2_0)
public final class Manager extends Manager<Manager, AutoRestParameterGroupingTestServiceImpl> {
    /**
     * Get a Configurable instance that can be used to create Manager with optional configuration.
     *
     * @return the instance allowing configurations
     */
    public static Configurable configure() {
        return new Manager.ConfigurableImpl();
    }

    /**
     * Creates an instance of Manager that exposes  resource management API entry points.
     *
     * @param credentials the credentials to use
     * @param subscriptionId the subscription UUID
     * @return the Manager
     */
    public static Manager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
        return new Manager(new RestClient.Builder()
            .withBaseUrl(credentials.environment(), AzureEnvironment.Endpoint.RESOURCE_MANAGER)
            .withCredentials(credentials)
            .withSerializerAdapter(new AzureJacksonAdapter())
            .withResponseBuilderFactory(new AzureResponseBuilder.Factory())
            .withInterceptor(new ProviderRegistrationInterceptor(credentials))
            .build(), subscriptionId);
    }

    /**
     * Creates an instance of Manager that exposes  resource management API entry points.
     *
     * @param restClient the RestClient to be used for API calls.
     * @param subscriptionId the subscription UUID
     * @return the Manager
     */
    public static Manager authenticate(RestClient restClient, String subscriptionId) {
        return new Manager(restClient, subscriptionId);
    }

    /**
     * The interface allowing configurations to be set.
     */
    public interface Configurable extends AzureConfigurable<Configurable> {
        /**
         * Creates an instance of Manager that exposes  management API entry points.
         *
         * @param credentials the credentials to use
         * @param subscriptionId the subscription UUID
         * @return the interface exposing  management API entry points that work across subscriptions
         */
        Manager authenticate(AzureTokenCredentials credentials, String subscriptionId);
    }

    /**
     * The implementation for Configurable interface.
     */
    private static final class ConfigurableImpl extends AzureConfigurableImpl<Configurable> implements Configurable {
        public Manager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
            return Manager.authenticate(buildRestClient(credentials), subscriptionId);
        }
    }

    private Manager(RestClient restClient, String subscriptionId) {
        super(
            restClient,
            subscriptionId,
            new AutoRestParameterGroupingTestServiceImpl(restClient).withSubscriptionId(subscriptionId));
    }
}
