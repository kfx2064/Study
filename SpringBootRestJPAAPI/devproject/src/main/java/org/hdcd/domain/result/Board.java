package org.hdcd.domain.result;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@ToString
public class Board {

    private int boardNo;
    private String title;
    private String content;
    private String writer;
    private Date regDate;

    Board(int boardNo, String title, String content, String writer, Date regDate) {
        super();
        this.boardNo = boardNo;
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.regDate = regDate;
    }

    public static class BoardBuilder {

        private int boardNo;
        private String title;
        private String content;
        private String writer;
        private Date regDate;

        private BoardBuilder() {}

        public BoardBuilder boardNo(int boardNo) {
            this.boardNo = boardNo;
            return this;
        }

        public BoardBuilder title(String title) {
            this.title = title;
            return this;
        }

        public BoardBuilder content(String content) {
            this.content = content;
            return this;
        }

        public BoardBuilder writer(String writer) {
            this.writer = writer;
            return this;
        }

        public BoardBuilder regDate(Date regDate) {
            this.regDate = regDate;
            return this;
        }

        public Board build() {
            return new Board(boardNo, title, content, writer, regDate);
        }

    }

}
