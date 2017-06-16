package yuandp.wristband.property.library.app;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;

import java.util.ArrayList;
import java.util.List;

/**
 * @author：yuan
 * @data: 2017/3/28
 * @Description： 管理所有的Activity
 */

public class ManageApplication extends Application {

    private static ArrayList<Activity> activityList = new ArrayList<Activity>();

    /**
     * 添加Activity到容器中
     */
    public static void addActivity(Activity activity) {
        activityList.add(activity);
    }

    /**
     * 删除Activity到容器中
     */
    public static void removeActivity(Activity activity) {
        activityList.remove(activity);
    }

    /**
     * 遍历所有Activity并finish
     */
    public static void exit() {
        for (Activity activity : activityList) {
            activity.finish();
        }
        activityList.clear();
//        System.exit(0);
//        android.os.Process.killProcess(android.os.Process.myPid());
    }

    /**
     * 判断当前应用程序处于前台还是后台
     * <uses-permission android:name="android.permission.GET_TASKS"/>
     */
    public static boolean isApplicationBroughtToBackground(final Context context) {
        ActivityManager am = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
        List<ActivityManager.RunningTaskInfo> tasks = am.getRunningTasks(1);
        if (!tasks.isEmpty()) {
            ComponentName topActivity = tasks.get(0).topActivity;
            if (!topActivity.getPackageName().equals(context.getPackageName())) {
                return true;
            }
        }
        return false;
    }

}
