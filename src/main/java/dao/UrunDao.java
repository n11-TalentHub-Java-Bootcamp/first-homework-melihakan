package dao;
import base.BaseDao;
import entity.Urun;
import hibernate.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;

public class UrunDao extends BaseDao {

    public List<Urun> findAll(){
        String sql = "select urun from Urun urun";
        Query query = getSessionFactory().createQuery(sql);

        return query.list();
    }
    public Urun findById(Long id){
        String sql = "select urun from Urun urun where urun.id =:givenId";
        Query query = getSessionFactory().createQuery(sql);
        query.setParameter("givenId",id);
        return (Urun) query.uniqueResult();
    }
}
