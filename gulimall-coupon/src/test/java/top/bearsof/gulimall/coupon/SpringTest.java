package top.bearsof.gulimall.coupon;


import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SpringBootTest
public class SpringTest {
    public static List<String> result()  {
        List<String> result = null;
        try {
            result = new ArrayList<>();
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/gulimall_wms";
            String username = "root";
            String password = "bearsof";
            Connection connection = DriverManager.getConnection(url,username,password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select table_name from information_schema.tables where table_schema='gulimall_wms'");
            while (resultSet.next())
            {
                // System.out.println(rs.getString("Cno"));
                System.out.println(resultSet.getString("TABLE_NAME"));
                //System.out.println(rs.getString());
                //                System.out.println(rs.getString("tables"));/
                result.add(resultSet.getString("TABLE_NAME"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    public static void main(String[] args) {
        FastAutoGenerator.create("jdbc:mysql://localhost:3306/gulimall_wms", "root", "bearsof")
                .globalConfig(builder -> {
                    builder.author("bears") // 设置作者
                            //.enableSwagger() // 开启 swagger 模式
                            .fileOverride() // 覆盖已生成文件
                            .outputDir("C:\\bearsof\\Project\\gulimall\\gulimall-ware\\src\\main\\java"); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("top.bearsof.gulimall") // 设置父包名
                            .moduleName("ware") // 设置父包模块名
                            .pathInfo(Collections.singletonMap(OutputFile.xml, "C:\\bearsof\\Project\\gulimall\\gulimall-ware\\src\\main\\resources\\mapper")); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude(result()) // 设置需要生成的表名
                            .addTablePrefix("wms_", "c_"); // 设置过滤表前缀
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }
}
