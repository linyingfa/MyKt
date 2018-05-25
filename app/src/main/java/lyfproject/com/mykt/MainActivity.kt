package lyfproject.com.mykt

import android.content.Context
import android.icu.util.UniversalTimeScale.toLong
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Half.toFloat

/**
 * Created by xiaolin on 2018/5/24.
 */
//TODO 冒号表示继承
class MainActivity : AppCompatActivity() {
    //TODO 空安全 问号表示该变量可以为空。
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //创建类的实例  Kotlin 并没有 new 关键字，简单粗暴：
        var wm = WeatherinfoModel(WeatherinfoBean())

    }

    fun 变量() {
//        不管变量是 var 还是 val 都要初始化值，这点没有 Java 好，但保证了空安全。
        //变量  变量有可变和不可变，可以用 var 和 val 声明。
        val s = "Sample" // 自动推断出字符
        val i = 23 // 整型，立即赋值
        //指定类型：
        val s1: String = "Sample" //指定String类型
        val activity: Context = this
//        可变变量：
        // 自动推断出 `Int` 类型
        var x = 5
        x += 1
    }

    fun 基本类型() {
        //todo 数字
        //分别有Double、Float、Long、Int、Short、Byte 类型。
        //Kotlin没有隐式拓宽转换，如 Java 中 int 可以隐式转换为 long，必须要显式类型转换。
        val a: Double = 5.2
        val b: Int = a.toInt() // 显式转换，b 等于 5
        val c: Float = 5.2F
        val d: Int = c.toInt()// d 等于 5
        //显式类型转换方法:
//        toByte(): Byte
//        toShort(): Short
//        toInt(): Int
//        toLong(): Long
//        toFloat(): Float
//        toDouble(): Double
//        toChar(): Cha
        //todo 字符
        //使用 Char 类型表示。
        val e: Char = 'q'
//      布尔使用 Boolean 类型表示，它有两个值：true 和 false。
        val f: Boolean = true
        //字符串 使用 String 类型表示。
        /**
         * 字符串模板，可以包含一些小段代码，会把求值结果合并到字符串中。模板表达式以美元符（$）开头：
         */
        val h = "me"
        val j = "it is $h"// j 为“it is me”
        //模板中的任意表达式，用大括号：
        val k = "h length is ${h.length}"// h length is 2
        //TODO 数组
        //使用 Array 类来创建和操作数组，和 Java 区别很大，它定义了 get 和 set 函数，size 属性，以及一些其他有用的成员函数。
        //使用库函数 arrayOf() 来创建一个数组并传递元素值给它，如 arrayOf(1, 2, 3) 创建了 array[1, 2, 3]。
        //[] 可以用于访问数组的元素，实际上 [] 被进行了操作符的重载，调用的是 Array 类的 get 和 set 方法。
        //库函数 arrayOfNulls() 可以用于创建一个指定大小、元素都为空的数组。
        //使用装箱操作，
        val arr1 = arrayOf(1, 2, 3)
        //原生类型数组，还有 ByteArray、 ShortArray 等
        val arr2: IntArray = intArrayOf(1, 2, 3)
        //直接指定长度
        val arr3 = arrayOfNulls<Int>(5)
        //长度为 0 的空数组
        val empty = emptyArray<Int>()
        //访问数组元素
        val arr4 = arrayOf(1, 2, 3)
        println(arr4[1])         //输出“2”，建议用这个方法
        println(arr4.get(1))     //输出“2”
        //修改元素
        arr4[1] = 10
        println(arr4[1])        //输出“10”
        //遍历数组
        for (arr in arr4) {
            println(arr)
        }
        //遍历数组下标
        for (arr in arr4.indices) {
            println(arr)
        }
    }

    fun 控制流() {
        //If表达式 用法和 Java 一样，Kotlin 里可以作为一个表达式，返回一个值。
        val l = 4
        val m = 5
        // 作为表达式
        val n = if (l > m) l else m
        //When 表达式,When 取代 Java switch 操作符。
        val o = 3
        when (o) {
            1 -> print("o == 1")
            2 -> print("o == 2")
            else -> {
                print("o == 3")
            }
        }
        //For 循环
        val arr5 = arrayOf(1, 2, 3, 4, 5)
        for (arr in arr5.indices) {//indices是(index的复数)
            println(arr)
        }
        for (arr in arr5) {//indices是(index的复数)
            println(arr)
        }
        //While 循环,,用法和 Java一样。
        while (true) {

        }
    }

    //TODO  函数声明 使用 fun 关键字声明。
    //返回类型   : Int代表返回的类型继承于Int
    fun sun1(p: Int, q: Int): Int {
        return p + q
    }

    //表达式作为返回值
    fun sun2(p: Int, q: Int) = p + q

    fun 直接返回函数(): Int {
        return sun2(1, 2)
    }

    //函数返回无意义的值，相当于 Java 里的 void
    fun sum3(p: Int, q: Int): Unit {
    }

    //Unit 返回类型可以省略：
    fun sum4(p: Int, q: Int) {

    }


}