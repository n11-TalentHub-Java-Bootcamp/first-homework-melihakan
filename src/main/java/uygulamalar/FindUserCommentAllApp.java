package uygulamalar;

import dto.CommentListDto;
import dto.UserCommentListDto;
import dto.YorumSayDto;
import entityservice.YorumEntityService;

import java.util.List;

public class FindUserCommentAllApp {
    public static void main(String[] args) {
        YorumEntityService service = new YorumEntityService();
        List<UserCommentListDto> userCommentListDtos = service.userCommentListDto();

        for (UserCommentListDto userCommentListDto : userCommentListDtos) {
            System.out.println(userCommentListDto);
        }

    }
}
