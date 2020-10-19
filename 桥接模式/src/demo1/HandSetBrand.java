package demo1;

/**
 * ClassName:HandSetBrand
 * Package:${PACKAGE}
 *
 * @Date:2020/2/16 14:17
 * @Author:WenJiahu
 */
public abstract class HandSetBrand {
    protected HandSetSoft soft;

    public void setSoft(HandSetSoft soft) {
        this.soft = soft;
    }

    public  abstract void run();
}
