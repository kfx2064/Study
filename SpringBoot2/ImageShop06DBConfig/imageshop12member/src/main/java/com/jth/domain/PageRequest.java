package com.jth.domain;

import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

public class PageRequest {

    private int page;
    private int sizePerPage;

    private String searchType;
    private String keyword;

    public PageRequest() {
        this.page = 1;
        this.sizePerPage = 10;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        if(page <= 0) {
            this.page = 1;
            return;
        }

        this.page = page;
    }

    public int getSizePerPage() {
        return this.sizePerPage;
    }

    public void setSizePerPage(int sizePerPage) {
        if (sizePerPage <= 0 || sizePerPage > 100) {
            this.sizePerPage = 10;
            return;
        }

        this.sizePerPage = sizePerPage;
    }

    public int getPageStart() {
        return (this.page - 1) * sizePerPage;
    }

    public String getSearchType() {
        return searchType;
    }

    public void setSearchType(String searchType) {
        this.searchType = searchType;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    // 멤버변수 활용 다양한 형태의 쿼리파라미터 생성.
    public String toUriString() {
        UriComponents uriComponents = UriComponentsBuilder.newInstance()
                .queryParam("page", this.page)
                .queryParam("size", this.sizePerPage)
                .queryParam("searchType", this.searchType)
                .queryParam("keyword", this.keyword)
                .build();

        return uriComponents.toUriString();
    }

    public String toUriString(int page) {
        UriComponents uriComponents = UriComponentsBuilder.newInstance()
                .queryParam("page", page)
                .queryParam("size", this.sizePerPage)
                .queryParam("searchType", this.searchType)
                .queryParam("keyword", this.keyword)
                .build();

        return uriComponents.toUriString();
    }

    public String toUriStringByPage(int page) {
        UriComponents uriComponents = UriComponentsBuilder.newInstance()
                .queryParam("page", page)
                .queryParam("size", this.sizePerPage)
                .build();

        return uriComponents.toUriString();
    }
}
