package org.zerock.persistence;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.zerock.domain.WebBoard;

public interface CustomWebBoard {
	
	public Page<Object[]> getCustomPage(String type, String keyword, Pageable page);

}
