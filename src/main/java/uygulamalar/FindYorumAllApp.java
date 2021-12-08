package uygulamalar;

import entity.Urun;
import entity.UrunYorum;
import entityservice.UrunEntityService;
import entityservice.YorumEntityService;

import java.util.List;

public class FindYorumAllApp {
    public static void main(String[] args) {
        YorumEntityService service = new YorumEntityService();
        List<UrunYorum> urunYorumList = service.findAll();

        for (UrunYorum urunYorum : urunYorumList) {
            System.out.println(urunYorum);
        }

    }

}
