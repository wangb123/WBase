#WBase文档
####使用方法：

```groovy
	implementation 'org.wbing:base:0.1.4'
	implementation "$api_kt"//部分代码依赖kotlin，所以需要依赖
	implementation "$api_appcompat"//使用了appcompat兼容包
```

##功能说明
>WBase模块一个基于安卓SDK独立封装出来的对Android APP快速开发的库，在原有activity、fragment和application的基础上二次封装，使之更符合敏捷试的开发。模块采用M(model)、V(view)、P(presenter)和VM(ViewModel)组合

###WModel
>定义数据模型层，每个数据模型都有int形id，int占用32位4个字节，long64位8字节，节省内存使用int形ID，数据模型不与View产生任何关联

###WView
>定义UI显示层，通常是指Activity和Framgent，不得与数据模型产生关联，

###WPresenter
>定义业务处理层，负责协调处理view、model和ViewModel之间的沟通交流。简单的使用场景：view要显示model中的数据，调用关系是view=>presenter=>model,用户或其他出发view的某种需求，view告诉presenter我要干嘛，presenter去执行，执行可分为两种，一种是交给model做具体执行，还有一种是自己执行，执行完毕后，将结果回调给view，看图

![刚发的](http://www.jcodecraeer.com/uploads/userup/13953/1G020140036-F40-0.png)

###ViewDataBinding
>定义数据绑定层，使用Android DataBinding框架实现，用于实现数据绑定

###WCallback
>定义逻辑执行结果回调，当执行玩任务后，将执行结果回馈给调用方

###WApp
>抽象的Application

###WAct
>抽象的Activity，实现IView接口，实现了沉浸式状态栏，注意导航栏高度的处理

###WFrag
>抽象的Fragment，实现IView接口，





---
###TODO list

##### 0.1.5
- WView在不设置布局的时候没有ViewHolder

##### 0.1.4
- To enable the new data binding compiler, add the following option to your gradle.properties file:
```groovy
	android.databinding.enableV2=true
```

##### 0.1.1
- WAct不要在onCreate中设置背景颜色，留给用户去设置，可能会造成页面透明
- ViewHolder返回值由Unit改为Boolean
- 修改WAct和WFrag中Callback的返回类型为bool
- WAct双击返回添加toast提示

