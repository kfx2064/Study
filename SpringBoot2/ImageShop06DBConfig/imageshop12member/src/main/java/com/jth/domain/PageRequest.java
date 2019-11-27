package com.jth.domain;

public class PageRequest {

    private int page;
    private int sizePerPage;

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

}
