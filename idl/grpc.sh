#!/bin/bash

target=../api/build/generated/source/proto/main/java

mvn clean install &&
  rm target/classes/*.proto &&
  rm -rf ${target} &&
  mkdir -p ${target} &&
  mv target/generated-sources/protobuf/java/* ${target}
