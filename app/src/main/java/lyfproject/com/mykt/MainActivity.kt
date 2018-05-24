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
    //TODO 问号表示该变量可以为空
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


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


    }

}