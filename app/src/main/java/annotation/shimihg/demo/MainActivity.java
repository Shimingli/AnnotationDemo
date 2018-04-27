package annotation.shimihg.demo;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import annotation.shimihg.com.R;

import java.util.ArrayList;

/**
 * 注解（元数据）为我们在代码中添加信息提供了一种形式化的方法，使我们可以在某个时刻非常方便的使用这些数据（受到了C#的启发 C#覆盖一个方法必须使用@Override，但是
 * java不是必选的）
 *
 * java SE5重要的语言的变化
 * 注解使得我们的能够以将有编译器来测试和验证的格式，存储有关程序的额外的信息
 * 注解可以用来生成描述符文件，甚至或是新的类定义，并有助于减轻编写样板代码的的负担
 * 使用注解，我们可以将这些元数据保存在Java代码中，并利用 annotion API 为自己的注解构造处理工具
 * 更加干净易读的代码以及编译器类型的检查
 * 虽然Java SE5提供一些元数据，但是一般来说，主要还是需要我们自己定义新的注解，并且按照自己的方法使用它们
 *
 * */
public class MainActivity extends AppCompatActivity {

    @Override//表示当前的方法将覆盖基类中的方法，C#中必须写，但是Java中可以不写
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //@Deprecated 方法已经过时
        setProgressBarVisibility(false);
        /**
         * 关闭不当的编译器的警告信息，在javase5 以前使用的话，不起作用
         */
        //@SuppressWarnings("unused")
         //final Object mInstanceTracker = StrictMode.trackActivity(this);


        PasswordUtils passwordUtils = new PasswordUtils();

        boolean dsd = passwordUtils.validatePassword("dsd");

        String shiming = passwordUtils.validatePasswordReverse("shiming");

        boolean shimingdddddd = passwordUtils.validatePasswordStirng("shimingdddddd");

        System.out.println("shiming  +=+=+=++"+dsd);
        System.out.println("shiming  +=+=+=++"+shiming);
        System.out.println("shiming  +=+=+=++"+shimingdddddd);

        System.out.println("--------------------------start-------------------");
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        UseCaseTracker.trackUseCases(integers,PasswordUtils.class);


        AlarmManager am = (AlarmManager) getSystemService(Context.ALARM_SERVICE);

        //Intent intent = new Intent(this, AlarmService.class
        //intent.setAction(AlarmService.ACTION_ALARM);
        //PendingIntent pendingIntent = PendingIntent.getService(this, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);
        //if(Build.VERSION.SDK_INT < 19){
        //    am.set(AlarmManager.RTC_WAKEUP, System.currentTimeMillis() + 3000, pendingIntent);
        //}else{
        //    am.setExact(AlarmManager.RTC_WAKEUP, System.currentTimeMillis() + 3000, pendingIntent);
        //}
    }
}
