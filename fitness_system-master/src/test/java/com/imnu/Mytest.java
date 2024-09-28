package com.imnu;

import com.imnu.dao.coachdao;
import com.imnu.dao.dingdandao;
import com.imnu.dao.userdao;
import com.imnu.dao.usermapper;
import com.imnu.pojo.coachbean;
import com.imnu.pojo.dingdanbean;
import com.imnu.pojo.userbean;
import com.imnu.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Mytest {

    @Test
    public void test01(){
        ApplicationContext app = new ClassPathXmlApplicationContext("beans.xml");
        user sn = (user) app.getBean("shaonian");
        sn.han();
    }

    @Test
    public void test02(){
        //id（主键）、用户名、密码、电话、地址、性别、姓名、会员积分、训练计划、是否教练
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        usermapper mapper = sqlSession.getMapper(usermapper.class);
        List<userbean> userList = mapper.getUserList();

        for (userbean u :userList) {
            System.out.println(u);
        }


    }

    @Test
    public void test03(){
        //id（主键）、用户名、密码、电话、地址、性别、姓名、会员积分、训练计划、是否教练
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        usermapper mapper = sqlSession.getMapper(usermapper.class);
//        List<userbean> userList = mapper.getUserList();


        userbean u1 = new userbean();
        u1.setId(10087);
        u1.setName("WYQ");
        u1.setPassword("WYQwyq1029");
        u1.setPhone("17611111111");
        u1.setAddress("nmgxam");
        u1.setSex("爷们");
        u1.setRealname("刘德华");
        u1.setScore("99");
        u1.setPlan("一天一个小朋友");
        u1.setIs_coach("Y");

        int insert = mapper.insert(u1);
    }

    @Test
    public void test04(){
        //id（主键）、用户名、密码、电话、地址、性别、姓名、会员积分、训练计划、是否教练
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        usermapper mapper = sqlSession.getMapper(usermapper.class);
        int delete = mapper.delete(10088);

        System.out.println(delete);

    }

    @Test
    public void test05(){
        //id（主键）、用户名、密码、电话、地址、性别、姓名、会员积分、训练计划、是否教练
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        usermapper mapper = sqlSession.getMapper(usermapper.class);


        userbean u1 = new userbean();
        u1.setId(10087);
        u1.setName("zhrrr");
        u1.setPassword("WYQwyq1029");
        u1.setPhone("17611111111");
        u1.setAddress("nmgxam");
        u1.setSex("爷们");
        u1.setRealname("刘德华");
        u1.setScore("99");
        u1.setPlan("一天一个小朋友");
        u1.setIs_coach("Y");

        int updatename = mapper.updatename(u1);


    }
    @Test
    public void test06(){
        //id（主键）、用户名、密码、电话、地址、性别、姓名、会员积分、训练计划、是否教练
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        usermapper mapper = sqlSession.getMapper(usermapper.class);
        userbean userbean = mapper.selectById(10087);
        System.out.println(userbean);


    }

    @Test
    public void test07(){
        userdao userdao = new userdao();

        userbean u1 = new userbean();

        u1.setName("zht");
        u1.setPassword("zht");
        u1.setPhone("17622222222");
        u1.setAddress("nmgIMNU");
        u1.setSex("男");
        u1.setRealname("zht");
        u1.setScore("999");
        u1.setPlan("一口一头猪");
        u1.setIs_coach("N");

        //userbean userbean = userdao.selectById(10086);
        //System.out.println(userbean);

//        List<userbean> userbeans = userdao.selectAll();
//        for(userbean u:userbeans){
//            System.out.println(u);
//        }
//
//        int delete = userdao.delete(10087);
//        System.out.println(delete);
//
//        int add = userdao.add(u1);
//        System.out.println(add);

//        int updatename = userdao.updatename(u1);
//        System.out.println(updatename);

        int add = userdao.add(u1);
        System.out.println(add);
    }

    @Test
    public void test08(){
        //id（主键）、用户名、密码、电话、地址、性别、姓名、会员积分、训练计划、是否教练
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        usermapper mapper = sqlSession.getMapper(usermapper.class);
        int IsLive = mapper.selectIsLive("zhr","zhr019523");
        System.out.println(IsLive);

    }

    @Test
    public void test09(){
        //id（主键）、用户名、密码、电话、地址、性别、姓名、会员积分、训练计划、是否教练
        userdao userdao = new userdao();
        userbean zht = userdao.selectByName("zht");
        System.out.println(zht);

    }
    @Test
    public void test10(){
        //id（主键）、用户名、密码、电话、地址、性别、姓名、会员积分、训练计划、是否教练
        userdao userdao = new userdao();
        List<userbean> userbeanList = userdao.selectAll();
        for(userbean u:userbeanList){
            System.out.println(u);
        }

    }
    @Test
    public void test11(){
        //id（主键）、用户名、密码、电话、地址、性别、姓名、会员积分、训练计划、是否教练
        userdao userdao = new userdao();
        int admin = userdao.isAdmin("admin", "zht");
        System.out.println(admin);

    }
    @Test
    public void test12(){
        //id（主键）、用户名、密码、电话、地址、性别、姓名、会员积分、训练计划、是否教练
        userdao userdao = new userdao();
        List<userbean> z = userdao.getsomeuser("z");

        for (userbean u:z) {
            System.out.println(u);
        }


    }
    @Test
    public void test13(){
        //id（主键）、用户名、密码、电话、地址、性别、姓名、会员积分、训练计划、是否教练
        userdao userdao = new userdao();
        int coach = userdao.isCoach("q", "q");
        if(coach==1){
            System.out.println("是教练");
        }


    }
    @Test
    public void test14(){
        //id（主键）、用户名、密码、电话、地址、性别、姓名、会员积分、训练计划、是否教练
        coachdao coachdao = new coachdao();
        List<coachbean> yyp = coachdao.selectallcoach("YYP");
        for (coachbean u:yyp
             ) {
            System.out.println(u);

        }


    }
    @Test
    public void test15(){
        //id（主键）、用户名、密码、电话、地址、性别、姓名、会员积分、训练计划、是否教练
//        coachdao coachdao = new coachdao();
//        coachbean coachbean = new coachbean(10080,"asd","asd","asd","asd","asd","asd","asd","asd","asd");
//        coachdao.updateCoach();


    }
    @Test
    public void test16(){
        //id（主键）、用户名、密码、电话、地址、性别、姓名、会员积分、训练计划、是否教练
        dingdandao dingdandao = new dingdandao();
        List<dingdanbean> selectalldingdan = dingdandao.selectalldingdan();
        for (dingdanbean u:selectalldingdan
        ) {
            System.out.println(u);

        }


    }
    @Test
    public void test17(){
        //id（主键）、用户名、密码、电话、地址、性别、姓名、会员积分、训练计划、是否教练
        dingdandao dingdandao = new dingdandao();
        List<dingdanbean> selectalldingdan = dingdandao.selectByUsername("zhr");
        for (dingdanbean u:selectalldingdan
        ) {
            System.out.println(u);

        }


    }
    @Test
    public void test18(){
        //id（主键）、用户名、密码、电话、地址、性别、姓名、会员积分、训练计划、是否教练
        dingdandao dingdandao = new dingdandao();
        int updatepaymessage = dingdandao.updatepaymessage(10086);
        System.out.println(updatepaymessage);


    }
    @Test
    public void test19(){
        //id（主键）、用户名、密码、电话、地址、性别、姓名、会员积分、训练计划、是否教练
        dingdandao dingdandao = new dingdandao();
        int up = dingdandao.updatecomments("真dd的肥", 10086);

        System.out.println(up);


    }
    @Test
    public void test20(){
        //id（主键）、用户名、密码、电话、地址、性别、姓名、会员积分、训练计划、是否教练
        dingdandao dingdandao = new dingdandao();

        dingdanbean dingdanbean = new dingdanbean();

        dingdanbean.setUserid(10086);
        dingdanbean.setUsername("zhr");
        dingdanbean.setCoachid(10087);
        dingdanbean.setCoachname("YYP");

        int insertdingdan = dingdandao.insertdingdan(dingdanbean);
        System.out.println(insertdingdan);


    }
    @Test
    public void test21(){
        //id（主键）、用户名、密码、电话、地址、性别、姓名、会员积分、训练计划、是否教练
        coachdao coachdao = new coachdao();
        String selectonecoachnamebyid = coachdao.selectonecoachnamebyid(10087);
        System.out.println(selectonecoachnamebyid);


    }
    @Test
    public void test22(){
        //id（主键）、用户名、密码、电话、地址、性别、姓名、会员积分、训练计划、是否教练
        dingdandao dingdandao = new dingdandao();
        List<dingdanbean> zhr = dingdandao.selectnopaydingdan("zhr");

        for (dingdanbean z:zhr
             ) {
            System.out.println(z);
        }


    }

}
