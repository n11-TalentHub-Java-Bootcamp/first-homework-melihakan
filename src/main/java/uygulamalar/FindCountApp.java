package uygulamalar;

import dto.UserCommentListDto;
import dto.YorumSayDto;
import entityservice.YorumEntityService;

import java.util.List;

public class FindCountApp {

    public static void main(String[] args) {
        YorumEntityService service = new YorumEntityService();
        List<YorumSayDto> yorumSayDtos = service.countCommentNum();

        for (YorumSayDto YorumSayDto : yorumSayDtos) {
            System.out.println(YorumSayDto);
        }
    }



}
