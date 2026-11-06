# istad-proto

Protocol Buffer definitions shared by the ISTAD microservices. The module is
published to the Buf Schema Registry as `buf.build/sophiram/istad-proto`.

## Validate and generate

Install the [Buf CLI](https://buf.build/docs/cli/installation/) and run these
commands from this repository:

```shell
buf lint
buf breaking --against https://github.com/Sophiram/istad-proto.git#branch=main
buf generate
```

`buf generate` writes Java protobuf and gRPC sources to `gen/java`. Those files
are generated output; consumers should use the Maven SDKs from the BSR instead
of copying generated sources into their repositories.

`GetProductResponse` uses the same fields, types, and numbers as the previous
`Product` response, preserving the serialized payload. The RPC descriptor's
response type name changes to satisfy Buf's standard RPC response naming rule,
so `buf breaking` will report this schema change against the existing baseline.

## Publish

Log in with a Buf account, then publish the module:

```shell
buf registry login
buf registry module create buf.build/sophiram/istad-proto --visibility public
buf push
```

Create the BSR module once. Public visibility lets the microservices build
resolve its Maven SDKs without registry credentials.
The GitHub Actions workflow runs lint and breaking-change checks on pushes and
pull requests.

## Resolve Java SDK versions

After publishing, get the generated SDK versions from the BSR:

```shell
buf registry sdk version --module=buf.build/sophiram/istad-proto --plugin=buf.build/protocolbuffers/java
buf registry sdk version --module=buf.build/sophiram/istad-proto --plugin=buf.build/grpc/java
```

Copy each command's output into the corresponding `bufProtoJavaSdkVersion` or
`bufGrpcJavaSdkVersion` Gradle property. The two plugins can have different
versions; do not assume one output applies to both.

Build the microservices repository with those values:

```shell
./gradlew build -PbufProtoJavaSdkVersion=PROTOBUF_SDK_VERSION -PbufGrpcJavaSdkVersion=GRPC_SDK_VERSION
```
