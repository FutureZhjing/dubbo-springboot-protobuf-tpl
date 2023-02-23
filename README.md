---
layout: cover
---

# 说明

利用 `SpringBoot 3.X` + `dubbo` + `zookeeper` 实现分布式系统，支持 `protobuf`

----

# 环境

- `springBoot 3.X`
- `dubbo 3.2.x`
- `grpc 1.53.0`
- `kotlin`
- `gradle`
- `zookeeper 3.7.0`
- `protobuf`

---

# 项目结构

```tex
├── buildSrc										# gradle 配置
├── api													# protobuf & grpc service
├── consumer										# 消费者
├── idl													# proto文件以及编译脚本
├── provider										# 生产者
```

