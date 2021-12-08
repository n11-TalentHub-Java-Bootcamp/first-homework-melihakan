package dto;

import java.math.BigDecimal;

public class YorumSayDto {

    private Long urunId;
    private String urunName;
    private BigDecimal fiyat;
    private Long yorumSayisi;

    public YorumSayDto(){

    }

    public YorumSayDto(Long urunId, String urunName, BigDecimal fiyat, Long yorumSayisi) {
        this.setUrunId(urunId);
        this.setUrunName(urunName);
        this.setFiyat(fiyat);
        this.setYorumSayisi(yorumSayisi);
    }

    public Long getUrunId() {
        return urunId;
    }

    public void setUrunId(Long urunId) {
        this.urunId = urunId;
    }

    public String getUrunName() {
        return urunName;
    }

    public void setUrunName(String urunName) {
        this.urunName = urunName;
    }

    public BigDecimal getFiyat() {
        return fiyat;
    }

    public void setFiyat(BigDecimal fiyat) {
        this.fiyat = fiyat;
    }

    public Long getYorumSayisi() {
        return yorumSayisi;
    }

    public void setYorumSayisi(Long yorumSayisi) {
        this.yorumSayisi = yorumSayisi;
    }

    @Override
    public String toString() {
        return "YorumSayDto{" +
                "urunId=" + urunId +
                ", urunName='" + urunName + '\'' +
                ", fiyat=" + fiyat +
                ", yorumSayisi=" + yorumSayisi +
                '}';
    }
}
