/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodycomplex.implementation;

import com.google.common.reflect.TypeToken;
import com.microsoft.rest.v2.RestProxy;
import com.microsoft.rest.v2.RestResponse;
import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceFuture;
import com.microsoft.rest.v2.Validator;
import com.microsoft.rest.v2.annotations.BodyParam;
import com.microsoft.rest.v2.annotations.ExpectedResponses;
import com.microsoft.rest.v2.annotations.GET;
import com.microsoft.rest.v2.annotations.Headers;
import com.microsoft.rest.v2.annotations.Host;
import com.microsoft.rest.v2.annotations.PUT;
import com.microsoft.rest.v2.annotations.UnexpectedResponseExceptionType;
import com.microsoft.rest.v2.http.HttpClient;
import fixtures.bodycomplex.Arrays;
import fixtures.bodycomplex.models.ArrayWrapper;
import fixtures.bodycomplex.models.ErrorException;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import java.io.IOException;

/**
 * An instance of this class provides access to all the operations defined in
 * Arrays.
 */
public class ArraysImpl implements Arrays {
    /**
     * The proxy service used to perform REST calls.
     */
    private ArraysService service;

    /**
     * The service client containing this operation class.
     */
    private AutoRestComplexTestServiceImpl client;

    /**
     * Initializes an instance of ArraysImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public ArraysImpl(AutoRestComplexTestServiceImpl client) {
        this.service = RestProxy.create(ArraysService.class, client);
        this.client = client;
    }

    /**
     * The interface defining all the services for Arrays to be used by the
     * proxy service to perform REST calls.
     */
    @Host("http://localhost:3000")
    interface ArraysService {
        @GET("complex/array/valid")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, ArrayWrapper>> getValid();

        @PUT("complex/array/valid")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Void>> putValid(@BodyParam("application/json; charset=utf-8") ArrayWrapper complexBody);

        @GET("complex/array/empty")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, ArrayWrapper>> getEmpty();

        @PUT("complex/array/empty")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Void>> putEmpty(@BodyParam("application/json; charset=utf-8") ArrayWrapper complexBody);

        @GET("complex/array/notprovided")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, ArrayWrapper>> getNotProvided();
    }

    /**
     * Get complex types with array property.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the ArrayWrapper object if successful.
     */
    public ArrayWrapper getValid() {
        return getValidAsync().blockingGet();
    }

    /**
     * Get complex types with array property.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;ArrayWrapper&gt;} object.
     */
    public ServiceFuture<ArrayWrapper> getValidAsync(final ServiceCallback<ArrayWrapper> serviceCallback) {
        return ServiceFuture.fromBody(getValidAsync(), serviceCallback);
    }

    /**
     * Get complex types with array property.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Single&lt;RestResponse&lt;Void, ArrayWrapper&gt;&gt;} object if successful.
     */
    public Single<RestResponse<Void, ArrayWrapper>> getValidWithRestResponseAsync() {
        return service.getValid();
    }

    /**
     * Get complex types with array property.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Maybe&lt;ArrayWrapper&gt;} object if successful.
     */
    public Maybe<ArrayWrapper> getValidAsync() {
        return getValidWithRestResponseAsync()
            .flatMapMaybe(new Function<RestResponse<Void, ArrayWrapper>, Maybe<ArrayWrapper>>() {
                public Maybe<ArrayWrapper> apply(RestResponse<Void, ArrayWrapper> restResponse) {
                    if (restResponse.body() == null) {
                        return Maybe.empty();
                    } else {
                        return Maybe.just(restResponse.body());
                    }
                }
            });
    }

    /**
     * Put complex types with array property.
     *
     * @param complexBody Please put an array with 4 items: "1, 2, 3, 4", "", null, "&amp;S#$(*Y", "The quick brown fox jumps over the lazy dog".
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    public void putValid(ArrayWrapper complexBody) {
        putValidAsync(complexBody).blockingAwait();
    }

    /**
     * Put complex types with array property.
     *
     * @param complexBody Please put an array with 4 items: "1, 2, 3, 4", "", null, "&amp;S#$(*Y", "The quick brown fox jumps over the lazy dog".
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Void&gt;} object.
     */
    public ServiceFuture<Void> putValidAsync(ArrayWrapper complexBody, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(putValidAsync(complexBody), serviceCallback);
    }

    /**
     * Put complex types with array property.
     *
     * @param complexBody Please put an array with 4 items: "1, 2, 3, 4", "", null, "&amp;S#$(*Y", "The quick brown fox jumps over the lazy dog".
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    public Single<RestResponse<Void, Void>> putValidWithRestResponseAsync(ArrayWrapper complexBody) {
        if (complexBody == null) {
            throw new IllegalArgumentException("Parameter complexBody is required and cannot be null.");
        }
        Validator.validate(complexBody);
        return service.putValid(complexBody);
    }

    /**
     * Put complex types with array property.
     *
     * @param complexBody Please put an array with 4 items: "1, 2, 3, 4", "", null, "&amp;S#$(*Y", "The quick brown fox jumps over the lazy dog".
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Completable} object if successful.
     */
    public Completable putValidAsync(ArrayWrapper complexBody) {
        return putValidWithRestResponseAsync(complexBody)
            .toCompletable();
    }

    /**
     * Get complex types with array property which is empty.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the ArrayWrapper object if successful.
     */
    public ArrayWrapper getEmpty() {
        return getEmptyAsync().blockingGet();
    }

    /**
     * Get complex types with array property which is empty.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;ArrayWrapper&gt;} object.
     */
    public ServiceFuture<ArrayWrapper> getEmptyAsync(final ServiceCallback<ArrayWrapper> serviceCallback) {
        return ServiceFuture.fromBody(getEmptyAsync(), serviceCallback);
    }

    /**
     * Get complex types with array property which is empty.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Single&lt;RestResponse&lt;Void, ArrayWrapper&gt;&gt;} object if successful.
     */
    public Single<RestResponse<Void, ArrayWrapper>> getEmptyWithRestResponseAsync() {
        return service.getEmpty();
    }

    /**
     * Get complex types with array property which is empty.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Maybe&lt;ArrayWrapper&gt;} object if successful.
     */
    public Maybe<ArrayWrapper> getEmptyAsync() {
        return getEmptyWithRestResponseAsync()
            .flatMapMaybe(new Function<RestResponse<Void, ArrayWrapper>, Maybe<ArrayWrapper>>() {
                public Maybe<ArrayWrapper> apply(RestResponse<Void, ArrayWrapper> restResponse) {
                    if (restResponse.body() == null) {
                        return Maybe.empty();
                    } else {
                        return Maybe.just(restResponse.body());
                    }
                }
            });
    }

    /**
     * Put complex types with array property which is empty.
     *
     * @param complexBody Please put an empty array.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    public void putEmpty(ArrayWrapper complexBody) {
        putEmptyAsync(complexBody).blockingAwait();
    }

    /**
     * Put complex types with array property which is empty.
     *
     * @param complexBody Please put an empty array.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Void&gt;} object.
     */
    public ServiceFuture<Void> putEmptyAsync(ArrayWrapper complexBody, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(putEmptyAsync(complexBody), serviceCallback);
    }

    /**
     * Put complex types with array property which is empty.
     *
     * @param complexBody Please put an empty array.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    public Single<RestResponse<Void, Void>> putEmptyWithRestResponseAsync(ArrayWrapper complexBody) {
        if (complexBody == null) {
            throw new IllegalArgumentException("Parameter complexBody is required and cannot be null.");
        }
        Validator.validate(complexBody);
        return service.putEmpty(complexBody);
    }

    /**
     * Put complex types with array property which is empty.
     *
     * @param complexBody Please put an empty array.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Completable} object if successful.
     */
    public Completable putEmptyAsync(ArrayWrapper complexBody) {
        return putEmptyWithRestResponseAsync(complexBody)
            .toCompletable();
    }

    /**
     * Get complex types with array property while server doesn't provide a response payload.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the ArrayWrapper object if successful.
     */
    public ArrayWrapper getNotProvided() {
        return getNotProvidedAsync().blockingGet();
    }

    /**
     * Get complex types with array property while server doesn't provide a response payload.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;ArrayWrapper&gt;} object.
     */
    public ServiceFuture<ArrayWrapper> getNotProvidedAsync(final ServiceCallback<ArrayWrapper> serviceCallback) {
        return ServiceFuture.fromBody(getNotProvidedAsync(), serviceCallback);
    }

    /**
     * Get complex types with array property while server doesn't provide a response payload.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Single&lt;RestResponse&lt;Void, ArrayWrapper&gt;&gt;} object if successful.
     */
    public Single<RestResponse<Void, ArrayWrapper>> getNotProvidedWithRestResponseAsync() {
        return service.getNotProvided();
    }

    /**
     * Get complex types with array property while server doesn't provide a response payload.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Maybe&lt;ArrayWrapper&gt;} object if successful.
     */
    public Maybe<ArrayWrapper> getNotProvidedAsync() {
        return getNotProvidedWithRestResponseAsync()
            .flatMapMaybe(new Function<RestResponse<Void, ArrayWrapper>, Maybe<ArrayWrapper>>() {
                public Maybe<ArrayWrapper> apply(RestResponse<Void, ArrayWrapper> restResponse) {
                    if (restResponse.body() == null) {
                        return Maybe.empty();
                    } else {
                        return Maybe.just(restResponse.body());
                    }
                }
            });
    }
}
