package uygulamalar;

import entity.Urun;
import entity.UrunYorum;
import entityservice.UrunEntityService;
import entityservice.YorumEntityService;

import java.util.List;

public class FindYorumAllApp {
    public static void main(String[] args) {
        YorumEntityService service = new YorumEntityService();
        List<CommentListDto> commentListDtos = service.commentList();

        for (CommentListDto commentListDto : commentListDtos) {
            System.out.println(commentListDto);
        }

    }

}
