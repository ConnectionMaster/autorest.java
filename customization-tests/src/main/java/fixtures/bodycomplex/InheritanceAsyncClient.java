// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.bodycomplex;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import fixtures.bodycomplex.implementation.InheritancesImpl;
import fixtures.bodycomplex.implementation.models.ErrorException;
import fixtures.bodycomplex.implementation.models.Siamese;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the asynchronous AutoRestComplexTestService type. */
@ServiceClient(builder = AutoRestComplexTestServiceBuilder.class, isAsync = true)
public final class InheritanceAsyncClient {
    private final InheritancesImpl serviceClient;

    /**
     * Initializes an instance of Inheritances client.
     *
     * @param serviceClient the service client implementation.
     */
    InheritanceAsyncClient(InheritancesImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Get complex types that extend others.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return complex types that extend others.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Siamese>> getValidWithResponse() {
        return this.serviceClient.getValidWithResponseAsync();
    }

    /**
     * Get complex types that extend others.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return complex types that extend others.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Siamese> getValid() {
        return this.serviceClient.getValidAsync();
    }

    /**
     * Put complex types that extend others.
     *
     * @param complexBody Please put a siamese with id=2, name="Siameee", color=green, breed=persion, which hates 2
     *     dogs, the 1st one named "Potato" with id=1 and food="tomato", and the 2nd one named "Tomato" with id=-1 and
     *     food="french fries".
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> putValidWithResponse(Siamese complexBody) {
        return this.serviceClient.putValidWithResponseAsync(complexBody);
    }

    /**
     * Put complex types that extend others.
     *
     * @param complexBody Please put a siamese with id=2, name="Siameee", color=green, breed=persion, which hates 2
     *     dogs, the 1st one named "Potato" with id=1 and food="tomato", and the 2nd one named "Tomato" with id=-1 and
     *     food="french fries".
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> putValid(Siamese complexBody) {
        return this.serviceClient.putValidAsync(complexBody);
    }
}
