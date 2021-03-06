## 工厂模式

### 意义
* 将实例化对象的代码提取出来，放到一个类中同意管理和维护，达到和主项目目的依赖关系的解耦
* 创建对象实例时，不要直接New类，而是把new类的动作放在一个工厂方法中并返回
* 不要让为继承具体类，而是继承抽象类或者实现接口
* 不要覆盖基类中已经实现的方法

### 实现方式
* 简单工厂模式

* 工厂方法
  * 将对象的实例化推迟到子类中
  
* 抽象工厂模式
  * 定义了一个interface用于创建相关或依赖关系的对象簇，而无需指明具体的类
  * 抽象工厂模式可以将简单工厂模式和工厂方法模式进行整合
  * 从设计层面看，抽象工厂模式就是对简单工厂模式的改进
  ＊ 将工厂抽象成两层，AbsFactory(抽象工厂)和具体实现的工厂子类。程序员可以根据创建对象类型使用对应的子类。这样将单个的简单工厂变成工厂簇