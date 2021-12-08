package entityservice;

import dao.UrunDao;
import dao.YorumDao;
import dto.YorumSayDto;
import entity.Urun;
import entity.UrunYorum;

import java.util.List;

public class YorumEntityService {


    private YorumDao yorumDao;

    public YorumEntityService() {
        yorumDao = new YorumDao();
    }
    public List<UrunYorum> findAll() {
        return yorumDao.findAll();
    }

    public List<YorumSayDto> findAllUrunDetayDtoByKategoriKirilim(Long id) {
        return yorumDao.findAllUrunDetayDtoByKategoriKirilim(id);
    }
}
