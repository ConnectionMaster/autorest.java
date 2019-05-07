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

import com.microsoft.rest.v3.RestResponse;
import com.microsoft.rest.v3.http.HttpRequest;
import java.util.Map;

/**
 * Contains all response data for the beginPutAsyncRelativeRetryInvalidHeader operation.
 */
public final class LROSADsBeginPutAsyncRelativeRetryInvalidHeaderResponse extends RestResponse<LROSADsPutAsyncRelativeRetryInvalidHeaderHeaders, Product> {
    /**
     * Creates an instance of LROSADsBeginPutAsyncRelativeRetryInvalidHeaderResponse.
     *
     * @param request the request which resulted in this LROSADsBeginPutAsyncRelativeRetryInvalidHeaderResponse.
     * @param statusCode the status code of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param body the deserialized body of the HTTP response.
     */
    public LROSADsBeginPutAsyncRelativeRetryInvalidHeaderResponse(HttpRequest request, int statusCode, LROSADsPutAsyncRelativeRetryInvalidHeaderHeaders headers, Map<String, String> rawHeaders, Product body) {
        super(request, statusCode, headers, rawHeaders, body);
    }

    /**
     * @return the deserialized response headers.
     */
    @Override
    public LROSADsPutAsyncRelativeRetryInvalidHeaderHeaders headers() {
        return super.headers();
    }

    /**
     * @return the deserialized response body.
     */
    @Override
    public Product body() {
        return super.body();
    }
}