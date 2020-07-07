package GInterface;

/**
 * 在任何版本的 java中，接口都能定义抽象方法
 * 格式：
 * public abstract返回值类型，方法名称（参数列表）
 * 
 * 注意事项：
 * 1. 接口当中的抽象方法，修饰符必须是两个固定的关键字：public abstract
 * 2. 这两个关键字修饰符，可以选择性省略
 * 3. 方法的三要素，随意定义
 */

public interface MyInterfaceAbstract {
    // 这是一个抽象方法
    public abstract void methodAbs1();

    // 抽象方法
    abstract void methodAbs2();

    // 抽象方法
    public void methodAbs3();

    // 抽象方法
    void methodAbs4();
}