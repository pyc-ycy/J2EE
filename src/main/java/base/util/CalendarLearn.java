package base.util;

import org.springframework.util.StringUtils;

import java.util.Calendar;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;

public class CalendarLearn {
    public static void main(String[] args) {
        Locale[] availableLocales = Calendar.getAvailableLocales();
        System.out.println("get the available locales of China:");
        for (Locale l :
                availableLocales) {
            String s = l.toString();
            boolean pt = StringUtils.startsWithIgnoreCase(s, "zh_");
            if (pt){
                System.out.println(s);
            }
        }
//        System.out.println("List time zone id:");
//        String[] availableIDs = TimeZone.getAvailableIDs();
//        for (String tz : availableIDs){
//            boolean pt = StringUtils.startsWithIgnoreCase(tz,"Asia/");
//            if (pt){
//                System.out.println(tz);
//            }
//        }
        Calendar instanceNotLocal = Calendar.getInstance();
        Calendar instanceWithZh_cn = Calendar.getInstance(new Locale("zh_CN"));
        Calendar zh_cn = Calendar.getInstance(TimeZone.getTimeZone("Asia/Shanghai"), new Locale("zh_CN"));
        System.out.println(Objects.equals(instanceNotLocal, instanceWithZh_cn));
        System.out.println(zh_cn.getCalendarType());
        System.out.println(zh_cn.getTime());
        System.out.println(zh_cn.getWeekYear());
        System.out.println(instanceNotLocal.getTime());
        System.out.println(Locale.getDefault(Locale.Category.FORMAT));
        System.out.println(TimeZone.getDefault().getID());

    }
}
