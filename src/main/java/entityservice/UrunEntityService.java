package entityservice;

import dao.KategoriDao;
import dao.UrunDao;
import entity.Kategori;
import entity.Urun;

import java.util.List;

public class UrunEntityService {

    private UrunDao urunDao;

    public UrunEntityService() {
        urunDao = new UrunDao();
    }

    public List<Urun> findAll() {
        return urunDao.findAll();
    }
    public Urun findById(Long id){
        return urunDao.findById(id);
    }
}
