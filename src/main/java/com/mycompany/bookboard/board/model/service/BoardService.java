package com.mycompany.bookboard.board.model.service;

import java.util.List;

import com.mycompany.bookboard.board.model.vo.Board;

public interface BoardService {
	int totalCount();

	Board selectBoard(int chk, String board_num);

	List<Board> selectList(int startPage, int limit);

	List<Board> selectSearch(String keyword);

	void insertBoard(Board b);

	Board updateBoard(Board b);

	void deleteBoard(String board_num);
}