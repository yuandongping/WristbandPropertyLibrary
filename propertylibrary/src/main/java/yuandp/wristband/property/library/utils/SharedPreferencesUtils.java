package yuandp.wristband.property.library.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

import java.util.ArrayList;

/**
 * @author：yuan
 * @data: 2017/3/28
 * @Description：保存SharedPreferences中存的数据
 */

public class SharedPreferencesUtils {

    /**
     * 语言
     */
    private final static String Language_SHAREDPREFERENCES = "Language_SHAREDPREFERENCES";
    private final static String Language_ID = "Language_ID";
    private final static String Language_Value = "Language_Value";

    public static int getLanguageId(Context context) {
        return context.getSharedPreferences(Language_SHAREDPREFERENCES, Context.MODE_PRIVATE).getInt(Language_ID, -1);
    }

    public static void setLanguageId(Context context, int id) {
        context.getSharedPreferences(Language_SHAREDPREFERENCES, Context.MODE_PRIVATE).edit().putInt(Language_ID, id).apply();
    }

    public static String getLanguageValue(Context context) {
        return context.getSharedPreferences(Language_SHAREDPREFERENCES, Context.MODE_PRIVATE).getString(Language_Value, "english");
    }

    public static void setLanguageValue(Context context, String languageValue) {
        context.getSharedPreferences(Language_SHAREDPREFERENCES, Context.MODE_PRIVATE).edit().putString(Language_Value, languageValue).apply();
    }

//    ------------------------------------------------------------------------

    /**
     * Sport
     * */
    private final static String Target_SHAREDPREFERENCES = "Target_SHAREDPREFERENCES";
    private final static String Moving_Target_VALUE = "Moving_Target_VALUE";
    private final static String Weight_Gole_VALUE = "Weight_Gole_VALUE";

    /**获取运动目標值*/
    public static int getMovingTarget(Context context){
        return context.getSharedPreferences(Target_SHAREDPREFERENCES, Context.MODE_PRIVATE).getInt(Moving_Target_VALUE, 10000);
    }

    /**设置运动目標值*/
    public static void setMovingTarget(Context context, int target){
        if (target == 0){
            return;
        }
        context.getSharedPreferences(Target_SHAREDPREFERENCES, Context.MODE_PRIVATE).edit().putInt(Moving_Target_VALUE, target).apply();
    }

    /**获取体重目標值*/
    public static int getWeightGole(Context context) {
        return context.getSharedPreferences(Target_SHAREDPREFERENCES, Context.MODE_PRIVATE).getInt(Weight_Gole_VALUE, 60);
    }

    /**设置体重目標值*/
    public static void setWeightGole(Context context, int weightGole){
        if (weightGole == 0){
            return;
        }
        context.getSharedPreferences(Target_SHAREDPREFERENCES, Context.MODE_PRIVATE).edit().putInt(Weight_Gole_VALUE, weightGole).apply();
    }

    //------------------------------------------------------------------------
    /**
     * BLE
     */
    public final static String BLE_SHAREDPREFERENCES = "BLE_SHAREDPREFERENCES";
    public final static String BLE_NAME = "BLE_NAME";
    public final static String BLE_MAC = "BLE_MAC";
    public final static String BLE_BING_DATE = "BLE_BING_DATE";

    /**获取连接的蓝牙设备名称*/
    public static String getBleName(Context context){
        return context.getSharedPreferences(BLE_SHAREDPREFERENCES, Context.MODE_PRIVATE).getString(BLE_NAME, "NULL");
    }

    /**获取连接的蓝牙设备地址*/
    public static String getBleMac(Context context){
        return context.getSharedPreferences(BLE_SHAREDPREFERENCES, Context.MODE_PRIVATE).getString(BLE_MAC, "");
    }

    /**获取绑定时间戳*/
    public static long getBleBingDate(Context context){
        return context.getSharedPreferences(BLE_SHAREDPREFERENCES, Context.MODE_PRIVATE).getLong(BLE_BING_DATE, 0);
    }

    /**设置连接的蓝牙设备地址,和绑定时间*/
    public static void setBle(Context context, String bleName, String bleMac, long bingDate) {
        SharedPreferences sp = context.getSharedPreferences(BLE_SHAREDPREFERENCES, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putString(BLE_NAME, bleName);
        editor.putString(BLE_MAC, bleMac);
        editor.putLong(BLE_BING_DATE, bingDate);
        editor.commit();
    }

    //------------------------------------------------------------------------

    /**
     * 智能提醒
     */
    public final static String INTELLIGENCE_SHAREDPREFERENCES = "INTELLIGENCE_SHAREDPREFERENCES";
    public final static String COME_PHONE_STATE = "COME_PHONE_STATE";
    public final static String COME_SMS_STATE = "COME_SMS_STATE";

    public final static String INTELLIGENCE_STATE = "INTELLIGENCE_STATE";//app通知开关
    public final static String WEChat_STATE = "WEChat_STATE";
    public final static String QQ_STATE = "QQ_STATE";
    public final static String Facebook_STATE = "Facebook_STATE";
    public final static String Twitter_STATE = "Twitter_STATE";
    public final static String Sedentary_STATE = "Sedentary_STATE";//久坐
    public final static String Antilost_STATE = "Antilost_STATE";//防丟

    /**获取来电开关状态*/
    public static boolean getCallState(Context context){
        return context.getSharedPreferences(INTELLIGENCE_SHAREDPREFERENCES, Context.MODE_PRIVATE).getBoolean(COME_PHONE_STATE, false);
    }

    /**设置来电开关状态*/
    public static void setCallState(Context context, boolean state){
        context.getSharedPreferences(INTELLIGENCE_SHAREDPREFERENCES, Context.MODE_PRIVATE).edit().putBoolean(COME_PHONE_STATE, state).apply();
    }

    /**获取短信开关状态*/
    public static boolean getSmsState(Context context){
        return context.getSharedPreferences(INTELLIGENCE_SHAREDPREFERENCES, Context.MODE_PRIVATE).getBoolean(COME_SMS_STATE, false);
    }

    /**设置短信开关状态*/
    public static void setSmsState(Context context, boolean state){
        context.getSharedPreferences(INTELLIGENCE_SHAREDPREFERENCES, Context.MODE_PRIVATE).edit().putBoolean(COME_SMS_STATE, state).apply();
    }

    /**获取app通知开关状态*/
    public static boolean getAppNotifyState(Context context){
        return context.getSharedPreferences(INTELLIGENCE_SHAREDPREFERENCES, Context.MODE_PRIVATE).getBoolean(INTELLIGENCE_STATE, false);
    }

    /**设置app通知开关状态*/
    public static void setAppNotifyState(Context context, boolean state){
        context.getSharedPreferences(INTELLIGENCE_SHAREDPREFERENCES, Context.MODE_PRIVATE).edit().putBoolean(INTELLIGENCE_STATE, state).apply();
    }

    /**获取weChat开关状态*/
    public static boolean getWeChatState(Context context){
        return context.getSharedPreferences(INTELLIGENCE_SHAREDPREFERENCES, Context.MODE_PRIVATE).getBoolean(WEChat_STATE, false);
    }

    /**设置weChat开关状态*/
    public static void setWeChatState(Context context, boolean state){
        context.getSharedPreferences(INTELLIGENCE_SHAREDPREFERENCES, Context.MODE_PRIVATE).edit().putBoolean(WEChat_STATE, state).apply();
    }

    /**获取QQ开关状态*/
    public static boolean getQQState(Context context){
        return context.getSharedPreferences(INTELLIGENCE_SHAREDPREFERENCES, Context.MODE_PRIVATE).getBoolean(QQ_STATE, false);
    }

    /**设置QQ开关状态*/
    public static void setQQState(Context context, boolean state){
        context.getSharedPreferences(INTELLIGENCE_SHAREDPREFERENCES, Context.MODE_PRIVATE).edit().putBoolean(QQ_STATE, state).apply();
    }

    /**设置Facebook开关状态*/
    public static void setFacebookState(Context context, boolean state){
        context.getSharedPreferences(INTELLIGENCE_SHAREDPREFERENCES, Context.MODE_PRIVATE).edit().putBoolean(Facebook_STATE, state).apply();
    }

    /**获取Facebook开关状态*/
    public static boolean getFacebookState(Context context){
        return context.getSharedPreferences(INTELLIGENCE_SHAREDPREFERENCES, Context.MODE_PRIVATE).getBoolean(Facebook_STATE, false);
    }

    /**获取Twitter开关状态*/
    public static boolean getTwitterState(Context context){
        return context.getSharedPreferences(INTELLIGENCE_SHAREDPREFERENCES, Context.MODE_PRIVATE).getBoolean(Twitter_STATE, false);
    }

    /**设置Twitter开关状态*/
    public static void setTwitterState(Context context, boolean state){
        context.getSharedPreferences(INTELLIGENCE_SHAREDPREFERENCES, Context.MODE_PRIVATE).edit().putBoolean(Twitter_STATE, state).apply();
    }

    /**获取久坐开关状态*/
    public static boolean getSedentaryState(Context context){
        return context.getSharedPreferences(INTELLIGENCE_SHAREDPREFERENCES, Context.MODE_PRIVATE).getBoolean(Sedentary_STATE, false);
    }

    /**设置久坐开关状态*/
    public static void setSedentaryState(Context context, boolean state){
        context.getSharedPreferences(INTELLIGENCE_SHAREDPREFERENCES, Context.MODE_PRIVATE).edit().putBoolean(Sedentary_STATE, state).apply();
    }

    /**获取防丢开关状态*/
    public static boolean getAntilostState(Context context){
        return context.getSharedPreferences(INTELLIGENCE_SHAREDPREFERENCES, Context.MODE_PRIVATE).getBoolean(Antilost_STATE, false);
    }

    /**设置防丢开关状态*/
    public static void setAntilostState(Context context, boolean state){
        context.getSharedPreferences(INTELLIGENCE_SHAREDPREFERENCES, Context.MODE_PRIVATE).edit().putBoolean(Antilost_STATE, state).apply();
    }


    //------------------------------------------------------------------------
    /**
     * 闹钟，只有一个闹钟
     */
    public final static String ALARM_CLOCK_SHAREDPREFERENCES = "ALARM_CLOCK_SHAREDPREFERENCES";
    public final static String ALARM_CLOCK_STATUS = "ALARM_CLOCK_STATUS";
    public final static String ALARM_CLOCK_HOUR = "ALARM_CLOCK_HOUR";
    public final static String ALARM_CLOCK_MINUTE = "ALARM_CLOCK_MINUTE";

    public final static String ALARM_CLOCK_Sun = "ALARM_CLOCK_Sun";
    public final static String ALARM_CLOCK_Mon = "ALARM_CLOCK_Mon";
    public final static String ALARM_CLOCK_Tues = "ALARM_CLOCK_Tues";
    public final static String ALARM_CLOCK_Wed = "ALARM_CLOCK_Wed";
    public final static String ALARM_CLOCK_Thur = "ALARM_CLOCK_Thur";
    public final static String ALARM_CLOCK_Fri = "ALARM_CLOCK_Fri";
    public final static String ALARM_CLOCK_Sat = "ALARM_CLOCK_Sat";

    /**获取闹钟打开状态*/
    public static boolean getAlarmClockStatus(Context context){
        return context.getSharedPreferences(ALARM_CLOCK_SHAREDPREFERENCES, Context.MODE_PRIVATE).getBoolean(ALARM_CLOCK_STATUS, false);
    }

    /**设置闹钟打开状态*/
    public static void setAlarmClockStatus(Context context, boolean b) {
        context.getSharedPreferences(ALARM_CLOCK_SHAREDPREFERENCES, Context.MODE_PRIVATE).edit().putBoolean(ALARM_CLOCK_STATUS, b).apply();
    }

    /**获取闹钟时间--时*/
    public static int getAlarmClockHourValue(Context context) {
        return context.getSharedPreferences(ALARM_CLOCK_SHAREDPREFERENCES, Context.MODE_PRIVATE).getInt(ALARM_CLOCK_HOUR, 7);
    }

    /**获取闹钟时间--分*/
    public static int getAlarmClockMinuteValue(Context context) {
        return context.getSharedPreferences(ALARM_CLOCK_SHAREDPREFERENCES, Context.MODE_PRIVATE).getInt(ALARM_CLOCK_MINUTE, 0);
    }

    /**设置闹钟时间*/
    public static void setAlarmClockValue(Context context, int hour, int minute) {
        Log.e("SharedPreferencesUtils", "hour="+hour+",minute="+minute);
        SharedPreferences sp = context.getSharedPreferences(ALARM_CLOCK_SHAREDPREFERENCES, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putInt(ALARM_CLOCK_HOUR, hour);
        editor.putInt(ALARM_CLOCK_MINUTE, minute);
        editor.commit();
    }

    /**获取闹钟周期*/
    public static ArrayList<Boolean> getAlarmClockWeekList(Context context) {
        ArrayList<Boolean> bList = new ArrayList<>();
        SharedPreferences sharedPreferences = context.getSharedPreferences(ALARM_CLOCK_SHAREDPREFERENCES, Context.MODE_PRIVATE);
        bList.add(sharedPreferences.getBoolean(ALARM_CLOCK_Sun, false));
        bList.add(sharedPreferences.getBoolean(ALARM_CLOCK_Mon, true));
        bList.add(sharedPreferences.getBoolean(ALARM_CLOCK_Tues, true));
        bList.add(sharedPreferences.getBoolean(ALARM_CLOCK_Wed, true));
        bList.add(sharedPreferences.getBoolean(ALARM_CLOCK_Thur, true));
        bList.add(sharedPreferences.getBoolean(ALARM_CLOCK_Fri, true));
        bList.add(sharedPreferences.getBoolean(ALARM_CLOCK_Sat, false));
        return bList;
    }

    /**设置闹钟周期*/
    public static void setAlarmClockWeekList(Context context, ArrayList<Boolean> bList) {
        if(bList != null && bList.size() > 6){
            SharedPreferences sp = context.getSharedPreferences(ALARM_CLOCK_SHAREDPREFERENCES, Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = sp.edit();
            editor.putBoolean(ALARM_CLOCK_Sun, bList.get(0));
            editor.putBoolean(ALARM_CLOCK_Mon, bList.get(1));
            editor.putBoolean(ALARM_CLOCK_Tues, bList.get(2));
            editor.putBoolean(ALARM_CLOCK_Wed, bList.get(3));
            editor.putBoolean(ALARM_CLOCK_Thur, bList.get(4));
            editor.putBoolean(ALARM_CLOCK_Fri, bList.get(5));
            editor.putBoolean(ALARM_CLOCK_Sat, bList.get(6));
            editor.commit();
        }
    }

    //------------------------------------------------------------------------
    /**
     * 通知栏
     */
    public final static String NOTIFICATION_SHAREDPREFERENCES = "NOTIFICATION_SHAREDPREFERENCES";
    public final static String NOTIFICATION_STATUS = "NOTIFICATION_STATUS";

    /**获取通知栏打开状态*/
    public static boolean getNotificationStatus(Context context){
        return context.getSharedPreferences(NOTIFICATION_SHAREDPREFERENCES, Context.MODE_PRIVATE).getBoolean(NOTIFICATION_STATUS, false);
    }

    /**设置通知栏打开状态*/
    public static void setNotificationStatus(Context context, boolean b) {
        context.getSharedPreferences(NOTIFICATION_SHAREDPREFERENCES, Context.MODE_PRIVATE).edit().putBoolean(NOTIFICATION_STATUS, b).apply();
    }

 //------------------------------------------------------------------------
    /**
     * 用戶
     */
    public final static String ME_SHAREDPREFERENCES = "ME_SHAREDPREFERENCES";
    public final static String ME_BG_IMAGE = "ME_BG_IMAGE";
    public final static String ME_HEAD_ICON = "ME_HEAD_ICON";
    public final static String ME_NAME = "ME_NAME";
    public final static String ME_SEX = "ME_SEX";
    public final static String ME_BRITHDAY = "ME_BRITHDAY";
    public final static String ME_HEIGHT = "ME_HEIGHT";
    public final static String ME_WEIGHT = "ME_WEIGHT";
    public final static String ME_STEP = "ME_STEP";

    /**获取背景圖片*/
    public static String getMeBgIamge(Context context){
        return context.getSharedPreferences(ME_SHAREDPREFERENCES, Context.MODE_PRIVATE).getString(ME_BG_IMAGE, "");
    }

    /**设置背景圖片*/
    public static void setMeBgIamge(Context context, String bgImagePath) {
        context.getSharedPreferences(ME_SHAREDPREFERENCES, Context.MODE_PRIVATE).edit().putString(ME_BG_IMAGE, bgImagePath).apply();
    }

    /**获取頭像*/
    public static String getMeHeadIcon(Context context){
        return context.getSharedPreferences(ME_SHAREDPREFERENCES, Context.MODE_PRIVATE).getString(ME_HEAD_ICON, "");
    }

    /**设置頭像*/
    public static void setMeHeadIcon(Context context, String headIconPath) {
        context.getSharedPreferences(ME_SHAREDPREFERENCES, Context.MODE_PRIVATE).edit().putString(ME_HEAD_ICON, headIconPath).apply();
    }

    /**获取姓名*/
    public static String getMeName(Context context){
        return context.getSharedPreferences(ME_SHAREDPREFERENCES, Context.MODE_PRIVATE).getString(ME_NAME, "your name");
    }

    /**设置姓名*/
    public static void setMeName(Context context, String name) {
        context.getSharedPreferences(ME_SHAREDPREFERENCES, Context.MODE_PRIVATE).edit().putString(ME_NAME, name).apply();
    }

    /**获取性別*/
    public static int getMeSex(Context context){
        return context.getSharedPreferences(ME_SHAREDPREFERENCES, Context.MODE_PRIVATE).getInt(ME_SEX, 0);
    }

    /**设置性別*/
    public static void setMeSex(Context context, int sex) {
        context.getSharedPreferences(ME_SHAREDPREFERENCES, Context.MODE_PRIVATE).edit().putInt(ME_SEX, sex).apply();
    }

    /**获取出生日期*/
    public static String getMeBrithday(Context context){
        return context.getSharedPreferences(ME_SHAREDPREFERENCES, Context.MODE_PRIVATE).getString(ME_BRITHDAY, "1990-01-01");
    }

    /**设置出生日期*/
    public static void setMeBrithday(Context context, String brithday) {
        context.getSharedPreferences(ME_SHAREDPREFERENCES, Context.MODE_PRIVATE).edit().putString(ME_BRITHDAY, brithday).apply();
    }

    /**获取身高*/
    public static int getMeHeight(Context context){
        return context.getSharedPreferences(ME_SHAREDPREFERENCES, Context.MODE_PRIVATE).getInt(ME_HEIGHT, 180);
    }

    /**设置身高*/
    public static void setMeHeight(Context context, int height) {
        context.getSharedPreferences(ME_SHAREDPREFERENCES, Context.MODE_PRIVATE).edit().putInt(ME_HEIGHT, height).apply();
    }

    /**获取體重*/
    public static float getMeWeight(Context context){
        return context.getSharedPreferences(ME_SHAREDPREFERENCES, Context.MODE_PRIVATE).getFloat(ME_WEIGHT, 60);
    }

    /**设置體重*/
    public static void setMeWeight(Context context, float weight) {
        context.getSharedPreferences(ME_SHAREDPREFERENCES, Context.MODE_PRIVATE).edit().putFloat(ME_WEIGHT, weight).apply();
    }

    /**获取步距*/
    public static int getMeStep(Context context){
        return context.getSharedPreferences(ME_SHAREDPREFERENCES, Context.MODE_PRIVATE).getInt(ME_STEP, 100);
    }

    /**设置步距*/
    public static void setMeStep(Context context, int step) {
        context.getSharedPreferences(ME_SHAREDPREFERENCES, Context.MODE_PRIVATE).edit().putInt(ME_STEP, step).apply();
    }

    //------------------------------------------------------------------------
}
