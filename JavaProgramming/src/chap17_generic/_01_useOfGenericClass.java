package chap17_generic;

import chap17_generic.clazz.BoardFile;
import chap17_generic.clazz.FreeBoard;
import chap17_generic.clazz.NoticeBoard;

public class _01_useOfGenericClass {

	public static void main(String[] args) {
		//자유게시판 게시글에 대한 첨부파일 생성
		BoardFile<FreeBoard> fBoardFile = new BoardFile<FreeBoard>();
		
		fBoardFile.setT(new FreeBoard());
		fBoardFile.getT().setfBoardNo(1);
		fBoardFile.getT().setfBoardTitle("test");
		fBoardFile.getT().setfBoardContent("test입니다.");
		
		fBoardFile.setBoardNo(fBoardFile.getT().getfBoardNo());
		
		fBoardFile.setType(fBoardFile
				.getT().getClass().getSimpleName().equals("FreeBoard") ? 1 : 2);
		
		System.out.println(fBoardFile);
		
//		FreeBoard fBoard = new FreeBoard();
//		fBoard.setfBoardNo(1);
//		fBoard.setfBoardTitle("test");
//		fBoard.setfBoardContent("test입니다.");
//		fBoardFile.setT(fBoard);
		
		//공지사항 게시글에 대한 첨부파일 생성
		BoardFile<NoticeBoard> nBoardFile = new BoardFile<NoticeBoard>();
		
		NoticeBoard nBoard = new NoticeBoard();
		nBoard.setnBoardNo(2);
		nBoard.setnBoardTitle("test2");
		nBoard.setnBoardContent("test2입니다.");
		nBoardFile.setT(nBoard);
		
		nBoardFile.setBoardNo(nBoardFile.getT().getnBoardNo());
		
		nBoardFile.setType(nBoardFile
				.getT().getClass().getSimpleName().equals("FreeBoard") ? 1 : 2);
		
		System.out.println(nBoardFile);

	}

}
