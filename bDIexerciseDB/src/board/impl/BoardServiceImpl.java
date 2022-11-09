package board.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import board.BoardDao;
import board.BoardService;
import board.vo.BoardVO;

//@Component("boardService")
@Service("boardService")
//스스로 객체 생성
public class BoardServiceImpl implements BoardService {
	 
	@Autowired
	//스스로 주입
	//여러개 중에서 하나만 쓸때
	//@Qualified("xxx")
	//@Resource(name="nnn")
	private BoardDao boardDAO;
	
	
	//메소드 오버라이딩
	@Override
	public void insertBoard(BoardVO vo) {
		boardDAO.insertBoard(vo);
		
	}

	@Override
	public void updateBoard(BoardVO vo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBoard(BoardVO vo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public BoardVO getBoard(BoardVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BoardVO> getBoardList(BoardVO vo) {
		// TODO Auto-generated method stub
		return null;
	}


}
