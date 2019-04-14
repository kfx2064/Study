package org.zerock.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class PageDTO {
	
	private int startPage;
	private int endPage;
	private boolean prev, next;
	
	private int total;
	private Criteria cri;
	
	public PageDTO(Criteria cri, int total) {
		
		this.cri = cri;
		this.total = total;
		System.out.println("total ::: " + total);
		System.out.println("cri.getPageNum() ::: " + cri.getPageNum());
		
		this.endPage = (int) (Math.ceil(cri.getPageNum() / 10.0)) * 10;
		System.out.println("endPage ::: " + endPage);
		
		this.startPage = this.endPage - 9;
		System.out.println("startPage ::: " + startPage);
		
		//int realEnd = (int) (Math.ceil((total * 1.0) / cri.getAmount()));
		
		System.out.println("cri.getAmount() ::: " + cri.getAmount());
		
		int realEnd = (int) Math.ceil(total / endPage);
		System.out.println("realEnd ::: " + realEnd);
		
		
		if(realEnd < 10) {
			this.endPage = realEnd;
		}
		
		// 페이지 끝자리 구하기
		if(realEnd < 10) {
			int trueEndPage = (((int)(startPage / 10)) * 10) + this.endPage;
			System.out.println("trueEndPage ::: " + trueEndPage);
			this.endPage = trueEndPage;
		}
		
		System.out.println("this.endPage ::: " + this.endPage);
		
		this.prev = this.startPage > 1;
		
		this.next = 10 < realEnd;
		
		System.out.println("this.prev ::: " + this.prev);
		System.out.println("this next ::: " + this.next);
		
	}

}
