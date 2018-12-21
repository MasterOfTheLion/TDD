public class MyUtil {

    public static String percentage2fivegrade(int grade) {
        if (grade < 0)
            return "错误";
        else if (grade < 60)
            return "不及格";
        else if (grade < 70)
            return "及格";
        else if (grade < 80)
            return "中等";
        else if (grade < 90)
            return "良好";
        else if (grade <= 100)
            return "优秀";
        else
            return "错误";
    }
}
