// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package fixtures.modelflattening.models;

import com.azure.core.implementation.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Error model.
 */
@Fluent
public final class Error {
    /*
     * The status property.
     */
    @JsonProperty(value = "status")
    private Integer status;

    /*
     * The message property.
     */
    @JsonProperty(value = "message")
    private String message;

    /*
     * The parentError property.
     */
    @JsonProperty(value = "parentError")
    private Error parentError;

    /**
     * Get the status property: The status property.
     *
     * @return the status value.
     */
    public Integer status() {
        return this.status;
    }

    /**
     * Set the status property: The status property.
     *
     * @param status the status value to set.
     * @return the Error object itself.
     */
    public Error status(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * Get the message property: The message property.
     *
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message property: The message property.
     *
     * @param message the message value to set.
     * @return the Error object itself.
     */
    public Error message(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get the parentError property: The parentError property.
     *
     * @return the parentError value.
     */
    public Error parentError() {
        return this.parentError;
    }

    /**
     * Set the parentError property: The parentError property.
     *
     * @param parentError the parentError value to set.
     * @return the Error object itself.
     */
    public Error parentError(Error parentError) {
        this.parentError = parentError;
        return this;
    }
}