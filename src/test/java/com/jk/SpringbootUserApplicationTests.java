package com.jk;

import com.jk.dao.UserDao;
import com.jk.entity.UserEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

@SpringBootTest
class SpringbootUserApplicationTests {
    @Autowired
    private UserDao UserDao;

    @Test
    public void testdataBase() throws UnsupportedEncodingException {

        List<UserEntity> snkList= UserDao.selectUserList();

        /*String pathVariable = snkList.get(0).getGroupName();


            String groupName =   URLEncoder.encode(pathVariable, "gbk");*/

        for (UserEntity snk : snkList) {
            //snk.setGroupName(groupName);
            System.out.println(snk);
        }
    }

}
