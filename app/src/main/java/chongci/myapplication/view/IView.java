package chongci.myapplication.view;

import chongci.myapplication.Bean.Bean;
import chongci.myapplication.Bean.BeanOne;
import chongci.myapplication.Bean.BeanThree;
import chongci.myapplication.Bean.BeanTwo;

/**
 * Created by Administrator on 2017/9/13.
 */

public interface IView {
    void OnSuccess(Bean bean);
    void OnSuccess(BeanOne beanOne);
    void OnSuccecc(BeanTwo beanTwo);
    void OnSuccecc(BeanThree beanThree);
}
