package uygulamalar;

import dto.YorumSayDto;
import entityservice.YorumEntityService;

import java.util.List;

public class DtoApp {
    public static void main(String[] args) {

        YorumEntityService service = new YorumEntityService();
        List<YorumSayDto> urunList = service.findAllUrunDetayDtoByKategoriKirilim(3L);

        for (YorumSayDto urunDetayDto : urunList) {
            System.out.println(urunDetayDto);
        }
    }
}
