package lyfproject.com.mykt

/**
 * Created by Administrator on 2018/5/25.
 */

//抽象类
abstract class ApiCallback2<M> {

    /**
     * 1、抽象方法必须为 public 或者 protected，缺省情况下默认为 public；
    2、抽象类不能用来创建对象；
    3、如果一个类继承于一个抽象类，则子类必须实现父类的抽象方法。如果子类没有实现父类的抽象方法，
    则必须将子类也定义为为 abstract 类。如果抽象类中含有抽象属性，再实现子类中必须将抽象属性初始化，除非子类也为抽象类。
     */

    abstract fun onSuccess(model: M)

    abstract fun onFailure(msg: String?)
    abstract fun onFinish()
}