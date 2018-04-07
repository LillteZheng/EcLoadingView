
这是一个封装好的 loading 工具库，内置了常见了加载动画，目前正在添加中。。。。



**第一种,仿饿了吗加载动画**

![image](https://github.com/LillteZheng/EcLoadingView/raw/master/gif/jump.gif)

**第二种，仿蘑菇街加载动画**

![image](https://github.com/LillteZheng/EcLoadingView/raw/master/gif/people.gif)


## **怎么样使用**

```
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
然后添加：
```
 compile 'com.github.LillteZheng:EcLoadingView:v0.1'
 ```

第一种 xml 配置 , 其中 ec_jump_bitmap_array 是跳的图片：
```
 <com.zhengsr.ecloadinglib.view.EcJumpLoadingView
        android:id="@+id/ecloadview"
        android:layout_width="150dp"
        android:layout_height="150dp"
        app:ec_jump_bitmap_array="@array/image_array"
        app:ec_jump_anim_time="500"
        android:layout_gravity="center_horizontal"
        app:ec_jump_shader_color="#515151"
        />
``` 

第二种 xml 配置 , 其中 ec_bitmap_anim_list 图片的动画：
```
<com.zhengsr.ecloadinglib.view.EcBitmapLoadingView
        android:id="@+id/ecbitmaploadview"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:scaleType="centerCrop"
        android:layout_marginTop="20dp"
        android:layout_gravity="center_horizontal"
        app:ec_bitmap_anim_list="@drawable/main_loading_anim"/>
``` 

获取到实例之后，使用 startAnim（） 和  stopAnim() 即可。


