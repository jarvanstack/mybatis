import com.bmft.dao.BillMapper;
import com.bmft.dao.RoleMapper;
import com.bmft.pojo.Bill;
import com.bmft.pojo.Role;
import com.bmft.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

public class BillTest {
    static org.apache.log4j.Logger logger = Logger.getLogger(UserTest.class);


    //List<Bill> getBillList(Bill bill);
    @Test
    public void getBillList() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        BillMapper mapper = sqlSession.getMapper(BillMapper.class);
        HashMap<String, Object> map = new HashMap<>();
        List<Bill> billList = mapper.getBillList(map);

        for (Bill bill : billList) {
            System.out.println(bill);
        }
        sqlSession.commit();
        sqlSession.close();
    }

    // Bill getBillById(String id);
    @Test
    public void getBillById() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        BillMapper mapper = sqlSession.getMapper(BillMapper.class);
        HashMap<String, Object> map = new HashMap<>();
        Bill billById = mapper.getBillById("2");
        System.out.println(billById);


        sqlSession.commit();
        sqlSession.close();
    }
    //boolean addBill(Map<String,Object> map) ;
    @Test
    public void addBill() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        BillMapper mapper = sqlSession.getMapper(BillMapper.class);
        HashMap<String, Object> map = new HashMap<>();
        Bill billById = mapper.getBillById("2");
        billById.setProductName("反萨法反萨法");

        boolean b = mapper.addBill(billById);

        logger.info(b);


        sqlSession.commit();
        sqlSession.close();
    }

    //boolean modifyBill(Bill bill) ;

    @Test
    public void modifyBill() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        BillMapper mapper = sqlSession.getMapper(BillMapper.class);
        HashMap<String, Object> map = new HashMap<>();
        Bill billById = mapper.getBillById("2");
        billById.setProductName("哈哈哈哈哈");

        boolean b = mapper.modifyBill(billById);

        logger.info(b);


        sqlSession.commit();
        sqlSession.close();
    }
//boolean deleteBillById(String id) ;

    @Test
    public void deleteBillById() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        BillMapper mapper = sqlSession.getMapper(BillMapper.class);


        boolean b = mapper.deleteBillById("2");

        logger.info(b);


        sqlSession.commit();
        sqlSession.close();
    }


}
