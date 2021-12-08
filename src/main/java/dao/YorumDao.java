package dao;

import base.BaseDao;
import dto.YorumSayDto;
import entity.Urun;
import entity.UrunYorum;
import org.hibernate.query.Query;

import java.util.List;

public class YorumDao extends BaseDao {

    public List<UrunYorum> findAll(){
        String sql = "select urunyorum from UrunYorum urunyorum ";
        Query query = getSessionFactory().createQuery(sql);
        return query.list();
    }
    public List<YorumSayDto> findAllUrunDetayDtoByKategoriKirilim(Long id){
        String sql = "select count(urunyorum.yorum)from UrunYorum urunyorum " +
                " left join Kullanici kullanici  on urunyorum.kullanici.id = kullanici.id "+
                "where kullanici.id = :id ";
        Query query = getSessionFactory().createQuery(sql);
        query.setParameter("id", id);
        return query.list();
    }

}
