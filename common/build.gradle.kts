dependencies {
  api(Deps.protobuf)
}

java.sourceSets {
  getByName("main").java.srcDirs("build/generated/source/proto/main/java")
}
