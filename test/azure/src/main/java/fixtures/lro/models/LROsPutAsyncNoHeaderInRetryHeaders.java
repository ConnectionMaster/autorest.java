/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.lro.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines headers for putAsyncNoHeaderInRetry operation.
 */
public class LROsPutAsyncNoHeaderInRetryHeaders {
    /**
     * The azureAsyncOperation property.
     */
    @JsonProperty(value = "Azure-AsyncOperation")
    private String azureAsyncOperation;

    /**
     * Get the azureAsyncOperation value.
     *
     * @return the azureAsyncOperation value.
     */
    public String azureAsyncOperation() {
        return this.azureAsyncOperation;
    }

    /**
     * Set the azureAsyncOperation value.
     *
     * @param azureAsyncOperation the azureAsyncOperation value to set.
     * @return the LROsPutAsyncNoHeaderInRetryHeaders object itself.
     */
    public LROsPutAsyncNoHeaderInRetryHeaders withAzureAsyncOperation(String azureAsyncOperation) {
        this.azureAsyncOperation = azureAsyncOperation;
        return this;
    }
}
