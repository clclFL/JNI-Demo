package club.pineclone.jni.demo;

/**
 * 动态方式注册native方法，重写JNI_OnLoad形式
 */
public class IntSub {

    //native方法声明
    private static native int sub(int a, int b);

    //加载DLL动态库
    static {
        System.loadLibrary("DLL-JNI-03");
    }

    public static void main(String[] args) {
        System.out.println(sub(5 , 6));
    }

}
