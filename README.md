
### Android自定义电池
> 跟随系统电量自动更新，高度简化使用，一行代码即可实现电量图标的自动变化，无需手动操作进行管理

[ ![Download](https://api.bintray.com/packages/swallowsonny/ext/BatteryView/images/download.svg?version=1.0.0) ](https://bintray.com/swallowsonny/ext/BatteryView/1.0.0/link)

#### 成果图片
![Image](https://github.com/swallowsonny/BatteryView/blob/master/imgs/battery.jpg)



#### 项目引入
- 项目根目录的build.gradle中添加仓库
```
repositories {
	maven {
		url  "https://dl.bintray.comswallowsonny/ext"
	}
}
```
- 在app目录下的build.gradle中添加
```
implementation 'com.sjx.batteryview:BatteryView:1.0.0'
```

#### 基本使用
- xml中引入
```xml
<com.sjx.batteryviewlibrary.BatteryView
        android:id="@+id/bv_1"
        android:layout_width="32dp"
        android:layout_height="14dp"
        app:bv_orientation="horizontal_left"
        app:bv_border_padding="1.5dp"
        app:bv_border_width="1dp"
        app:bv_header_width="2dp"
        app:bv_radis="1dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toLeftOf="@id/bv_2"
        app:layout_constraintTop_toTopOf="parent" />
```

- Activity的onCreate()方法中初始化
```kotlin
// 初始化
batteryView.setLifecycleOwner(this)
// 电量回调监听，当前电量值，最大值100
batteryView.setOnBatteryPowerListener {  }
```

#### 常用属性
- `bv_orientation`

电池头方向：`horizontal_left` | `horizontal_right` | `vertical_top` | `vertical_bottom`
- `bv_border_padding`: 电池外边框与内部实心电量部分的间距
- `bv_border_width`: 电池外边框线条宽度
- `bv_radis`: 电池矩形圆角大小
- `bv_border_color`: 电池边框颜色
- `bv_power_color_low`: 低电量显示颜色，默认红色
- `bv_power_value_low`: 低电量阈值，默认为10，满电量100
- `bv_power_color_medium`: 中电量颜色，默认黄色
- `bv_power_value_medium`: 中电量阈值，默认20
- `bv_power_color_high`: 充电中，高电量的显示颜色
- `bv_no_charging_color_high`: 未充电下高电量的显示颜色
- `bv_header_width`: 电池头的宽度
- `bv_header_color`: 电池头的颜色
- `bv_charging_speed`: 电池充电时，显示动画的速度，范围1-9，数值越大，速度越快



