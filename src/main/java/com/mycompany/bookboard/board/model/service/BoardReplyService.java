package com.mycompany.bookboard.board.model.service;

import java.util.List;

import com.mycompany.bookboard.board.model.vo.BoardReply;

public interface BoardReplyService {
	BoardReply selectBoardReply(String comment_id);

	List<BoardReply> selectList(String board_num);

	int insertBoardReply(BoardReply br);

	int updateBoardReply(BoardReply br);

	int deleteBoardReply(BoardReply br);
}
