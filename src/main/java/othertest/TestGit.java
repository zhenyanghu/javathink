package othertest;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

/**
 * Created by Rocky on 2019/1/8.
 */
public class TestGit {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        List<String> list = new ArrayList<>();
        System.out.println("自动导包确实好用");

        String passwd = Optional.ofNullable("0cdafcfa3fe820c4d68009e4e6bf068d;4b42f1cb6ab8abba")
                .map(s -> s.split(";")[0]).orElse("");
        System.out.println(passwd);
    }
}
