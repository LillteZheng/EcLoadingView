
这是一个封装好的 loading 工具库，内置了常见了加载动画，目前正在添加中。。。。

**第一种,仿饿了吗加载动画**

![image](https://user-gold-cdn.xitu.io/2018/5/27/1639eeb9c44dd5cc?w=216&h=162&f=gif&s=64674)

**仿蘑菇街加载动画**

![image](https://user-gold-cdn.xitu.io/2018/5/27/1639eeb9c6cd3e91?w=228&h=117&f=gif&s=97223)


## **怎么使用**

在project 的 build.gradle :
```
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```
然后关联即可
```
 compile 'com.github.LillteZheng:EcLoadingView:v0.3'
```


由于图片都是内置到 lib 中，所以可以很方便的使用，如水果动画，可以设置时间：

```
  <com.zhengsr.ecloadinglib.view.EcJumpLoadingView
        android:id="@+id/ecloadview"
        android:layout_width="250dp"
        android:layout_height="250dp"
        app:ec_jump_anim_time="500"
        android:layout_gravity="center_horizontal"
        />
```

也可以直接在代码直接写：
```
EcBitmapLoadingView view = new EcBitmapLoadingView(this);
content.addView(view);
```

在获取实例之后，也可以使用 startAnim() 和 stopAnim() 来开始或停止动画




