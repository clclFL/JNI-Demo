package club.pineclone.jni.demo;

/**
 * 动态方式注册native方法
 */
public class IntMultiple {

    //动态注册核心方法，主要目的是获取JNIEnv对象从而进行原生方法注册
    private static native void registerNatives();

    //原生方法，将来和DLL动态库中的实现进行动态绑定
    private static native int multiple(int a, int b);

    //通过静态代码块的形式，在类被JVM加载的时候进行native的动态绑定
    static {
        System.loadLibrary("DLL-JNI-02");
        registerNatives();
    }

    public static void main(String[] args) {
        System.out.println(multiple(5 , 6));
    }

}
