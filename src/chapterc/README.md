## 介绍说明

咖啡系统有不同的咖啡，且不同的咖啡可以添加不同的调料。

咖啡的种类有：House Blend（家常咖啡），Dark Roast（深培咖啡），Decaf（低因咖啡）以及 Espresso（浓缩咖啡）。

咖啡调料的种类有：Milk（牛奶），Soy（豆浆），Mocha（摩卡）以及 Whip（奶泡）。

## UML 和代码

原有的类 UML 设计如下

<div align="center"><img src="./a/uml_1.svg"></div>

当我们添加了配料，原有的每种咖啡都可以配上不同的调料，相应的类也成指数倍增。

<div align="center"><img src="./a/uml_2.svg"></div>

如果牛奶的价格上涨，所有跟牛奶有关的类都需要修改。而如果新增一种焦糖的调料，那么所有咖啡都要增加对应的调料。

### 使用实例变量

使用实例变量来设置调料

<div align="center"><img src="./b/uml.svg"></div>
