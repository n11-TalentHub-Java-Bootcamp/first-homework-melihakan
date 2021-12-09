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

    public List<YorumSayDto> countCommentNum(){
        return yorumDao.countCommentNum();
    }
    public List<CommentListDto> commentList(){
        return yorumDao.commentList();
    }
    public List<UserCommentListDto> userCommentListDto(){
        return yorumDao.userCommentListDto();
    }
}
