package othertest;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

/**
 * Created by Rocky on 2019/1/8.
 */
public class TestGit {

    private String name;

    public String getName() {
        return name;
    }

    TestGit(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        List<String> list = new ArrayList<>();
        System.out.println("自动导包确实好用");


        String passwd = Optional.ofNullable(new TestGit("hu;zhenyang")).map(TestGit::getName)
                .map(s -> s.split(";")[0]).orElse("其他值");
        System.out.println(passwd);
    }
}
