# Java Codegen Report
Generated at 2021-07-07T19:23:23.930722
## Success
<details>
<summary>RP count: 179</summary>

- EnterpriseKnowledgeGraph
- addons
- adp
- advisor
- agrifood
- alertsmanagement
- analysisservices
- apimanagement
- appconfiguration
- applicationinsights
- appplatform
- attestation
- authorization
- automanage
- automation
- azure-kusto
- azureactivedirectory
- azurearcdata
- azuredata
- azurestack
- azurestackhci
- baremetalinfrastructure
- batch
- billing
- blockchain
- blueprint
- botservice
- cdn
- changeanalysis
- cloudshell
- cognitiveservices
- commerce
- communication
- compute
- confidentialledger
- confluent
- consumption
- containerinstance
- containerregistry
- containerservice
- cosmos-db
- cost-management
- cpim
- customer-insights
- customerlockbox
- customproviders
- databox
- databoxedge
- databricks
- datacatalog
- datadog
- datafactory
- datalake-analytics
- datalake-store
- datamigration
- dataprotection
- datashare
- deploymentmanager
- desktopvirtualization
- deviceprovisioningservices
- deviceupdate
- devops
- devspaces
- devtestlabs
- dfp
- digitaltwins
- dnc
- dns
- domainservices
- edgeorder
- edgeorderpartner
- elastic
- engagementfabric
- eventgrid
- eventhub
- extendedlocation
- frontdoor
- guestconfiguration
- hanaonazure
- hardwaresecuritymodules
- hdinsight
- healthbot
- healthcareapis
- hybridcompute
- hybriddatamanager
- hybridkubernetes
- hybridnetwork
- imagebuilder
- iotcentral
- iothub
- iotsecurity
- keyvault
- kubernetesconfiguration
- labservices
- logic
- logz
- m365securityandcompliance
- machinelearningcompute
- machinelearningexperimentation
- machinelearningservices
- maintenance
- managednetwork
- managedservices
- managementgroups
- managementpartner
- maps
- mariadb
- marketplace
- marketplacenotifications
- marketplaceordering
- mediaservices
- migrate
- migrateprojects
- mixedreality
- msi
- mysql
- netapp
- network
- notificationhubs
- operationalinsights
- operationsmanagement
- peering
- portal
- postgresql
- postgresqlhsc
- powerbidedicated
- powerbiembedded
- powerplatform
- privatedns
- purview
- quantum
- quota
- recoveryservices
- recoveryservicesbackup
- recoveryservicessiterecovery
- redhatopenshift
- redis
- redisenterprise
- relay
- reservations
- resourcegraph
- resourcehealth
- resourcemover
- saas
- scheduler
- search
- securityandcompliance
- securityinsights
- serialconsole
- servicebus
- servicefabric
- servicefabricmanagedclusters
- servicefabricmesh
- signalr
- softwareplan
- sql
- sqlvirtualmachine
- storSimple1200Series
- storage
- storagecache
- storageimportexport
- storagepool
- storagesync
- storsimple8000series
- subscription
- support
- synapse
- testbase
- timeseriesinsights
- trafficmanager
- videoanalyzer
- visualstudio
- vmware
- vmwarecloudsimple
- web
- webpubsub
- windowsesu
- windowsiot
- workloadmonitor
</details>

## Failure at Codegen
- iotspaces
- policyinsights
- security

## Failure at Build
- monitor
- providerhub
- streamanalytics

## Logs
<details>
<summary>adhybridhealthservice</summary>

**stdout**
```
AutoRest code generation utility [cli version: 3.2.3; node: v14.17.1, max-memory: 2048 MB]
(C) 2018 Microsoft Corporation.
https://aka.ms/autorest
   Loading AutoRest core      '/home/runner/.autorest/@autorest_core@3.0.6350/node_modules/@autorest/core/dist' (3.0.6350)
   Loading local AutoRest extension '@autorest/java' (/home/runner/work/autorest.java/autorest.java)
   Loading local AutoRest extension '@autorest/java.fluent' (/home/runner/work/autorest.java/autorest.java/fluentgen)
   Loading local AutoRest extension '@autorest/java.fluentnamer' (/home/runner/work/autorest.java/autorest.java/fluentgen/../fluentnamer)
   Loading AutoRest extension '@autorest/modelerfour' (4.15.447->4.15.447)

WARNING (PreCheck/CheckDuplicateSchemas): Checking for duplicate schemas, this could take a (long) while.  Run with --verbose for more detail.

```
**stderr**
```
FATAL: Error: Name is empty!
  Error: Plugin pre-namer reported failure.

```
</details>

<details>
<summary>intune</summary>

**stdout**
```
AutoRest code generation utility [cli version: 3.2.3; node: v14.17.1, max-memory: 2048 MB]
(C) 2018 Microsoft Corporation.
https://aka.ms/autorest
   Loading AutoRest core      '/home/runner/.autorest/@autorest_core@3.0.6350/node_modules/@autorest/core/dist' (3.0.6350)
   Loading local AutoRest extension '@autorest/java' (/home/runner/work/autorest.java/autorest.java)
   Loading local AutoRest extension '@autorest/java.fluent' (/home/runner/work/autorest.java/autorest.java/fluentgen)
   Loading local AutoRest extension '@autorest/java.fluentnamer' (/home/runner/work/autorest.java/autorest.java/fluentgen/../fluentnamer)
   Loading AutoRest extension '@autorest/modelerfour' (4.15.447->4.15.447)

WARNING (PreCheck/SchemaMissingType): The schema 'Resource' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'Location' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'LocationProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'Error' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'LocationCollection' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'GroupsCollection' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'GroupItem' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'GroupProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ApplicationCollection' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'Application' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ApplicationProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'IOSMAMPolicyCollection' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'AndroidMAMPolicyCollection' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'iOSMAMPolicy' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'AndroidMAMPolicy' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'MAMPolicyAppIdOrGroupIdPayload' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'MAMPolicyAppOrGroupIdProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'MAMPolicyProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'iOSMAMPolicyProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'AndroidMAMPolicyProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'DeviceCollection' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'Device' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'DeviceProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'WipeDeviceOperationResult' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'WipeDeviceOperationResultProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'OperationResultCollection' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'OperationResult' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'OperationResultProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'operationMetadataProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'StatusesDefault' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'StatusesProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'FlaggedUserCollection' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'FlaggedUser' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'FlaggedUserProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'FlaggedEnrolledAppCollection' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'FlaggedEnrolledApp' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'FlaggedEnrolledAppProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'FlaggedEnrolledAppError' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/CheckDuplicateSchemas): Checking for duplicate schemas, this could take a (long) while.  Run with --verbose for more detail.
INFORMATION (FluentNamer): Load fluent settings
INFORMATION (FluentJavaSettings): Option, string, add-inner : null
INFORMATION (FluentJavaSettings): Option, string, remove-inner : null
INFORMATION (FluentJavaSettings): Option, string, rename-model : null
INFORMATION (FluentJavaSettings): Option, string, remove-model : null
INFORMATION (FluentJavaSettings): Option, string, name-for-ungrouped-operations : null
INFORMATION (FluentJavaSettings): Option, string, pom-file : null
INFORMATION (FluentJavaSettings): Option, string, package-version : null
INFORMATION (FluentJavaSettings): Option, boolean, sdk-integration : null
INFORMATION (FluentNamer): Transform code model
INFORMATION (FluentTransformer): Rename ungrouped operation group to 'ResourceProvider'
INFORMATION (SchemaNameNormalization): Override default name, from 'hostName' to 'hostname'
INFORMATION (SchemaNameNormalization): Override default name, from 'GetLocationByHostName' to 'GetLocationByHostname'
INFORMATION (SchemaNameNormalization): Override default name, from 'hostName' to 'hostname'
INFORMATION (SchemaNameNormalization): Override default name, from 'hostName' to 'hostname'
INFORMATION (SchemaNameNormalization): Override default name, from 'userName' to 'username'
INFORMATION (SchemaNameNormalization): Override default name, from 'hostName' to 'hostname'
INFORMATION (SchemaNameNormalization): Override default name, from 'userName' to 'username'
INFORMATION (SchemaNameNormalization): Override default name, from 'hostName' to 'hostname'
INFORMATION (SchemaNameNormalization): Override default name, from 'userName' to 'username'
INFORMATION (SchemaNameNormalization): Override default name, from 'hostName' to 'hostname'
INFORMATION (SchemaNameNormalization): Override default name, from 'hostName' to 'hostname'
INFORMATION (SchemaNameNormalization): Override default name, from 'hostName' to 'hostname'
INFORMATION (SchemaNameNormalization): Override default name, from 'hostName' to 'hostname'
INFORMATION (SchemaNameNormalization): Override default name, from 'userName' to 'username'
INFORMATION (SchemaNameNormalization): Override default name, from 'hostName' to 'hostname'
INFORMATION (SchemaNameNormalization): Override default name, from 'userName' to 'username'
INFORMATION (SchemaNameNormalization): Override default name, from 'hostName' to 'hostname'
INFORMATION (SchemaNameNormalization): Override default name, from 'hostName' to 'hostname'
INFORMATION (SchemaNameNormalization): Override default name, from 'hostName' to 'hostname'
INFORMATION (SchemaNameNormalization): Override default name, from 'hostName' to 'hostname'
INFORMATION (SchemaNameNormalization): Override default name, from 'hostName' to 'hostname'
INFORMATION (SchemaNameNormalization): Override default name, from 'hostName' to 'hostname'
INFORMATION (SchemaNameNormalization): Override default name, from 'hostName' to 'hostname'
INFORMATION (SchemaNameNormalization): Override default name, from 'hostName' to 'hostname'
INFORMATION (SchemaNameNormalization): Override default name, from 'hostName' to 'hostname'
INFORMATION (SchemaNameNormalization): Override default name, from 'hostName' to 'hostname'
INFORMATION (SchemaNameNormalization): Override default name, from 'hostName' to 'hostname'
INFORMATION (SchemaNameNormalization): Override default name, from 'hostName' to 'hostname'
INFORMATION (SchemaNameNormalization): Override default name, from 'hostName' to 'hostname'
INFORMATION (SchemaNameNormalization): Override default name, from 'hostName' to 'hostname'
INFORMATION (SchemaNameNormalization): Override default name, from 'hostName' to 'hostname'
INFORMATION (SchemaNameNormalization): Override default name, from 'hostName' to 'hostname'
INFORMATION (SchemaNameNormalization): Override default name, from 'hostName' to 'hostname'
INFORMATION (SchemaNameNormalization): Override default name, from 'hostName' to 'hostname'
INFORMATION (SchemaNameNormalization): Override default name, from 'hostName' to 'hostname'
INFORMATION (SchemaNameNormalization): Override default name, from 'hostName' to 'hostname'
INFORMATION (SchemaNameNormalization): Override default name, from 'hostName' to 'hostname'
INFORMATION (SchemaNameNormalization): Override default name, from 'hostName' to 'hostname'
INFORMATION (FluentGen): Read YAML
INFORMATION (FluentJavaSettings): Option, string, add-inner : null
INFORMATION (FluentJavaSettings): Option, string, remove-inner : null
INFORMATION (FluentJavaSettings): Option, string, rename-model : null
INFORMATION (FluentJavaSettings): Option, string, remove-model : null
INFORMATION (FluentJavaSettings): Option, string, name-for-ungrouped-operations : null
INFORMATION (FluentJavaSettings): Option, string, pom-file : null
INFORMATION (FluentJavaSettings): Option, string, package-version : null
INFORMATION (FluentJavaSettings): Option, boolean, sdk-integration : null
INFORMATION (FluentGen): Map code model to client model
INFORMATION (FluentMapper): Add Inner to response types: [FlaggedEnrolledApp, Location, Application, AndroidMamPolicy, OperationResult, IOsmamPolicy, FlaggedUser, WipeDeviceOperationResult, GroupItem, Device]

```
**stderr**
```

ERROR (FluentGen): Failed to successfully run fluentgen plugin java.lang.IllegalArgumentException: [JavaCheck/SchemaError] item name value not found among properties of client model StatusesDefault
java.lang.IllegalArgumentException: [JavaCheck/SchemaError] item name value not found among properties of client model StatusesDefault
	at com.azure.autorest.mapper.ClientMethodMapper.map(ClientMethodMapper.java:87)
	at com.azure.autorest.mapper.MethodGroupMapper.map(MethodGroupMapper.java:115)
	at com.azure.autorest.mapper.ServiceClientMapper.map(ServiceClientMapper.java:88)
	at com.azure.autorest.mapper.ClientMapper.map(ClientMapper.java:116)
	at com.azure.autorest.fluent.FluentGen.handleMap(FluentGen.java:145)
	at com.azure.autorest.fluent.FluentGen.processInternal(FluentGen.java:86)
	at com.azure.autorest.extension.base.plugin.NewPlugin.process(NewPlugin.java:202)
	at com.azure.autorest.fluent.Main.lambda$main$1(Main.java:18)
	at com.azure.autorest.extension.base.jsonrpc.Connection.lambda$dispatch$2(Connection.java:151)
	at com.azure.autorest.extension.base.jsonrpc.Connection.lambda$process$3(Connection.java:270)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:515)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)

FATAL (FluentGen): Unhandled error: [JavaCheck/SchemaError] item name value not found among properties of client model StatusesDefault
java.lang.IllegalArgumentException: [JavaCheck/SchemaError] item name value not found among properties of client model StatusesDefault
	at com.azure.autorest.mapper.ClientMethodMapper.map(ClientMethodMapper.java:87)
	at com.azure.autorest.mapper.MethodGroupMapper.map(MethodGroupMapper.java:115)
	at com.azure.autorest.mapper.ServiceClientMapper.map(ServiceClientMapper.java:88)
	at com.azure.autorest.mapper.ClientMapper.map(ClientMapper.java:116)
	at com.azure.autorest.fluent.FluentGen.handleMap(FluentGen.java:145)
	at com.azure.autorest.fluent.FluentGen.processInternal(FluentGen.java:86)
	at com.azure.autorest.extension.base.plugin.NewPlugin.process(NewPlugin.java:202)
	at com.azure.autorest.fluent.Main.lambda$main$1(Main.java:18)
	at com.azure.autorest.extension.base.jsonrpc.Connection.lambda$dispatch$2(Connection.java:151)
	at com.azure.autorest.extension.base.jsonrpc.Connection.lambda$process$3(Connection.java:270)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:515)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)

  Error: Plugin fluentgen reported failure.

```
</details>

<details>
<summary>iotspaces</summary>

**stdout**
```
AutoRest code generation utility [cli version: 3.2.3; node: v14.17.1, max-memory: 2048 MB]
(C) 2018 Microsoft Corporation.
https://aka.ms/autorest
   Loading AutoRest core      '/home/runner/.autorest/@autorest_core@3.0.6350/node_modules/@autorest/core/dist' (3.0.6350)
   Loading local AutoRest extension '@autorest/java' (/home/runner/work/autorest.java/autorest.java)
   Loading local AutoRest extension '@autorest/java.fluent' (/home/runner/work/autorest.java/autorest.java/fluentgen)
   Loading local AutoRest extension '@autorest/java.fluentnamer' (/home/runner/work/autorest.java/autorest.java/fluentgen/../fluentnamer)
   Loading AutoRest extension '@autorest/modelerfour' (4.15.447->4.15.447)

WARNING (PreCheck/CheckDuplicateSchemas): Checking for duplicate schemas, this could take a (long) while.  Run with --verbose for more detail.
INFORMATION (FluentNamer): Load fluent settings
INFORMATION (FluentJavaSettings): Option, string, add-inner : null
INFORMATION (FluentJavaSettings): Option, string, remove-inner : null
INFORMATION (FluentJavaSettings): Option, string, rename-model : null
INFORMATION (FluentJavaSettings): Option, string, remove-model : null
INFORMATION (FluentJavaSettings): Option, string, name-for-ungrouped-operations : null
INFORMATION (FluentJavaSettings): Option, string, pom-file : null
INFORMATION (FluentJavaSettings): Option, string, package-version : null
INFORMATION (FluentJavaSettings): Option, boolean, sdk-integration : null
INFORMATION (FluentNamer): Transform code model
INFORMATION (FluentGen): Read YAML
INFORMATION (FluentJavaSettings): Option, string, add-inner : null
INFORMATION (FluentJavaSettings): Option, string, remove-inner : null
INFORMATION (FluentJavaSettings): Option, string, rename-model : null
INFORMATION (FluentJavaSettings): Option, string, remove-model : null
INFORMATION (FluentJavaSettings): Option, string, name-for-ungrouped-operations : null
INFORMATION (FluentJavaSettings): Option, string, pom-file : null
INFORMATION (FluentJavaSettings): Option, string, package-version : null
INFORMATION (FluentJavaSettings): Option, boolean, sdk-integration : null
INFORMATION (FluentGen): Map code model to client model
INFORMATION (FluentMapper): Add Inner to response types: []
INFORMATION (FluentGen): Java template for client model
INFORMATION (FluentGen): Process for Fluent Lite, SDK integration disabled
INFORMATION (FluentJavaSettings): Option, string, tag : package-2017-10-preview
INFORMATION (FluentJavaSettings): Option, string, base-folder : .
INFORMATION (FluentJavaSettings): Option, string, output-folder : /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-iotspaces
INFORMATION (FluentJavaSettings): Option, string, azure-libraries-for-java-folder : null
INFORMATION (FluentJavaSettings): List of input files : [Microsoft.IoTSpaces/preview/2017-10-01-preview/iotspaces.json]

```
**stderr**
```

ERROR (FluentGen): Failed to successfully run fluentgen plugin java.lang.IllegalStateException: 'endpoint' (or '$host') is required in ServiceClient properties, properties are httpPipeline,serializerAdapter,defaultPollInterval
java.lang.IllegalStateException: 'endpoint' (or '$host') is required in ServiceClient properties, properties are httpPipeline,serializerAdapter,defaultPollInterval
	at com.azure.autorest.fluent.template.FluentManagerTemplate.write(FluentManagerTemplate.java:60)
	at com.azure.autorest.fluent.model.javamodel.FluentJavaPackage.addFluentManager(FluentJavaPackage.java:87)
	at com.azure.autorest.fluent.FluentGen.handleFluentLite(FluentGen.java:253)
	at com.azure.autorest.fluent.FluentGen.processInternal(FluentGen.java:92)
	at com.azure.autorest.extension.base.plugin.NewPlugin.process(NewPlugin.java:202)
	at com.azure.autorest.fluent.Main.lambda$main$1(Main.java:18)
	at com.azure.autorest.extension.base.jsonrpc.Connection.lambda$dispatch$2(Connection.java:151)
	at com.azure.autorest.extension.base.jsonrpc.Connection.lambda$process$3(Connection.java:270)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:515)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)

FATAL (FluentGen): Unhandled error: 'endpoint' (or '$host') is required in ServiceClient properties, properties are httpPipeline,serializerAdapter,defaultPollInterval
java.lang.IllegalStateException: 'endpoint' (or '$host') is required in ServiceClient properties, properties are httpPipeline,serializerAdapter,defaultPollInterval
	at com.azure.autorest.fluent.template.FluentManagerTemplate.write(FluentManagerTemplate.java:60)
	at com.azure.autorest.fluent.model.javamodel.FluentJavaPackage.addFluentManager(FluentJavaPackage.java:87)
	at com.azure.autorest.fluent.FluentGen.handleFluentLite(FluentGen.java:253)
	at com.azure.autorest.fluent.FluentGen.processInternal(FluentGen.java:92)
	at com.azure.autorest.extension.base.plugin.NewPlugin.process(NewPlugin.java:202)
	at com.azure.autorest.fluent.Main.lambda$main$1(Main.java:18)
	at com.azure.autorest.extension.base.jsonrpc.Connection.lambda$dispatch$2(Connection.java:151)
	at com.azure.autorest.extension.base.jsonrpc.Connection.lambda$process$3(Connection.java:270)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:515)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)

  Error: Plugin fluentgen reported failure.

```
</details>

<details>
<summary>machinelearning</summary>

**stdout**
```
AutoRest code generation utility [cli version: 3.2.3; node: v14.17.1, max-memory: 2048 MB]
(C) 2018 Microsoft Corporation.
https://aka.ms/autorest
   Loading AutoRest core      '/home/runner/.autorest/@autorest_core@3.0.6350/node_modules/@autorest/core/dist' (3.0.6350)
   Loading local AutoRest extension '@autorest/java' (/home/runner/work/autorest.java/autorest.java)
   Loading local AutoRest extension '@autorest/java.fluent' (/home/runner/work/autorest.java/autorest.java/fluentgen)
   Loading local AutoRest extension '@autorest/java.fluentnamer' (/home/runner/work/autorest.java/autorest.java/fluentgen/../fluentnamer)
   Loading AutoRest extension '@autorest/modelerfour' (4.15.447->4.15.447)
[Exception] No input files provided.

Use --help to get help information.

```
**stderr**
```

```
</details>

<details>
<summary>monitor</summary>

**stdout**
```
[INFO] Scanning for projects...
[INFO] 
[INFO] --< com.azure.resourcemanager:azure-resourcemanager-monitor-generated >--
[INFO] Building Microsoft Azure SDK for Monitor Management 1.0.0-beta.1
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ azure-resourcemanager-monitor-generated ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-monitor/src/main/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.1:compile (default-compile) @ azure-resourcemanager-monitor-generated ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 406 source files to /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-monitor/target/classes
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR : 
[INFO] -------------------------------------------------------------
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-monitor/src/main/java/azure/resourcemanager/monitor/models/ErrorResponseCommon.java:[45,38] getAdditionalInfo() in azure.resourcemanager.monitor.models.ErrorResponseCommon cannot override getAdditionalInfo() in com.azure.core.management.exception.ManagementError
  return type java.util.List<azure.resourcemanager.monitor.models.ErrorAdditionalInfo> is not compatible with java.util.List<com.azure.core.management.exception.AdditionalInfo>
[INFO] 1 error
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  5.211 s
[INFO] Finished at: 2021-07-07T18:50:14Z
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.8.1:compile (default-compile) on project azure-resourcemanager-monitor-generated: Compilation failure
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-monitor/src/main/java/azure/resourcemanager/monitor/models/ErrorResponseCommon.java:[45,38] getAdditionalInfo() in azure.resourcemanager.monitor.models.ErrorResponseCommon cannot override getAdditionalInfo() in com.azure.core.management.exception.ManagementError
[ERROR]   return type java.util.List<azure.resourcemanager.monitor.models.ErrorAdditionalInfo> is not compatible with java.util.List<com.azure.core.management.exception.AdditionalInfo>
[ERROR] 
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException

```
**stderr**
```

```
</details>

<details>
<summary>policyinsights</summary>

**stdout**
```
AutoRest code generation utility [cli version: 3.2.3; node: v14.17.1, max-memory: 2048 MB]
(C) 2018 Microsoft Corporation.
https://aka.ms/autorest
   Loading AutoRest core      '/home/runner/.autorest/@autorest_core@3.0.6350/node_modules/@autorest/core/dist' (3.0.6350)
   Loading local AutoRest extension '@autorest/java' (/home/runner/work/autorest.java/autorest.java)
   Loading local AutoRest extension '@autorest/java.fluent' (/home/runner/work/autorest.java/autorest.java/fluentgen)
   Loading local AutoRest extension '@autorest/java.fluentnamer' (/home/runner/work/autorest.java/autorest.java/fluentgen/../fluentnamer)
   Loading AutoRest extension '@autorest/modelerfour' (4.15.447->4.15.447)

WARNING (PreCheck/SchemaMissingType): The schema 'PolicyTrackedResourcesQueryResults' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'QueryFailure' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'QueryFailure-error' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'RemediationListResult' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'RemediationDeploymentsListResult' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'RemediationDeployment' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'Remediation' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'RemediationProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'RemediationFilters' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'RemediationDeploymentSummary' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ErrorResponse' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ErrorDefinition' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'TypedErrorInfo' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'PolicyEventsQueryResults' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'QueryFailure' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'QueryFailure-error' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'PolicyStatesQueryResults' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'SummarizeResults' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'Summary' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'SummaryResults' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ComplianceDetail' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'PolicyAssignmentSummary' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'PolicyDefinitionSummary' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'PolicyGroupSummary' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'QueryFailure' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'QueryFailure-error' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'OperationsListResults' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'Operation' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'Operation-display' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'PolicyMetadata' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'PolicyMetadataSlimProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'PolicyMetadataProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'SlimPolicyMetadata' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'PolicyMetadataCollection' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ErrorResponse' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ErrorDefinition' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'TypedErrorInfo' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'CheckRestrictionsRequest' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'CheckRestrictionsResourceDetails' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'PendingField' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'CheckRestrictionsResult' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'CheckRestrictionsResult-contentEvaluationResult' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'FieldRestrictions' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'FieldRestriction' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'PolicyEvaluationResult' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'PolicyReference' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'AttestationListResult' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'Attestation' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'AttestationProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'AttestationEvidence' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ErrorResponse' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ErrorDefinition' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'TypedErrorInfo' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/CheckDuplicateSchemas): Checking for duplicate schemas, this could take a (long) while.  Run with --verbose for more detail.

WARNING (PreCheck/DuplicateSchema): Duplicate Schema named ErrorResponse -- properties.error.$ref: undefined => "#/components/schemas/schemas:283" 

WARNING (PreCheck/DuplicateSchema): Duplicate Schema named ErrorDefinition -- properties.details.$ref: undefined => "#/components/schemas/schemas:287" 

WARNING (Modeler/MissingType): The schema 'TypedErrorInfo-info' has no type or format information whatsoever. Location:
   file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2019-07-01/remediations.json#/components/schemas/TypedErrorInfo-info
   file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2019-10-01/policyMetadata.json#/components/schemas/TypedErrorInfo-info
   file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2021-01-01/attestations.json#/components/schemas/TypedErrorInfo-info

WARNING (Modeler/MissingType): The schema 'components·1twbxlw·schemas·policyevent·additionalproperties' has no type or format information whatsoever. Location:
   file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2019-10-01/policyEvents.json#/components/schemas/components·1twbxlw·schemas·policyevent·additionalproperties

WARNING (Modeler/MissingType): The schema 'components·nwpyyh·schemas·componenteventdetails·additionalproperties' has no type or format information whatsoever. Location:
   file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2019-10-01/policyEvents.json#/components/schemas/components·nwpyyh·schemas·componenteventdetails·additionalproperties

WARNING (Modeler/MissingType): The schema 'components·1yhb3ub·schemas·policystate·additionalproperties' has no type or format information whatsoever. Location:
   file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2019-10-01/policyStates.json#/components/schemas/components·1yhb3ub·schemas·policystate·additionalproperties

WARNING (Modeler/MissingType): The schema 'components·hezmy5·schemas·componentstatedetails·additionalproperties' has no type or format information whatsoever. Location:
   file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2019-10-01/policyStates.json#/components/schemas/components·hezmy5·schemas·componentstatedetails·additionalproperties

WARNING (PreNamer/DeduplicateName): Deduplicating schema name: 'ErrorResponse' -> 'ErrorResponseAutoGenerated'

WARNING (PreNamer/DeduplicateName): Deduplicating schema name: 'ErrorDefinition' -> 'ErrorDefinitionAutoGenerated'

WARNING (PreNamer/DeduplicateName): Deduplicating schema name: 'ErrorResponse' -> 'ErrorResponseAutoGenerated2'

WARNING (PreNamer/DeduplicateName): Deduplicating schema name: 'ErrorDefinition' -> 'ErrorDefinitionAutoGenerated2'
INFORMATION (FluentNamer): Load fluent settings
INFORMATION (FluentJavaSettings): Option, string, add-inner : null
INFORMATION (FluentJavaSettings): Option, string, remove-inner : null
INFORMATION (FluentJavaSettings): Option, string, rename-model : null
INFORMATION (FluentJavaSettings): Option, string, remove-model : null
INFORMATION (FluentJavaSettings): Option, string, name-for-ungrouped-operations : null
INFORMATION (FluentJavaSettings): Option, string, pom-file : null
INFORMATION (FluentJavaSettings): Option, string, package-version : null
INFORMATION (FluentJavaSettings): Option, boolean, sdk-integration : null
INFORMATION (FluentNamer): Transform code model

```
**stderr**
```

ERROR (FluentNamer): Failed to successfully run fluentnamer plugin.
java.lang.NullPointerException
	at com.azure.autorest.preprocessor.tranformer.Transformer.addPagingNextOperation(Transformer.java:290)
	at com.azure.autorest.preprocessor.tranformer.Transformer.transformOperationGroups(Transformer.java:120)
	at com.azure.autorest.preprocessor.tranformer.Transformer.transform(Transformer.java:42)
	at com.azure.autorest.fluentnamer.FluentNamer.transform(FluentNamer.java:125)
	at com.azure.autorest.fluentnamer.FluentNamer.processInternal(FluentNamer.java:62)
	at com.azure.autorest.extension.base.plugin.NewPlugin.process(NewPlugin.java:202)
	at com.azure.autorest.fluentnamer.Main.lambda$main$1(Main.java:19)
	at com.azure.autorest.extension.base.jsonrpc.Connection.lambda$dispatch$2(Connection.java:151)
	at com.azure.autorest.extension.base.jsonrpc.Connection.lambda$process$3(Connection.java:270)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:515)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)

  Error: Plugin fluentnamer reported failure.

```
</details>

<details>
<summary>providerhub</summary>

**stdout**
```
[INFO] Scanning for projects...
[INFO] 
[INFO] --< com.azure.resourcemanager:azure-resourcemanager-providerhub-generated >--
[INFO] Building Microsoft Azure SDK for ProviderHub Management 1.0.0-beta.1
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ azure-resourcemanager-providerhub-generated ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-providerhub/src/main/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.1:compile (default-compile) @ azure-resourcemanager-providerhub-generated ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 236 source files to /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-providerhub/target/classes
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR : 
[INFO] -------------------------------------------------------------
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-providerhub/src/main/java/azure/resourcemanager/providerhub/models/DefaultRolloutProperties.java:[39,1] class, interface, or enum expected
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-providerhub/src/main/java/azure/resourcemanager/providerhub/models/DefaultRolloutProperties.java:[40,9] class, interface, or enum expected
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-providerhub/src/main/java/azure/resourcemanager/providerhub/models/DefaultRolloutProperties.java:[41,5] class, interface, or enum expected
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-providerhub/src/main/java/azure/resourcemanager/providerhub/models/DefaultRolloutProperties.java:[45,12] class, interface, or enum expected
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-providerhub/src/main/java/azure/resourcemanager/providerhub/models/DefaultRolloutProperties.java:[47,9] class, interface, or enum expected
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-providerhub/src/main/java/azure/resourcemanager/providerhub/models/DefaultRolloutProperties.java:[48,5] class, interface, or enum expected
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-providerhub/src/main/java/azure/resourcemanager/providerhub/models/DefaultRolloutProperties.java:[56,12] class, interface, or enum expected
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-providerhub/src/main/java/azure/resourcemanager/providerhub/models/DefaultRolloutProperties.java:[58,5] class, interface, or enum expected
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-providerhub/src/main/java/azure/resourcemanager/providerhub/models/CustomRolloutProperties.java:[39,1] class, interface, or enum expected
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-providerhub/src/main/java/azure/resourcemanager/providerhub/models/CustomRolloutProperties.java:[40,9] class, interface, or enum expected
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-providerhub/src/main/java/azure/resourcemanager/providerhub/models/CustomRolloutProperties.java:[41,5] class, interface, or enum expected
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-providerhub/src/main/java/azure/resourcemanager/providerhub/models/CustomRolloutProperties.java:[45,12] class, interface, or enum expected
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-providerhub/src/main/java/azure/resourcemanager/providerhub/models/CustomRolloutProperties.java:[47,9] class, interface, or enum expected
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-providerhub/src/main/java/azure/resourcemanager/providerhub/models/CustomRolloutProperties.java:[48,5] class, interface, or enum expected
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-providerhub/src/main/java/azure/resourcemanager/providerhub/models/CustomRolloutProperties.java:[56,12] class, interface, or enum expected
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-providerhub/src/main/java/azure/resourcemanager/providerhub/models/CustomRolloutProperties.java:[58,5] class, interface, or enum expected
[INFO] 16 errors 
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  1.869 s
[INFO] Finished at: 2021-07-07T18:57:53Z
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.8.1:compile (default-compile) on project azure-resourcemanager-providerhub-generated: Compilation failure: Compilation failure: 
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-providerhub/src/main/java/azure/resourcemanager/providerhub/models/DefaultRolloutProperties.java:[39,1] class, interface, or enum expected
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-providerhub/src/main/java/azure/resourcemanager/providerhub/models/DefaultRolloutProperties.java:[40,9] class, interface, or enum expected
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-providerhub/src/main/java/azure/resourcemanager/providerhub/models/DefaultRolloutProperties.java:[41,5] class, interface, or enum expected
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-providerhub/src/main/java/azure/resourcemanager/providerhub/models/DefaultRolloutProperties.java:[45,12] class, interface, or enum expected
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-providerhub/src/main/java/azure/resourcemanager/providerhub/models/DefaultRolloutProperties.java:[47,9] class, interface, or enum expected
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-providerhub/src/main/java/azure/resourcemanager/providerhub/models/DefaultRolloutProperties.java:[48,5] class, interface, or enum expected
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-providerhub/src/main/java/azure/resourcemanager/providerhub/models/DefaultRolloutProperties.java:[56,12] class, interface, or enum expected
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-providerhub/src/main/java/azure/resourcemanager/providerhub/models/DefaultRolloutProperties.java:[58,5] class, interface, or enum expected
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-providerhub/src/main/java/azure/resourcemanager/providerhub/models/CustomRolloutProperties.java:[39,1] class, interface, or enum expected
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-providerhub/src/main/java/azure/resourcemanager/providerhub/models/CustomRolloutProperties.java:[40,9] class, interface, or enum expected
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-providerhub/src/main/java/azure/resourcemanager/providerhub/models/CustomRolloutProperties.java:[41,5] class, interface, or enum expected
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-providerhub/src/main/java/azure/resourcemanager/providerhub/models/CustomRolloutProperties.java:[45,12] class, interface, or enum expected
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-providerhub/src/main/java/azure/resourcemanager/providerhub/models/CustomRolloutProperties.java:[47,9] class, interface, or enum expected
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-providerhub/src/main/java/azure/resourcemanager/providerhub/models/CustomRolloutProperties.java:[48,5] class, interface, or enum expected
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-providerhub/src/main/java/azure/resourcemanager/providerhub/models/CustomRolloutProperties.java:[56,12] class, interface, or enum expected
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-providerhub/src/main/java/azure/resourcemanager/providerhub/models/CustomRolloutProperties.java:[58,5] class, interface, or enum expected
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException

```
**stderr**
```

```
</details>

<details>
<summary>resources</summary>

**stdout**
```
AutoRest code generation utility [cli version: 3.2.3; node: v14.17.1, max-memory: 2048 MB]
(C) 2018 Microsoft Corporation.
https://aka.ms/autorest
   Loading AutoRest core      '/home/runner/.autorest/@autorest_core@3.0.6350/node_modules/@autorest/core/dist' (3.0.6350)
   Loading local AutoRest extension '@autorest/java' (/home/runner/work/autorest.java/autorest.java)
   Loading local AutoRest extension '@autorest/java.fluent' (/home/runner/work/autorest.java/autorest.java/fluentgen)
   Loading local AutoRest extension '@autorest/java.fluentnamer' (/home/runner/work/autorest.java/autorest.java/fluentgen/../fluentnamer)
   Loading AutoRest extension '@autorest/modelerfour' (4.15.447->4.15.447)
[Exception] No input files provided.

Use --help to get help information.

```
**stderr**
```

```
</details>

<details>
<summary>security</summary>

**stdout**
```
AutoRest code generation utility [cli version: 3.2.3; node: v14.17.1, max-memory: 2048 MB]
(C) 2018 Microsoft Corporation.
https://aka.ms/autorest
   Loading AutoRest core      '/home/runner/.autorest/@autorest_core@3.0.6350/node_modules/@autorest/core/dist' (3.0.6350)
   Loading local AutoRest extension '@autorest/java' (/home/runner/work/autorest.java/autorest.java)
   Loading local AutoRest extension '@autorest/java.fluent' (/home/runner/work/autorest.java/autorest.java/fluentgen)
   Loading local AutoRest extension '@autorest/java.fluentnamer' (/home/runner/work/autorest.java/autorest.java/fluentgen/../fluentnamer)
   Loading AutoRest extension '@autorest/modelerfour' (4.15.447->4.15.447)

WARNING (PreCheck/AllOfWhenYouMeantRef): Schema 'ConnectionToIpNotAllowed' is using an 'allOf' instead of a $ref. This creates a wasteful anonymous type when generating code.

WARNING (PreCheck/AllOfWhenYouMeantRef): Schema 'ConnectionFromIpNotAllowed' is using an 'allOf' instead of a $ref. This creates a wasteful anonymous type when generating code.

WARNING (PreCheck/AllOfWhenYouMeantRef): Schema 'LocalUserNotAllowed' is using an 'allOf' instead of a $ref. This creates a wasteful anonymous type when generating code.

WARNING (PreCheck/AllOfWhenYouMeantRef): Schema 'ProcessNotAllowed' is using an 'allOf' instead of a $ref. This creates a wasteful anonymous type when generating code.

WARNING (PreCheck/AllOfWhenYouMeantRef): Schema 'ActiveConnectionsNotInAllowedRange' is using an 'allOf' instead of a $ref. This creates a wasteful anonymous type when generating code.

WARNING (PreCheck/AllOfWhenYouMeantRef): Schema 'AmqpC2DMessagesNotInAllowedRange' is using an 'allOf' instead of a $ref. This creates a wasteful anonymous type when generating code.

WARNING (PreCheck/AllOfWhenYouMeantRef): Schema 'MqttC2DMessagesNotInAllowedRange' is using an 'allOf' instead of a $ref. This creates a wasteful anonymous type when generating code.

WARNING (PreCheck/AllOfWhenYouMeantRef): Schema 'HttpC2DMessagesNotInAllowedRange' is using an 'allOf' instead of a $ref. This creates a wasteful anonymous type when generating code.

WARNING (PreCheck/AllOfWhenYouMeantRef): Schema 'AmqpC2DRejectedMessagesNotInAllowedRange' is using an 'allOf' instead of a $ref. This creates a wasteful anonymous type when generating code.

WARNING (PreCheck/AllOfWhenYouMeantRef): Schema 'MqttC2DRejectedMessagesNotInAllowedRange' is using an 'allOf' instead of a $ref. This creates a wasteful anonymous type when generating code.

WARNING (PreCheck/AllOfWhenYouMeantRef): Schema 'HttpC2DRejectedMessagesNotInAllowedRange' is using an 'allOf' instead of a $ref. This creates a wasteful anonymous type when generating code.

WARNING (PreCheck/AllOfWhenYouMeantRef): Schema 'AmqpD2CMessagesNotInAllowedRange' is using an 'allOf' instead of a $ref. This creates a wasteful anonymous type when generating code.

WARNING (PreCheck/AllOfWhenYouMeantRef): Schema 'MqttD2CMessagesNotInAllowedRange' is using an 'allOf' instead of a $ref. This creates a wasteful anonymous type when generating code.

WARNING (PreCheck/AllOfWhenYouMeantRef): Schema 'HttpD2CMessagesNotInAllowedRange' is using an 'allOf' instead of a $ref. This creates a wasteful anonymous type when generating code.

WARNING (PreCheck/AllOfWhenYouMeantRef): Schema 'DirectMethodInvokesNotInAllowedRange' is using an 'allOf' instead of a $ref. This creates a wasteful anonymous type when generating code.

WARNING (PreCheck/AllOfWhenYouMeantRef): Schema 'FailedLocalLoginsNotInAllowedRange' is using an 'allOf' instead of a $ref. This creates a wasteful anonymous type when generating code.

WARNING (PreCheck/AllOfWhenYouMeantRef): Schema 'FileUploadsNotInAllowedRange' is using an 'allOf' instead of a $ref. This creates a wasteful anonymous type when generating code.

WARNING (PreCheck/AllOfWhenYouMeantRef): Schema 'QueuePurgesNotInAllowedRange' is using an 'allOf' instead of a $ref. This creates a wasteful anonymous type when generating code.

WARNING (PreCheck/AllOfWhenYouMeantRef): Schema 'TwinUpdatesNotInAllowedRange' is using an 'allOf' instead of a $ref. This creates a wasteful anonymous type when generating code.

WARNING (PreCheck/AllOfWhenYouMeantRef): Schema 'UnauthorizedOperationsNotInAllowedRange' is using an 'allOf' instead of a $ref. This creates a wasteful anonymous type when generating code.

WARNING (PreCheck/SchemaMissingType): The schema 'ComplianceResultList' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'PricingList' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'AdvancedThreatProtectionProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'TagsResource' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'IoTSecuritySolutionsList' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'IoTSecuritySolutionAnalyticsModelProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'IoTSecuritySolutionAnalyticsModelProperties-devicesMetricsItem' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'IoTSecuritySolutionAnalyticsModelList' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'IoTSecurityAggregatedAlertList' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'IoTSecurityAggregatedRecommendationList' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'IoTSecurityAggregatedAlertProperties-topDevicesListItem' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'TagsResource' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'WorkspaceSettingList' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'RegulatoryComplianceStandardList' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'RegulatoryComplianceControlList' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'RegulatoryComplianceAssessmentList' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'AutomationList' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'Rule' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'EffectiveNetworkSecurityGroups' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'AdaptiveNetworkHardeningProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'AdaptiveNetworkHardening' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'AdaptiveNetworkHardeningsList' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ExternalSecuritySolutionList' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'DeviceList' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'IngestionSettingList' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ConnectionStrings' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'SoftwareProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ErrorAdditionalInfo' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/CheckDuplicateSchemas): Checking for duplicate schemas, this could take a (long) while.  Run with --verbose for more detail.

WARNING (PreCheck/DuplicateSchema): Duplicate Schema named ExternalSecuritySolutionKind -- type: undefined => "string",properties: {"kind":{"description":"The kind of the external solution","$ref":"#/components/schemas/ExternalSecuritySolutionKind"}} => <none>,enum: undefined => ["CEF","ATA","AAD"],x-ms-enum: undefined => {"name":"ExternalSecuritySolutionKind","modelAsString":true,"values":[{"value":"CEF"},{"value":"ATA"},{"value":"AAD"}]} 

WARNING (PreCheck/DuplicateSchema): Duplicate Schema named AadConnectivityState -- type: undefined => "string",properties: {"connectivityState":{"$ref":"#/components/schemas/AadConnectivityState"}} => <none>,title: undefined => "The connectivity state of the external AAD solution ",enum: undefined => ["Discovered","NotLicensed","Connected"],x-ms-enum: undefined => {"name":"AadConnectivityState","modelAsString":true,"values":[{"value":"Discovered"},{"value":"NotLicensed"},{"value":"Connected"}]} 
INFORMATION (FluentNamer): Load fluent settings
INFORMATION (FluentJavaSettings): Option, string, add-inner : null
INFORMATION (FluentJavaSettings): Option, string, remove-inner : null
INFORMATION (FluentJavaSettings): Option, string, rename-model : null
INFORMATION (FluentJavaSettings): Option, string, remove-model : null
INFORMATION (FluentJavaSettings): Option, string, name-for-ungrouped-operations : null
INFORMATION (FluentJavaSettings): Option, string, pom-file : null
INFORMATION (FluentJavaSettings): Option, string, package-version : null
INFORMATION (FluentJavaSettings): Option, boolean, sdk-integration : null
INFORMATION (FluentNamer): Transform code model

WARNING (FluentTransformer): Modify parameter 'ascLocation' implementation from CLIENT to METHOD
INFORMATION (SchemaNameNormalization): Override default name, from 'ETag' to 'Etag'

WARNING (SchemaNameNormalization): Rename schema from 'Enum13' to 'TasksTaskUpdateActionType', based on operation group 'Tasks'

WARNING (SchemaNameNormalization): Rename schema from 'Enum15' to 'InformationProtectionPoliciesInformationProtectionPolicyName', based on operation group 'InformationProtectionPolicies'

WARNING (SchemaNameNormalization): Rename schema from 'Enum85' to 'SettingsSettingName', based on operation group 'Settings'

WARNING (NamingConflictResolver): Name conflict of choice with object 'protocol'
INFORMATION (NamingConflictResolver): Rename choice from 'protocol' to 'protocolValue'

WARNING (NamingConflictResolver): Name conflict of choice with object 'ExternalSecuritySolutionKind'
INFORMATION (NamingConflictResolver): Rename choice from 'ExternalSecuritySolutionKind' to 'ExternalSecuritySolutionKindValue'

WARNING (NamingConflictResolver): Name conflict of choice with object 'kind'
INFORMATION (NamingConflictResolver): Rename choice from 'kind' to 'kindValue'

WARNING (NamingConflictResolver): Name conflict of choice with object 'AadConnectivityState'
INFORMATION (NamingConflictResolver): Rename choice from 'AadConnectivityState' to 'AadConnectivityStateValue'
INFORMATION (OperationNameNormalization): Rename operation from 'listBySubscription' to 'list', in operation group 'IotSecuritySolution'
INFORMATION (OperationNameNormalization): Rename operation from 'get' to 'getByResourceGroup', in operation group 'IotSecuritySolution'
INFORMATION (OperationNameNormalization): Rename operation from 'get' to 'getByResourceGroup', in operation group 'Automations'

WARNING (OperationNameNormalization): Conflict operation name found after attempted rename '[list]', in operation group 'AssessmentsMetadata'

WARNING (OperationNameNormalization): Conflict operation name found after attempted rename '[list]', in operation group 'SecureScoreControlDefinitions'
INFORMATION (OperationNameNormalization): Rename operation from 'listBySubscription' to 'list', in operation group 'SoftwareInventories'
INFORMATION (ResourceTypeNormalization): Change parent from 'Resource' to 'ProxyResource', for 'ComplianceResult'
INFORMATION (ResourceTypeNormalization): Change parent from 'Resource' to 'ProxyResource', for 'Pricing'
INFORMATION (ResourceTypeNormalization): Change parent from 'Resource' to 'ProxyResource', for 'AdvancedThreatProtectionSetting'
INFORMATION (ResourceTypeNormalization): Change parent from 'Resource' to 'ProxyResource', for 'DeviceSecurityGroup'
INFORMATION (ResourceTypeNormalization): Change parent from 'Resource' to 'ProxyResource', for 'IoTSecuritySolutionModel'
INFORMATION (ResourceTypeNormalization): Change parent from 'Resource' to 'ProxyResource', for 'IoTSecuritySolutionAnalyticsModel'
INFORMATION (ResourceTypeNormalization): Change parent from 'Resource' to 'ProxyResource', for 'IoTSecurityAggregatedAlert'
INFORMATION (ResourceTypeNormalization): Change parent from 'Resource' to 'ProxyResource', for 'IoTSecurityAggregatedRecommendation'
INFORMATION (ResourceTypeNormalization): Change parent from 'Resource' to 'ProxyResource', for 'AscLocation'
INFORMATION (ResourceTypeNormalization): Change parent from 'Resource' to 'ProxyResource', for 'SecurityTask'
INFORMATION (ResourceTypeNormalization): Change parent from 'Resource' to 'ProxyResource', for 'AutoProvisioningSetting'
INFORMATION (ResourceTypeNormalization): Change parent from 'Resource' to 'ProxyResource', for 'Compliance'
INFORMATION (ResourceTypeNormalization): Change parent from 'Resource' to 'ProxyResource', for 'InformationProtectionPolicy'
INFORMATION (ResourceTypeNormalization): Change parent from 'Resource' to 'ProxyResource', for 'SecurityContact'
INFORMATION (ResourceTypeNormalization): Change parent from 'Resource' to 'ProxyResource', for 'WorkspaceSetting'
INFORMATION (ResourceTypeNormalization): Change parent from 'Resource' to 'ProxyResource', for 'RegulatoryComplianceStandard'
INFORMATION (ResourceTypeNormalization): Change parent from 'Resource' to 'ProxyResource', for 'RegulatoryComplianceControl'
INFORMATION (ResourceTypeNormalization): Change parent from 'Resource' to 'ProxyResource', for 'RegulatoryComplianceAssessment'
INFORMATION (ResourceTypeNormalization): Change parent from 'Resource' to 'ProxyResource', for 'SecuritySubAssessment'
INFORMATION (ResourceTypeNormalization): Change parent from 'TrackedResource' to 'Resource', for 'Automation'
INFORMATION (ResourceTypeNormalization): Change parent from 'Resource' to 'ProxyResource', for 'TrackedResource'
INFORMATION (ResourceTypeNormalization): Change parent from 'Resource' to 'ProxyResource', for 'AlertsSuppressionRule'
INFORMATION (ResourceTypeNormalization): Change parent from 'Resource' to 'ProxyResource', for 'ServerVulnerabilityAssessment'
INFORMATION (ResourceTypeNormalization): Change parent from 'Resource' to 'ProxyResource', for 'SecurityAssessmentMetadata'
INFORMATION (ResourceTypeNormalization): Change parent from 'Resource' to 'ProxyResource', for 'SecurityAssessment'
INFORMATION (ResourceTypeNormalization): Change parent from 'Resource' to 'ProxyResource', for 'AdaptiveApplicationControlGroup'
INFORMATION (ResourceTypeNormalization): Change parent from 'Resource' to 'ProxyResource', for 'AdaptiveNetworkHardening'
INFORMATION (ResourceTypeNormalization): Change parent from 'Resource' to 'ProxyResource', for 'AllowedConnectionsResource'
INFORMATION (ResourceTypeNormalization): Change parent from 'Resource' to 'ProxyResource', for 'TopologyResource'
INFORMATION (ResourceTypeNormalization): Change parent from 'Resource' to 'ProxyResource', for 'JitNetworkAccessPolicy'
INFORMATION (ResourceTypeNormalization): Change parent from 'Resource' to 'ProxyResource', for 'DiscoveredSecuritySolution'
INFORMATION (ResourceTypeNormalization): Change parent from 'Resource' to 'ProxyResource', for 'SecuritySolutionsReferenceData'
INFORMATION (ResourceTypeNormalization): Change parent from 'Resource' to 'ProxyResource', for 'ExternalSecuritySolution'
INFORMATION (ResourceTypeNormalization): Change parent from 'Resource' to 'ProxyResource', for 'SecureScoreItem'
INFORMATION (ResourceTypeNormalization): Change parent from 'Resource' to 'ProxyResource', for 'SecureScoreControlDetails'
INFORMATION (ResourceTypeNormalization): Change parent from 'Resource' to 'ProxyResource', for 'SecureScoreControlDefinitionItem'
INFORMATION (ResourceTypeNormalization): Change parent from 'Resource' to 'ProxyResource', for 'SecuritySolution'
INFORMATION (ResourceTypeNormalization): Change parent from 'Resource' to 'ProxyResource', for 'ConnectorSetting'
INFORMATION (ResourceTypeNormalization): Change parent from 'Resource' to 'ProxyResource', for 'Scan'
INFORMATION (ResourceTypeNormalization): Change parent from 'Resource' to 'ProxyResource', for 'ScanResult'
INFORMATION (ResourceTypeNormalization): Change parent from 'Resource' to 'ProxyResource', for 'RuleResults'
INFORMATION (ResourceTypeNormalization): Change parent from 'Resource' to 'ProxyResource', for 'IotDefenderSettingsModel'
INFORMATION (ResourceTypeNormalization): Change parent from 'Resource' to 'ProxyResource', for 'IotSensorsModel'
INFORMATION (ResourceTypeNormalization): Change parent from 'Resource' to 'ProxyResource', for 'Device'
INFORMATION (ResourceTypeNormalization): Change parent from 'Resource' to 'ProxyResource', for 'OnPremiseIotSensor'
INFORMATION (ResourceTypeNormalization): Change parent from 'Resource' to 'ProxyResource', for 'IotSitesModel'
INFORMATION (ResourceTypeNormalization): Change parent from 'Resource' to 'ProxyResource', for 'IotAlertModel'
INFORMATION (ResourceTypeNormalization): Change parent from 'Resource' to 'ProxyResource', for 'IotAlertType'
INFORMATION (ResourceTypeNormalization): Change parent from 'Resource' to 'ProxyResource', for 'IotRecommendationModel'
INFORMATION (ResourceTypeNormalization): Change parent from 'Resource' to 'ProxyResource', for 'IotRecommendationType'
INFORMATION (ResourceTypeNormalization): Change parent from 'Resource' to 'ProxyResource', for 'Alert'
INFORMATION (ResourceTypeNormalization): Change parent from 'Resource' to 'ProxyResource', for 'Setting'
INFORMATION (ResourceTypeNormalization): Change parent from 'Resource' to 'ProxyResource', for 'IngestionSetting'
INFORMATION (ResourceTypeNormalization): Change parent from 'Resource' to 'ProxyResource', for 'Software'
INFORMATION (SchemaCleanup): Remove unused schema 'Resource'
INFORMATION (SchemaCleanup): Remove unused schema 'SecureScoreControlScore'
INFORMATION (FluentGen): Read YAML
INFORMATION (FluentJavaSettings): Option, string, add-inner : null
INFORMATION (FluentJavaSettings): Option, string, remove-inner : null
INFORMATION (FluentJavaSettings): Option, string, rename-model : null
INFORMATION (FluentJavaSettings): Option, string, remove-model : null
INFORMATION (FluentJavaSettings): Option, string, name-for-ungrouped-operations : null
INFORMATION (FluentJavaSettings): Option, string, pom-file : null
INFORMATION (FluentJavaSettings): Option, string, package-version : null
INFORMATION (FluentJavaSettings): Option, boolean, sdk-integration : null
INFORMATION (FluentGen): Map code model to client model
INFORMATION (FluentMapper): Add Inner to response types: [SecurityAssessmentMetadata, IotAlertTypeList, AutoProvisioningSetting, PackageDownloads, Setting, ExternalSecuritySolution, Automation, IotDefenderSettingsList, AdvancedThreatProtectionSetting, SecuritySubAssessment, SecuritySolution, IotSensorsModel, IotAlertType, IoTSecurityAggregatedAlert, TopologyResource, DeviceSecurityGroup, AdaptiveApplicationControlGroups, IotSitesModel, IoTSecuritySolutionAnalyticsModelList, SecurityTask, SecurityAssessment, RulesResults, WorkspaceSetting, IotRecommendationTypeList, IngestionSettingToken, RegulatoryComplianceStandard, OnPremiseIotSensor, Alert, Device, SecurityContact, Compliance, Scans, InformationProtectionPolicy, AllowedConnectionsResource, IotRecommendationType, IoTSecurityAggregatedRecommendation, IotDefenderSettingsModel, IotRecommendationModel, AlertsSuppressionRule, AutomationValidationStatus, AdaptiveApplicationControlGroup, OnPremiseIotSensorsList, RuleResults, IotAlertModel, ScanResult, DiscoveredSecuritySolution, AscLocation, RegulatoryComplianceControl, ConnectionStrings, IngestionSetting, SecureScoreItem, SecureScoreControlDetails, SecuritySolutionsReferenceDataList, IotSensorsList, IoTSecuritySolutionModel, ServerVulnerabilityAssessmentsList, IotSitesList, Scan, Operation, JitNetworkAccessPolicy, JitNetworkAccessRequest, Software, IoTSecuritySolutionAnalyticsModel, RegulatoryComplianceAssessment, ScanResults, ServerVulnerabilityAssessment, Pricing, ComplianceResult, AdaptiveNetworkHardening, SecureScoreControlDefinitionItem, PricingList, ConnectorSetting]
INFORMATION (FluentMapper): Add Inner for type 'SecureScoreControlDefinitionItem': []

```
**stderr**
```

ERROR (FluentGen): Failed to successfully run fluentgen plugin java.lang.IllegalArgumentException: discriminator not found in type ExternalSecuritySolution and its parents
java.lang.IllegalArgumentException: discriminator not found in type ExternalSecuritySolution and its parents
	at com.azure.autorest.util.SchemaUtil.getDiscriminatorSerializedName(SchemaUtil.java:100)
	at com.azure.autorest.mapper.ModelMapper.map(ModelMapper.java:166)
	at com.azure.autorest.mapper.ModelMapper.map(ModelMapper.java:182)
	at com.azure.autorest.mapper.ClientMapper.lambda$map$5(ClientMapper.java:97)
	at java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:195)
	at java.base/java.util.stream.DistinctOps$1$2.accept(DistinctOps.java:175)
	at java.base/java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1655)
	at java.base/java.util.stream.Streams$ConcatSpliterator.forEachRemaining(Streams.java:734)
	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:484)
	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
	at java.base/java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:913)
	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
	at java.base/java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:578)
	at com.azure.autorest.mapper.ClientMapper.map(ClientMapper.java:100)
	at com.azure.autorest.fluent.FluentGen.handleMap(FluentGen.java:145)
	at com.azure.autorest.fluent.FluentGen.processInternal(FluentGen.java:86)
	at com.azure.autorest.extension.base.plugin.NewPlugin.process(NewPlugin.java:202)
	at com.azure.autorest.fluent.Main.lambda$main$1(Main.java:18)
	at com.azure.autorest.extension.base.jsonrpc.Connection.lambda$dispatch$2(Connection.java:151)
	at com.azure.autorest.extension.base.jsonrpc.Connection.lambda$process$3(Connection.java:270)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:515)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)

FATAL (FluentGen): Unhandled error: discriminator not found in type ExternalSecuritySolution and its parents
java.lang.IllegalArgumentException: discriminator not found in type ExternalSecuritySolution and its parents
	at com.azure.autorest.util.SchemaUtil.getDiscriminatorSerializedName(SchemaUtil.java:100)
	at com.azure.autorest.mapper.ModelMapper.map(ModelMapper.java:166)
	at com.azure.autorest.mapper.ModelMapper.map(ModelMapper.java:182)
	at com.azure.autorest.mapper.ClientMapper.lambda$map$5(ClientMapper.java:97)
	at java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:195)
	at java.base/java.util.stream.DistinctOps$1$2.accept(DistinctOps.java:175)
	at java.base/java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1655)
	at java.base/java.util.stream.Streams$ConcatSpliterator.forEachRemaining(Streams.java:734)
	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:484)
	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
	at java.base/java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:913)
	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
	at java.base/java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:578)
	at com.azure.autorest.mapper.ClientMapper.map(ClientMapper.java:100)
	at com.azure.autorest.fluent.FluentGen.handleMap(FluentGen.java:145)
	at com.azure.autorest.fluent.FluentGen.processInternal(FluentGen.java:86)
	at com.azure.autorest.extension.base.plugin.NewPlugin.process(NewPlugin.java:202)
	at com.azure.autorest.fluent.Main.lambda$main$1(Main.java:18)
	at com.azure.autorest.extension.base.jsonrpc.Connection.lambda$dispatch$2(Connection.java:151)
	at com.azure.autorest.extension.base.jsonrpc.Connection.lambda$process$3(Connection.java:270)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:515)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)

  Error: Plugin fluentgen reported failure.

```
</details>

<details>
<summary>service-map</summary>

**stdout**
```
AutoRest code generation utility [cli version: 3.2.3; node: v14.17.1, max-memory: 2048 MB]
(C) 2018 Microsoft Corporation.
https://aka.ms/autorest
   Loading AutoRest core      '/home/runner/.autorest/@autorest_core@3.0.6350/node_modules/@autorest/core/dist' (3.0.6350)
   Loading local AutoRest extension '@autorest/java' (/home/runner/work/autorest.java/autorest.java)
   Installing AutoRest extension '@microsoft.azure/classic-openapi-validator' (~1.0.9)
   Installed AutoRest extension '@microsoft.azure/classic-openapi-validator' (~1.0.9->1.0.14)
   Installing AutoRest extension '@microsoft.azure/openapi-validator' (~1.0.2)
   Installed AutoRest extension '@microsoft.azure/openapi-validator' (~1.0.2->1.0.4)
   Installing AutoRest extension 'oav' (~0.4.20)
   Installed AutoRest extension 'oav' (~0.4.20->0.4.70)
   Loading local AutoRest extension '@autorest/java.fluent' (/home/runner/work/autorest.java/autorest.java/fluentgen)
   Loading local AutoRest extension '@autorest/java.fluentnamer' (/home/runner/work/autorest.java/autorest.java/fluentgen/../fluentnamer)
   Loading AutoRest extension '@autorest/modelerfour' (4.15.447->4.15.447)

WARNING (PreCheck/AllOfWhenYouMeantRef): Schema 'MachineReference' is using an 'allOf' instead of a $ref. This creates a wasteful anonymous type when generating code.

WARNING (PreCheck/AllOfWhenYouMeantRef): Schema 'ClientGroupReference' is using an 'allOf' instead of a $ref. This creates a wasteful anonymous type when generating code.

WARNING (PreCheck/AllOfWhenYouMeantRef): Schema 'Summary' is using an 'allOf' instead of a $ref. This creates a wasteful anonymous type when generating code.

WARNING (PreCheck/SchemaMissingType): The schema 'Resource' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ResourceReference' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'MachineReference' with an undefined type and 'allOf'/'anyOf'/'oneOf' is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ProcessReference' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'PortReference' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'MachineReferenceWithHints' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ClientGroupReference' with an undefined type and 'allOf'/'anyOf'/'oneOf' is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'CoreResource' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'Machine' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'Process' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'Port' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ClientGroup' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ClientGroupMember' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'MachineGroup' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'Summary' with an undefined type and 'allOf'/'anyOf'/'oneOf' is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'MachinesSummary' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'Relationship' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'Connection' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'Acceptor' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'RelationshipProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ConnectionProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'AcceptorProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'Ipv4NetworkInterface' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'Ipv6NetworkInterface' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'NetworkConfiguration' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'AgentConfiguration' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'Timezone' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'OperatingSystemConfiguration' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'MachineResourcesConfiguration' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'VirtualMachineConfiguration' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'HypervisorConfiguration' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'HostingConfiguration' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'AzureHostingConfiguration' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'AzureCloudServiceConfiguration' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'AzureVmScaleSetConfiguration' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'AzureServiceFabricClusterConfiguration' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ImageConfiguration' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ProcessUser' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ProcessDetails' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ProcessHostedService' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ProcessHostingConfiguration' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'AzureProcessHostingConfiguration' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'SingleMachineDependencyMapRequest' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'MultipleMachinesMapRequest' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'MachineListMapRequest' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'MachineGroupMapRequest' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/CheckDuplicateSchemas): Checking for duplicate schemas, this could take a (long) while.  Run with --verbose for more detail.

WARNING (PreCheck/PropertyRedeclarationWarning): Schema 'MachineGroup' has a property 'etag' that is already declared the parent schema 'CoreResource' but isn't significantly different. The property has been removed from MachineGroup

WARNING (PostOperationIdContainsUrlVerb/R2066/SDKViolation): OperationId should contain the verb: 'generatemap' in:'Maps_Generate'. Consider updating the operationId
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/service-map/resource-manager/Microsoft.OperationalInsights/preview/2015-11-01-preview/arm-service-map.json:4591:4

WARNING (PostOperationIdContainsUrlVerb/R2066/SDKViolation): OperationId should contain the verb: 'machinegroups' in:'MachineGroups_Create'. Consider updating the operationId
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/service-map/resource-manager/Microsoft.OperationalInsights/preview/2015-11-01-preview/arm-service-map.json:6557:4

WARNING (EnumInsteadOfBoolean/R3018/ARMViolation): Booleans are not descriptive and make them hard to use. Consider using string enums with allowed set of values defined. Property: live
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/service-map/resource-manager/Microsoft.OperationalInsights/preview/2015-11-01-preview/arm-service-map.json:58:6

WARNING (EnumInsteadOfBoolean/R3018/ARMViolation): Booleans are not descriptive and make them hard to use. Consider using string enums with allowed set of values defined. Property: live
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/service-map/resource-manager/Microsoft.OperationalInsights/preview/2015-11-01-preview/arm-service-map.json:2097:6

WARNING (OperationIdNounVerb/R1001/SDKViolation): Per the Noun_Verb convention for Operation Ids, the noun 'Machines' should not appear after the underscore. Note: If you have already shipped an SDK on top of this spec, fixing this warning may introduce a breaking change.
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/service-map/resource-manager/Microsoft.OperationalInsights/preview/2015-11-01-preview/arm-service-map.json:3618:4

WARNING (PutInOperationName/R1006/SDKViolation): 'PUT' operation 'MachineGroups_Update' should use method name 'Create'. Note: If you have already shipped an SDK on top of this spec, fixing this warning may introduce a breaking change.
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/service-map/resource-manager/Microsoft.OperationalInsights/preview/2015-11-01-preview/arm-service-map.json:6750:4

WARNING (XmsEnumValidation/R2018/SDKViolation): The enum types should have x-ms-enum type extension set with appropriate options. Property name: kind
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/service-map/resource-manager/Microsoft.OperationalInsights/preview/2015-11-01-preview/arm-service-map.json:6937:4

WARNING (XmsEnumValidation/R2018/SDKViolation): The enum types should have x-ms-enum type extension set with appropriate options. Property name: kind
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/service-map/resource-manager/Microsoft.OperationalInsights/preview/2015-11-01-preview/arm-service-map.json:7070:4

WARNING (XmsEnumValidation/R2018/SDKViolation): The enum types should have x-ms-enum type extension set with appropriate options. Property name: kind
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/service-map/resource-manager/Microsoft.OperationalInsights/preview/2015-11-01-preview/arm-service-map.json:7434:4

WARNING (XmsEnumValidation/R2018/SDKViolation): The enum types should have x-ms-enum type extension set with appropriate options. Property name: provider
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/service-map/resource-manager/Microsoft.OperationalInsights/preview/2015-11-01-preview/arm-service-map.json:8039:4

WARNING (XmsEnumValidation/R2018/SDKViolation): The enum types should have x-ms-enum type extension set with appropriate options. Property name: kind
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/service-map/resource-manager/Microsoft.OperationalInsights/preview/2015-11-01-preview/arm-service-map.json:8046:4

WARNING (XmsEnumValidation/R2018/SDKViolation): The enum types should have x-ms-enum type extension set with appropriate options. Property name: provider
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/service-map/resource-manager/Microsoft.OperationalInsights/preview/2015-11-01-preview/arm-service-map.json:8306:4

WARNING (XmsEnumValidation/R2018/SDKViolation): The enum types should have x-ms-enum type extension set with appropriate options. Property name: kind
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/service-map/resource-manager/Microsoft.OperationalInsights/preview/2015-11-01-preview/arm-service-map.json:8313:4

WARNING (XmsEnumValidation/R2018/SDKViolation): The enum types should have x-ms-enum type extension set with appropriate options. Property name: kind
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/service-map/resource-manager/Microsoft.OperationalInsights/preview/2015-11-01-preview/arm-service-map.json:8450:4

WARNING (DescriptionAndTitleMissing/R4000/SDKViolation): 'properties' model/property lacks 'description' and 'title' property. Consider adding a 'description'/'title' element. Accurate description/title is essential for maintaining reference documentation.
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/service-map/resource-manager/Microsoft.OperationalInsights/preview/2015-11-01-preview/arm-service-map.json:7419:4

WARNING (DescriptionAndTitleMissing/R4000/SDKViolation): 'properties' model/property lacks 'description' and 'title' property. Consider adding a 'description'/'title' element. Accurate description/title is essential for maintaining reference documentation.
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/service-map/resource-manager/Microsoft.OperationalInsights/preview/2015-11-01-preview/arm-service-map.json:7456:4

WARNING (DescriptionAndTitleMissing/R4000/SDKViolation): 'properties' model/property lacks 'description' and 'title' property. Consider adding a 'description'/'title' element. Accurate description/title is essential for maintaining reference documentation.
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/service-map/resource-manager/Microsoft.OperationalInsights/preview/2015-11-01-preview/arm-service-map.json:7471:4

WARNING (DescriptionAndTitleMissing/R4000/SDKViolation): 'nodes' model/property lacks 'description' and 'title' property. Consider adding a 'description'/'title' element. Accurate description/title is essential for maintaining reference documentation.
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/service-map/resource-manager/Microsoft.OperationalInsights/preview/2015-11-01-preview/arm-service-map.json:8398:4

WARNING (DescriptionAndTitleMissing/R4000/SDKViolation): 'edges' model/property lacks 'description' and 'title' property. Consider adding a 'description'/'title' element. Accurate description/title is essential for maintaining reference documentation.
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/service-map/resource-manager/Microsoft.OperationalInsights/preview/2015-11-01-preview/arm-service-map.json:8401:4

WARNING (EnumInsteadOfBoolean/R3018/ARMViolation): Booleans are not descriptive and make them hard to use. Consider using string enums with allowed set of values defined. Property: live
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/service-map/resource-manager/Microsoft.OperationalInsights/preview/2015-11-01-preview/arm-service-map.json:8424:4

WARNING (EnumInsteadOfBoolean/R3018/ARMViolation): Booleans are not descriptive and make them hard to use. Consider using string enums with allowed set of values defined. Property: filterProcesses
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/service-map/resource-manager/Microsoft.OperationalInsights/preview/2015-11-01-preview/arm-service-map.json:8490:4
INFORMATION (FluentNamer): Load fluent settings
INFORMATION (FluentJavaSettings): Option, string, add-inner : null
INFORMATION (FluentJavaSettings): Option, string, remove-inner : null
INFORMATION (FluentJavaSettings): Option, string, rename-model : null
INFORMATION (FluentJavaSettings): Option, string, remove-model : null
INFORMATION (FluentJavaSettings): Option, string, name-for-ungrouped-operations : null
INFORMATION (FluentJavaSettings): Option, string, pom-file : null
INFORMATION (FluentJavaSettings): Option, string, package-version : null
INFORMATION (FluentJavaSettings): Option, boolean, sdk-integration : null
INFORMATION (FluentNamer): Transform code model
INFORMATION (SchemaNameNormalization): Override default name, from 'userName' to 'username'
INFORMATION (SchemaNameNormalization): Create sealed choice 'HostingConfigurationProvider'
INFORMATION (SchemaNameNormalization): Create sealed choice 'ProcessHostingConfigurationProvider'
INFORMATION (ResourceTypeNormalization): Change parent from 'Resource' to 'ProxyResource', for 'CoreResource'
INFORMATION (ResourceTypeNormalization): Change parent from 'Resource' to 'ProxyResource', for 'Relationship'
INFORMATION (ResourceTypeNormalization): Change parent from 'Resource' to 'ProxyResource', for 'ClientGroupMember'
INFORMATION (ResourceTypeNormalization): Change parent from 'Resource' to 'ProxyResource', for 'MachinesSummary'
INFORMATION (ResourceTypeNormalization): Change parent from 'Resource' to 'ProxyResource', for 'Summary'
INFORMATION (SchemaCleanup): Remove unused schema 'Resource'
INFORMATION (SchemaCleanup): Remove unused schema 'Summary'
INFORMATION (FluentGen): Read YAML
INFORMATION (FluentJavaSettings): Option, string, add-inner : null
INFORMATION (FluentJavaSettings): Option, string, remove-inner : null
INFORMATION (FluentJavaSettings): Option, string, rename-model : null
INFORMATION (FluentJavaSettings): Option, string, remove-model : null
INFORMATION (FluentJavaSettings): Option, string, name-for-ungrouped-operations : null
INFORMATION (FluentJavaSettings): Option, string, pom-file : null
INFORMATION (FluentJavaSettings): Option, string, package-version : null
INFORMATION (FluentJavaSettings): Option, boolean, sdk-integration : null
INFORMATION (FluentGen): Map code model to client model
INFORMATION (FluentMapper): Add Inner to response types: [ClientGroupMembersCount, MapResponse, Connection, Port, ClientGroupMember, Process, ClientGroup, Machine, MachinesSummary, MachineGroup, Liveness]
INFORMATION (FluentGen): Java template for client model
INFORMATION (FluentGen): Process for Fluent Lite, SDK integration disabled
INFORMATION (FluentJavaSettings): Option, string, tag : package-2015-11-preview
INFORMATION (FluentJavaSettings): Option, string, base-folder : .
INFORMATION (FluentJavaSettings): Option, string, output-folder : /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-service-map
INFORMATION (FluentJavaSettings): Option, string, azure-libraries-for-java-folder : null
INFORMATION (FluentJavaSettings): List of input files : [Microsoft.OperationalInsights/preview/2015-11-01-preview/arm-service-map.json]
INFORMATION (FluentGen): Write Java
INFORMATION (JavaFormatter): Java version: 11.0.11
INFORMATION (JavaFormatter): Java formatter enabled
INFORMATION (FluentGen): Write Xml
INFORMATION (FluentGen): Write Text

```
**stderr**
```
FATAL: Failed validating: 'file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/service-map/resource-manager/Microsoft.OperationalInsights/preview/2015-11-01-preview/arm-service-map.json', error encountered: TypeError: Cannot read property 'properties' of undefined
FATAL: [object Object]
(node:24489) UnhandledPromiseRejectionWarning: Error: Plugin model-validator reported failure.
    at /home/runner/.autorest/@autorest_core@3.0.6350/node_modules/@autorest/core/dist/lib/pipeline/plugins/external.js:27:19
    at async ScheduleNode (/home/runner/.autorest/@autorest_core@3.0.6350/node_modules/@autorest/core/dist/lib/pipeline/pipeline.js:314:33)
(Use `node --trace-warnings ...` to show where the warning was created)
(node:24489) UnhandledPromiseRejectionWarning: Unhandled promise rejection. This error originated either by throwing inside of an async function without a catch block, or by rejecting a promise which was not handled with .catch(). To terminate the node process on unhandled promise rejection, use the CLI flag `--unhandled-rejections=strict` (see https://nodejs.org/api/cli.html#cli_unhandled_rejections_mode). (rejection id: 60)
(node:24489) [DEP0018] DeprecationWarning: Unhandled promise rejections are deprecated. In the future, promise rejections that are not handled will terminate the Node.js process with a non-zero exit code.
  Error: Plugin model-validator reported failure.

```
</details>

<details>
<summary>streamanalytics</summary>

**stdout**
```
[INFO] Scanning for projects...
[INFO] 
[INFO] --< com.azure.resourcemanager:azure-resourcemanager-streamanalytics-generated >--
[INFO] Building Microsoft Azure SDK for StreamAnalytics Management 1.0.0-beta.1
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ azure-resourcemanager-streamanalytics-generated ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-streamanalytics/src/main/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.1:compile (default-compile) @ azure-resourcemanager-streamanalytics-generated ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 255 source files to /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-streamanalytics/target/classes
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR : 
[INFO] -------------------------------------------------------------
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-streamanalytics/src/main/java/azure/resourcemanager/streamanalytics/implementation/QueryTestingResultImpl.java:[23,33] cannot find symbol
  symbol:   method status()
  location: class azure.resourcemanager.streamanalytics.fluent.models.QueryTestingResultInner
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-streamanalytics/src/main/java/azure/resourcemanager/streamanalytics/implementation/QueryTestingResultImpl.java:[27,33] cannot find symbol
  symbol:   method outputUri()
  location: class azure.resourcemanager.streamanalytics.fluent.models.QueryTestingResultInner
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-streamanalytics/src/main/java/azure/resourcemanager/streamanalytics/implementation/TestDatasourceResultImpl.java:[23,33] cannot find symbol
  symbol:   method status()
  location: class azure.resourcemanager.streamanalytics.fluent.models.TestDatasourceResultInner
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-streamanalytics/src/main/java/azure/resourcemanager/streamanalytics/implementation/SampleInputResultImpl.java:[25,33] cannot find symbol
  symbol:   method status()
  location: class azure.resourcemanager.streamanalytics.fluent.models.SampleInputResultInner
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-streamanalytics/src/main/java/azure/resourcemanager/streamanalytics/implementation/SampleInputResultImpl.java:[29,47] cannot find symbol
  symbol:   method diagnostics()
  location: class azure.resourcemanager.streamanalytics.fluent.models.SampleInputResultInner
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-streamanalytics/src/main/java/azure/resourcemanager/streamanalytics/implementation/SampleInputResultImpl.java:[38,33] cannot find symbol
  symbol:   method eventsDownloadUrl()
  location: class azure.resourcemanager.streamanalytics.fluent.models.SampleInputResultInner
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-streamanalytics/src/main/java/azure/resourcemanager/streamanalytics/implementation/SampleInputResultImpl.java:[42,33] cannot find symbol
  symbol:   method lastArrivalTime()
  location: class azure.resourcemanager.streamanalytics.fluent.models.SampleInputResultInner
[INFO] 7 errors 
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  4.186 s
[INFO] Finished at: 2021-07-07T19:14:55Z
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.8.1:compile (default-compile) on project azure-resourcemanager-streamanalytics-generated: Compilation failure: Compilation failure: 
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-streamanalytics/src/main/java/azure/resourcemanager/streamanalytics/implementation/QueryTestingResultImpl.java:[23,33] cannot find symbol
[ERROR]   symbol:   method status()
[ERROR]   location: class azure.resourcemanager.streamanalytics.fluent.models.QueryTestingResultInner
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-streamanalytics/src/main/java/azure/resourcemanager/streamanalytics/implementation/QueryTestingResultImpl.java:[27,33] cannot find symbol
[ERROR]   symbol:   method outputUri()
[ERROR]   location: class azure.resourcemanager.streamanalytics.fluent.models.QueryTestingResultInner
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-streamanalytics/src/main/java/azure/resourcemanager/streamanalytics/implementation/TestDatasourceResultImpl.java:[23,33] cannot find symbol
[ERROR]   symbol:   method status()
[ERROR]   location: class azure.resourcemanager.streamanalytics.fluent.models.TestDatasourceResultInner
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-streamanalytics/src/main/java/azure/resourcemanager/streamanalytics/implementation/SampleInputResultImpl.java:[25,33] cannot find symbol
[ERROR]   symbol:   method status()
[ERROR]   location: class azure.resourcemanager.streamanalytics.fluent.models.SampleInputResultInner
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-streamanalytics/src/main/java/azure/resourcemanager/streamanalytics/implementation/SampleInputResultImpl.java:[29,47] cannot find symbol
[ERROR]   symbol:   method diagnostics()
[ERROR]   location: class azure.resourcemanager.streamanalytics.fluent.models.SampleInputResultInner
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-streamanalytics/src/main/java/azure/resourcemanager/streamanalytics/implementation/SampleInputResultImpl.java:[38,33] cannot find symbol
[ERROR]   symbol:   method eventsDownloadUrl()
[ERROR]   location: class azure.resourcemanager.streamanalytics.fluent.models.SampleInputResultInner
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-streamanalytics/src/main/java/azure/resourcemanager/streamanalytics/implementation/SampleInputResultImpl.java:[42,33] cannot find symbol
[ERROR]   symbol:   method lastArrivalTime()
[ERROR]   location: class azure.resourcemanager.streamanalytics.fluent.models.SampleInputResultInner
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException

```
**stderr**
```

```
</details>
