/* 테이블 명 : board
 * 컬럼
 * - 게시글 번호 idx, 숫자, pk, 자동으로 1씩 증가
 * - 제목 title, 문자 , not null
 * - 작성자 writer, 문자, not null
 * - 작성일 indate, 날짜, 기본값으로 오늘 날짜
 * - 내용 content, 문자, not null
 */

CREATE TABLE BOARD(
 IDX INT NOT NULL AUTO_INCREMENT,
 TITLE VARCHAR(100) NOT NULL,
 CONTENTS VARCHAR(1000) NOT NULL,
 WRITER  VARCHAR(100) NOT NULL,
 INDATE DATETIME DEFAULT NOW(), 
 PRIMARY KEY(IDX)
);

INSERT INTO BOARD (TITLE, WRITER, CONTENTS)
VALUE('게시물 1', '작성자1', '내용1');
INSERT INTO BOARD (TITLE, WRITER, CONTENTS)
VALUE('아~~ 스프링 재밌다~', '문경서', '스프링 너무 재밌어요ㅠㅠ');
INSERT INTO BOARD (TITLE, WRITER, CONTENTS)
VALUE('자바부터 어쩐지 너무 좋더라..', '나규민', '자바가 내 체질이잖아!!');
INSERT INTO BOARD (TITLE, WRITER, CONTENTS)
VALUE('전 JSP때부터 서버 관련 수업이 너무 좋아요..', '김혜림', '서버 개발자가 될테야');
INSERT INTO BOARD (TITLE, WRITER, CONTENTS)
VALUE('합정역의 자바 마스터', '오희진', '합정역의 자바 마스터는 나다.');
SELECT * FROM BOARD;




 