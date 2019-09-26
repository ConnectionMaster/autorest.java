﻿// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for license information.

namespace AutoRest.Java.Model
{
    /// <summary>
    /// The different types of ClientMethod overloads that can exist in a client.
    /// </summary>
    public enum ClientMethodType
    {
        PagingSync, 
        PagingAsync,
        PagingAsyncSinglePage,

        SimulatedPagingSync,
        SimulatedPagingAsync,

        LongRunningSync,
        LongRunningAsync,

        SimpleSync,
        SimpleAsync, // will not generate when sync-methods=none, will generate when sync-methods=essential
        SimpleAsyncRestResponse,

        Resumable
    }
}