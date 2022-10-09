package top.bearsof.gulimall.product;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.bearsof.gulimall.product.entity.Brand;
import top.bearsof.gulimall.product.service.BrandService;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class SpringTest {
    @Test
    void test() throws Exception {
        List<String> result = new ArrayList<>();
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/gulimall_pms";
        String username = "root";
        String password = "bearsof";
        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select table_name from information_schema.tables where table_schema='gulimall_pms'");
        while (resultSet.next()) {
            // System.out.println(rs.getString("Cno"));
            //System.out.println(resultSet.getString("TABLE_NAME"));
            //System.out.println(rs.getString());
//                System.out.println(rs.getString("tables"));/
            result.add(resultSet.getString("TABLE_NAME"));
        }

        System.out.println(result);

    }






    @Autowired
    private BrandService brandService;
    @Test
    void brandServerTest() {
        Brand brand = new Brand();
        brand.setName("哇哈哈");
        brand.setSort(2);
        brandService.save(brand);
    }

    @Test
    void getListTest() {
        List<Brand> list = brandService.list();
        System.out.println(list);
    }
}
