
����һ����װ�õ� loading ���߿⣬�����˳����˼��ض�����Ŀǰ��������С�������



**��һ��,�¶�������ض���**

![image](https://github.com/LillteZheng/EcLoadingView/raw/master/gif/jump.gif)

**�ڶ��֣���Ģ���ּ��ض���**

![image](https://github.com/LillteZheng/ViewPagerHelper/raw/master/gif/people.gif)


## **��ô��ʹ��**

��һ�� xml ���� , ���� ec_jump_bitmap_array ������ͼƬ��
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

�ڶ��� xml ���� , ���� ec_bitmap_anim_list ͼƬ�Ķ�����
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

��ȡ��ʵ��֮��ʹ�� startAnim���� ��  stopAnim() ���ɡ�


