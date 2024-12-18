package com.devstudios.redsocial.application.dtos.shared;

import java.util.List;




public class ResponsePaginationDto<T> extends ResponseDto<List<T>> {

    private Long elements;
    private int pages;


    public Long getElements() {
        return elements;
    }
    public void setElements(Long elements) {
        this.elements = elements;
    }
    public int getPages() {
        return pages;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }

}
