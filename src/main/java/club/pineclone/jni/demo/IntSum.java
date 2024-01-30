package club.pineclone.jni.demo;

/**
 * 静态方式注册native方法
 */
public class IntSum {

    //原生方法声明
    private native int sum(int a, int b);

    //将含有原生方法实现的DLL文件加载到Java虚拟机
    static {
        System.loadLibrary("DLL-JNI-01");
    }

    //在这里测试原生方法
    public static void main(String[] args) {
        System.out.println(new IntSum().sum(5, 6));
    }

}
