package lyfproject.com.mykt

import android.content.Context
import android.util.AttributeSet
import android.view.View

/**
 * Created by Administrator on 2018/5/25.
 */
class MyView : View {
    //子类【冒号】继承，override 标注在子类中覆盖：
    constructor(ctx: Context) : super(ctx)//这里的：是返回值。。方法中冒号表示返回fun getRequest(): Request?

    //如果类没有主构造函数，那么每个次构造函数必须 使用 super 关键字初始化其基类型：
    constructor(ctx: Context, attrs: AttributeSet) : super(ctx, attrs)


}