package lyfproject.com.mykt

import android.database.Observable

/**
 * Created by Administrator on 2018/5/25.
 * 泛型，泛型类
 */
class ApiCallback<M>(m: M) {


    fun <M> addSubscription(observable: Observable<M>) {
        //泛型函数 ，类型参数要放在函数名称之前：
    }
}