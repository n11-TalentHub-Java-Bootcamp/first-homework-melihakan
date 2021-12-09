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
    public List<YorumSayDto> countCommentNum(){
        String sql = "select distinct new dto.YorumSayDto( urun.urun.id, urun.urun.adi, urun.urun.fiyat, count (urun.id)) from UrunYorum urun group by urun.urun.id, urun.urun.adi, urun.urun.fiyat,urun.id";
        Query query = getSessionFactory().createQuery(sql);

        return query.list();
    }
    public List<CommentListDto> commentList(){

        String sql = "select new dto.CommentListDto( urun.urun.adi, urun.urun.kategori.adi, urun.urun.fiyat, urun.kullanici.adi, urun.kullanici.soyadi, urun.kullanici.email, urun.kullanici.telefon, urun.yorum, urun.yorumTarihi ) from UrunYorum urun ";
        Query query = getSessionFactory().createQuery(sql);

        return query.list();
    }
    public List<UserCommentListDto> userCommentListDto(){
        String sql = "select new dto.UserCommentListDto( urun.kullanici.id, urun.kullanici.adi,urun.urun.adi, urun.yorum, urun.yorumTarihi ) from UrunYorum urun ";
        Query query = getSessionFactory().createQuery(sql);

        return query.list();
    }

}
