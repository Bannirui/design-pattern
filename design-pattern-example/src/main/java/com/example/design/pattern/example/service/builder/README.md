## 建造者模式 Builder

### 模式定义
将一个复杂对象的创建与它的表示分离，使得同样的构建过程可以创建不同的表示

### 场景
* 需要生成的对象具有复杂的内部结构
* 需要生成的对象内部属性本身相互依赖
* 与不可变对象配合使用

### 优点
* 建造者独立，易扩展
* 便于控制细节风险

### 建造者模式的四个角色
* Product 产品角色 一个具体的产品对象
* Builder 抽象建造者 创建一个Product对象的各个部件指定的接口/抽象类
* ConcreteBuilder 具体建造者 实现接口，构建和装配各个部件
* Director 指挥者 构建一个使用Builder接口的对象，主要是用于创建一个复杂对象
  * 隔离客户与对象的生产过程
  * 负责控制产品对象的生产过程