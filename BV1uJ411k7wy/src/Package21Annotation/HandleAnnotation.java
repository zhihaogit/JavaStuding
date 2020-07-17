package Package21Annotation;

public class HandleAnnotation {
}

/**
 * 小结：
 * 可以在运行期通过反射读取 RUNTIME类型的注解，注意千万不要漏写 @Retention(RetentionPolicy.RUNTIME)，否则运行期无法读取到该注解
 * 可以通过程序处理注解来实现相应的功能：
 *  对 javaBeajn的属性值按规则进行检查
 *  JUnit会自动运行 @Test标记的测试方法
 */
