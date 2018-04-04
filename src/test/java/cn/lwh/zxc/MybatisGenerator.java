package cn.lwh.zxc;

import org.mybatis.generator.api.ShellRunner;

/**
 * 用mybatis自动生成实体类和mapping
 * @author luoweihong 
 * @date  2018年4月3日
 */
public class MybatisGenerator {
    public static void main(String[] args) {
        args = new String[] { "-configfile", "src\\main\\resources\\config\\generatorConfig.xml", "-overwrite" };
        ShellRunner.main(args);
    }
}
