package lyfproject.com.mykt

/**
 * Created by Administrator on 2018/5/25.
 */
//类名:WeatherinfoModel
//主构造函数:constructor(val weatherinfo: WeatherinfoBean)
//如果主构造函数没有任何注解或者可见性修饰符（private、 protected、 internal 和 public），
// 可以省略这个 constructor 关键字。
class WeatherinfoModel public constructor(val weatherinfo: WeatherinfoBean) {
    //类体
    init {
        //主构造函数不能包含任何的代码，
        //初始化的代码可以放到 init 块中

    }
    /**
     * 次构造函数
    类也可以声明前缀有 constructor 的次构造函数：

    class Person {
    constructor(parent: Person) {
    parent.children.add(this)
    }
    }
     */


}